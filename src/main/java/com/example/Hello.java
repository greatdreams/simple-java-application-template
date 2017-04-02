package com.example;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/** the main class of the program
 *
 *@author greatdreams
 */
public class Hello {

    public static void hello(String... names) {
        Observable.fromArray(names).subscribe(
                name -> {
                    System.out.println("Hello " + name + "!");
                }
        );
    }
    public static void hello1(int max){

        Observable<String> o = Observable.create(observableEmitter -> {
            for(int i = 0; i < max; i++) {
                observableEmitter.onNext(String.valueOf(i));
            }
        });
        o.map(it -> {
            String temp = "$" + it;
            temp += " price";
            return temp;
        }).subscribe(it -> System.out.println(it));
    }

    private static Logger LOGGER = LoggerFactory.getLogger(Hello.class);
    /** the entry method of the program
     * @param args application arguments
     */
    public static void main(String[] args) {
        LOGGER.info("This application is build with the sbt tool");
        hello("java", "scala", "groovy", "clojure");
        hello("erlang", "go", "rust", "swift", "lua");

        hello1(2);
        hello1(3);

        JFrame frame = new JFrame("This is just a demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
