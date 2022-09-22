package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entity.Logger;
import com.bankapp.service.LoggerService;

@RestController
public class LoggerController {
	@Autowired
	private LoggerService loggerService;

	// addLog
	public void addLog(Logger logger) {
		loggerService.addLog(logger);
	}

	// showLog
	@GetMapping("/getlogger/{acctID}/logds")
	public Logger showLog(@PathVariable int acctID) {
		return loggerService.showLog(acctID);
	}
   
	public void deleteLog(int acctID) {
		loggerService.deleteLog(acctID);
	}
}
