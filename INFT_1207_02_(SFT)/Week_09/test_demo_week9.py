import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
import time

class AutomationPracticeTest(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.maximize_window()
        self.driver.get("http://automationpractice.pl")
        time.sleep(5)


    def tearDown(self):
        self.driver.quit()


    def test_product_page_loads(self):
        driver = self.driver
        time.sleep(5)

        women_button = driver.find_element(By.LINK_TEXT, "Women")
        women_button.click()
        time.sleep(5)

if __name__ == "__main__":
    unittest.main()