package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	@GetMapping("/form")
	public void form() {}
	
	@PostMapping("/receive")
	public String receive(String message,RedirectAttributes rttr) {
		String url="redirect:/success";
		
		//rttr.addAttribute("message","redirectAttribute : "+message);
		rttr.addFlashAttribute("message","flashAttribute : "+message);
		return url;
	}
	
	@GetMapping("/success")
	public void success() {}
}







