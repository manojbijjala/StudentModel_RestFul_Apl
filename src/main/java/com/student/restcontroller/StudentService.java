package com.student.restcontroller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.model.StudentModel;
import com.student.model.StudentRepositary;

@Service 
public class StudentService {
	
	@Autowired
	private StudentRepositary studentRepositary;

	public StudentModel save(StudentModel studentmodel) {
		return studentRepositary.save(studentmodel);
		
	}
	
	 
	 private static List<StudentModel> studentController = new ArrayList<>(Arrays.asList(
			new StudentModel(1205L,25,"Manoj Kumar","Amar","Bijjala"),
			new StudentModel(1206L,25,"maha lakshmi","k","k"),
			new StudentModel(1207L,25,"Shravani","A","B"),
			new StudentModel(1208L,25,"Sai Kiran","A","B"),
        	new StudentModel(1209L,25,"KK","C","CH")));
	 
	 
	 public List<StudentModel> getAllstudentModel() {
		
//		 studentRepositary.findAll().forEach(studentController::add);
//		 return studentController;
		 return this.studentRepositary.findAll();
	 }
	 
	 

		public void addStudentModel(StudentModel studentmodel) {
			studentController.add(studentmodel); 
			
		}  

	public static void updateStudentModel(Long id, StudentModel studentmodel) {
		for(int i=0;  i < studentController.size();i++) {
			StudentModel sm =studentController.get(i);
			if (sm.getStudentId()==id) {
				studentController.set(i,studentmodel);
				return;
			}
		}
		
}

	public void deleteStudentModel(Long id) {
//		studentController.removeIf(sm ->sm.getStudentId()==id);
		this.studentRepositary.delete(id);
		
	}


	
	
		
	}

	
	

	


	



