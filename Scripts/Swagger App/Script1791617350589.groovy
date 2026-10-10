import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

Mobile.startExistingApplication('com.saucelabs.mydemoapp.android')

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.ImageView'), 60)

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.TextView - Log In'), 60)

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.EditText'), 60)

Mobile.sendKeys('bod@example.com')

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.EditText (1)'), 60)

Mobile.sendKeys('10203040')

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.Button - Login'), 60)

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.ImageView'), 60)

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.TextView - Log Out'), 60)

Mobile.tap(findTestObject('Swagger Login-Logout/android.widget.Button - LOGOUT'), 60)

Mobile.closeApplication()

