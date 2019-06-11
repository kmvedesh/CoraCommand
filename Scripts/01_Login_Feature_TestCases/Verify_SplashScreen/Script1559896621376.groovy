import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('http://cncdevui.azurewebsites.net/UI/#/account/login')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/SplashScreen/Genpact-logo'), 0)

WebUI.comment('GenpactLogo is present')

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Object Repository/SplashScreen/UsernameTextField'), 0)

WebUI.comment('Username Textfiled is present')

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Object Repository/SplashScreen/PasswordTextField'), 0)

WebUI.comment('Password Textfiled is present')

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Object Repository/SplashScreen/VerifyForgot PasswordLink'), 0)

WebUI.comment('Forgot password link  is present')

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Object Repository/SplashScreen/VerifySIGN IN'), 0)

WebUI.comment('SignIn button is present')

WebUI.closeBrowser()

