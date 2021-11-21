package com.exergyRestApi.TestCases.policy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.payloads.application.CreateApplicationPayloads;
import com.policyPayloads.policyPayloads;

import Utilities.ApiHelper;
import Utilities.DataProvider;
import io.restassured.response.Response;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


public class UploadDocument extends policyPayloads {

public static void  uploadDocument(ExtentReports extent) throws URISyntaxException, SAXException, IOException, ParserConfigurationException {
	
	
	
	
    String policySitUrl = DataProvider.GetPropVal(DataProvider.propertyFilePath, "policySitUrl");
	
	String policySubId = DataProvider.GetPropVal(DataProvider.propertyFilePath, "policySubId");

	String policySubKey = DataProvider.GetPropVal(DataProvider.propertyFilePath, "policySubKey");
	
	
	
	ExtentTest test;
	test=extent.createTest("Upload document");
	Response response;
	response =  ApiHelper.sendRestPostRequest(policySitUrl,policySubKey,policySubId,UploadDocument, "/Policy/50000007/Attachment?policyHolderIdentityNumber=8412260245088");
	response.prettyPrint();
	ApiHelper.AssertEquals("Status code" ,"200", String.valueOf(response.statusCode()) , test);
	
	
	//additions
	 
	test.info( "Find payload(Request) below");
    test.info( MarkupHelper.createCodeBlock(UploadDocument,CodeLanguage.JSON));
    test.info( "Find response below");
    test.info( MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.JSON));

}



	
}