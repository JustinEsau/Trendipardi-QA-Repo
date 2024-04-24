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

'Set viewport size Tablet-landscape - 1080 x 810'
WebUI.setViewPortSize(1080, 810)

WebUI.click(findTestObject('Object Repository/Footer/widget-3/button_Accept'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/h2_MORE TRENDI'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/a_How it works'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/img_What happens if I encounter an issue wi_32f865'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/a_FAQs'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/img_What happens if I encounter an issue wi_32f865'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/a_Contact'))

WebUI.click(findTestObject('Object Repository/Footer/widget-3/a_Support'))

WebUI.closeBrowser()

