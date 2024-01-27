package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;import javax.tools.DocumentationTool.Location;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import com.in28minutes.rest.webservices.restfulwebservices.model.Post;
import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import com.in28minutes.rest.webservices.restfulwebservices.repository.PostRepository;
import com.in28minutes.rest.webservices.restfulwebservices.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
public class PostJpaResource {

	private UserRepository repository;
	
	private PostRepository postRepository;

	public PostJpaResource(UserRepository repository, PostRepository postRepository) {
		this.repository = repository;
		this.postRepository = postRepository;
	}

	@GetMapping("/jpa/users/{id}/posts") 
	public List<Post>getPostsForSpecificUser(@PathVariable int id) { 
		Optional<User> user =repository.findById(id);
	    
		if(user.isEmpty())
		      throw new UserNotFoundException("id : " + id);
	 
	     List<Post> posts = user.get().getPosts(); 
	     return posts; 
	}	
	
	@PostMapping("/jpa/users/{id}/create/posts")
	public ResponseEntity<Post> createPostsForUser(@PathVariable int id, @Valid @RequestBody Post post) {
		Optional<User> user = repository.findById(id);
		
		if(user.isEmpty())
			throw new UserNotFoundException("id : " + id);
		
		post.setUsers(user.get());
		Post savedPost = postRepository.save(post);
			
		// /jpa/users/{id} => /jpa/users 
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(savedPost.getId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
	
	/*
	 * @GetMapping("/jpa/posts/{id}") public Post getPostsbyId(@PathVariable int id)
	 * { return postRepository.findById(id).get(); }
	 */
	
	//http://localhost:8082/jpa/users/10001/create/posts/1
	@GetMapping("/jpa/users/{user_id}/create/posts/{id}")
	public Post getPostsforSpecificUserById(@PathVariable int id, @PathVariable int user_id) {
		return postRepository.findById(id).get();
	}

}
