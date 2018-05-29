/**
 * Alipay.com Inc.
 * Copyright (c) 2005-2010 All Rights Reserved.
 */
package com.alipay.sofademo.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * A sample controller.
 */
@Controller
public class SampleController {
	@RequestMapping(value="/sample",method = RequestMethod.GET)
	public void doGet(ModelMap modelMap) {

       modelMap.put("hello","world");

	}
}
