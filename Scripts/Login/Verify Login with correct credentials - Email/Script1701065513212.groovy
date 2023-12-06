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

Mobile.comment('Test Case No. - SN1004')

Mobile.comment('Application is launching.............')

CustomKeywords.'living.Common.startApplication'()

Mobile.comment('Waiting for element presence...............')

Mobile.waitForElementPresent(findTestObject('Living/btn Get Started'), GlobalVariable.G_longtimeout)

CustomKeywords.'living.Elements.loginuser'(GlobalVariable.G_memberusername, GlobalVariable.G_memberpassword)

Mobile.waitForElementPresent(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), GlobalVariable.G_longtimeout)

Mobile.comment('Asssertions started.........')

Mobile.verifyElementVisible(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Living/Home Tab/lbl - Today Activities'), 0)

Mobile.comment('Asssertions closed.........')

Mobile.closeApplication()

