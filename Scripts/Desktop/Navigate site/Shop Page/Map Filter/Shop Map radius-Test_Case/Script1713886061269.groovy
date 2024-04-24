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

WebUI.click(findTestObject('Object Repository/Shop Map filter/button_Accept'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/a_Shop'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/button_Radiuskm_mapboxgl-ctrl-icon mapboxgl_e9ecdf'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/button_Radiuskm_mapboxgl-ctrl-icon mapboxgl_e9ecdf'))

WebUI.doubleClick(findTestObject('Object Repository/Shop Map filter/button_Radiuskm_mapboxgl-ctrl-icon mapboxgl_b0a21e'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/span_Radiuskm_mapboxgl-ctrl-compass-arrow'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/canvas_Radiuskm_mapboxgl-canvas'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/a_Backdrops'))

WebUI.click(findTestObject('Object Repository/Shop Map filter/h1_Backdrops'))

WebUI.closeBrowser()

