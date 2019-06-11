import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

String requiredCard = "Process Tower View"

WebUI.callTestCase(findTestCase('01_Login_Feature_TestCases/01_Valid_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String activeCard = CustomKeywords.'header_ViewName.Header.activeCardHeaderName'()
if(activeCard != requiredCard){
	CustomKeywords.'newKeyword.DynamicXpath.dragableMatCardsXpath'(requiredCard)
}

WebUI.click(findTestObject('Object Repository/Page_Home/list_view'))

String colour = CustomKeywords.'newKeyword.AutomationBotStatus.BotStatusColourInList'("Cash_Payment_Production Environment")
println colour

String processGrpName = CustomKeywords.'newKeyword.AutomationBotStatus.processGroupInList'("Cash_Payment_Production Environment")
println processGrpName

String lastRunRobotName = CustomKeywords.'newKeyword.AutomationBotStatus.lastRunRobotInList'("Cash_Payment_Production Environment")
println lastRunRobotName
