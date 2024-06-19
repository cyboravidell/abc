package com.main.controller;
import java.util.*;


@Controller
public class MainController{

private UserService userService;

@GetMapping("/")
public String homePage(){
  return "home";
}
}
