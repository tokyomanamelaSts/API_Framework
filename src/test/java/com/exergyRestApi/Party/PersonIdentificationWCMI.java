package com.exergyRestApi.Party;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.PartyApi.Payloads.PartyApiSitPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import io.restassured.response.Response;

public class PersonIdentificationWCMI extends PartyApiSitPayloads{
	
	public static void  personIdentificationWCMI(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
		
		
		
		ExtentTest test;
		test=extent.createTest("Person Identification With Comprehensive Mortality Information");
		Response response;
		response =  ApiHelper.sendRestPostRequest(ApiHelper.PartyIdentificationSitUrl,ApiHelper.PartySubKey, ApiHelper.PartySubId,PersonIndentificationWCMI, "");
		response.prettyPrint();
		ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
		test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
		
	}

}