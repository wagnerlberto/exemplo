package com.empresa.exemplo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {

  @RequestMapping("/")
  String home() {
    return "Olá";
  }
}
