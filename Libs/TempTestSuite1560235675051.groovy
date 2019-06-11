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


suiteProperties.put('id', 'Test Suites/SanityTestCases')

suiteProperties.put('name', 'SanityTestCases')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\703177908\\Desktop\\CNCAutomation\\Project X - Cora Command\\Project X - Cora Command\\Reports\\SanityTestCases\\20190611_121755\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/SanityTestCases', suiteProperties, [new TestCaseBinding('Test Cases/01_Login_Feature_TestCases/01_Valid_Login', 'Test Cases/01_Login_Feature_TestCases/01_Valid_Login',  null), new TestCaseBinding('Test Cases/01_Login_Feature_TestCases/Verify_SplashScreen', 'Test Cases/01_Login_Feature_TestCases/Verify_SplashScreen',  null), new TestCaseBinding('Test Cases/WorkforceAvailability/CC_Workforce_Check Robot Status', 'Test Cases/WorkforceAvailability/CC_Workforce_Check Robot Status',  null), new TestCaseBinding('Test Cases/WorkforceAvailability/CC_Workforce_Toggle to Hierarchy View', 'Test Cases/WorkforceAvailability/CC_Workforce_Toggle to Hierarchy View',  null), new TestCaseBinding('Test Cases/WorkforceAvailability/CC_Workforce_Verify the Status Count', 'Test Cases/WorkforceAvailability/CC_Workforce_Verify the Status Count',  null), new TestCaseBinding('Test Cases/WorkforceAvailability/DigitalWorkforce_Health', 'Test Cases/WorkforceAvailability/DigitalWorkforce_Health',  null), new TestCaseBinding('Test Cases/Dashboard/UptimeDowntime', 'Test Cases/Dashboard/UptimeDowntime',  null), new TestCaseBinding('Test Cases/Dashboard/Verify_MTBF_MTTR', 'Test Cases/Dashboard/Verify_MTBF_MTTR',  null), new TestCaseBinding('Test Cases/Dashboard/List View_Workforce Availability', 'Test Cases/Dashboard/List View_Workforce Availability',  null), new TestCaseBinding('Test Cases/ProcessTowerView/DragAndDrop_ProcessTowerWidget', 'Test Cases/ProcessTowerView/DragAndDrop_ProcessTowerWidget',  null), new TestCaseBinding('Test Cases/ProcessTowerView/Processdetailview', 'Test Cases/ProcessTowerView/Processdetailview',  null), new TestCaseBinding('Test Cases/ProcessTowerView/ProcessListView', 'Test Cases/ProcessTowerView/ProcessListView',  null), new TestCaseBinding('Test Cases/ProcessTowerView/ValidateProcessTowerViewWidget', 'Test Cases/ProcessTowerView/ValidateProcessTowerViewWidget',  null), new TestCaseBinding('Test Cases/Notifications/CC_Double click on Notification', 'Test Cases/Notifications/CC_Double click on Notification',  null), new TestCaseBinding('Test Cases/Notifications/CC_Notification_Widget Verfication', 'Test Cases/Notifications/CC_Notification_Widget Verfication',  null), new TestCaseBinding('Test Cases/Automated Process Snapshot/DoubleClick_AutomatedProcessSnapshot', 'Test Cases/Automated Process Snapshot/DoubleClick_AutomatedProcessSnapshot',  null), new TestCaseBinding('Test Cases/Automated Process Snapshot/Verify_widget', 'Test Cases/Automated Process Snapshot/Verify_widget',  null), new TestCaseBinding('Test Cases/Automated Process Snapshot/View_VerificationForTimeStamp', 'Test Cases/Automated Process Snapshot/View_VerificationForTimeStamp',  null), new TestCaseBinding('Test Cases/LicenseInventory/Verify_LicenseInventory_DetailView', 'Test Cases/LicenseInventory/Verify_LicenseInventory_DetailView',  null), new TestCaseBinding('Test Cases/LicenseInventory/Verify_LicenseInventory_WidgetView', 'Test Cases/LicenseInventory/Verify_LicenseInventory_WidgetView',  null), new TestCaseBinding('Test Cases/GeographyView/ClickOnAutomatedProcessProcessGroup', 'Test Cases/GeographyView/ClickOnAutomatedProcessProcessGroup',  null), new TestCaseBinding('Test Cases/GeographyView/Verify_GeographyDetailView', 'Test Cases/GeographyView/Verify_GeographyDetailView',  null), new TestCaseBinding('Test Cases/GeographyView/Verify_GeographyWidgetView', 'Test Cases/GeographyView/Verify_GeographyWidgetView',  null), new TestCaseBinding('Test Cases/Dashboard/DoubleClick_SLA_Breaches', 'Test Cases/Dashboard/DoubleClick_SLA_Breaches',  null), new TestCaseBinding('Test Cases/Dashboard/SLABreaches_WidgetView', 'Test Cases/Dashboard/SLABreaches_WidgetView',  null), new TestCaseBinding('Test Cases/Dashboard/ClickOn_ExceptionCategory', 'Test Cases/Dashboard/ClickOn_ExceptionCategory',  null), new TestCaseBinding('Test Cases/Dashboard/ClickOn_ExceptionSubcategory', 'Test Cases/Dashboard/ClickOn_ExceptionSubcategory',  null), new TestCaseBinding('Test Cases/Dashboard/DoubleClick_ExceptionAnalysis', 'Test Cases/Dashboard/DoubleClick_ExceptionAnalysis',  null), new TestCaseBinding('Test Cases/Dashboard/Exception_Analysis_Widget_View', 'Test Cases/Dashboard/Exception_Analysis_Widget_View',  null), new TestCaseBinding('Test Cases/SLA/SLACount', 'Test Cases/SLA/SLACount',  null), new TestCaseBinding('Test Cases/SLA/SLAVerification', 'Test Cases/SLA/SLAVerification',  null), new TestCaseBinding('Test Cases/SLA/WorkforceProcess', 'Test Cases/SLA/WorkforceProcess',  null), new TestCaseBinding('Test Cases/SLA/AutomationProcessSla', 'Test Cases/SLA/AutomationProcessSla',  null), new TestCaseBinding('Test Cases/10_Insight/10.1_InsightsNavigationValidation', 'Test Cases/10_Insight/10.1_InsightsNavigationValidation',  null), new TestCaseBinding('Test Cases/10_Insight/10.2_ValidateByClickingOnWorkforcemetrics', 'Test Cases/10_Insight/10.2_ValidateByClickingOnWorkforcemetrics',  null), new TestCaseBinding('Test Cases/10_Insight/10.3_Validate by clicking on Controller', 'Test Cases/10_Insight/10.3_Validate by clicking on Controller',  null), new TestCaseBinding('Test Cases/10_Insight/10.4_ValidateByClickingOnProcessMetrics', 'Test Cases/10_Insight/10.4_ValidateByClickingOnProcessMetrics',  null), new TestCaseBinding('Test Cases/10_Insight/10.5_ValidateByClickingOnProcessGroup', 'Test Cases/10_Insight/10.5_ValidateByClickingOnProcessGroup',  null), new TestCaseBinding('Test Cases/10_Insight/10.6_ValidateByClickingOnIndividualProcess', 'Test Cases/10_Insight/10.6_ValidateByClickingOnIndividualProcess',  null), new TestCaseBinding('Test Cases/10_Insight/10.7_ClickOnReportsModuleAndVerifyThe Functionality', 'Test Cases/10_Insight/10.7_ClickOnReportsModuleAndVerifyThe Functionality',  null), new TestCaseBinding('Test Cases/10_Insight/10.8_ClickOndownloadIconForOverallWorkforceMetrics', 'Test Cases/10_Insight/10.8_ClickOndownloadIconForOverallWorkforceMetrics',  null), new TestCaseBinding('Test Cases/10_Insight/10.9_Click on Download icon for overall Process metrics', 'Test Cases/10_Insight/10.9_Click on Download icon for overall Process metrics',  null), new TestCaseBinding('Test Cases/Settings_User Card/NavigatingToUserPage', 'Test Cases/Settings_User Card/NavigatingToUserPage',  null), new TestCaseBinding('Test Cases/Settings_User Card/Users Count', 'Test Cases/Settings_User Card/Users Count',  null), new TestCaseBinding('Test Cases/Settings_User Card/UserCount_Validation', 'Test Cases/Settings_User Card/UserCount_Validation',  null), new TestCaseBinding('Test Cases/RoleManagement/PageNavigation', 'Test Cases/RoleManagement/PageNavigation',  null), new TestCaseBinding('Test Cases/RoleManagement/RoleCount', 'Test Cases/RoleManagement/RoleCount',  null), new TestCaseBinding('Test Cases/Diagnostics/Diagnostic_header', 'Test Cases/Diagnostics/Diagnostic_header',  null)])