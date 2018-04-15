/**
 * 
 */
package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentMain;
import com.student.dto.Students;
import com.student.mapping.Student;

/**
 * @author Saroj
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public StudentMain getJsonParse(String JSON_DATA, String startRoll, String endRoll) {
		StudentMain studentMain = new StudentMain();
		try {
			
			JSONObject jsonObject = new JSONObject(JSON_DATA);
			JSONObject students = jsonObject.getJSONObject("students");
			JSONArray studentArray = students.getJSONArray("student");
			List<Student> studentList = new ArrayList<>();
			Students Students = new Students();
			
			for (int i = 0; i < studentArray.length(); i++) {

				final JSONObject studentObj = studentArray.getJSONObject(i);
				// check for the query roll no data to get details for them
				if (studentObj.getString("rollNo").equals(startRoll)
						|| studentObj.getString("rollNo").equals(endRoll)) {
					Student student =new Student();
					student.setAge(studentObj.getString("age"));
					student.setName(studentObj.getString("name"));
					student.setRollNo(studentObj.getString("rollNo"));
					studentList.add(student);
				}
			}
			Students.setStudent(studentList);
			studentMain.setStudents(Students);
		} catch (JSONException exception) {
			exception.getMessage();
		}

		return studentMain;
	}

}
