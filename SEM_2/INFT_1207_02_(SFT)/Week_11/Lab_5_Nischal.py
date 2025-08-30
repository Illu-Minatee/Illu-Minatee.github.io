# -------------------------------------------------------------------------------
# Program Name:     Lab5_Nischal.py
# Program Author:   Nischal Shrestha Kasula, StudentID: 100995481  # Student name
# Date Created:     July 21, 2025
#
# Description:      This program automates the process of selecting a product
#                   on an e-commerce website, adding it to the cart, and
#                   verifying the order summary using Selenium WebDriver.
# -------------------------------------------------------------------------------

import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

class ECommerceShoppingTest(unittest.TestCase):

    def setUp(self):
        """
        Test Case Fixture: Runs before each test method.
        Initializes the Chrome WebDriver, maximizes the window, and navigates to the website.
        """
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()
        self.driver.get("https://magento.softwaretestingboard.com/")
        # Adding a wait to ensure the page loads completely before we start interacting with it.
        time.sleep(5)

    def tearDown(self):
        """
        Test Case Fixture: Runs after each test method.
        Closes the browser window to clean up the session.
        """
        self.driver.quit()

    def test_complete_shopping_workflow(self):
        """
        This single test case covers the entire shopping workflow as a sequential process.
        Each step builds upon the previous one.
        """
        driver = self.driver

        # --- Step 1: Navigate to Women -> Tops -> Hoodies & Sweatshirts ---
        print("Step 1: Navigating to Hoodies & Sweatshirts section...")

        # Wait for page to fully load and locate menu elements with explicit waits
        women_menu = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.XPATH, "//span[normalize-space()='Women']"))
        )
        
        # Create ActionChains object to perform hover actions
        actions = ActionChains(driver)
        
        # Hover over Women menu to reveal submenu
        actions.move_to_element(women_menu).perform()
        time.sleep(5)
        
        # Wait for Tops menu to be visible and clickable
        tops_menu = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.XPATH, "//a[@id='ui-id-9']"))
        )
        
        # Hover over Tops to reveal submenu
        actions.move_to_element(tops_menu).perform()
        time.sleep(5)
        
        # Wait for Hoodies & Sweatshirts link and click it
        hoodies_link = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.XPATH, "//a[@id='ui-id-12']//span[contains(text(),'Hoodies & Sweatshirts')]"))
        )
        hoodies_link.click()
        
        # Wait for the product page to load
        time.sleep(5)
        print("Successfully navigated to the Hoodies & Sweatshirts page.")


        # --- Step 2: Select filters for Style, Size, Price, Color, and Material ---
        print("\nStep 2: Applying product filters...")
        
        # Selecting Style: Pullover
        driver.find_element(By.XPATH, "//div[normalize-space()='Style']").click()
        time.sleep(2)
        driver.find_element(By.XPATH, "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[3]//a[1]").click()
        time.sleep(3)
        print("Selected Style: Pullover")

        # Selecting Size: M
        driver.find_element(By.XPATH, "//div[normalize-space()='Size']").click()
        time.sleep(2)
        driver.find_element(By.XPATH, "//a[@aria-label='M']//div[contains(@class,'swatch-option text')][normalize-space()='M']").click()
        time.sleep(3)
        print("Selected Size: M")

        # Selecting Price: $50.00 - $59.99
        driver.find_element(By.XPATH, "//div[normalize-space()='Price']").click()
        time.sleep(2)
        driver.find_element(By.XPATH, "//span[normalize-space()='$59.99']").click()
        time.sleep(3)
        print("Selected Price Range: $50.00 - $59.99")

        # Selecting Color: Purple
        driver.find_element(By.XPATH, "//div[normalize-space()='Color']").click()
        time.sleep(2)
        driver.find_element(By.XPATH, "//a[@aria-label='Purple']//div[contains(@class,'swatch-option color')]").click()
        time.sleep(3)
        print("Selected Color: Purple")

        # Selecting Material: Polyester
        driver.find_element(By.XPATH, "//div[normalize-space()='Material']").click()
        time.sleep(2)
        driver.find_element(By.XPATH, "//div[4]//div[2]//ol[1]//li[3]//a[1]").click()
        time.sleep(5) # Wait for all filters to apply and products to refresh
        print("Selected Material: Polyester")


        # --- Step 3: Select any single dress and click on 'Add to cart' ---
        print("\nStep 3: Selecting a product and adding to cart...")
        
        # First, find the product item box
        product_item_box = WebDriverWait(driver, 10).until(
            EC.presence_of_element_located((By.XPATH, "(//div[@class='product-item-info'])[1]"))
        )
        
        # Before hovering, get the name of the product and store it for our final check
        product_name_expected = product_item_box.find_element(By.XPATH, ".//a[@class='product-item-link']").text
        print(f"Product selected to add to cart: {product_name_expected}")

        # Scroll to the product to ensure it's in view
        driver.execute_script("arguments[0].scrollIntoView({block: 'center'});", product_item_box)
        time.sleep(2)

        # Now, perform the hover action on the product box to reveal the 'Add to Cart' button
        actions.move_to_element(product_item_box).perform()
        time.sleep(3)
        
        # Wait for the Add to Cart button to be present and click
        
        # Wait for button to be clickable
        add_to_cart_button = WebDriverWait(driver, 10).until(
            EC.element_to_be_clickable((By.XPATH, "//span[normalize-space()='Add to Cart']"))
        )
        
        # click
        add_to_cart_button.click()
            
        
        # Wait for the item to be added to the cart and the success message to appear.
        time.sleep(5)
        print(f"'{product_name_expected}' added to cart.")


        # --- Step 4: Click the 'cart icon' ---
        print("\nStep 4: Clicking on the shopping cart icon...")
        
        cart_icon = driver.find_element(By.XPATH, "//a[@class='action showcart']")  
        cart_icon.click()
        time.sleep(3) # Wait for the mini cart to drop down.
        print("Opened the mini cart.")


        # --- Step 5: Click on the 'Proceed to Checkout' Button ---
        print("\nStep 5: Clicking 'Proceed to Checkout'...")
        
        proceed_to_checkout_button = driver.find_element(By.XPATH, "//button[@id='top-cart-btn-checkout']")
        proceed_to_checkout_button.click()
        
        # Wait for the checkout/shipping page to load. This can be a slow page.
        time.sleep(10)
        print("Navigated to the checkout page.")


        # --- Step 6: Assert the 'Order Summary' ---
        print("\nStep 6: Asserting the order summary...")
        
        # Expand the Order Summary if it's not already open.
        order_summary_dropdown = driver.find_element(By.XPATH, "//div[@class='title']")
        # A check to see if the dropdown is already expanded
        if not order_summary_dropdown.get_attribute('aria-expanded') == 'true':
            order_summary_dropdown.click()
        time.sleep(2)

        # Check that the product name in the order summary matches the one we added.
        item_in_cart_element = driver.find_element(By.XPATH, "//strong[@class='product-item-name']")
        product_name_in_cart = item_in_cart_element.text
        
        print(f"Expected item in cart: {product_name_expected}")
        print(f"Item found in order summary: {product_name_in_cart}")
        
        self.assertEqual(product_name_expected, product_name_in_cart, "The item in the cart does not match the selected product.")
        print("Assertion successful: The correct item is in the order summary.")


        # --- Step 7: Finally close the browser (handled by tearDown) ---
        print("\nStep 7: Test complete. Closing the browser...")

if __name__ == "__main__":
    unittest.main()