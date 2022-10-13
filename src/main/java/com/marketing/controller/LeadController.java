package com.marketing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	
	//Handler Method
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
}
