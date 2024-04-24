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

WebUI.click(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/button_Accept'))

WebUI.click(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/a_Login  Register'))

WebUI.setText(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/input__username'), 'Dummy_store_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/input__password'), 'w6ZIaFrrRgb6k6CPTl1y/w==')

WebUI.click(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Net Sales'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Pageview'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Sales this Month'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Orders'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Reviews'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/div_Latest Announcement                    See All'))

WebUI.click(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/a_See All'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/h1_Announcement'))

WebUI.click(findTestObject('Object Repository/Vendor-Login/Vendor-dashboard/i_Social Profile_fas fa-power-off'))

WebUI.closeBrowser()

