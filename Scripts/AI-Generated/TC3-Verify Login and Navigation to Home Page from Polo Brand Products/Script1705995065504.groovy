import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import katalon.truetest.Scripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_products'))

'Step 3: Add visual checkpoint at Page_products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Login and Navigation to Home Page from Polo Brand Products_visual_checkpoint')

'Step 4: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 5: At Page products, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_6_polo'))

'Step 6: At Page brand products/Polo, click on hyperlink cart > navigate to Page view cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_cart'))

'Step 7: At Page view cart, click on hyperlink proceed to checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_proceed_to_checkout'))

'Step 8: At Page view cart, click on hyperlink register login > navigate to Page login'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_register_login'))

'Step 9: Login into Application'

Scripts.login()

'Step 10: Add visual checkpoint at Page_home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Login and Navigation to Home Page from Polo Brand Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
