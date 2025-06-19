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
