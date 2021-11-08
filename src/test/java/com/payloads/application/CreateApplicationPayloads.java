package com.payloads.application;

public class CreateApplicationPayloads {

	

	public static final String CreateApplicationPayLoad =
			"{\r\n"
				+ "  \"sourceReference\": \"T00005100\",\r\n"
				+ "  \"campaignCode\": \"60200000\",\r\n"
				+ "  \"productCode\": \"60200000\",\r\n"
				+ "  \"policyHolders\": [\r\n"
				+ "    {\r\n"
				+ "      \"preferedCommunicationMethod\": \"Phone\",\r\n"
				+ "      \"initials\": \"RY\",\r\n"
				+ "      \"firstNames\": \"RANDY\",\r\n"
				+ "      \"surname\": \"RAYMOND\",\r\n"
				+ "      \"gender\": \"Male\",\r\n"
				+ "      \"birthDate\": \"1991-05-05T08:47:19.361Z\",\r\n"
				+ "      \"countryOfResidence\": \"South Africa\",\r\n"
				+ "      \"identities\": [\r\n"
				+ "        {\r\n"
				+ "          \"identityType\": \"NationalIdentityNumber\",\r\n"
				+ "          \"identityNumber\": \"9105055913089\",\r\n"
				+ "          \"issueCountry\": \"South Africa\",\r\n"
				+ "          \"issueDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
				+ "          \"expiryDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
				+ "          \"citizenshipCountry\": \"South Africa\"\r\n"
				+ "        }\r\n"
				+ "      ],\r\n"
				+ "      \"contactNumbers\": [\r\n"
				+ "        {\r\n"
				+ "          \"contactType\": \"Mobile\",\r\n"
				+ "          \"contactNumber\": \"0720726932\",\r\n"
				+ "          \"countryCode\": \"27\",\r\n"
				+ "          \"extension\": null\r\n"
				+ "        }\r\n"
				+ "      ],\r\n"
				+ "      \"emailAddress\": \"randy@gmail.com\",\r\n"
				+ "      \"partyType\": \"Person\",\r\n"
				+ "      \"rolePlayerType\": \"PolicyHolder\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "    \"channel\": {\r\n"
				+ "      \"channelType\": \"Kiosk\",\r\n"
				+ "      \"channelLocation\": \"Latitude: 10.8006252, Longitude: 106.705828\",\r\n"
				+ "      \"channelLocationName\": \"Tyme\",\r\n"
				+ "      \"channelReference\": \"TymeTest\",\r\n"
				+ "      \"deviceSerialNumber\": \"352222081992046\"\r\n"
				+ "    }\r\n"
				+ "}";
	
