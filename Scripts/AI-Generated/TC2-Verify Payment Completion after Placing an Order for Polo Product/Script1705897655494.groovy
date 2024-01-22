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

'Step 2: At Page products, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/div_object'))

'Step 3: At Page products, click on hyperlink 6 polo > navigate to Page brand products/Polo'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_products/hyperlink_6_polo'))

'Step 4: At Page brand products/Polo, click on hyperlink cart > navigate to Page view cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_brand_products_Polo/hyperlink_cart'))

'Step 5: At Page view cart, click on hyperlink proceed to checkout > navigate to Page checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_proceed_to_checkout'))

'Step 6: At Page checkout, input on textarea message'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/textarea_message'), var_1_textarea_message)

'Step 7: At Page checkout, click on hyperlink place order > navigate to Page payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/hyperlink_place_order'))

'Step 8: At Page payment, click on input name on card'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/input_name_on_card'))

'Step 9: At Page payment, input on input name on card'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_name_on_card'), var_2_input_name_on_card)

'Step 10: At Page payment, input on input card number'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_card_number'), var_3_input_card_number)

'Step 11: At Page payment, input on input cvc'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_cvc'), var_4_input_cvc)

'Step 12: At Page payment, input on input expiry month'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_month'), var_5_input_expiry_month)

'Step 13: At Page payment, input on input expiry year'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_year'), var_6_input_expiry_year)

'Step 14: At Page payment, click on button pay and confirm order > navigate to Page payment done/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/button_pay_and_confirm_order'))

'Step 15: Add visual checkpoint at Page_payment_done/*'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Payment Completion after Placing an Order for Polo Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
