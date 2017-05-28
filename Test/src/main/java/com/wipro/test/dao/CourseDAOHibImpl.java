package com.wipro.test.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.wipro.test.dto.CourseDTO;

@Repository("CourseDAO")
public class CourseDAOHibImpl implements CourseDAOInt {

	@Autowired
	SessionFactory sessionFactory = null;

	private static Logger log = Logger.getLogger(CourseDAOHibImpl.class);

	public Long add(CourseDTO dto) {
		log.debug("Course Dao Add Started");
		Long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		log.debug("Course Dao Add End");
		return pk;
	}

	
	public CourseDTO findByPK(Long pk) {
		log.debug("CourseDAO Find by PK Started");
		CourseDTO dto = null;
		dto = (CourseDTO) sessionFactory.getCurrentSession().get(CourseDTO.class, pk);
		log.debug("CourseDAO Find by PK Ended");
		
		return dto;
	}

		@Override
	public void delete(Long id) {

		CourseDTO dto = new CourseDTO();
		dto.setId(id);
		log.debug("Course Dao Delete Started");
		sessionFactory.getCurrentSession().delete(dto);
		log.debug("Course Dao Delete End");

	}
		public CourseDTO findByName(String CourseName) {
			log.debug("Course DAO Find by Name Started");
			CourseDTO dto = null;
			List list = sessionFactory.getCurrentSession()
					.createCriteria(CourseDTO.class)
					.add(Restrictions.eq("courseName", CourseName)).list();

			if (list.size() == 1) {
				dto = (CourseDTO) list.get(0);
				
			}
			log.debug("Course DAO Find by Name Ended");
			return dto;

		}
}