	public static final String CreateApplicationBenefitsPayLoad =
			"[\r\n"
			+ "	{\r\n"
			+ "		\"$type\": \"FuneralBenefit\",\r\n"
			+ "		\"benefitCode\": \"638\",\r\n"
			+ "		\"benefitName\": \"Tyme Funeral Benefit\",\r\n"
			+ "		\"description\": \"Tyme Funeral Benefit\",\r\n"
			+ "		\"benefitCategory\": \"FuneralBenefit\",\r\n"
			+ "		\"lifeAssureds\": [\r\n"
			+ "			{\r\n"
			+ "				\"partyType\": \"Person\",\r\n"
			+ "				\"rolePlayerType\": \"MainLifeAssured\",\r\n"
			+ "				\"partyReference\": \"\",\r\n"
			+ "				\"title\": \"Dr\",\r\n"
			+ "				\"initials\": \"RY\",\r\n"
			+ "				\"firstNames\": \"RANDY\",\r\n"
			+ "				\"surname\": \"RAYMOND\",\r\n"
			+ "				\"maidenName\": \"\",\r\n"
			+ "				\"gender\": \"Male\",\r\n"
			+ "				\"birthDate\": \"1991-05-05T08:47:19.361Z\",\r\n"
			+ "				\"identities\": [\r\n"
			+ "					{\r\n"
			+ "						\"identityType\": \"NationalIdentityNumber\",\r\n"
			+ "						\"identityNumber\": \"9105055913089\",\r\n"
			+ "						\"issueCountry\": \"South Africa\",\r\n"
			+ "						\"issueDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "						\"expiryDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "						\"citizenshipCountry\": \"South Africa\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"maritalStatus\": \"Single\",\r\n"
			+ "				\"contactNumbers\": [\r\n"
			+ "					{\r\n"
			+ "						\"contactType\": \"Mobile\",\r\n"
			+ "						\"contactNumber\": \"0720720722\",\r\n"
			+ "						\"countryCode\": \"27\",\r\n"
			+ "						\"extension\": \"\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"lifeAssuredType\": \"MainLife\",\r\n"
			+ "				\"relationshipToPolicyHolder\": \"Self\",\r\n"
			+ "				\"relationshipToMainInsured\": \"Self\",\r\n"
			+ "				\"selectedCoverAmount\": 40000.0,\r\n"
			+ "				\"benefitPremiums\": []\r\n"
			+ "			},\r\n"
			+ "			{\r\n"
			+ "				\"partyType\": \"Person\",\r\n"
			+ "				\"rolePlayerType\": \"LifeAssured\",\r\n"
			+ "				\"partyReference\": \"\",\r\n"
			+ "				\"title\": \"Dr\",\r\n"
			+ "				\"initials\": \"R\",\r\n"
			+ "				\"firstNames\": \"One\",\r\n"
			+ "				\"surname\": \"Partner\",\r\n"
			+ "				\"maidenName\": \"\",\r\n"
			+ "				\"gender\": \"Female\",\r\n"
			+ "				\"birthDate\": \"1992-01-17T08:47:19.361Z\",\r\n"
			+ "				\"contactNumbers\": [\r\n"
			+ "					{\r\n"
			+ "						\"contactType\": \"Mobile\",\r\n"
			+ "						\"contactNumber\": \"0720720722\",\r\n"
			+ "						\"countryCode\": \"27\",\r\n"
			+ "						\"extension\": \"\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"lifeAssuredType\": \"Partner\",\r\n"
			+ "				\"relationshipToPolicyHolder\": \"Self\",\r\n"
			+ "				\"relationshipToMainInsured\": \"Self\",\r\n"
			+ "				\"selectedCoverAmount\": 20000.0,\r\n"
			+ "				\"benefitPremiums\": []\r\n"
			+ "			}\r\n"
			+ "		]\r\n"
			+ "	}\r\n"
			+ "]";
	public static final String CreateApplicationPolicyHolderPayLoad =
			"[\r\n"
			+ "	{\r\n"
			+ "		\"$type\": \"FuneralBenefit\",\r\n"
			+ "		\"benefitCode\": \"638\",\r\n"
			+ "		\"benefitName\": \"Tyme Funeral Benefit\",\r\n"
			+ "		\"description\": \"Tyme Funeral Benefit\",\r\n"
			+ "		\"benefitCategory\": \"FuneralBenefit\",\r\n"
			+ "		\"lifeAssureds\": [\r\n"
			+ "			{\r\n"
			+ "				\"partyType\": \"Person\",\r\n"
			+ "				\"rolePlayerType\": \"MainLifeAssured\",\r\n"
			+ "				\"partyReference\": \"\",\r\n"
			+ "				\"title\": \"Dr\",\r\n"
			+ "				\"initials\": \"RY\",\r\n"
			+ "				\"firstNames\": \"RANDY\",\r\n"
			+ "				\"surname\": \"RAYMOND\",\r\n"
			+ "				\"maidenName\": \"\",\r\n"
			+ "				\"gender\": \"Male\",\r\n"
			+ "				\"birthDate\": \"1991-05-05T08:47:19.361Z\",\r\n"
			+ "				\"identities\": [\r\n"
			+ "					{\r\n"
			+ "						\"identityType\": \"NationalIdentityNumber\",\r\n"
			+ "						\"identityNumber\": \"9105055913089\",\r\n"
			+ "						\"issueCountry\": \"South Africa\",\r\n"
			+ "						\"issueDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "						\"expiryDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "						\"citizenshipCountry\": \"South Africa\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"maritalStatus\": \"Single\",\r\n"
			+ "				\"contactNumbers\": [\r\n"
			+ "					{\r\n"
			+ "						\"contactType\": \"Mobile\",\r\n"
			+ "						\"contactNumber\": \"0720720722\",\r\n"
			+ "						\"countryCode\": \"27\",\r\n"
			+ "						\"extension\": \"\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"lifeAssuredType\": \"MainLife\",\r\n"
			+ "				\"relationshipToPolicyHolder\": \"Self\",\r\n"
			+ "				\"relationshipToMainInsured\": \"Self\",\r\n"
			+ "				\"selectedCoverAmount\": 40000.0,\r\n"
			+ "				\"benefitPremiums\": []\r\n"
			+ "			},\r\n"
			+ "			{\r\n"
			+ "				\"partyType\": \"Person\",\r\n"
			+ "				\"rolePlayerType\": \"LifeAssured\",\r\n"
			+ "				\"partyReference\": \"\",\r\n"
			+ "				\"title\": \"Dr\",\r\n"
			+ "				\"initials\": \"R\",\r\n"
			+ "				\"firstNames\": \"One\",\r\n"
			+ "				\"surname\": \"Partner\",\r\n"
			+ "				\"maidenName\": \"\",\r\n"
			+ "				\"gender\": \"Female\",\r\n"
			+ "				\"birthDate\": \"1992-01-17T08:47:19.361Z\",\r\n"
			+ "				\"contactNumbers\": [\r\n"
			+ "					{\r\n"
			+ "						\"contactType\": \"Mobile\",\r\n"
			+ "						\"contactNumber\": \"0720720722\",\r\n"
			+ "						\"countryCode\": \"27\",\r\n"
			+ "						\"extension\": \"\"\r\n"
			+ "					}\r\n"
			+ "				],\r\n"
			+ "				\"lifeAssuredType\": \"Partner\",\r\n"
			+ "				\"relationshipToPolicyHolder\": \"Self\",\r\n"
			+ "				\"relationshipToMainInsured\": \"Self\",\r\n"
			+ "				\"selectedCoverAmount\": 20000.0,\r\n"
			+ "				\"benefitPremiums\": []\r\n"
			+ "			}\r\n"
			+ "		]\r\n"
			+ "	}\r\n"
			+ "]";
	
