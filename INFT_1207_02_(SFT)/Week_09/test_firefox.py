import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.firefox.options import Options
import time

class GoogleToYouTubeSearchTest(unittest.TestCase):

    def setUp(self):
        # Headless mode for Firefox (Bonus Task)
      #  firefox_options = Options()
       # firefox_options.add_argument("--headless")
        #firefox_options.add_argument("--width=1920")
        #firefox_options.add_argument("--height=1080")

        self.driver = webdriver.Firefox()
        self.driver.get("https://www.google.com")
        time.sleep(3)  # Wait for page to load

    def tearDown(self):
        self.driver.quit()

    def test_search_on_youtube(self):
        driver = self.driver

        # Step 1: Search for YouTube in Google
        google_search_box = driver.find_element(By.NAME, "q")
        google_search_box.send_keys("https://www.youtube.com")
        google_search_box.send_keys(Keys.RETURN)
        time.sleep(20)

        # Step 2: Click first search result to go to YouTube
        first_result = driver.find_element(By.XPATH, "//h3")
        first_result.click()
        time.sleep(5)

        # Switch to YouTube tab
        driver.switch_to.window(driver.window_handles[-1])
        self.assertIn("YouTube", driver.title)

        # Step 3: Locate YouTube search bar and search "Selenium WebDriver"
        youtube_search_box = driver.find_element(By.NAME, "search_query")
        youtube_search_box.send_keys("Selenium WebDriver")
        youtube_search_box.send_keys(Keys.RETURN)
        time.sleep(5)

        # Step 4: Validate that search term is in title
        self.assertIn("Selenium WebDriver", driver.title)

        # Step 5: Screenshot
        driver.save_screenshot("search_results.png")

        # Step 6: Click first video result
        first_video = driver.find_element(By.ID, "video-title")
        first_video.click()
        time.sleep(5)

        # Step 7: Switch to video tab if opened
        driver.switch_to.window(driver.window_handles[-1])

        # Step 8: Validate title does NOT contain "Google"
        self.assertNotIn("Google", driver.title)

if __name__ == "__main__":
    unittest.main()
