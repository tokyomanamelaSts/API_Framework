package com.exergySoapRequest;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Utilities.ApiHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PersonPassportNumber {

	public static void validatePersonPassPortNumber(ExtentReports extent) throws URISyntaxException, IOException, SAXException, ParserConfigurationException {

		ExtentTest test;
		test=extent.createTest("validatePersonPassPortNumber");
		String username = "mipusr";
		String password = "69hTryVKjMa4";
		
		System.out.println("Starting test validatePersonPassPortNumber.......\n========================================");
		
		
		FileInputStream fileInputStream = new FileInputStream(new File(System.getProperty("user.dir")+"/SoapRequest/PersonPassportNumber.xml"));
		RestAssured.baseURI = "https://uatsvc.hollard.co.za/PartyVerificationService";

		Response response =
		given()
			    .auth().preemptive().basic(username, password)
			    .cookie("TS01a7fb6e=01eb9fd3170a1c617c16d2810469fc51be347f94c7c48c41032a30faa60445670bbce72e2f9ead2d2c1c5528ea4c79f8362009786b0da59d9067a0dc7d40127d519bf3f9d7; f5avraaaaaaaaaaaaaaaa_session_=JPBBBPACPAJCEMEHNCMLBKBKFGOENAGMGICMOOEBEBBAAMBIPCONEIJCEAGKJOOHAKODPBGOEKPEAODAFOLAEJAKGHNKCCKJNPNMNCNBDOBDLCCHHGMMPGOEGEOPDMGJ")
				.header("Content-Type", "text/xml;charset=UTF-8")
				.header("SOAPAction", "http://hollard.co.za/PartyVerificationService/ScreenAndVerifyParty")
				.header("Authorization", "Basic bWlwdXNyOjY5aFRyeVZLak1hNA==").header("Accept-Encoding", "gzip,deflate")
				.header("Host", "uatsvc.hollard.co.za").and().body(IOUtils.toString(fileInputStream, "UTF-8"))
		.when()
				.post("/PartyVerificationService.svc")
		.then()         
				.statusCode(200).and().extract().response();
		
		

		test.info(MarkupHelper.createCodeBlock(response.asString(),CodeLanguage.XML));
		
		
		
		// validations
		String fullname = ApiHelper.getvaluefromxml(response.asString(), "q1:FullName");
		ApiHelper.AssertEquals("fullname", "Michiel Vorster",fullname, test);
		
		String AddressType = ApiHelper.getvaluefromxml(response.asString(), "q1:AddressType");
		ApiHelper.AssertEquals("AddressType", "None",AddressType, test);
		
		String AddressLine1 = ApiHelper.getvaluefromxml(response.asString(), "q1:AddressLine1");
		ApiHelper.AssertEquals("AddressLine1", "116 Metropolitan Street",AddressLine1, test);
		
		String AddressLine2 = ApiHelper.getvaluefromxml(response.asString(), "q1:AddressLine2");
		ApiHelper.AssertEquals("AddressLine2", "Beacon Valley",AddressLine2, test);
		
		String AddressLine3 = ApiHelper.getvaluefromxml(response.asString(), "q1:AddressLine3");
		ApiHelper.AssertEquals("AddressLine3", "Mitchells Plain",AddressLine3, test);
		
		String IsMatch = ApiHelper.getvaluefromxml(response.asString(), "IsMatch");
		ApiHelper.AssertEquals("IsMatch", "False",IsMatch, test);
		
		
		String RiskRating = ApiHelper.getvaluefromxml(response.asString(), "RiskRating");
		ApiHelper.AssertEquals("RiskRating", "Medium",RiskRating, test);
		
		String SourceReference = ApiHelper.getvaluefromxml(response.asString(), "SourceReference");
		ApiHelper.AssertEquals("SourceReference", "8903060218085",SourceReference, test);
		
		String Q2fullname = ApiHelper.getvaluefromxml(response.asString(), "q2:FullName");
		ApiHelper.AssertEquals("Q2fullname", "LODE CAMILLE NEWMAN",Q2fullname, test);

		

   }


}
