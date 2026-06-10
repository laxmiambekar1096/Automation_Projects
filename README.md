# SauceDemo Automation Framework

## Overview
This project is an automated testing framework for the SauceDemo web application built using Selenium WebDriver, Java, TestNG, and Maven. The framework follows the Page Object Model (POM) design pattern to improve maintainability, reusability, and scalability.

## Application Under Test
https://www.saucedemo.com/

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub

## Features
- Automated Login Validation
- Product Selection and Cart Validation
- Checkout Process Automation
- Reusable Page Objects
- TestNG Test Execution
- Maven Build Management
- Screenshot Capture (if implemented)
- Easy Maintenance and Scalability

## Project Structure


SauceDemoAutomation/
│
├── src/test/java
│ ├── helper
│ │ ├── BasePage.java
│ │ ├── BaseTest.java
│ ├── pom_pages
│ │ ├── LoginPage_POM.java
│ │ ├── HomePage_ProductPage_POM.java
│ │ ├── CartPage_POM.java
│ │ └── CheckoutPages_POM.java
│ ├── testcases
│ │ ├── Saucedemo_all_Testcase.java
│ ├── utility_Files
│ │ ├── Excel_Utility.java
│ │ ├── ExtentManage_Utility.java
│ │ ├── Screenshot_Utility.java
│ │ └── Wait_Utility.java
│
├── src/test/resources
│ │ ├── config.properties
│ │ ├── Log4j.xml
│ │ ├── Test_Data.xlsx
├── testng.xml
├── pom.xml
└── README.md


## Test Scenarios Covered

### Login Module
- Valid Login
- Invalid Login
- Empty Username Validation
- Empty Password Validation

### Product Module
- Verify Product Listing
- Add Product to Cart
- Remove Product from Cart

### Checkout Module
- Complete Checkout Process
- Verify Order Confirmation Message

## Prerequisites

Before running the project, ensure the following are installed:

- Java JDK 17 or later
- Maven
- Eclipse or IntelliJ IDEA
- Google Chrome Browser

## Installation

1. Clone the repository:

```bash
git clone https://github.com/laxmiambekar1096/SauceDemoAutomation.git
Navigate to the project folder:
cd SauceDemoAutomation
Install dependencies:
mvn clean install
Running Tests
Run All Tests
mvn test
Run Using TestNG
Open the project in Eclipse/IntelliJ.
Right-click on testng.xml.
Select Run As → TestNG Suite.
Test Credentials
Username	Password
standard_user	secret_sauce
Reports

After execution, TestNG reports are available in:

test-output/index.html
Design Pattern Used
Page Object Model (POM)

The framework follows the Page Object Model design pattern where:

Page locators are maintained separately.
Page actions are encapsulated in page classes.
Test scripts remain clean and maintainable.
Future Enhancements
Cucumber BDD Integration
Extent Reports
Jenkins CI/CD Integration
BrowserStack Cross-Browser Testing
Data-Driven Testing using Excel
Parallel Execution

Author
Laxmi Ambekar
QA Automation Tester
