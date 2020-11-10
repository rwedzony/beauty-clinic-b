package it.arcade.hospital.controller;
import it.arcade.hospital.testclass.TestClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public TestClass getTest(){
        return new TestClass("helloWorld");
    }
}
