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

//WebUI.click(findTestObject('Object Repository/Page_Home/accountSelection'))
//WebUI.click(findTestObject('Object Repository/Page_Home/walmartLabAccount'))
WebUI.click(findTestObject('Object Repository/Page_Home/insightsTab'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Home/Insights/WorkforceMatrices/downloadIcn_Workforce'))

WebUI.click(findTestObject('Object Repository/Page_Home/Insights/WorkforceMatrices/downloadBtn_WorkfoceMatrices'))

WebUI.delay(5)

File downloadFile = new File('D:\\Users\\703177909\\Downloads')

File[] dirContents = downloadFile.listFiles()

for (int i = 0; i < dirContents.length; i++) {
    println(dirContents[i].getName())

    if (dirContents[i].getName().equals('WorkforceMetrics_WalmartLab_10Jun2019.xlsx')) {
        println(('File :' + dirContents[i].getName()) + '       Downloaded')

        break
    } else {
        println('File not present')
    }
}

WebUI.closeBrowser()

