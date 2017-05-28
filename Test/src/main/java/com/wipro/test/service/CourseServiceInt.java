package com.wipro.test.service;

import java.util.List;

import com.wipro.test.dto.CourseDTO;
import com.wipro.test.exception.DuplicateRecordException;


public interface CourseServiceInt {
	  
    public Long add(CourseDTO dto) throws DuplicateRecordException;
    public void update(CourseDTO dto) throws DuplicateRecordException;
    public void delete(Long id);
    public CourseDTO findByName(String CourseName);
    public CourseDTO findByPK(Long pk);

   

}
