import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.comment('Test Case to execute - LIVING-T2010')

Mobile.comment('Application is launching.............')

CustomKeywords.'living.Common.startApplication'()

Mobile.comment('Waiting for element presence...............')

Mobile.waitForElementPresent(findTestObject('Living/btn Get Started'), GlobalVariable.G_longtimeout)

CustomKeywords.'living.Elements.loginuser'(GlobalVariable.G_memberusername, GlobalVariable.G_memberpassword)

Mobile.waitForElementPresent(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), GlobalVariable.G_longtimeout)

Mobile.comment('Asssertions started.........')

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Top Section - Affirmation'), GlobalVariable.G_minitimeout)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Wellbeing Section'), GlobalVariable.G_minitimeout)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Check In Tab'), GlobalVariable.G_minitimeout)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Timer Tab'), GlobalVariable.G_minitimeout)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Downloads Tab'), GlobalVariable.G_minitimeout)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Favorites Tab'), GlobalVariable.G_minitimeout)

//Mobile.verifyElementExist(findTestObject('Living/Home Tab/Morning Feeds'), GlobalVariable.G_minitimeout)

Mobile.comment('Trying to scroll till Like section reached............')

Mobile.scrollToText(txt_maylike, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Living/Home Tab/Afternoon Feeds'), 0)

//Mobile.verifyElementExist(findTestObject('Living/Home Tab/Evening Feeds'), 0)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Meditation Tab'), 0)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Music Tab'), 0)

Mobile.verifyElementExist(findTestObject('Living/Home Tab/Food Tab'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.closeApplication()

