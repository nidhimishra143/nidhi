package com.wipro.test.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_Course")
public class CourseDTO extends BaseDTO {
   
    @Column(name = "COURSE_NAME", length = 50)
    private String courseName;
   
    @Column(name = "DURATION", length = 50)
    private String duration;
   
    @Column(name = "DESCRIPTION", length = 50)
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
	public String getKey() {
		
		return id + "";
	}
	public String getValue() {
		
		return courseName;
	}
    


}