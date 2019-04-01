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
    public static Object Max_Delay
     
    /**
     * <p></p>
     */
    public static Object Min_Delay
     
    /**
     * <p></p>
     */
    public static Object PreviousTestFailed
     

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
            Max_Delay = selectedVariables['Max_Delay']
            Min_Delay = selectedVariables['Min_Delay']
            PreviousTestFailed = selectedVariables['PreviousTestFailed']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
