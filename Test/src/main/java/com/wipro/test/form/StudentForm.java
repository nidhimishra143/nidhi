package com.wipro.test.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.wipro.test.dto.BaseDTO;
import com.wipro.test.dto.StudentDTO;
import java.util.Date;
import com.wipro.test.util.Util;

public class StudentForm extends BaseForm {

    @NotEmpty(message=" ")
    private String firstName;

    @NotEmpty(message=" ")
    private String lastName;

    @NotEmpty(message=" ")
    @DateTimeFormat
    private String dob;

    @NotEmpty(message=" ")
    private String mobileNo;

    @NotEmpty(message=" ")
    @Email
    private String email;

	
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BaseDTO getDto() {
        StudentDTO dto = new StudentDTO();
        dto.setId(id);
        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        dto.setDob(Util.getDate(dob));
        dto.setMobileNo(mobileNo);
        dto.setEmail(email);
      
        return dto;
    }

    public void populate(BaseDTO bDto) {
        StudentDTO dto = (StudentDTO) bDto;
        id = dto.getId();
        firstName = dto.getFirstName();
        lastName = dto.getLastName();
        dob = Util.getDate(dto.getDob());
        mobileNo = dto.getMobileNo();
        email = dto.getEmail();
       

    }

}