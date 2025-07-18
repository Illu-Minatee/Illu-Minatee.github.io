"""
Author: Nischal Shrestha Kasula
Date: July 17, 2025
Type: ICE 5 - Selenium Locating Strategies (Individual)
Description: Automates user registration and login on demo.guru99.com using Selenium WebDriver.
"""

import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
import time

class ICE5_Nischal(unittest.TestCase):

    def setUp(self):
        # Initialize Chrome WebDriver
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()

    def tearDown(self):
        # Close browser after each test
        self.driver.quit()

    def test_01_register_user(self):
        driver = self.driver
        driver.get("http://demo.guru99.com/test/newtours/")
        time.sleep(3)

        register_button = driver.find_element(By.LINK_TEXT, "REGISTER")
        register_button.click()
        time.sleep(3)
        # Fill in Name.
        first_name_input = driver.find_element(By.NAME, "firstName")
        first_name_input.send_keys("Minati")
        time.sleep(2)

        last_name_input = driver.find_element(By.NAME, "lastName")
        last_name_input.send_keys("Illu")
        time.sleep(1)

        phone_input = driver.find_element(By.NAME, "phone")
        phone_input.send_keys("1234567890")
        time.sleep(1)

        email_input = driver.find_element(By.ID, "userName")
        email_input.send_keys("illu@example.com")
        time.sleep(1)

        # === Fill in Mailing Information ===
        address_input = driver.find_element(By.NAME, "address1")
        address_input.send_keys("123 Test Street")
        time.sleep(1)

        city_input = driver.find_element(By.NAME, "city")
        city_input.send_keys("Oshawa")
        time.sleep(1)

        state_input = driver.find_element(By.NAME, "state")
        state_input.send_keys("Ontario")
        time.sleep(1)

        postal_code_input = driver.find_element(By.NAME, "postalCode")
        postal_code_input.send_keys("L1H7K4")
        time.sleep(1)

        # === Select Country from Dropdown ===
        country_dropdown = Select(driver.find_element(By.NAME, "country"))
        country_dropdown.select_by_visible_text("CANADA")
        time.sleep(1)

        # === Fill in User Information ===
        username_input = driver.find_element(By.ID, "email")
        username_input.send_keys("IlluMi")  
        time.sleep(1)

        password_input = driver.find_element(By.NAME, "password")
        password_input.send_keys("yourpassword")  
        time.sleep(1)

        confirm_password_input = driver.find_element(By.NAME, "confirmPassword")
        confirm_password_input.send_keys("yourpassword")
        time.sleep(1)

        # Submit the form
        driver.find_element(By.NAME, "submit").click()
        time.sleep(3)
    

    def test_02_login_user(self):
        driver = self.driver
        driver.get("http://demo.guru99.com/test/newtours/")
        time.sleep(3)

        driver.find_element(By.NAME, "userName").send_keys("IlluMi")
        driver.find_element(By.NAME, "password").send_keys("yourpassword")
        driver.find_element(By.NAME, "submit").click()
        time.sleep(3)

        # Assert login success
        body_text = driver.find_element(By.TAG_NAME, "body").text
        self.assertIn("Login Successfully", body_text)

if __name__ == "__main__":
    unittest.main()
