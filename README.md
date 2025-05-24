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
- [Test11–Test26](#coming-soon)

---

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
3. Click **Products**  
4. Verify **ALL PRODUCTS** page  
5. Click **View Product** of first item  
6. Verify product detail: name, price, category, availability, etc.

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

## Test11–Test26: Coming Soon

These will follow the same format and cover:
- Add to cart
- Product recommendations
- Checkout process
- Review features
- Wishlist functions
- Order history
- Search filters
- Payment validation  
...and more!

---

## 🧰 Project Structure

