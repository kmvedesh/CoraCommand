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

WebUI.callTestCase(findTestCase('Dashboard/DoubleClick_ExceptionAnalysis'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_BusinessException'), 
    5)

ExceptionCategory = WebUI.getText(findTestObject('Exception_Analysis_DetailView/DetailExceptionView_BusinessException'))

WebUI.click(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailExceptionView_BusinessException'))

ExceptionSubcategoryHeader = WebUI.getText(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailsExceptionView_subcategoryHeaderName'))

WebUI.scrollToElement(findTestObject('Object Repository/Exception_Analysis_DetailView/DetailsExceptionView_subcategoryHeaderName'), 
    5)

if (ExceptionCategory == ExceptionSubcategoryHeader) {
    System.out.println('Subcategory card displayed')
} else {
    WebUI.comment('Subcategory card not available!!')
}

WebUI.closeBrowser()

