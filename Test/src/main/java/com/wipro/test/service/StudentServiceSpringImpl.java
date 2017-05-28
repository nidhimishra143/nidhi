package com.wipro.test.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.test.dao.StudentDAOInt;
import com.wipro.test.dto.StudentDTO;
import com.wipro.test.exception.DuplicateRecordException;

@Service("StudentService")
public class StudentServiceSpringImpl implements StudentServiceInt {

	@Autowired
	private StudentDAOInt dao;

	private static Logger log = Logger.getLogger(StudentServiceSpringImpl.class);

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public long add(StudentDTO dto) throws DuplicateRecordException {
		log.debug("Student Service Add Started");
		StudentDTO dtoExist = dao.findByEmail(dto.getEmail());
		if (dtoExist != null) {
			throw new DuplicateRecordException("Student Name already exists");
		}
		long pk = dao.add(dto);
		log.debug("Student Service Add Ended");
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(long id) {
		dao.delete(id);

	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public StudentDTO findByEmail(String email) {
		log.debug("Student Service findByName Started");
		StudentDTO dto = dao.findByEmail(email);
		log.debug("Student Service findByName Ended");
		return dto;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public StudentDTO findById(long id) {

		StudentDTO dto = dao.findByPK(id);
		return dto;
	}

}
