package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	IStudentService is;
	
	
	
	@RequestMapping("/")
	public String getHome()
	{
		return "redirect:all";
	}
	@GetMapping("/add")
	public String sendToAdd()
	{
		return "Form";
	}
	@PostMapping("/insert")
	public String insertData(Model m,@ModelAttribute("student")Student s)
	{
		is.saveStudent(s);
		return "redirect:all";
	}
	@GetMapping("/all")
	public String showAll(Model model) {
		
		List<Student> elist = is.findAllStudent();
		/*List<Student> l = elist.stream()
				.filter(a->a.getId()>0)
				.collect(Collectors.toList());*/
		model.addAttribute("a", elist);
		
		
		return "Home";
	}
	@GetMapping("/del")
	public String deleteById(Model m,@ModelAttribute("id")Integer id)
	{
		System.out.println(id);
		is.deleteId(id);
		return "redirect:all";
	}
	@GetMapping("/bupd")
	public String beforeUpd(Model m,@ModelAttribute("id")Integer id)
	
	{
		System.out.println(id);
		Optional<Student> op=is.findById(id);
		System.out.println(op);
		System.out.println("op.get is ==>"+op.get());
		
		
		m.addAttribute("u",op.get());
		return "UpdateForm";
	}
	@PostMapping("/upd")
	public String update(Model m,@ModelAttribute("student") Student s)
	{
		is.updateById(s);
		
		
		return "redirect:all";
	}
	

}
