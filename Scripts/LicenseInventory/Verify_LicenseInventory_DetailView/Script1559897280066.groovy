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

String requiredCard = "Notifications"

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()
if(activeCard != requiredCard){
	CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
}

WebUI.doubleClick(findTestObject('Object Repository/License Inventory/License Inventory_Widget'))

WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_Header'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseInventoryDetai_TotalLicense'), 0)

WebUI.waitForPageLoad(10)

WebUI.delay(5)

TotalLicenseCount = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_TotalCount'))

WebUI.comment('Total license count is :' + TotalLicenseCount)

WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_Cost'), 0)

TotalLicenseCost = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_CostValue'))

WebUI.comment('Total license cost is :' + TotalLicenseCost)

WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_Installed'), 0)

TotalInstalledLicenseCount = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_TotalInstalledCount'))

WebUI.comment('Total license cost is :' + TotalInstalledLicenseCount)

WebUI.verifyElementPresent(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_Unused'), 0)

TotalUnusedLicenseCount = WebUI.getText(findTestObject('Object Repository/License Inventory/LicenseInventoryDetail_UnusedCount'))

WebUI.comment('Total license cost is :' + TotalUnusedLicenseCount)

WebUI.closeBrowser()

