import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/check')

suiteProperties.put('name', 'check')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Users\\703177909\\Desktop\\Project X - Cora Command\\Project X - Cora Command\\Reports\\check\\20190611_082714\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/check', suiteProperties, [new TestCaseBinding('Test Cases/SLA/WorkforceProcess', 'Test Cases/SLA/WorkforceProcess',  null), new TestCaseBinding('Test Cases/SLA/AutomationProcessSla', 'Test Cases/SLA/AutomationProcessSla',  null), new TestCaseBinding('Test Cases/ProcessTowerView/DragAndDrop_ProcessTowerWidget', 'Test Cases/ProcessTowerView/DragAndDrop_ProcessTowerWidget',  null), new TestCaseBinding('Test Cases/ProcessTowerView/Processdetailview', 'Test Cases/ProcessTowerView/Processdetailview',  null), new TestCaseBinding('Test Cases/ProcessTowerView/ProcessListView', 'Test Cases/ProcessTowerView/ProcessListView',  null), new TestCaseBinding('Test Cases/ProcessTowerView/ValidateProcessTowerViewWidget', 'Test Cases/ProcessTowerView/ValidateProcessTowerViewWidget',  null)])
