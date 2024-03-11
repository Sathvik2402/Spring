package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Emp;
import com.nt.service.IEmployeeManagementSevice;


@Controller
public class EmployeeOpsController {

	@Autowired
	IEmployeeManagementSevice serv;
	
	@GetMapping("/")
	public String showHomePage() {
	return "welcome";
	}
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		List<Emp> list=serv.fetchAllEmployees();
		map.put("list",list);
		return "show_report";
	}
	@PostMapping("/submit")
	public String submitData(@ModelAttribute("empl")Emp e,RedirectAttributes ses) {
		Emp se=serv.register(e);
		ses.addFlashAttribute("resultMsg", se.getEmpno());
		return "redirect:report";
	}
	
	@GetMapping("/add")
	public String addData(Map<String,Object> map) {
		return "register";
	}
	
	@GetMapping("/emp_edit")
	public String showEditFormPage(@ModelAttribute("emp")Emp emp,@RequestParam("no")int no) 
	{
		
		Emp em1=serv.findEmpById(no);
		BeanUtils.copyProperties(em1, emp);
		return "edit_form";
	}
	
	@PostMapping("/emp_edit")
	public String editProcess(@ModelAttribute("empl")Emp e,RedirectAttributes ses) {
		String se=serv.modifyEmp(e);
		ses.addFlashAttribute("resultMsg", se);
		return "redirect:report";
	}
	@GetMapping("/emp_delete")
	public String removeEmployeeById(@RequestParam("no") int no,RedirectAttributes ra) 
	{
		
		String result=serv.deleteEmployee(no);
		ra.addFlashAttribute("resultMsg",result);
		return "redirect:report";
	}
}
