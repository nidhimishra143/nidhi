package com.wipro.test.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wipro.test.dto.StudentDTO;

@Repository("StudentDAO")
public class StudentDAOHibImpl implements StudentDAOInt {

	@Autowired
	SessionFactory sessionFactory = null;

	private static Logger log = Logger.getLogger(StudentDAOHibImpl.class);

	public long add(StudentDTO dto) {

		long pk = (Long) sessionFactory.getCurrentSession().save(dto);

		return pk;
	}

	public void delete(StudentDTO dto) {
		sessionFactory.getCurrentSession().delete(dto);

	}

	@Override
	public StudentDTO findByPK(long pk) {
		System.out.println("in find by pk dao start");
		StudentDTO dto = null;
		dto = (StudentDTO) sessionFactory.getCurrentSession().get(StudentDTO.class, pk);
		return dto;
	}

	@Override
	public void delete(long id) {
		StudentDTO dto = new StudentDTO();
		dto.setId(id);
		sessionFactory.getCurrentSession().delete(dto);

	}
	 public StudentDTO findByEmail(String StudentEmail) {
	    	
	        StudentDTO dto = null;
	        List list = sessionFactory.getCurrentSession().createCriteria(StudentDTO.class)
	                .add(Restrictions.eq("email", StudentEmail)).list();

	        System.out.println("List Size in Find By Email Dao " + list.size());

	        if (list.size() == 1) {
	            dto = (StudentDTO) list.get(0);
	            System.out.println("DTO Not Null");
	        }
	       return dto;
		}

}