	public static final String CreateApplicationPremiumCollectionPayLoad =
			
			"{\r\n"
			+ "  \"collectionMethod\": \"DebitOrder\",\r\n"
			+ "  \"policyPayer\": {\r\n"
			+ "    \"employmentDetails\": {\r\n"
			+ "      \"employmentStatus\": \"Employed\",\r\n"
			+ "      \"occupation\": \"Developer\",\r\n"
			+ "      \"employeeNumber\": \"HO1234\",\r\n"
			+ "      \"employerName\": \"Hollard\",\r\n"
			+ "      \"employerContactNumber\": {\r\n"
			+ "        \"contactType\": \"Mobile\",\r\n"
			+ "        \"contactNumber\": \"0720720722\",\r\n"
			+ "        \"countryCode\": \"27\",\r\n"
			+ "        \"extension\": \"\"\r\n"
			+ "      },\r\n"
			+ "      \"incomeGroup\": {\r\n"
			+ "        \"name\": \"5000 - 10000\",\r\n"
			+ "        \"currency\": {\r\n"
			+ "          \"currency\": \"ZAR (South Africa Rand)\"\r\n"
			+ "        },\r\n"
			+ "        \"low\": 5000,\r\n"
			+ "        \"high\": 10000\r\n"
			+ "      },\r\n"
			+ "      \"lsmGroup\": \"LSM1\",\r\n"
			+ "      \"salaryDay\": \"20\",\r\n"
			+ "      \"salaryFrequency\": \"Monthly\"\r\n"
			+ "    },\r\n"
			+ "    \"sourceOfIncome\": \"Salary\",\r\n"
			+ "    \"sourceOfIncomeOther\": null,\r\n"
			+ "    \"sourceOfWealth\": \"Savings\",\r\n"
			+ "    \"sourceOfWealthOther\": null,\r\n"
			+ "    \"requirements\": [\r\n"
			+ "      {\r\n"
			+ "        \"requirementReason\": \"FICA\",\r\n"
			+ "        \"requirementType\": \"ProofOfIdentity\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"verifications\": [\r\n"
			+ "      {\r\n"
			+ "        \"verificationType\": \"Identity\",\r\n"
			+ "        \"verified\": true,\r\n"
			+ "        \"source\": {\r\n"
			+ "          \"sourceName\": \"\",\r\n"
			+ "          \"sourceReference\": \"\",\r\n"
			+ "          \"sourceResult\": \"\"\r\n"
			+ "        },\r\n"
			+ "        \"note\": \"\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"documents\": [\r\n"
			+ "      {\r\n"
			+ "        \"documentReference\": \"Test\",\r\n"
			+ "        \"documentType\": \"Proof of Identity\",\r\n"
			+ "        \"documentData\": \"Test22khnoahaoh32hroih3fggf32\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"title\": \"Dr\",\r\n"
			+ "    \"initials\": \"R\",\r\n"
			+ "    \"firstNames\": \"Randy\",\r\n"
			+ "    \"surname\": \"Vandham\",\r\n"
			+ "    \"maidenName\": \"\",\r\n"
			+ "    \"gender\": \"Male\",\r\n"
			+ "    \"birthDate\": \"2020-07-09T08:35:39.829Z\",\r\n"
			+ "    \"countryOfResidence\": \"South Africa\",\r\n"
			+ "    \"identities\": [\r\n"
			+ "      {\r\n"
			+ "        \"identityType\": \"NationalIdentityNumber\",\r\n"
			+ "        \"identityNumber\": \"9205065130086\",\r\n"
			+ "        \"issueCountry\": \"South Africa\",\r\n"
			+ "        \"issueDate\": \"2020-07-09T08:35:39.829Z\",\r\n"
			+ "        \"expiryDate\": \"2020-07-09T08:35:39.829Z\",\r\n"
			+ "        \"citizenshipCountry\": \"South Africa\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"maritalStatus\": \"Single\",\r\n"
			+ "    \"contactNumbers\": [\r\n"
			+ "      {\r\n"
			+ "        \"contactType\": \"Mobile\",\r\n"
			+ "        \"contactNumber\": \"0720720722\",\r\n"
			+ "        \"countryCode\": \"27\",\r\n"
			+ "        \"extension\": \"\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"addresses\": [\r\n"
			+ "      {\r\n"
			+ "        \"addressType\": \"Street\",\r\n"
			+ "        \"addressLine1\": \"Test\",\r\n"
			+ "        \"addressLine2\": \"10 Test Street\",\r\n"
			+ "        \"addressLine3\": \"Happy Land\",\r\n"
			+ "        \"suburb\": \"Happy Land\",\r\n"
			+ "        \"townCity\": \"Happy Town\",\r\n"
			+ "        \"provinceState\": \"Happy\",\r\n"
			+ "        \"country\": \"South Africa\",\r\n"
			+ "        \"postalZipCode\": \"1920\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"emailAddress\": \"randy@gmail.com\",\r\n"
			+ "    \"partyType\": \"Person\",\r\n"
			+ "    \"rolePlayerType\": \"PolicyPayer\",\r\n"
			+ "    \"partyReference\": \"\"\r\n"
			+ "  },\r\n"
			+ "  \"bankAccount\": {\r\n"
			+ "    \"accountHolderName\": \"R Vandham\",\r\n"
			+ "    \"accountType\": \"Cheque\",\r\n"
			+ "    \"bankName\": \"AbsaBankLtd\",\r\n"
			+ "    \"branchName\": \"Test\",\r\n"
			+ "    \"branchCode\": \"1234\",\r\n"
			+ "    \"accountNumber\": \"123123123\",\r\n"
			+ "    \"verified\": true\r\n"
			+ "  },\r\n"
			+ "  \"debitDay\": \"20\"\r\n"
			+ "}";
	
