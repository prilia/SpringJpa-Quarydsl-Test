package org.nli.web.controller;

import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mock")
@Produces("application/json")
public class MockController {
	
	private static final Logger logger = Logger.getLogger(MockController.class);
	
	
}
