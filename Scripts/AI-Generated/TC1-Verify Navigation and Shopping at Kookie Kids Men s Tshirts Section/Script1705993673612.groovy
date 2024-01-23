import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Navigation and Shopping at Kookie Kids Men s Tshirts Section_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
