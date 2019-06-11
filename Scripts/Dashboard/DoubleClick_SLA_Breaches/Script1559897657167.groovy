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

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Count'), 5)

WebUI.click(findTestObject('Object Repository/Todays_Summary_Panel/SLA_Count'))

WebUI.waitForElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_WorkforceHeader'), 
    10)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreached_Count'), 0)

SLABreachedCount = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreached_Count'))

System.out.println('Breached SLA Count is :' + SLABreachedCount)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/Total_setSLAs'), 0)

Total_SLACount = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/Total_setSLAs'))

System.out.println('Total SLA set Count is :' + Total_SLACount)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_WorkforceHeader'), 
    0)

SLA_WorkforceHeader = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_WorkforceHeader'))

System.out.println('Text for Workforce SLA is :' + SLA_WorkforceHeader)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_AutomatedProcessHeader'), 
    0)

SLA_AutomatedProcessHeader = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_AutomatedProcessHeader'))

System.out.println('Text for Automated Process SLA is :' + SLA_AutomatedProcessHeader)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarWorkforce'), 
    0)

SLA_SlidebarWorkfrceHeader = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarWorkforce'))

System.out.println('Slidebar text for Wrkforce SLA is :' + SLA_SlidebarWorkfrceHeader)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarWorkforce_Count'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarAutomatedProcess'), 
    0)

SLA_SlidebarAutomatedProcessHeader = WebUI.getText(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarAutomatedProcess'))

System.out.println('Slidebar text for Automated Process SLA is :' + SLA_SlidebarAutomatedProcessHeader)

WebUI.verifyElementPresent(findTestObject('Object Repository/SLA_Breaches_DetailView/SLABreachesPage_SlidebarAutomatedProcess_Count'), 
    0)

WebUI.closeBrowser()

