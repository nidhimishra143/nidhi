package com.wipro.test.form;

import java.sql.Timestamp;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

import com.wipro.test.dto.BaseDTO;
import com.wipro.test.dto.CourseDTO;

public class CourseForm extends BaseForm {

	@NotEmpty(message = " ")
	private String courseName;

	@NotEmpty(message = " ")
	private String duration;

	@NotEmpty(message = " ")
	private String description;

	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
    public BaseDTO getDto() {

		CourseDTO dto = new CourseDTO();
        dto.setId(id);
        dto.setCourseName(courseName);
        dto.setDuration(duration);
        dto.setDescription(description);
        dto.setCreatedBy(createdBy);
        dto.setModifiedBy(modifiedBy);
        dto.setCreatedDatetime(new Timestamp(new Date().getTime()));
        dto.setModifiedDatetime(new Timestamp(new Date().getTime()));

        return dto;
    }
	
	@Override
	public void populate(BaseDTO bDto) {
		    CourseDTO dto = (CourseDTO) bDto;
	        id = dto.getId();
	        courseName = dto.getCourseName();
	        duration = dto.getDuration();
	        description = dto.getDescription();
	        createdBy = dto.getCreatedBy();
	        modifiedBy = dto.getModifiedBy();
	        createdDatetime = dto.getCreatedDatetime().getTime();
	        modifiedDatetime = dto.getModifiedDatetime().getTime();
	    }


}