	public static final String CreateApplicationBeneficiariesPayLoad =
			
			"{\r\n"
			+ "	\"personBeneficiaries\":[\r\n"
			+ "		{\r\n"
			+ "			\"beneficiaryType\": \"Person\",\r\n"
			+ "			\"partyType\": \"Person\",\r\n"
			+ "			\"rolePlayerType\": \"Beneficiary\",\r\n"
			+ "			\"relationShiptoPolicyHolder\": \"Brother\",\r\n"
			+ "			\"relationshipToMainInsured\": \"Brother\",\r\n"
			+ "			\"percentageShare\": 100,\r\n"
			+ "			\"note\": \"This is a test\",\r\n"
			+ "			\"title\": \"Dr\",\r\n"
			+ "			\"initials\": \"H\",\r\n"
			+ "			\"firstNames\": \"Happy\",\r\n"
			+ "			\"surname\": \"Vandham\",\r\n"
			+ "			\"maidenName\": \"string\",\r\n"
			+ "			\"gender\": \"Male\",\r\n"
			+ "			\"birthDate\": \"1992-05-06T10:01:09.579Z\",\r\n"
			+ "			\"countryOfResidence\": \"South Africa\",\r\n"
			+ "			\"maritalStatus\": \"Single\",\r\n"
			+ "			\"emailAddress\": \"happy@gmail.com\"\r\n"
			+ "		}\r\n"
			+ "]\r\n"
			+ "}\r\n";
	
