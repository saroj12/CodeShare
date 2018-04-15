/**
 * 
 */
package com.student.service;

import org.springframework.stereotype.Component;

import com.student.dto.StudentMain;

/**
 * @author Saroj
 *
 * Json parsing API for the queryed roll nos
 */

@Component
public interface StudentService {

	public StudentMain getJsonParse(String input, String startRollNo, String endRollNo);

}
