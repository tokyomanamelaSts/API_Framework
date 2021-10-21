package com.exergyRestApi.PartyVerification;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.PartyVerificationRest.Payloads.PartyApiSitPayloads;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import Utilities.DataProvider;
import io.restassured.response.Response;

public class TC_002 extends PartyApiSitPayloads{
	
	public static void PersonIdentification_Basic_Invalid_ID(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
		
		String PartyVerificationSitUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSitUrl");
		
		String PartySubId = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubId");

		String PartySubKey = DataProvider.GetPropVal(DataProvider.propertyFilePath, "PartyVerificationSubKey");
	
	
		
		
		ExtentTest test;
		test=extent.createTest("TC_002_PersonIdentification_Basic");
		Response response;
		response =  ApiHelper.sendRestPostRequest(PartyVerificationSitUrl,PartySubKey, PartySubId,PersonIndentificationBasic, "/Person/0706145018084/Identification");
		response.prettyPrint();
		ApiHelper.AssertEquals("Status code" ,"500", String.valueOf(response.statusCode()) , test);
		
		JSONObject innerJson = new JSONObject(response.getBody().asString());
		
	
		String error = innerJson.get("ErrorMessage").toString();
		ApiHelper.AssertEquals("Error Message" ,"Object reference not set to an instance of an object.", error, test);
		
		String uri = innerJson.get("URI").toString();
		ApiHelper.AssertEquals("uri" ,"/Person/0706145018084/Identification", uri, test);
		
		test.info( MarkupHelper.createCodeBlock(PersonIndentificationBasic,CodeLanguage.JSON));
		test.info( "ID Number(Invalid) used: 0706145018084");
		test.info( "Find response below");
		test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));
		

		
	}

}
