import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink test cases > navigate to Page test cases'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_test_cases'))

'Step 3: At Page test cases, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_products'))

'Step 4: Add visual checkpoint at Page_products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify API List Page Navigation_visual_checkpoint')

'Step 5: At Page products, click on hyperlink api testing > navigate to Page api list'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_api_testing'))

'Step 6: Add visual checkpoint at Page_api_list'

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify API List Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
