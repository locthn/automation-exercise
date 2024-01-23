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

'Step 2: At Page home, click on hyperlink test cases > navigate to Page test cases'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_test_cases'))

'Step 3: At Page test cases, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_products'))

'Step 4: Add visual checkpoint at Page_products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Adding Women s Dress to Cart and Viewing the Category Products_visual_checkpoint')

'Step 5: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 6: At Page products, click on hyperlink women'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_women'))

'Step 7: At Page products, click on hyperlink dress > navigate to Page category products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_dress'))

'Step 8: At Page category products/*, click on hyperlink add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_add_to_cart'))

'Step 9: Add visual checkpoint at Page_category_products/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Adding Women s Dress to Cart and Viewing the Category Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
