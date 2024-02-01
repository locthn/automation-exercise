import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on hyperlink signup login > navigate to Page login'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_signup_login'))

'Step 3: Login into Application'

TrueTestScripts.login()

'Step 4: At Page home, click on hyperlink products > navigate to Page products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_products'))

'Step 5: At Page products, click on hyperlink women'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_women'))

'Step 6: At Page products, click on hyperlink tops shirts > navigate to Page category products'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_tops_shirts'))

'Step 7: At Page category products, click on hyperlink view product > navigate to Page product details'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_view_product'))

'Step 8: Add visual checkpoint at Page product details'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Product Details for Women s Tops and Shirts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
