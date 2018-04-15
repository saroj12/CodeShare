/**
 * 
 */
package com.student.dto;

import java.io.Serializable;
import java.util.List;

import com.student.mapping.Student;

/**
 * @author Saroj
 *
 */

public class Students implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Student> student;

	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
