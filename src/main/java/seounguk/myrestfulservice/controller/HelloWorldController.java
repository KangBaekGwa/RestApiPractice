package seounguk.myrestfulservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import seounguk.myrestfulservice.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public String home(){
        return "this is home";
    }

    //GET
    //URI - /hello-world
    //
    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloworldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloworldBeanPathVarliable(@PathVariable("name") String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
