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

'Set viewport size Tablet-portrait- 810 x 1080'
WebUI.setViewPortSize(810, 1080)

WebUI.click(findTestObject('Object Repository/Footer/widget-2/button_Accept'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/h2_VENDOR INFO'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/a_My account'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/a_Become a Vendor'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/img_Privacy Policy_attachment-large size-la_652540'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/a_Vendor Subscription (1)'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/h2_Vendor Subscription - 01'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/a_Vendor Store List'))

WebUI.click(findTestObject('Object Repository/Footer/widget-2/h1_Store List'))

WebUI.closeBrowser()

