package com.wipro.test.ctl;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;


public abstract class BaseCtl  {

	
	protected static final String OP_SAVE = "Save";
	protected static final String OP_DELETE = "Delete";
	
	
	@ModelAttribute
	public void preload(Model model) {
			}

}