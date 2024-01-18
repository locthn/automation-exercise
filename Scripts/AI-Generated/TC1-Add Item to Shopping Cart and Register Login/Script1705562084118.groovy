import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 2: At Page products, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_6_polo'))

'Step 3: At Page brand products/Polo, click on hyperlink cart > navigate to Page view cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_cart'))

'Step 4: At Page view cart, click on hyperlink proceed to checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_proceed_to_checkout'))

'Step 5: At Page view cart, click on hyperlink register login > navigate to Page login'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_register_login'))

'Step 7: Add visual checkpoint at Page_home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add Item to Shopping Cart and Register Login_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
