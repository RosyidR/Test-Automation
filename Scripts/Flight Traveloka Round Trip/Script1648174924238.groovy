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

WebUI.navigateToUrl('https://traveloka.com')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Click Menu'))

WebUI.click(findTestObject('Click Sub Menu'))

WebUI.click(findTestObject('Round Trip'))

WebUI.setText(findTestObject('Origin'), 'Bandung')

WebUI.click(findTestObject('Click Bandung'))

WebUI.setText(findTestObject('Destination'), 'Bali')

WebUI.delay(2)

WebUI.click(findTestObject('Click Bali'))

WebUI.click(findTestObject('Departure Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Select Date'))

WebUI.click(findTestObject('Click Return'))

WebUI.click(findTestObject('Return open'))

WebUI.delay(2)

WebUI.click(findTestObject('Return Date'))

WebUI.click(findTestObject('Click Passanger'))

WebUI.click(findTestObject('Total Passangers'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Done'))

WebUI.click(findTestObject('Seat Class'))

WebUI.click(findTestObject('Select Class'))

WebUI.click(findTestObject('Search Flight'))

WebUI.delay(10)

WebUI.closeBrowser()

