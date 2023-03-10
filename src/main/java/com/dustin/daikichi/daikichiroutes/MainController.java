package com.dustin.daikichi.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {

  @RequestMapping("")
  public String index() {
    return "<h1>Welcome</h1><a href=\"/\">home</a>";
  }

  @RequestMapping("/today")
  public String today() {
    return "Today you will find luck in all your endeavors!<a href=\"/\">home</a>";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow() {
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!<a href=\"/\">home</a>";
  }


}
