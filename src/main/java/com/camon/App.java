package com.camon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class App {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(App.class, args);

    SpringApplication springApplication = new SpringApplication(App.class);
    springApplication.addListeners(new ApplicationPidFileWriter());
    springApplication.run(args);
  }
}