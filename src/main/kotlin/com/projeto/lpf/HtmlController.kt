package com.projeto.lpf

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import java.io.File


@Controller
class HtmlController {

  @GetMapping("/")
  fun webPage(model: Model): String {
    model["title"] = "Página"
    // Página a ser carregada
    return "page"
  }

}