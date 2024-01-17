import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page test cases, click on hyperlink test case 7 verify test cases page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_7_verify_test_cases_page'))

'Step 2: At Page test cases, click on hyperlink test case 10 verify subscription in hom'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_10_verify_subscription_in_hom'))

'Step 3: At Page test cases, click on hyperlink test case 21 add review on product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_21_add_review_on_product'))

'Step 4: At Page test cases, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_products'))

'Step 5: Add visual checkpoint at Page_products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Navigation to Various Test Cases from Test Case Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
