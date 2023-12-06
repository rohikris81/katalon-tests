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

Mobile.comment('Test Case No. - LIVING-T1001')

Mobile.comment('Application is launching.............')

CustomKeywords.'living.Common.startApplication'()

Mobile.comment('Waiting for element presence...............')

Mobile.waitForElementPresent(findTestObject('Living/btn Get Started'), GlobalVariable.G_longtimeout)

Mobile.tap(findTestObject('Living/btn Get Started'), 0)

Mobile.waitForElementPresent(findTestObject('Living/Onboarding/txt name'), GlobalVariable.G_longtimeout)

Mobile.sendKeys(findTestObject('Living/Onboarding/txt name'), 'AutoUser')

Mobile.sendKeys(findTestObject('Living/Onboarding/txt Email Address'), CustomKeywords.'living.Common.generateRandomNumber'())

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/checkbox term One'), 0)

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/btn Sign Up'), 0)

Mobile.sendKeys(findTestObject('Living/Onboarding/txt password'), 'Welcome@123')

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/btn Password Save'), 0)

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/btn Sounds Good'), 0)

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/lbl User Goal'), 0)

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/btn Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Living/Onboarding/btn Lets Begin'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), GlobalVariable.G_longtimeout)

Mobile.comment('Asssertions started........')

Mobile.verifyElementExist(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.tap(findTestObject('Living/Home Tab/tabMe'), 0)

//CustomKeywords.'living.Elements.logoutuser'()

Mobile.closeApplication()

