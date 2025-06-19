import unittest
from ICE_3_Nischal import find_smallest
# ------------------------------------------------------------------

# Test class for the methods
class TestMinimum(unittest.TestCase):
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


# Create 9 testcases
    def test_short_list(self):
        self.assertEqual(find_smallest([90]), 90)
        self.assertEqual(find_smallest([12, 10]), 10)
        self.assertEqual(find_smallest([10, 12]), 10)
        self.assertEqual(find_smallest([12, 14, 36]), 12)

        # Using assertLessEqual to check the smallest number correctly matches or is less than others
        self.assertLessEqual(find_smallest([12, 14, 36]), 12)  # 12 should be less than or equal to 12
        
        # Using assertNotEqual to ensure incorrect values don’t match
        self.assertNotEqual(find_smallest([36, 14, 12]), 36)  # Minimum is 12, not 36



    def test_empty_list(self):
        with self.assertRaises(ValueError):
            find_smallest([])

    def test_minimum_at_edges(self):
        self.assertEqual(find_smallest([10, 23, 34, 81, 97]), 10)

        # Using assertTrue to validate correctness logically
        self.assertTrue(find_smallest([97, 81, 34, 23, 10]) == 10) # Checks if the smallest value is correctly 10

    def test_negative_values(self):
        self.assertEqual(find_smallest([10, -2, 5, 23]), -2)
        # Using assertLess to ensure the smallest value is indeed less than others
        self.assertLess(find_smallest([10, -2, -24, 4]), -2)


    def test_all_negative(self):
        self.assertEqual(find_smallest([-23, -31, -45, -56]), -56)
        self.assertEqual(find_smallest([-6, -203, -2, -78]), -203)

    def test_real_numbers(self):
        with self.assertRaises(ValueError):
            find_smallest([23, 34.56, 67, 33])

    def test_invalid_characters(self):
        with self.assertRaises(ValueError):
            find_smallest([23, "hi", 32, 1])
        with self.assertRaises(ValueError):
            find_smallest([12, "&", "*", "34m", "!"])

    def test_duplicate_elements(self):
        self.assertEqual(find_smallest([3, 4, 6, 9, 6]), 3)
        
        # Using assertIn to check if the smallest value is among duplicates
        self.assertIn(find_smallest([13, 6, 6, 9, 15]), [6])


    def test_large_integer(self):
        self.assertEqual(find_smallest([530, 429449672, 97, 23, 46, 59]), 23)

# ------------------------------------------------------------------

# Run the tests
if __name__ == '__main__':
    unittest.main()