	public static final String CreateApplicationStatusPayLoad =
			"\"New\"";
		
	
	public static final String CreateApplicationPolicyHolderPayload=
			"[\r\n"
			+ "  {\r\n"
			+ "    \"title\": \"Dr\",\r\n"
			+ "    \"initials\": \"R\",\r\n"
			+ "    \"firstNames\": \"Randy\",\r\n"
			+ "    \"surname\": \"Vandham\",\r\n"
			+ "    \"maidenName\": \"\",\r\n"
			+ "    \"gender\": \"Male\",\r\n"
			+ "    \"birthDate\": \"1992-04-17T08:47:19.361Z\",\r\n"
			+ "    \"countryOfResidence\": \"South Africa\",\r\n"
			+ "    \"identities\": [\r\n"
			+ "        {\r\n"
			+ "            \"identityType\": \"NationalIdentityNumber\",\r\n"
			+ "            \"identityNumber\": \"9204175130086\",\r\n"
			+ "            \"issueCountry\": \"South Africa\",\r\n"
			+ "            \"issueDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "            \"expiryDate\": \"2020-07-09T08:47:19.361Z\",\r\n"
			+ "            \"citizenshipCountry\": \"South Africa\"\r\n"
			+ "        }\r\n"
			+ "    ],\r\n"
			+ "    \"maritalStatus\": \"Single\",\r\n"
			+ "    \"contactNumbers\": [\r\n"
			+ "        {\r\n"
			+ "            \"contactType\": \"Mobile\",\r\n"
			+ "            \"contactNumber\": \"0720726932\",\r\n"
			+ "            \"countryCode\": \"27\",\r\n"
			+ "            \"extension\": \"\"\r\n"
			+ "        }\r\n"
			+ "    ],\r\n"
			+ "    \"addresses\": [\r\n"
			+ "        {\r\n"
			+ "            \"latitude\": 0.4342132,\r\n"
			+ "            \"longitude\": 0.12214214,\r\n"
			+ "            \"addressType\": \"Street\",\r\n"
			+ "            \"addressLine1\": \"Test\",\r\n"
			+ "            \"addressLine2\": \"10 Test Street\",\r\n"
			+ "            \"addressLine3\": \"Happy Land\",\r\n"
			+ "            \"suburb\": \"Happy Land\",\r\n"
			+ "            \"townCity\": \"Happy Town\",\r\n"
			+ "            \"provinceState\": \"Happy\",\r\n"
			+ "            \"country\": \"South Africa\",\r\n"
			+ "            \"postalZipCode\": \"1920\"\r\n"
			+ "        }\r\n"
			+ "    ],\r\n"
			+ "    \"emailAddress\": \"randy@gmail.com\",\r\n"
			+ "    \"partyType\": \"Person\",\r\n"
			+ "    \"rolePlayerType\": \"PolicyHolder\",\r\n"
			+ "    \"partyReference\": \"PWYYZZZPI\",\r\n"
			+ "    \"preferedCommunicationMethod\": \"Phone\",\r\n"
			+ "    \"marketingConsent\": {\r\n"
			+ "      \"hollardMarketingConsent\": true,\r\n"
			+ "      \"HollardMarketingAndPartnerConsent\": true\r\n"
			+ "    },\r\n"
			+ "    \"employmentDetails\": {\r\n"
			+ "      \"employmentStatus\": \"Employed\",\r\n"
			+ "      \"occupation\": \"Developer\",\r\n"
			+ "      \"employeeNumber\": \"HO1234\",\r\n"
			+ "      \"employerName\": \"Hollard\",\r\n"
			+ "      \"employerContactNumber\": {\r\n"
			+ "        \"contactType\": \"Mobile\",\r\n"
			+ "        \"contactNumber\": \"0720720722\",\r\n"
			+ "        \"countryCode\": \"27\",\r\n"
			+ "        \"extension\": \"\"\r\n"
			+ "      }\r\n"
			+ "    },\r\n"
			+ "    \"sourceOfIncome\": \"Salary\",\r\n"
			+ "    \"sourceOfWealth\": \"Savings\",\r\n"
			+ "    \"requirements\": [\r\n"
			+ "      {\r\n"
			+ "        \"requirementReason\": \"FICA\",\r\n"
			+ "        \"requirementType\": \"ProofOfIdentity\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"verifications\": [\r\n"
			+ "      {\r\n"
			+ "        \"verificationType\": \"Identity\",\r\n"
			+ "        \"verified\": true,\r\n"
			+ "        \"source\": {\r\n"
			+ "          \"sourceName\": \"\",\r\n"
			+ "          \"sourceReference\": \"\",\r\n"
			+ "          \"sourceResult\": \"\"\r\n"
			+ "        },\r\n"
			+ "        \"note\": \"\"\r\n"
			+ "      }\r\n"
			+ "    ],\r\n"
			+ "    \"documents\": [\r\n"
			+ "      {\r\n"
			+ "        \"documentReference\": \"Test\",\r\n"
			+ "        \"documentType\": \"ProofOfIdentity\",\r\n"
			+ "        \"documentData\": \"Test24hskgiu3giugibehbioghv\"\r\n"
			+ "      }\r\n"
			+ "    ]\r\n"
			+ "  }\r\n"
			+ "]";
	
