package living
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import java.text.SimpleDateFormat
import java.util.Date
import internal.GlobalVariable
import io.appium.java_client.MobileElement
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.configuration.RunConfiguration
import java.util.Random
import java.util.concurrent.ThreadLocalRandom


class Common {

	@Keyword
	def static generaterstring() {
		def ran = Math.random()
		return ran
	}

	@Keyword
	def static generateRandomNumber() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			sb.append(rand.nextInt(10));
		}

		//return sb.toString();
	}




	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}


	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}

	@Keyword
	def getListOfElements(String st){
		def ad = MobileDriverFactory.getDriver()
		// Replace "yourLocator" with the actual locator strategy and value
		//String yourLocator = "//*[@class = 'android.widget.TextView' and @resource-id = 'glass.round.voyager.stage:id/title']"
		def myl = ad.findElementsByXPath(st)
		return myl

		// Loop through the list of elements and perform actions
		//	for (WebElement element : myl) {
		// Perform actions on each element
		// For example, you can print the text of each element
		//	println("Element text: " + element.text)
		//	}
	}

	@Keyword
	def Integer getListOfElementsCount(String st){
		def ad = MobileDriverFactory.getDriver()
		// Replace "yourLocator" with the actual locator strategy and value
		//String yourLocator = "//*[@class = 'android.widget.TextView' and @resource-id = 'glass.round.voyager.stage:id/title']"
		def myl = ad.findElementsByXPath(st).size()
		return myl
	}


	@Keyword
	def  Integer getMobileTime() {
		def appiumDriver = MobileDriverFactory.getDriver()
		def dt = appiumDriver.deviceTime
		// Format the device time as needed
		def formattedTime = new SimpleDateFormat("YYYY-MM-DD'T'HH:mm:ss").parse(dt)
		// Extracting time from date time
		def hourt = formattedTime.hours.toInteger()
		return hourt

	}

	@Keyword
	def uninstallApp() {
		def d = MobileDriverFactory.getDriver();
		d.removeApp(GlobalVariable.G_AppPath)
	}


	@Keyword
	def startApplication() {
		String appPath = RunConfiguration.getProjectDir() + GlobalVariable.G_AppPath
		Mobile.startApplication(appPath, true) // Setting it true will uninstall app always before next execution
	}
}