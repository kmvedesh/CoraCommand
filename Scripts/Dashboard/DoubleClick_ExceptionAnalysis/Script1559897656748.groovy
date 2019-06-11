import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String requiredCard = 'Exception Analysis'

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()

if (activeCard != requiredCard) {
    CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
}

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_HeaderName'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_HeaderName'), 
    10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop1stException'), 
    5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop2ndException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop3rdException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop4thException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop5thException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop6thException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_CatagoryTop6thException'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_TotalExceptionCount_DonutChart'), 
    0)

ExceptionCount = WebUI.getText(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_TotalExceptionCount_DonutChart'))

System.out.println(ExceptionCount)

WebUI.closeBrowser()

