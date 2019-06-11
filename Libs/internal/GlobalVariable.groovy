package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object MaxDelay
     
    /**
     * <p></p>
     */
    public static Object MinDelay
     
    /**
     * <p></p>
     */
    public static Object URL_Walmart
     
    /**
     * <p></p>
     */
    public static Object Username_Walmart
     
    /**
     * <p></p>
     */
    public static Object Max_Delay
     
    /**
     * <p></p>
     */
    public static Object Min_Delay
     
    /**
     * <p></p>
     */
    public static Object PreviousTestFailed
     
    /**
     * <p></p>
     */
    public static Object OrchestratorURL
     
    /**
     * <p></p>
     */
    public static Object RobotID
     
    /**
     * <p>Profile QA_Environment : Color code of Available robots</p>
     */
    public static Object Robot_Available
     
    /**
     * <p>Profile QA_Environment : Color code of Busy robots</p>
     */
    public static Object Robot_Busy
     
    /**
     * <p>Profile QA_Environment : Color code of Disconnected robots</p>
     */
    public static Object Robot_Disconnected
     
    /**
     * <p></p>
     */
    public static Object ActiveProcessColor
     
    /**
     * <p></p>
     */
    public static Object ProcessTowerName
     
    /**
     * <p></p>
     */
    public static Object Deactivated_Username
     
    /**
     * <p></p>
     */
    public static Object Account
     
    /**
     * <p></p>
     */
    public static Object authToken
     
    /**
     * <p></p>
     */
    public static Object ProcessKey
     
    /**
     * <p></p>
     */
    public static Object RobotState
     
    /**
     * <p></p>
     */
    public static Object ProcessName
     
    /**
     * <p></p>
     */
    public static Object ActiveProcess
     
    /**
     * <p></p>
     */
    public static Object FailedProcess
     
    /**
     * <p></p>
     */
    public static Object CompletedProcess
     
    /**
     * <p></p>
     */
    public static Object AutoProcessCount
     
    /**
     * <p></p>
     */
    public static Object ProcessTowers
     
    /**
     * <p></p>
     */
    public static Object MultipleProcessNames
     
    /**
     * <p>Profile QA_Environment : Color code for active process</p>
     */
    public static Object Automated_Proc_ActiveColorCode
     
    /**
     * <p>Profile QA_Environment : Code of completed proccess</p>
     */
    public static Object Automate_Proc_Completed_code
     
    /**
     * <p>Profile QA_Environment : Code for failed</p>
     */
    public static Object Automated_Proc_Failed_Code
     
    /**
     * <p>Profile QA_Environment : Code for scheduled</p>
     */
    public static Object Automated_Proc_Scheduled
     
    /**
     * <p></p>
     */
    public static Object LicenseName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            MaxDelay = selectedVariables['MaxDelay']
            MinDelay = selectedVariables['MinDelay']
            URL_Walmart = selectedVariables['URL_Walmart']
            Username_Walmart = selectedVariables['Username_Walmart']
            Max_Delay = selectedVariables['Max_Delay']
            Min_Delay = selectedVariables['Min_Delay']
            PreviousTestFailed = selectedVariables['PreviousTestFailed']
            OrchestratorURL = selectedVariables['OrchestratorURL']
            RobotID = selectedVariables['RobotID']
            Robot_Available = selectedVariables['Robot_Available']
            Robot_Busy = selectedVariables['Robot_Busy']
            Robot_Disconnected = selectedVariables['Robot_Disconnected']
            ActiveProcessColor = selectedVariables['ActiveProcessColor']
            ProcessTowerName = selectedVariables['ProcessTowerName']
            Deactivated_Username = selectedVariables['Deactivated_Username']
            Account = selectedVariables['Account']
            authToken = selectedVariables['authToken']
            ProcessKey = selectedVariables['ProcessKey']
            RobotState = selectedVariables['RobotState']
            ProcessName = selectedVariables['ProcessName']
            ActiveProcess = selectedVariables['ActiveProcess']
            FailedProcess = selectedVariables['FailedProcess']
            CompletedProcess = selectedVariables['CompletedProcess']
            AutoProcessCount = selectedVariables['AutoProcessCount']
            ProcessTowers = selectedVariables['ProcessTowers']
            MultipleProcessNames = selectedVariables['MultipleProcessNames']
            Automated_Proc_ActiveColorCode = selectedVariables['Automated_Proc_ActiveColorCode']
            Automate_Proc_Completed_code = selectedVariables['Automate_Proc_Completed_code']
            Automated_Proc_Failed_Code = selectedVariables['Automated_Proc_Failed_Code']
            Automated_Proc_Scheduled = selectedVariables['Automated_Proc_Scheduled']
            LicenseName = selectedVariables['LicenseName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
