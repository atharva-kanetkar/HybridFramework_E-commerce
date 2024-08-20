# HybridFramework_E-commerce
Creating Hyrbid Framework using Java, Selenium, testng for an E-Commerce application

Steps involved in creating a framework 
 
1) Creating folder structure.

2) Adding Dependencies.

3) Adding one test case - Account registration.

4) Create a base page, the Base page will have one constructor and initialize the driver, and every other page will extend base page.

5) Create locators and action methods for home page

6) Create locators and actions methods for Register page

7) Used RandomStringUtils.randomAlphabetic method from Common-lang repository to generate random email for register page

8) Create base class in test cases and keep the common methods to reuse (setup, teardown, randomnumbers, strings etc)

9) Every Test case now will extend base class (Launching the website, teardown, common methods etc)

10) And every object class will extend base page (Initialization of driver)

11) Creating Logging for test cases

12) Added Log4j-core and log4j-api Dependancies

13) Added log4j2.xml under test resources 

14)Under Base class, create logger variable 

15) Under test case, add the necessary logs 
