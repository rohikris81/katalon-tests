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

Mobile.comment('Test Case No. - SN1014')

Mobile.comment('Application is launching.............')

CustomKeywords.'living.Common.startApplication'()

Mobile.comment('Waiting for element presence...............')

Mobile.waitForElementPresent(findTestObject('Living/btn Get Started'), GlobalVariable.G_longtimeout)

Mobile.tap(findTestObject('Living/btn Get Started'), 0)

Mobile.tap(findTestObject('Living/link Login'), 0)

Mobile.tap(findTestObject('Object Repository/Living/btn Forgot Password'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Living/input username'), GlobalVariable.G_memberusername)

Mobile.tap(findTestObject('Object Repository/Living/btn Reset Password'), 0)

Mobile.sendKeys(findTestObject('Living/txt OTP Box 1'), '9')

Mobile.sendKeys(findTestObject('Living/txt OTP Box 2'), '9')

Mobile.sendKeys(findTestObject('Living/txt OTP Box 3'), '9')

Mobile.sendKeys(findTestObject('Living/txt OTP Box 4'), '9')

Mobile.sendKeys(findTestObject('Living/txt OTP Box 5'), '9')

Mobile.sendKeys(findTestObject('Living/txt OTP Box 6'), '9')

Mobile.comment('Asssertions started.........')

Mobile.verifyElementExist(findTestObject('Object Repository/Living/btn Verify OTP'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Living/btn Verify OTP'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.tap(findTestObject('Object Repository/Living/btn Verify OTP'), 0)

Mobile.comment('Asssertions started.........')

Mobile.verifyElementVisible(findTestObject('Living/Onboarding/txt password'), 0)

Mobile.verifyElementExist(findTestObject('Living/Onboarding/txt password'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.sendKeys(findTestObject('Living/Onboarding/txt password'), 'Welcome@123')

Mobile.tap(findTestObject('Living/Onboarding/btn Password Save'), 0)

Mobile.comment('Asssertions started.........')

Mobile.verifyElementVisible(findTestObject('Living/lbl input error message'), 0)

Mobile.verifyElementExist(findTestObject('Living/lbl input error message'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.closeApplication()

