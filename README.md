# Automation with Selenium & Java Project 

**Website:** [https://automationexercise.com](https://automationexercise.com)

---

## 🧪 Project Requirements

1. Use **Selenium** framework  
2. Use **TestNG**  
3. Use **POM** structure (Page Object Model)  
4. Use **asserts** to verify conditions  
5. Use **wait methods** (avoid `Thread.sleep`)  
6. Capture **screenshots on failure**


---

## 📋 Test Case Index

- [Test1: Register User](#test1-register-user)
- [Test2: Login User with correct email and password](#test2-login-user-with-correct-email-and-password)
- [Test3: Login User with incorrect email and password](#test3-login-user-with-incorrect-email-and-password)
- [Test4: Logout User](#test4-logout-user)
- [Test5: Register User with existing email](#test5-register-user-with-existing-email)
- [Test6: Contact Us Form](#test6-contact-us-form)
- [Test7: Verify Test Cases Page](#test7-verify-test-cases-page)
- [Test8: Verify All Products and product detail page](#test8-verify-all-products-and-product-detail-page)
- [Test9: Search Product](#test9-search-product)
- [Test10: Verify Subscription in home page](#test10-verify-subscription-in-home-page)
- [Test11: Verify Subscription in Cart page](#test11-verify-subscription-in-cart-page)
- [Test12: Add Products in Cart](#test12-add-products-in-cart)
- [Test13: Verify Product quantity in Cart](#test13-verify-product-quantity-in-cart)
- [Test14: Place Order: Register while Checkout](#test14-place-order-register-while-checkout)
- [Test15: Place Order: Register before Checkout](#test15-place-order-register-before-checkout)
- [Test16: Place Order: Login before Checkout](#test16-place-order-login-before-checkout)
- [Test17: Remove Products From Cart](#test17-remove-products-from-cart)
- [Test18: View Category Products](#test18-view-category-products)
- [Test19: View & Cart Brand Products](#test19-view--cart-brand-products)
- [Test20: Search Products and Verify Cart After Login](#test20-search-products-and-verify-cart-after-login)
- [Test21: Add review on product](#test21-add-review-on-product)
- [Test22: Add to cart from Recommended items](#test22-add-to-cart-from-recommended-items)
- [Test23: Verify address details in checkout page](#test23-verify-address-details-in-checkout-page)
- [Test24: Download Invoice after purchase order](#test24-download-invoice-after-purchase-order)
- [Test25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality](#test25-verify-scroll-up-using-arrow-button-and-scroll-down-functionality)
- [Test26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality](#test26-verify-scroll-up-without-arrow-button-and-scroll-down-functionality)

---

##  Known Issues / Test Observations
- [Search Keyword Sensitivity](#test-9-search-t-shirt-diffResults)

----

## Test1: Register User

1. Launch browser  
2. Navigate to `'http://automationexercise.com'`  
3. Verify that home page is visible  
4. Click on **Signup / Login**  
5. Verify **New User Signup!** is visible  
6. Enter name and email  
7. Click **Signup**  
8. Verify **ENTER ACCOUNT INFORMATION** is visible  
9. Fill details: Title, Name, Email, Password, Date of birth  
10. Select checkboxes: Newsletter and Special Offers  
11. Fill address info  
12. Click **Create Account**  
13. Verify **ACCOUNT CREATED!** is visible  
14. Click **Continue**  
15. Verify **Logged in as username**  
16. Click **Delete Account**  
17. Verify **ACCOUNT DELETED!** and click **Continue**

---

## Test2: Login User with correct email and password

1. Launch browser  
2. Go to the site  
3. Click **Signup / Login**  
4. Enter correct credentials  
5. Click **Login**  
6. Verify **Logged in as username**  
7. Click **Delete Account**  
8. Verify **ACCOUNT DELETED!**

---

## Test3: Login User with incorrect email and password

1. Open browser  
2. Go to the site  
3. Click **Signup / Login**  
4. Enter wrong email/password  
5. Click **Login**  
6. Verify error message: **Your email or password is incorrect!**

---

## Test4: Logout User

1. Launch browser  
2. Navigate to the site  
3. Log in with valid credentials  
4. Verify **Logged in as username**  
5. Click **Logout**  
6. Verify redirection to login page

---

## Test5: Register User with existing email

1. Open browser  
2. Go to the site  
3. Click **Signup / Login**  
4. Enter existing email  
5. Click **Signup**  
6. Verify error: **Email Address already exist!**

---

## Test6: Contact Us Form

1. Open browser  
2. Navigate to the site  
3. Click **Contact Us**  
4. Fill name, email, subject, and message  
5. Upload file  
6. Click **Submit**, accept alert  
7. Verify success message  
8. Click **Home**, ensure redirection to home

---

## Test7: Verify Test Cases Page

1. Open browser  
2. Go to site  
3. Click **Test Cases**  
4. Verify navigation to test cases page

---

## Test8: Verify All Products and product detail page

1. Open browser  
2. Go to site  
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. The products list is visible
6. Click on 'View Product' of first product
7. User is landed to product detail page
8. Verify that detail detail is visible: product name, category, price, availability, condition, brand

---

## Test9: Search Product

1. Open browser  
2. Navigate to the site  
3. Click **Products**  
4. Enter product name in search  
5. Click **Search**  
6. Verify **SEARCHED PRODUCTS**  
7. Ensure relevant products are shown

---

## Test10: Verify Subscription in home page

1. Launch browser  
2. Navigate to the site  
3. Scroll to footer  
4. Verify **SUBSCRIPTION** section  
5. Enter email and click arrow  
6. Confirm message: **You have been successfully subscribed!**

---

## Test11: Verify Subscription in Cart page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Cart' button
5. Scroll down to footer
6. Verify text 'SUBSCRIPTION'
7. Enter email address in input and click arrow button
8. Verify success message 'You have been successfully subscribed!' is visible


## Test12: Add Products in Cart
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Products' button
5. Hover over first product and click 'Add to cart'
6. Click 'Continue Shopping' button
7. Hover over second product and click 'Add to cart'
8. Click 'View Cart' button
9. Verify both products are added to Cart



## Test13:  Verify Product quantity in Cart
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'View Product' for any product on home page
5. Verify product detail is opened
6. Increase quantity to 4
7. Click 'Add to cart' button
8. Click 'View Cart' button
9. Verify that product is displayed in cart page with exact quantity


## Test14: Place Order: Register while Checkout
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click Proceed To Checkout
8. Click 'Register / Login' button
9. Fill all details in Signup and create account
10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
11. Verify ' Logged in as username' at top
12.Click 'Cart' button
13. Click 'Proceed To Checkout' button
14. Verify Address Details and Review Your Order
15. Enter description in comment text area and click 'Place Order'
16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
17. Click 'Pay and Confirm Order' button
18. Verify success message 'Your order has been placed successfully!'
19. Click 'Delete Account' button
20. Verify 'ACCOUNT DELETED!' and click 'Continue' button

## Test15: Place Order: Register before Checkout
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Signup / Login' button
5. Fill all details in Signup and create account
6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
7. Verify ' Logged in as username' at top
8. Add products to cart
9. Click 'Cart' button
10. Verify that cart page is displayed
11. Click Proceed To Checkout
12. Verify Address Details and Review Your Order
13. Enter description in comment text area and click 'Place Order'
14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
15. Click 'Pay and Confirm Order' button
16. Verify success message 'Your order has been placed successfully!'
17. Click 'Delete Account' button
18. Verify 'ACCOUNT DELETED!' and click 'Continue' button

## Test16: Place Order: Login before Checkout
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Signup / Login' button
5. Fill email, password and click 'Login' button
6. Verify 'Logged in as username' at top
7. Add products to cart
8. Click 'Cart' button
9. Verify that cart page is displayed
10. Click Proceed To Checkout
11. Verify Address Details and Review Your Order
12. Enter description in comment text area and click 'Place Order'
13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
14. Click 'Pay and Confirm Order' button
15. Verify success message 'Your order has been placed successfully!'


## Test17:  Remove Products From Cart
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click 'X' button corresponding to particular product
8. Verify that product is removed from the cart

## Test18: View Category Products
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that categories are visible on left side bar
4. Click on 'Women' category
5. Click on any category link under 'Women' category, for example: Dress
6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
7. On left side bar, click on any sub-category link of 'Men' category
8. Verify that user is navigated to that category page

## Test19: View & Cart Brand Products
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify that Brands are visible on left side bar
5. Click on any brand name
6. Verify that user is navigated to brand page and brand products are displayed
7. On left side bar, click on any other brand link
8. Verify that user is navigated to that brand page and can see products

## Test20: Search Products and Verify Cart After Login
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Enter product name in search input and click search button
6. Verify 'SEARCHED PRODUCTS' is visible
7. Verify all the products related to search are visible
8. Add those products to cart
9. Click 'Cart' button and verify that products are visible in cart
10. Click 'Signup / Login' button and submit login details
11. Again, go to Cart page
12. Verify that those products are visible in cart after login as well

## Test21: Add review on product
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify user is navigated to ALL PRODUCTS page successfully
5. Click on 'View Product' button
6. Verify 'Write Your Review' is visible
7. Enter name, email and review
8. Click 'Submit' button
9. Verify success message 'Thank you for your review.'

## Test22: Add to cart from Recommended items
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Scroll to bottom of page
4. Verify 'RECOMMENDED ITEMS' are visible
5. Click on 'Add To Cart' on Recommended product
6. Click on 'View Cart' button
7. Verify that product is displayed in cart page

## Test23: Verify address details in checkout page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click 'Signup / Login' button
5. Fill all details in Signup and create account
6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
7. Verify ' Logged in as username' at top
8. Add products to cart
9. Click 'Cart' button
10. Verify that cart page is displayed
11. Click Proceed To Checkout
12. Verify that the delivery address is same address filled at the time registration of account
13. Verify that the billing address is same address filled at the time registration of account
14. Click 'Delete Account' button
15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

## Test24:  Download Invoice after purchase order
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Add products to cart
5. Click 'Cart' button
6. Verify that cart page is displayed
7. Click Proceed To Checkout
8. Click 'Register / Login' button
9. Fill all details in Signup and create account
10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
11. Verify ' Logged in as username' at top
12.Click 'Cart' button
13. Click 'Proceed To Checkout' button
14. Verify Address Details and Review Your Order
15. Enter description in comment text area and click 'Place Order'
16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
17. Click 'Pay and Confirm Order' button
18. Verify success message 'Your order has been placed successfully!'
19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
20. Click 'Continue' button
21. Click 'Delete Account' button
22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

## Test25:  Verify Scroll Up using 'Arrow' button and Scroll Down functionality
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Click on arrow at bottom right side to move upward
7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

## Test26:  Verify Scroll Up without 'Arrow' button and Scroll Down functionality
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down page to bottom
5. Verify 'SUBSCRIPTION' is visible
6. Scroll up page to top
7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


## Known Issues / Test Observations

- Search Keyword Sensitivity
  Searching for `"Tshirt"` returns 6 results, while `"T-shirt"` returns only 3.  
  All `"T-shirt"` results are included in the `"Tshirt"` results.  
  This shows that the search engine is **sensitive to special characters** like hyphens.

  ✅ Suggestion: Normalize search input or improve fuzzy matching to include results for common variations like `T shirt`, `T-shirt`, and `Tshirt`.


