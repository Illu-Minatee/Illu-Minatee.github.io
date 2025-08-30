import unittest
from functions_week6 import is_even, add_two_numbers, multiply_two_numbers
class TestFunctionsWeek6(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        print("Setting up the test class...")
    
    @classmethod
    def tearDownClass(cls):
        print("Tearing down the test class...")

    def setUp(self):
        print("Setting up for a test...")
    
    def tearDown(self):
        print("Tearing down after a test...")


# Test cases for the functions in functions_week6.py    
    def test_is_even(self):
        self.assertEqual(is_even(0), True)
        self.assertEqual(is_even(3), False)
        self.assertEqual(is_even(-2), True)
        self.assertFalse(is_even(5))

    def test_add_two_numbers(self):
        self.assertNotEqual(add_two_numbers(2, 3), 1)
        self.assertEqual(add_two_numbers(-1, 1), 0)
        self.assertEqual(add_two_numbers(0, 0), 0)
        self.assertEqual(add_two_numbers(-5, -5), -10)

    def test_multiply_two_numbers(self):
        self.assertTrue(multiply_two_numbers(2, 3), 6)
        self.assertEqual(multiply_two_numbers(-1, 1), -1)
        self.assertNotEqual(multiply_two_numbers(0, 5), 1)
        self.assertEqual(multiply_two_numbers(-2, -3), 6)

if __name__ == '__main__':
    unittest.main()