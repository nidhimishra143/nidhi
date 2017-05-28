package com.wipro.test.service;

import com.wipro.test.dto.StudentDTO;
import com.wipro.test.exception.DuplicateRecordException;

public interface StudentServiceInt {

	public long add(StudentDTO dto) throws DuplicateRecordException;
	public void delete(long id);
	public StudentDTO findById(long id);
	public StudentDTO findByEmail(String email);
}
