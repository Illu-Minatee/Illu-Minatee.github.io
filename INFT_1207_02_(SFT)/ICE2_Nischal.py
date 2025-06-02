# ------------------------------------------------------------------
# Title:     Robustness Testing of Finding Minimum Value
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      May 29, 2025
# Purpose:   This Python program reads space-separated integers from
#  the user, filters out invalid inputs (such as alphanumeric characters and
#  special symbols), and finds the smallest number. Also robustness testing of the code
# ------------------------------------------------------------------
def get_user_input():
    """
    Prompts the user to enter space-separated integers.
    """
    user_input = input("Enter space-separated integers: ")
    return user_input.split()  # Split into individual elements

#Filters and converts valid integers from the given list.
def filter_valid_integers(elements):
    
    valid_integers = []  # Initialize an empty list for valid integers
    
    for element in elements:
        try:
            valid_integers.append(int(element))  # Convert element to integer and store it
        except ValueError:
            # Display message for ignored invalid input (non-numeric values)
            print("-" * 60)
            print(f"Invalid input '{element}' ignored. Please enter only integers.")

    return valid_integers  # Return the list of valid integers

#Finds and prints the minimum integer from the filtered list.
def find_minimum(valid_integers):
    
    if not valid_integers:  # Check if the list contains any valid numbers
        print("-" * 60)
        print("No valid integers were provided.")
        print("-" * 60)
        return  # Exit the function early if no integers were found

    # Initialize the first element as the minimum value
    min_value = valid_integers[0]
    
    # Iterate through the list to find the smallest value manually
    for num in valid_integers[1:]:  # Start from the second element
        if num < min_value:  # If a smaller number is found, update min_value
            min_value = num

    # Display the minimum valid integer found
    print("-" * 60)
    print(f"The minimum value is: {min_value}")

#  Main function that executes the program
def main():
    elements = get_user_input()  # Retrieve user input as a list of elements
    valid_integers = filter_valid_integers(elements)  # Extract only valid integers
    
    if valid_integers: # proceed only if there are valid integers
        find_minimum(valid_integers)  # Identify and display the smallest number


# Execute the main function to run the program
main()