	public static final String CreateApplicationPremiumCollection=
			"{\n"
			+ "   \"collectionMethod\":\"DebitOrder\",\n"
			+ "   \"policyPayer\":{\n"
			+ "      \"preferedCommunicationMethod\":\"None\",\n"
			+ "      \"addresses\":[],\n"
			+ "      \"emailAddress\":\"farhaana@gmail.com\",\n"
			+ "      \"language\":\"None\",\n"
			+ "      \"marketingConsent\":null,\n"
			+ "      \"policyReplacement\":null,\n"
			+ "      \"employmentDetails\":null,\n"
			+ "      \"sourceOfIncome\":\"None\",\n"
			+ "      \"sourceOfIncomeOther\":null,\n"
			+ "      \"sourceOfWealth\":\"None\",\n"
			+ "      \"sourceOfWealthOther\":null,\n"
			+ "      \"countryOfResidence\":\"None\",\n"
			+ "      \"requirements\":[],\n"
			+ "      \"verifications\":[],\n"
			+ "      \"documents\":[],\n"
			+ "      \"title\":\"Mrs\",\n"
			+ "      \"initials\":null,\n"
			+ "      \"firstNames\":\"Farhaana\",\n"
			+ "      \"surname\":\"Baartman\",\n"
			+ "      \"maidenName\":null,\n"
			+ "      \"gender\":\"None\",\n"
			+ "      \"birthDate\":\"1980-10-21T10:00:00Z\",\n"
			+ "      \"identities\":[\n"
			+ "         {\n"
			+ "            \"identityType\":\"NationalIdentityNumber\",\n"
			+ "            \"identityNumber\":\"8010214800089\",\n"
			+ "            \"issueCountry\":\"South Africa\",\n"
			+ "            \"issueDate\":null,\n"
			+ "            \"expiryDate\":null,\n"
			+ "            \"citizenshipCountry\":\"Afghanistan\"\n"
			+ "         }\n"
			+ "      ],\n"
			+ "      \"maritalStatus\":\"None\",\n"
			+ "      \"contactNumbers\":[\n"
			+ "         {\n"
			+ "            \"contactType\":\"Mobile\",\n"
			+ "            \"contactNumber\":\"0825577482\",\n"
			+ "            \"countryCode\":\"27\",\n"
			+ "            \"extension\":null\n"
			+ "         }\n"
			+ "      ],\n"
			+ "      \"partyType\":\"Person\",\n"
			+ "      \"rolePlayerType\":\"PolicyPayer\",\n"
			+ "      \"partyReference\":\"1605-PH-1\"\n"
			+ "   },\n"
			+ "   \"bankAccount\":{\n"
			+ "      \"accountType\":\"Savings\",\n"
			+ "      \"accountNumber\":\"1455098025\",\n"
			+ "      \"accountHolderName\":\"SA Matevhutevhu\",\n"
			+ "      \"branchCode\":\"470010\",\n"
			+ "      \"bankName\":\"CapitecBankLtd\",\n"
			+ "      \"verified\" : true\n"
			+ "\n"
			+ "   },\n"
			+ "   \"debitDay\":\"9\"\n"
			+ "}";
	
	
	
}

	