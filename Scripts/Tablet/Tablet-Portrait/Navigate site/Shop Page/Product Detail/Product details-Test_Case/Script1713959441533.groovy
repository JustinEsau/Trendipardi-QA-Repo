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

WebUI.click(findTestObject('Object Repository/Shop Map filter/button_Accept'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/button_Menu'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/a_Shop'))

WebUI.click(findTestObject('Object Repository/Product Detail/h2_Backdrops'))

WebUI.click(findTestObject('Object Repository/Product Detail/img'))

WebUI.click(findTestObject('Object Repository/Product Detail/img_1'))

WebUI.click(findTestObject('Object Repository/Product Detail/img_1_2'))

WebUI.click(findTestObject('Object Repository/Product Detail/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/Product Detail/p_From R1,500.00'))

WebUI.click(findTestObject('Object Repository/Product Detail/span_Tag'))

WebUI.click(findTestObject('Object Repository/Product Detail/a_party backdrops'))

WebUI.click(findTestObject('Object Repository/Product Detail/li_Products tagged party backdrops'))

WebUI.closeBrowser()

