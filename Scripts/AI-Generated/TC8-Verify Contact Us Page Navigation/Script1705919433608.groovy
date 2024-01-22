import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'Step 2: At Page home, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

'Step 3: At Page home, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object'))

'Step 4: At Page home, click on hyperlink object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_object_1'))

'Step 5: At Page home, click on hyperlink contact us > navigate to Page contact us'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_contact_us'))

'Step 6: Add visual checkpoint at Page_contact_us'

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Contact Us Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
