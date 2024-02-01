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

'Step 5: At Page category products, click on hyperlink cart > navigate to Page view cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category_products/hyperlink_cart'))

'Step 6: At Page view cart, click on hyperlink proceed to checkout > navigate to Page checkout'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_view_cart/hyperlink_proceed_to_checkout'))

'Step 7: At Page checkout, input on textarea message'

WebUI.setText(findTestObject('AI-Generated/Page_checkout/textarea_message'), textarea_message)

'Step 8: At Page checkout, click on hyperlink place order > navigate to Page payment'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/hyperlink_place_order'))

'Step 9: At Page payment, click on input name on card'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/input_name_on_card'))

'Step 10: At Page payment, input on input name on card'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_name_on_card'), input_name_on_card)

'Step 11: At Page payment, input on input card number'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_card_number'), input_card_number)

'Step 12: At Page payment, input on input cvc'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_cvc'), input_cvc)

'Step 13: At Page payment, input on input expiry month'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_month'), input_expiry_month)

'Step 14: At Page payment, input on input expiry year'

WebUI.setText(findTestObject('AI-Generated/Page_payment/input_expiry_year'), input_expiry_year)

'Step 15: At Page payment, click on button pay and confirm order > navigate to Page payment done'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment/button_pay_and_confirm_order'))

'Step 16: At Page payment done, click on hyperlink continue > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_payment_done/hyperlink_continue'))

'Step 17: Add visual checkpoint at Page home'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Place Order and Payment Confirmation for Women s Dress_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
