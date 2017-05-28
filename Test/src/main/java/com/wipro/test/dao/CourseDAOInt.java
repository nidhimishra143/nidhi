package com.wipro.test.dao;

import com.wipro.test.dto.CourseDTO;

public interface CourseDAOInt {

	public Long add(CourseDTO dto);

	public void delete(Long id);

	public CourseDTO findByPK(Long pk);
	 public CourseDTO findByName(String CourseName);
}