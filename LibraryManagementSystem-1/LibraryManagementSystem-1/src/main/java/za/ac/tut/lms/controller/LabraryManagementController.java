package za.ac.tut.lms.controller;

import javax.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import za.ac.tut.lms.model.User;
import za.ac.tut.lms.model.UserLogin;

@Controller
public class LabraryManagementController {

	//return a string from a /test1 url
	
	@GetMapping("/index")
	public String showLMS() {
		return "index";
	}
	@GetMapping("/signup")
	public String showSignup() {
		return "signup";
	}
	/*@GetMapping("/signup")
	public String showSignup(Model model) {
		model.addAttribute("User",new User());
		return "signup";
	}*/
	@GetMapping("/login")
	public String showLogin(Model model) {
		model.addAttribute("UserLogin",new UserLogin());
		return "login";
	}
	
	// Handling GET request to display homepage
	@GetMapping("/homepage")
	public String showHomepage(Model model) {

		model.addAttribute("userLogin", new UserLogin());
		return "homepage";
	}
	
	// Handling POST request to display homepage
	@PostMapping("/homepage")
	public String showHomepage(@Valid UserLogin userLogin,BindingResult bindingResult,Model model) {

		if(bindingResult.hasErrors()) {
			// If there are validation errors, return to the login form with error messages
			model.addAttribute("userLogin", userLogin);
			return "login";
		}
		model.addAttribute("userLogin", userLogin);
		return "homepage";
	}
	@GetMapping("/availableBooks")
	public String showAvailableBooks() {
		return "availableBooks";
	}
	@GetMapping("/updateDetails")
	public String showUpdateDetails() {
		return "updateDetails";
	}
	//ModelAttribute
}
