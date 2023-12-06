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
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AppPath
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_memberusername
     
    /**
     * <p></p>
     */
    public static Object G_memberpassword
     
    /**
     * <p></p>
     */
    public static Object G_wrongusername
     
    /**
     * <p></p>
     */
    public static Object G_wrongpassword
     
    /**
     * <p></p>
     */
    public static Object G_longtimeout
     
    /**
     * <p></p>
     */
    public static Object G_mediumtimeout
     
    /**
     * <p></p>
     */
    public static Object G_shorttimeout
     
    /**
     * <p></p>
     */
    public static Object G_membernamemobile
     
    /**
     * <p></p>
     */
    public static Object G_membermobilepwd
     
    /**
     * <p></p>
     */
    public static Object G_minitimeout
     
    /**
     * <p></p>
     */
    public static Object G_morning_message
     
    /**
     * <p></p>
     */
    public static Object G_evening_message
     
    /**
     * <p></p>
     */
    public static Object G_afternoon_message
     
    /**
     * <p></p>
     */
    public static Object G_morning_messageS
     
    /**
     * <p></p>
     */
    public static Object G_evening_messageS
     
    /**
     * <p></p>
     */
    public static Object G_afternoon_messageS
     
    /**
     * <p></p>
     */
    public static Object G_memname
     
    /**
     * <p></p>
     */
    public static Object UserGoalList
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AppPath = selectedVariables['G_AppPath']
            G_SiteURL = selectedVariables['G_SiteURL']
            G_memberusername = selectedVariables['G_memberusername']
            G_memberpassword = selectedVariables['G_memberpassword']
            G_wrongusername = selectedVariables['G_wrongusername']
            G_wrongpassword = selectedVariables['G_wrongpassword']
            G_longtimeout = selectedVariables['G_longtimeout']
            G_mediumtimeout = selectedVariables['G_mediumtimeout']
            G_shorttimeout = selectedVariables['G_shorttimeout']
            G_membernamemobile = selectedVariables['G_membernamemobile']
            G_membermobilepwd = selectedVariables['G_membermobilepwd']
            G_minitimeout = selectedVariables['G_minitimeout']
            G_morning_message = selectedVariables['G_morning_message']
            G_evening_message = selectedVariables['G_evening_message']
            G_afternoon_message = selectedVariables['G_afternoon_message']
            G_morning_messageS = selectedVariables['G_morning_messageS']
            G_evening_messageS = selectedVariables['G_evening_messageS']
            G_afternoon_messageS = selectedVariables['G_afternoon_messageS']
            G_memname = selectedVariables['G_memname']
            UserGoalList = selectedVariables['UserGoalList']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
