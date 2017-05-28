package com.wipro.test.ctl;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.test.dto.CourseDTO;
import com.wipro.test.exception.DuplicateRecordException;
import com.wipro.test.form.CourseForm;
import com.wipro.test.service.CourseServiceInt;

@Controller
@RequestMapping(value = "/Course")
public class CourseCtl extends BaseCtl {
	private static Logger log = Logger.getLogger(CourseCtl.class);

	@Autowired
	private CourseServiceInt service;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String display(@RequestParam(required = false) Long id, @ModelAttribute("form") CourseForm form,
			Model model) {

		log.debug("CourseCtl doDisplay() Start");

		if (id != null && id > 0) {
			form.populate(service.findByPK(id));
		}
		return "Course";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Locale locale, @RequestParam(required = false) String operation,
			@ModelAttribute("form") @Valid CourseForm form, BindingResult bindingResult, Model model) {

		log.debug("CourseCtl doSubmit() Start");

		if (bindingResult.hasErrors()) {
			return "Course";
		}

		try {

			if (OP_SAVE.equalsIgnoreCase(operation)) {
				CourseDTO dto = (CourseDTO) form.getDto();
				long id = service.add(dto);
				form.setId(id);
				model.addAttribute("success", "Success");
			}
		} catch (DuplicateRecordException e) {

			model.addAttribute("error", "Error");

		}
		return "Course";

	}
}
