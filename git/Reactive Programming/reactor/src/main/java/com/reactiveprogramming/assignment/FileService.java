package com.reactiveprogramming.assignment;

import reactor.core.publisher.Mono;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
   private static final Path PATH = Paths.get("D:\\UpSkill\\Reactive Programming\\reactor\\src\\main\\resources\\assignment\\sec01");

   public static Mono<String> read(String fileName){
       return Mono.fromSupplier(() -> readFile(fileName));
   }

   public static Mono<Void> write(String fileName){
       return Mono.fromRunnable(() -> writeFile(fileName));
   }

   public static Mono<Void> delete(String fileName){
       return Mono.fromRunnable(() -> deleteFile(fileName));
   }
   private static String readFile(String fileName){
       try {
           return Files.readString(PATH.resolve(fileName)); //append the file name with path
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

   private static void writeFile(String fileName){
       try {
           Files.writeString(PATH.resolve(fileName), "This is in the file " + fileName);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

   private static void deleteFile(String fileName){
       try {
           Files.delete(PATH.resolve(fileName));
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
