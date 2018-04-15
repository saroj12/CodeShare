/**
 * 
 */
package com.student.dto;

import java.io.Serializable;

/**
 * @author Saroj
 *
 */

public class StudentMain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Students Students;

	/**
	 * @return the students
	 */
	public Students getStudents() {
		return Students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(Students students) {
		Students = students;
	}

}
