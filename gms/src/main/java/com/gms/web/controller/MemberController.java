package com.gms.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/add")//get방식을 생략할수있고 생략하면 value도 생략할수있어
	public void add() {
		
	}
	@RequestMapping("/list")
	public void list() {
		
	}
	@RequestMapping("/search")
	public void search() {
		
	}
	@RequestMapping("/retrieve")
	public void retrieve() {
		
	}
	@RequestMapping("/count")
	public void count() {
		
	}
	@RequestMapping("/modify")
	public void modify() {
		
	}
	@RequestMapping("/remove")
	public void remove() {
		
	}
	@RequestMapping("/login")
	public void login() {
		
	}
	@RequestMapping("/logout")
	public void logout() {
		
	}
	@RequestMapping("/move")
	public void move() {
		
	}
	@RequestMapping("/fileupload")
	public void fileupload() {
		
	}
}
