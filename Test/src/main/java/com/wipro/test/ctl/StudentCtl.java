package com.wipro.test.ctl;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.test.dto.StudentDTO;
import com.wipro.test.exception.DuplicateRecordException;
import com.wipro.test.form.StudentForm;
import com.wipro.test.service.StudentServiceInt;

@Controller
@RequestMapping(value = "/Student")
public class StudentCtl extends BaseCtl {

	private static Logger log = Logger.getLogger(StudentCtl.class);

	@Autowired
	private StudentServiceInt service;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String display(@RequestParam(required = false) Long id, @ModelAttribute("form") StudentForm form,
			Model model) {

		log.debug("StudentCtl doDisplay() Start");

		if (id != null && id > 0) {
			form.populate(service.findById(id));
		}
		return "Student";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Locale locale, @RequestParam(required = false) String operation,
			@ModelAttribute("form") @Valid StudentForm form, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "Student";
		}

		try {

			if (OP_SAVE.equalsIgnoreCase(operation)) {
				if (bindingResult.hasErrors()) {
					return "Student";
				}
				StudentDTO dto = (StudentDTO) form.getDto();
				long id = service.add(dto);
				form.setId(id);

				model.addAttribute("success", "success");

			}

		} catch (DuplicateRecordException e) {

			model.addAttribute("error", "DuplicateRecord");
		}

		return "Student";
	}

}
