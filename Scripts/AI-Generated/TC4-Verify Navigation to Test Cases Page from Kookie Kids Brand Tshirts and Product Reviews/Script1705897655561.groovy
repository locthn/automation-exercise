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

'Step 2: At Page home, click on hyperlink 3 kookie kids > navigate to Page brand products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_3_kookie_kids'))

'Step 3: At Page brand products/*, click on hyperlink men'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products/hyperlink_men'))

'Step 4: At Page brand products/*, click on hyperlink tshirts > navigate to Page category products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products/hyperlink_tshirts'))

'Step 5: At Page category products/*, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_6_polo'))

'Step 6: At Page brand products/Polo, click on button continue shopping'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/button_continue_shopping'))

'Step 7: At Page brand products/Polo, click on hyperlink test cases > navigate to Page test cases'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_test_cases'))

'Step 8: Add visual checkpoint at Page_test_cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Navigation to Test Cases Page from Kookie Kids Brand Tshirts and Product Reviews_visual_checkpoint')

'Step 9: At Page test cases, click on hyperlink test case 7 verify test cases page'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_7_verify_test_cases_page'))

'Step 10: At Page test cases, click on hyperlink test case 10 verify subscription in hom'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_10_verify_subscription_in_hom'))

'Step 11: At Page test cases, click on hyperlink test case 21 add review on product'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_21_add_review_on_product'))

'Step 12: At Page test cases, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_products'))

'Step 13: Add visual checkpoint at Page_products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Navigation to Test Cases Page from Kookie Kids Brand Tshirts and Product Reviews_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
