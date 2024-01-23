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

'Step 2: At Page home, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_products'))

'Step 3: At Page products, click on hyperlink women'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_women'))

'Step 4: At Page products, click on hyperlink tops shirts > navigate to Page category products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_tops_shirts'))

'Step 5: At Page category products/*, click on hyperlink view product > navigate to Page product details/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_view_product'))

'Step 6: Add visual checkpoint at Page_product_details/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Viewing Details of Women s Tops and Shirts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
