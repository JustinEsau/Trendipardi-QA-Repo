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

WebUI.click(findTestObject('Object Repository/Shop- Category/button_Accept'))

WebUI.click(findTestObject('Object Repository/Shop- Category/a_Shop'))

WebUI.click(findTestObject('Object Repository/Shop- Category/h3_Product Categories'))

WebUI.click(findTestObject('Object Repository/Shop- Category/i_Catering Services_fas fa-angle-right'))

WebUI.click(findTestObject('Object Repository/Shop- Category/a_Catering for different party sizes'))

WebUI.click(findTestObject('Object Repository/Shop- Category/h1_Catering for different party sizes'))

WebUI.click(findTestObject('Object Repository/Shop- Category/div_No products were found matching your selection'))

WebUI.closeBrowser()

