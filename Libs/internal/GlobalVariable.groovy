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
    public static Object googleSite
     
    /**
     * <p></p>
     */
    public static Object averageWait
     
    /**
     * <p></p>
     */
    public static Object searchKeyword
     
    /**
     * <p></p>
     */
    public static Object sparkNetworkLink
     
    /**
     * <p></p>
     */
    public static Object funnyCatMemesScreenshot
     
    /**
     * <p></p>
     */
    public static Object screenshotLocation
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            googleSite = selectedVariables['googleSite']
            averageWait = selectedVariables['averageWait']
            searchKeyword = selectedVariables['searchKeyword']
            sparkNetworkLink = selectedVariables['sparkNetworkLink']
            funnyCatMemesScreenshot = selectedVariables['funnyCatMemesScreenshot']
            screenshotLocation = selectedVariables['screenshotLocation']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
