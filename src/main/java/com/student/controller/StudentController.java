/**
 * 
 */
package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentMain;
import com.student.service.StudentServiceImpl;


/**
 * @author Saroj
 * 
 * This class is used to get call the service class for json message parsing and getting
 *  data for the query parameter roll nos
 * 
 */
@RestController
@RequestMapping(value="/rest")
public class StudentController {
	
		
	@RequestMapping(value="/parseList",method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public @ResponseBody StudentMain getStudentDetails(@RequestParam String startRollNo, @RequestParam String endRollNo, @RequestBody String input) {
					
		StudentServiceImpl studentService =new StudentServiceImpl();
		StudentMain details =new StudentMain();
		 details=studentService.getJsonParse(input,startRollNo,endRollNo);
		
		return details;
		
		
	}



}
