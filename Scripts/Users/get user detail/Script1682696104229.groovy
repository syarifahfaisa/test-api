import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('Users/add user'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'status', 'success')

WS.verifyElementPropertyValue(response, 'message', 'User berhasil ditambahkan')