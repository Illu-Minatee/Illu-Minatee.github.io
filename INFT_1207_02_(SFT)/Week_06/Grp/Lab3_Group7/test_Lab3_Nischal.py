# ------------------------------------------------------------------------
# Title:     Unit Testing for Shape Area Calculations
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 19, 2025
# Purpose:   This module defines test cases for verifying the correctness
#            and robustness of area calculation functions for Circle, 
#            Trapezium, Ellipse, and Rhombus. It includes a menu-driven 
#            test suite that allows the user to run tests for individual shapes.
# ------------------------------------------------------------------------

import unittest
from Lab3_Nischal import circle_area, trapezium_area, ellipse_area, rhombus_area

# ----------- Test cases for Circle area calculation -----------
class TestCircle(unittest.TestCase):
    def test_valid(self):
        self.assertAlmostEqual(circle_area(3), 28.27433, places=4)  # Standard case

    def test_zero_radius(self):
        self.assertEqual(circle_area(0), 0)  # Edge case: zero input

    def test_negative(self):
        with self.assertRaises(ValueError):  # Invalid: negative radius
            circle_area(-5)

    def test_non_numeric(self):
        with self.assertRaises(TypeError):  # Invalid: string input
            circle_area("circle")


# ----------- Test cases for Trapezium area calculation -----------
class TestTrapezium(unittest.TestCase):
    def test_valid(self):
        self.assertEqual(trapezium_area(4, 6, 5), 25)

    def test_zero_base(self):
        self.assertEqual(trapezium_area(0, 6, 5), 15)

    def test_zero_height(self):
        self.assertEqual(trapezium_area(4, 6, 0), 0)

    def test_negative_base(self):
        with self.assertRaises(ValueError):
            trapezium_area(-4, 6, 5)

    def test_non_numeric(self):
        with self.assertRaises(TypeError):
            trapezium_area("a", 6, 5)


# ----------- Test cases for Ellipse area calculation -----------
class TestEllipse(unittest.TestCase):
    def test_valid(self):
        self.assertAlmostEqual(ellipse_area(3, 5), 47.1238, places=3)

    def test_zero_first_axis(self):
        self.assertEqual(ellipse_area(0, 5), 0)

    def test_zero_second_axis(self):
        self.assertEqual(ellipse_area(3, 0), 0)

    def test_negative_axis(self):
        with self.assertRaises(ValueError):
            ellipse_area(3, -5)

    def test_non_numeric(self):
        with self.assertRaises(TypeError):
            ellipse_area("a", 5)


# ----------- Test cases for Rhombus area calculation -----------
class TestRhombus(unittest.TestCase):
    def test_valid(self):
        self.assertEqual(rhombus_area(6, 8), 24)

    def test_zero_diagonal(self):
        self.assertEqual(rhombus_area(0, 8), 0)  # One diagonal is zero

    def test_negative(self):
        with self.assertRaises(ValueError):
            rhombus_area(6, -8)

    def test_non_numeric(self):
        with self.assertRaises(TypeError):
            rhombus_area("x", 8)


# --------------------- MENU-BASED TEST SUITE ---------------------

if __name__ == '__main__':
    # Loop controller for the test suite
    continue_loop = True

    while continue_loop:
        print("\nShape Area Test Suite")
        print("Select a shape to test:")
        print("[C] Circle\n[T] Trapezium\n[E] Ellipse\n[R] Rhombus")

        choice = input("Enter your choice: ").strip().lower()

        suite = unittest.TestSuite()

        if choice == 'c':
            suite.addTests(unittest.TestLoader().loadTestsFromTestCase(TestCircle))
        elif choice == 't':
            suite.addTests(unittest.TestLoader().loadTestsFromTestCase(TestTrapezium))
        elif choice == 'e':
            suite.addTests(unittest.TestLoader().loadTestsFromTestCase(TestEllipse))
        elif choice == 'r':
            suite.addTests(unittest.TestLoader().loadTestsFromTestCase(TestRhombus))
        else:
            print("Invalid selection. No tests run.")
            continue_loop = False
            continue

        # Run the selected test suite
        runner = unittest.TextTestRunner()
        runner.run(suite)

        # Prompt to run another test
        again = input("\nPress [R] to run another test or any other key to exit: ").strip().lower()
        if again == 'r':
            continue_loop = True
        else:
            print("Exiting test suite. Goodbye!")
            continue_loop = False
