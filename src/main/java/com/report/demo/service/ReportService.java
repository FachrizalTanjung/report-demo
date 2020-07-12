package com.report.demo.service;

import com.report.demo.dto.VoReq;

import net.sf.jasperreports.engine.JRException;

public interface ReportService {

	byte[] createReport(VoReq request) throws JRException;

}
