package com.wipro.test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.test.dao.CourseDAOInt;
import com.wipro.test.dto.CourseDTO;
import com.wipro.test.exception.DuplicateRecordException;

@Service("CourseService")
public class CourseServiceSpringImpl implements CourseServiceInt {

	@Autowired
	private CourseDAOInt dao;

	private static Logger log = Logger.getLogger(CourseServiceSpringImpl.class);

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public Long add(CourseDTO dto) throws DuplicateRecordException {
		log.debug("Course Service Add Started");
		CourseDTO dtoExist = dao.findByName(dto.getCourseName());
		if (dtoExist != null) {
			throw new DuplicateRecordException("Course Name already exists");
		}
		Long pk = dao.add(dto);
		log.debug("Course Service Add Ended");
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Long id) {
		log.debug("Course Service Delete");
		dao.delete(id);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public CourseDTO findByName(String CourseName) {
		log.debug("Student Service CourseName Started");
		CourseDTO dto = dao.findByName(CourseName);
		log.debug("Student Service findByName Ended");

		return dto;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public CourseDTO findByPK(Long pk) {
		log.debug("Student Service findByPK Started");
		CourseDTO dto = dao.findByPK(pk);
		log.debug("Student Service findByPK Ended");

		return dto;
	}

	

}
