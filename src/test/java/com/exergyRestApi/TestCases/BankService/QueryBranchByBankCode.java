package com.exergyRestApi.TestCases.BankService;

import java.io.IOException;

import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.payloads.BankService.BankServicePayloads;

import Utilities.ApiHelper;
import io.restassured.response.Response;

public class QueryBranchByBankCode extends BankServicePayloads{

	public static void  queryBranchByBankCode(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
		
		
		
		ExtentTest test;
		test=extent.createTest("Query Bank By Code");
		Response response;
		response =  ApiHelper.sendRestPostRequest(ApiHelper.bakingSitUrl,ApiHelper.bakingSubKey, ApiHelper.bakingSubId,QueryBranchByBankCodePayload, "/QueryBranchByBankCode");
		response.prettyPrint();
		ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
		test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
		
	
		
		
		
		
	}
	
	

	
}