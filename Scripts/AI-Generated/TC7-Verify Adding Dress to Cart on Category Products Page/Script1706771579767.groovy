import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page products'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/products')

'Step 2: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 3: At Page products, click on hyperlink women'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_women'))

'Step 4: At Page products, click on hyperlink dress > navigate to Page category products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_dress'))

'Step 5: At Page category products, click on hyperlink add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_add_to_cart'))

'Step 6: Add visual checkpoint at Page category products'

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Adding Dress to Cart on Category Products Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
