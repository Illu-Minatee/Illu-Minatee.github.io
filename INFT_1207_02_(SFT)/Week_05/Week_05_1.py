# ------------------------------------------------------------------
# Title:     Test Methods in Python
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 1, 2025
# Purpose:   
# ------------------------------------------------------------------

# Methods
def addTwoNumbers(num1, num2):
    
    return num1 + num2
def subtractTwoNumbers(num1, num2):
   
    return num1 - num2

def multiplyTwoNumbers(num1, num2):
    
    return num1 * num2

def divideTwoNumbers(num1, num2):
   
    if num2 == 0:
        raise ValueError("Cannot divide by zero.")
    else:
        return num1 / num2