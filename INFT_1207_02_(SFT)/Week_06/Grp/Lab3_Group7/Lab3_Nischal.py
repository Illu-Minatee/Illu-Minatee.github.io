# ------------------------------------------------------------------------
# Title:     Area Calculation for Multiple Geometric Shapes
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 19, 2025
# Purpose:   This Python module defines robust area calculation functions
#            for Circle, Trapezium, Ellipse, and Rhombus. It includes input 
#            validation to prevent calculation errors and is designed to be 
#            tested independently for each shape using a unit testing suite.
# ------------------------------------------------------------------------

# Import necessary libraries
from math import pi

# Function Definitions for Area Calculations

# Function to calculate the area of a circle
def circle_area(r):
    if not isinstance(r, (int, float)): # Check if radius is a number using isinstance / isinstance(object, (type1, type2))
        raise TypeError("Radius must be a number.") # Raise TypeError if radius is not a number
    # Check if radius is negative
    if r < 0:
        raise ValueError("Radius cannot be negative.")
    
    # If it passes the checks, calculate the area
    return pi * r ** 2

# Function to calculate the area of a trapezium
def trapezium_area(a, b, h):
    for val in (a, b, h):
        if not isinstance(val, (int, float)):
            raise TypeError("Base and height must be numbers.")
        if val < 0:
            raise ValueError("Base and height cannot be negative.")
    return 0.5 * (a + b) * h

# Function to calculate the area of an ellipse
def ellipse_area(a, b):
    for val in (a, b):
        if not isinstance(val, (int, float)):
            raise TypeError("Semi-axes must be numbers.")
        if val < 0:
            raise ValueError("Semi-axes cannot be negative.")
    return pi * a * b

# Function to calculate the area of a rhombus
def rhombus_area(d1, d2):
    for val in (d1, d2):
        if not isinstance(val, (int, float)):
            raise TypeError("Diagonals must be numbers.")
        if val < 0:
            raise ValueError("Diagonals cannot be negative.")
    return 0.5 * d1 * d2

# Function to get a float input from the user with error handling
def get_float(prompt):
    try:
        return float(input(prompt))
    except ValueError:
        print("-" * 60)
        print("❌ Invalid input. Please enter a number. ❌")
        print("-" * 60)
        # If input is not a valid float, prompt again
        return get_float(prompt)

# Main program loop to interact with the user
# This loop allows the user to select a shape and calculate its area
if __name__ == '__main__':
    # Initialize loop control variable
    continue_program = True

    # Main loop to keep the program running until the user decides to exit
    while continue_program:
        print("=" * 18)
        print("Area Calculator")
        print("=" * 18)

        print("[C] Circle\n[T] Trapezium\n[E] Ellipse\n[R] Rhombus")
        print("-"*60)
        choice = input("Choose a shape: ").strip().lower()

        try:
            if choice == 'c':
                r = get_float("Enter radius: ")
                # Calculate and print the area of the circle with 4 decimal places up to 4
                print(f"Area of Circle: {circle_area(r):.4f}")

            elif choice == 't':
                a = get_float("Enter base a: ")
                b = get_float("Enter base b: ")
                h = get_float("Enter height h: ")
                print(f"Area of Trapezium: {trapezium_area(a, b, h):.4f}")

            elif choice == 'e':
                a = get_float("Enter semi-axis a: ")
                b = get_float("Enter semi-axis b: ")
                print(f"Area of Ellipse: {ellipse_area(a, b):.4f}")

            elif choice == 'r':
                d1 = get_float("Enter diagonal 1: ")
                d2 = get_float("Enter diagonal 2: ")
                print(f"Area of Rhombus: {rhombus_area(d1, d2):.4f}")

            else:
                print("-" * 60)
                print("⚠️ Invalid shape selection.")
                print("-" * 60)
                continue

        except (TypeError, ValueError) as err:
            print(f"Error: {err}")

        again = input("\nPress [R] to calculate another or any other key to exit: ").strip().lower()
        continue_program = (again == 'r')
# End of the main program loop