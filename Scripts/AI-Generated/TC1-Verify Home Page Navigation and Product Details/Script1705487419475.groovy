import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page products, click on hyperlink home > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_home'))

'Step 2: At Page home, click on hyperlink view product > navigate to Page product details/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_view_product'))

'Step 3: At Page product details/*, click on button add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_add_to_cart'))

'Step 4: Add visual checkpoint at Page_product_details/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Home Page Navigation and Product Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
