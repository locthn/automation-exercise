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

'Step 2: At Page products, click on hyperlink api testing > navigate to Page api list'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_api_testing'))

'Step 3: Add visual checkpoint at Page api list'

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify API List Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
