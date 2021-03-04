package com.github.devgcoder.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duheng
 * @Date 2021/3/4 15:27
 */
@RestController
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/test")
	public String test() {
		return "123456";
	}

}
