# ------------------------------------------------------------------
# Title:     Robustness Testing of Finding Minimum Value
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      May 29, 2025
# Purpose:   This Python program reads space-separated integers from
#  the user, filters out invalid inputs (such as alphanumeric characters and
#  special symbols), and finds the smallest number. Also robustness testing of the code
# -------------------------------------------------------

# Gets space-separated integers from the user.
def get_user_input():
    # Gets space-separated integers from the user.
    user_input = input("Enter space-separated integers: ")  # Store input in a variable
    elements = user_input.split()  # Process input
    return elements  # Return processed input

# Filters and converts valid integers from the given list.
def filter_valid_integers(elements):
    """Filters valid integers and detects errors."""
    valid_integers = [] # Initialize an empty list for valid integers
    invalid_detected = False  # Track invalid inputs

    for element in elements:
        try:
            valid_integers.append(int(element))  # Convert and store valid numbers
        except ValueError:
            print(f"Invalid input '{element}' ignored. Please enter only integers.")
            invalid_detected = True  # Set flag when invalid input is found
    # Packing the results into a tuple for return
    return valid_integers, invalid_detected

# Finds and prints the minimum integer from the filtered list.
def find_minimum(valid_integers):
    """Finds and displays the smallest integer."""
    if not valid_integers:
        print("No valid integers were provided.")
        return
    
 # Iterate through the list to find the smallest value manually
    min_value = valid_integers[0] # Initialize the first element as the minimum value
    for num in valid_integers[1:]:  #  Start from the second element
        # If a smaller number is found, update min_value
        if num < min_value:
            min_value = num

    print(f"The minimum value is: {min_value}")

# Main function that executes the program
def main():
    """Executes program sequence."""
    elements = get_user_input()
    # Using tuple unpacking to get valid integers and error detection
    valid_integers, invalid_detected = filter_valid_integers(elements)

    if not invalid_detected:  # Ensure output is printed only if there were no errors
        find_minimum(valid_integers)

# Run the program
main()
