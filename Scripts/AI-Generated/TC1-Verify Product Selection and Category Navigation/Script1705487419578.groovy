import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on hyperlink 3 kookie kids > navigate to Page brand products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_3_kookie_kids'))

'Step 2: At Page brand products/*, click on hyperlink men'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products/hyperlink_men'))

'Step 3: At Page brand products/*, click on hyperlink tshirts > navigate to Page category products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products/hyperlink_tshirts'))

'Step 4: At Page category products/*, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_6_polo'))

'Step 5: At Page brand products/Polo, click on button continue shopping'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/button_continue_shopping'))

'Step 6: At Page brand products/Polo, click on hyperlink test cases > navigate to Page test cases'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_test_cases'))

'Step 7: Add visual checkpoint at Page_test_cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Product Selection and Category Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
