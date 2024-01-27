package com.reactiveprogramming.streamlazybehaviour;

import com.reactiveprogramming.assignment.FileService;
import com.reactiveprogramming.courseutil.Util;

public class Lec09Assignment {
    public static void main(String[] args) {
        FileService.read("read-file").subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

        FileService.write("write-file").subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

        FileService.delete("write-file").subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

    }
}
