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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

'Maximize current window'
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Footer/button_Accept'))

WebUI.click(findTestObject('Object Repository/Footer/a_Cookie Policy (ZA)'))

WebUI.click(findTestObject('Object Repository/Footer/h2_9. Contact details'))

WebUI.click(findTestObject('Object Repository/Footer/a_Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Footer/h3_Contact Us'))

WebUI.click(findTestObject('Object Repository/Footer/a_Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Footer/h2_Where your data is sent'))

WebUI.click(findTestObject('Object Repository/Footer/a_REDchip MEDIA'))

WebUI.closeBrowser()

