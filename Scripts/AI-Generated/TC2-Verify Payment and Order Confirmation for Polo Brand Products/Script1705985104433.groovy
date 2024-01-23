import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

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

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Payment and Order Confirmation for Polo Brand Products_visual_checkpoint')

'Step 5: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 6: At Page products, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_6_polo'))

'Step 7: At Page brand products/Polo, click on hyperlink cart > navigate to Page view cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_cart'))

'Step 8: At Page view cart, click on hyperlink proceed to checkout > navigate to Page checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_proceed_to_checkout'))

'Step 9: At Page checkout, input on textarea message'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/textarea_message'), var_1_textarea_message)

'Step 10: At Page checkout, click on hyperlink place order > navigate to Page payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/hyperlink_place_order'))

'Step 11: At Page payment, click on input name on card'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/input_name_on_card'))

'Step 12: At Page payment, input on input name on card'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_name_on_card'), var_2_input_name_on_card)

'Step 13: At Page payment, input on input card number'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_card_number'), var_3_input_card_number)

'Step 14: At Page payment, input on input cvc'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_cvc'), var_4_input_cvc)

'Step 15: At Page payment, input on input expiry month'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_month'), var_5_input_expiry_month)

'Step 16: At Page payment, input on input expiry year'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_year'), var_6_input_expiry_year)

'Step 17: At Page payment, click on button pay and confirm order > navigate to Page payment done/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/button_pay_and_confirm_order'))

'Step 18: Add visual checkpoint at Page_payment_done/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Payment and Order Confirmation for Polo Brand Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
