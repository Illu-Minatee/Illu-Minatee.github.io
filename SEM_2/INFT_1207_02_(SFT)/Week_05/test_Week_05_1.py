# ------------------------------------------------------------------
# Title:     Test File
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 1, 2025
# Purpose:   
# ------------------------------------------------------------------

# import external libraries
import unittest
from Week_05_1 import addTwoNumbers, subtractTwoNumbers, multiplyTwoNumbers, divideTwoNumbers

# Test class for the methods
class TestMathOperations(unittest.TestCase):
    @classmethod
    def setUpClass(cls): 
        print("Run once before all tests")

    @classmethod
    def tearDownClass(cls):
        print("Run once after all tests")       

    def setUp(self):
        print("Run before each test case")
        
    def tearDown(self):
        print("Run after each test case")

    # start testing our methods
    def test_addition(self):
        print("Testing addition method / addTwoNumbers function")
        EXPECTED_RESULT = 8
        result = addTwoNumbers(5, 3)
        # Check if the result matches the expected value
        self.assertEqual(result, EXPECTED_RESULT)

    def test_subtraction(self):
        print("Testing subtraction method / subtractTwoNumbers function")
        EXPECTED_RESULT = 2
        result = subtractTwoNumbers(5, 3)
        # Check if the result matches the expected value
        self.assertEqual(result, EXPECTED_RESULT)

    def test_multiplication(self):
        print("Testing multiplication method / multiplyTwoNumbers function")
        EXPECTED_RESULT = 15
        result = multiplyTwoNumbers(5, 3)
        # Check if the result matches the expected value
        self.assertEqual(result, EXPECTED_RESULT)

    def test_division(self):
        print("Testing division method / divideTwoNumbers function")
        EXPECTED_RESULT = 5 / 3
        result = divideTwoNumbers(5, 3)
        # Check if the result matches the expected value
        self.assertEqual(result, EXPECTED_RESULT)

# Run the tests
if __name__ == '__main__':
    unittest.main()