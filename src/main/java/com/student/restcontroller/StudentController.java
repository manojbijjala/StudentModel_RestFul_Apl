package com.student.restcontroller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentModel;
import com.student.model.StudentRepositary;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentRepositary studentRepositary;

	@RequestMapping("/list")
	public String studentList() {
		return "list";
	}

	@RequestMapping("/pass")
	public String studentPass() {
		return "pass";
	}

	@RequestMapping("/StudentModel")
	public List<StudentModel> getstudentObject() {
		return studentService.getAllstudentModel();
	}
    
	@RequestMapping(method = RequestMethod.POST, value = "/StudentModel")
	public StudentModel  addStudentModel(@RequestBody StudentModel studentmodel) {
		System.out.println("*******************************");
		System.out.println(studentmodel);
		System.out.println("*******************************");
		return studentService.save (studentmodel);

	}

   @RequestMapping(method = RequestMethod.PUT, value = "/StudentModel/{id}")
   public void updateStudentModel(@RequestBody StudentModel studentmodel, @PathVariable Long id) {
   StudentService.updateStudentModel(id, studentmodel);
}

	@RequestMapping(method = RequestMethod.DELETE, value = "/StudentModel/{id}")
	public void deleteStudentModel(@PathVariable Long id) {
		studentService.deleteStudentModel(id);
	}

}