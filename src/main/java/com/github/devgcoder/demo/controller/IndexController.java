package com.github.devgcoder.demo.controller;

import com.github.devgcoder.monitor.anno.MonitorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duheng
 * @Date 2021/3/4 15:27
 */
@MonitorController
@RestController
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/test")
	public String test() {
		return "123456";
	}

	@RequestMapping("/test2")
	public String test2() {
		return "789000";
	}
}
