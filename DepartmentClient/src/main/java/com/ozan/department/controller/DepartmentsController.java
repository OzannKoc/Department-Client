package com.ozan.department.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ozan.department.entity.Departments;
import com.ozan.department.entity.Employees;
import com.ozan.department.entity.Locations;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {
	
	
	private static final String departmentListUrl ="http://localhost:8081/SpringRestHR/departments/list";
	private static RestTemplate restTemplate = new RestTemplate();
	@GetMapping("/list")
	public String listDepartments(Model model) {
		ResponseEntity<Departments[]> responseEntity = 
				restTemplate.getForEntity(departmentListUrl, Departments[].class);
				
				List<Departments> depts = Arrays.asList(responseEntity.getBody());
//		List<Departments> myList = departmentsService.getDepartmentsList();
//		List<Employees> myEmpList = departmentsService.getEmployeesList();
//		List<Locations> myLctList = departmentsService.getLocationsList();
		model.addAttribute("departments", depts);
//		model.addAttribute("employees", myEmpList);
//		model.addAttribute("locations", myLctList);
		return "department-list";
	}

	@GetMapping("/add")
	public String addToDepartments(ModelMap model) {
//		Departments dept = new Departments();
//		List<Departments> myList = departmentsService.getDepartmentsList();
//		List<Employees> myEmpList = departmentsService.getEmployeesList();
//		List<Locations> myLctList = departmentsService.getLocationsList();
//		model.addAttribute("department", dept);
//		model.addAttribute("employees", myEmpList);
//		model.addAttribute("locations", myLctList);
		return "department-form";
	}

	@PostMapping("/save")
	public String saveDepartments(@RequestParam("id") Integer id,
									@RequestParam("name")String name ,
									@RequestParam("emp")String emp,
									@RequestParam("lct")String lct,Model model) {
		
//		if(id==null) {
//			Departments dept = new Departments();
//			dept.setName(name);
//			if(emp=="")
//				emp="0";
//			if(lct=="")
//				lct="0";
//			dept.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//			dept.setLct(departmentsService.updateLocations(Integer.valueOf(lct)));
//			departmentsService.saveDepartments(dept);
//			return "redirect:/departments/list";
//		}
//		else {
//			Departments dept = departmentsService.updateDepartments(id);
//			dept.setName(name);
//			if(emp=="")
//				emp="0";
//			if(lct=="")
//				lct="0";
//			dept.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//			dept.setLct(departmentsService.updateLocations(Integer.valueOf(lct)));
//			departmentsService.saveDepartments(dept);
//		}
		
//		if (id == null) {
//			Departments department = new Departments();
//			List<Departments> departmanlar = departmentsService.getDepartmentsList();
//
//			for (Departments departmentIterator : departmanlar) {
//				System.out.println(departmentIterator.getName());
//
//				if (name.equals(departmentIterator.getName())) {
//
//					System.out.println("Departmen name ayn� olamaz");
//					hata1 += "Departmen name ayn� olamaz";
//					//model.addAttribute("hata1", hata1);
//					return "redirect:/departments/list";
//
//				} else {
//					department.setName(name);
//
//				}
//			}
//
//			List<Employees> managerler = departmentsService.getEmployeesList();
//
//			for (Employees employee : managerler) {
//				System.out.println(employee.toString());
//				if (emp.equals(employee.getId().toString())) {
//					
//					hata1 = "B�yle bir manager ekleyemezsin."+employee.getDepartment().getName()+"nin manageri ";
//					System.out.println("b�yle bir manager ekleyemezsin");
//					
//					return "redirect:/departments/list";
//				} else if (emp.equals("")) {
//					emp = "0";
//					department.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//				} else {
//					department.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//				}
//			}
//
//			if (lct.equals("")) {
//				lct = "0";
//				department.setLct(departmentsService.updateLocations(Integer.valueOf(lct)));
//			} else {
//				department.setLct(departmentsService.updateLocations(Integer.valueOf(lct)));
//			}
//
//			departmentsService.saveDepartments(department);
//
//			return "redirect:/departments/list";
//		} else {
//			Departments department = departmentsService.updateDepartments(id);
//			List<Departments> departmanlar = departmentsService.getDepartmentsList();
//
//			if (name.equals(department.getName())) {
//				
//				department.setName(name);
//				
//				
//			} else {
//				for (Departments departmentIterator : departmanlar) {
//					// System.out.println(departmentIterator.getDepartmentName());
//
//					if(name.equals(departmentIterator.getName())) {
//						System.out.println("Departmen name ayn� olamaz");
//						hata1 = "Departmen name ayn� olamaz";
//						//model.addAttribute("hata1", hata1);
//						return "redirect:/departments/list";
//
//					} else {
//						department.setName(name);
//					}
//				}
//			}
//			
//			List<Employees> managerler = departmentsService.getEmployeesList();
//			if(emp.equals(department.getEmp().getId().toString())) {
//				department.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//				
//			} else {
//				for (Employees employee : managerler) {
//					//System.out.println(employee.toString());
//					
//					 if (emp.equals(employee.getId().toString())) {
//
//						System.out.println("b�yle bir manager ekleyemezsin");
//						hata1 = "B�yle bir manager ekleyemezsin."+employee.getDepartment().getName()+"nin manageri ";
//						//model.addAttribute("hata1", hata1);
//						return "redirect:/departments/list";
//					}  else {
//						department.setEmp(departmentsService.updateEmployees(Integer.valueOf(emp)));
//					}
//				}
//			}
//			
//
//			
//			department.setLct(departmentsService.updateLocations(Integer.valueOf(lct)));
//			System.out.println("departmentId" + id);
//			departmentsService.saveDepartments(department);
		
		
		
		
		return "redirect:/departments/list";
	}

	@GetMapping("/remove")
	public String deleteDepartments(@RequestParam("deptId") int deptId) {
//		departmentsService.removeDepartments(deptId);
		return "redirect:/departments/list";
	}

	@GetMapping("/update")
	public String updateDepartments(@RequestParam("deptId") int deptId, Model model) {
//		Departments dept = departmentsService.updateDepartments(deptId);
//		List<Employees> myEmpList = departmentsService.getEmployeesList();
//		List<Locations> myLctList = departmentsService.getLocationsList();
//
//		model.addAttribute("id", deptId);
//		model.addAttribute("name", dept.getName());
//		model.addAttribute("emp", dept.getEmp());
//		model.addAttribute("lct", dept.getLct());
//		model.addAttribute("department", dept);
//		model.addAttribute("employees", myEmpList);
//		model.addAttribute("locations", myLctList);
		return "department-form";
	}

	@GetMapping("/search")
	public String searchAll(@RequestParam("DepartmentSearch") String deptName,
			@RequestParam("ManagerSearch") String mngrName, @RequestParam("LocationSearch") String lctName,
			Model model) {
//		List<Departments> deptList = departmentsService.searchAll(deptName, mngrName, lctName);
//		List<Employees> myEmpList = departmentsService.getEmployeesList();
//		List<Locations> myLctList = departmentsService.getLocationsList();
//		model.addAttribute("departments", deptList);
//		model.addAttribute("employees", myEmpList);
//		model.addAttribute("locations", myLctList);

		return "department-list";
	}

}
