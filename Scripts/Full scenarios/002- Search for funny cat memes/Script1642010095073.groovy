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

'Open browser and navigate to the site'
WebUI.callTestCase(findTestCase('Common test steps/Navigate to site'), [:], FailureHandling.STOP_ON_FAILURE)

'Change global variable value to funny cat memes'
GlobalVariable.searchKeyword = 'funny cat memes'

'Search for funny cat memes keyword'
WebUI.callTestCase(findTestCase('Common test steps/Search function'), [:], FailureHandling.STOP_ON_FAILURE)

String screenshotPath = GlobalVariable.screenshotLocation + CustomKeywords.'customKeywords.newKeyword.generateRandomName'()

'Take screenshot and save it in specific path'
WebUI.takeScreenshot(CustomKeywords.'customKeywords.newKeyword.filePath'(screenshotPath), FailureHandling.CONTINUE_ON_FAILURE)

'Close browser'
WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

