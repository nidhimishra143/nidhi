package com.wipro.test.dao;

import java.util.List;

import com.wipro.test.dto.StudentDTO;


public interface StudentDAOInt {

   
    public long add(StudentDTO dto);
    public void delete(long id);
    public StudentDTO findByPK(long pk);
    public StudentDTO findByEmail(String StudentEmail);
   
}