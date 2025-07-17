# Group: 7
# Title: Week 9 - Selenium WebDriver Google to YouTube Search Automation
# Author: Nischal Shrestha Kasula, StudentID: 100995483
# Date: July 13, 2025
# Purpose: To demonstrate browser automation using Selenium WebDriver and Python unittest framework.
#
# This program automates the following steps:
# 1. Opens Google and performs a natural search to avoid CAPTCHA.
# 2. Navigates to YouTube and searches for "Selenium WebDriver".
# 3. Validates the page title, captures a screenshot, and clicks the first video.
# 4. Confirms that the video page does not include the word "Google".


import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

class GoogleToYouTubeSearchTest(unittest.TestCase):

    def setUp(self):
        # Launch Chrome browser and maximize window
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()

        # Navigate to Google homepage
        self.driver.get("https://www.google.com")
        time.sleep(3)

        # Locate the Google search bar and perform a natural search to avoid CAPTCHA
        search_input = self.driver.find_element(By.NAME, "q")
        search_input.send_keys("me chrome" + Keys.RETURN)
        time.sleep(3)

        # Directly navigate to YouTube (less suspicious than clicking search results)
        self.driver.get("https://www.youtube.com")
        time.sleep(5)

    def tearDown(self):
        # Close the browser after test run
        self.driver.quit()

    def test_search_on_youtube(self):
        driver = self.driver
        time.sleep(10)  # Wait to ensure YouTube is fully loaded

        # Locate the YouTube search bar and search for Selenium WebDriver
        search_bar = driver.find_element(By.NAME, "search_query")
        search_bar.send_keys("Selenium WebDriver" + Keys.RETURN)
        time.sleep(5)

        # Validate that the search term is present in the page title
        self.assertIn("Selenium WebDriver", driver.title)

        # Take a screenshot of the results page
        driver.save_screenshot("search_results.png")

        # Click on the first video result
        first_video = driver.find_element(By.ID, "video-title")
        first_video.click()
        time.sleep(5)

        # Switch to the video tab and verify "Google" is not in the page title
        driver.switch_to.window(driver.window_handles[-1])
        self.assertNotIn("Google", driver.title)

if __name__ == "__main__":
    unittest.main()
