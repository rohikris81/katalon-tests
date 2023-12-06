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
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

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


class Elements {

	Common co = new Common();

	@Keyword
	def  logoutuser() {

		Mobile.comment('Logout process started......')
		//Mobile.tap(findTestObject('Living/Home Tab/tabMe'), 0)
		Mobile.tap(findTestObject('Object Repository/Living/icon settings gear'), 0)
		Mobile.tap(findTestObject('Object Repository/Living/link logout'), 0)
		Mobile.comment('Waiting for element presence...............')
		Mobile.waitForElementPresent(findTestObject('Living/btn Get Started'), GlobalVariable.G_longtimeout)
		Mobile.comment('Logout process finished......')
	}

	@Keyword
	def  loginuser(String name, String pwd) {

		Mobile.comment('Login process started......')
		Mobile.tap(findTestObject('Living/btn Get Started'), 0)
		Mobile.tap(findTestObject('Living/link Login'), 0)
		Mobile.sendKeys(findTestObject('Object Repository/Living/input username'), name)
		Mobile.sendKeys(findTestObject('Object Repository/Living/input userpassword'), pwd)
		Mobile.tap(findTestObject('Object Repository/Living/btn Login'), 0)
		Mobile.comment('Login process finished......')
	}
}