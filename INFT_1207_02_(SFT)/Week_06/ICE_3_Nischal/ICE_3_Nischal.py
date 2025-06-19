# ------------------------------------------------------------------
# Title:     Robustness Testing of Finding Minimum Value
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 12, 2025
# Purpose:   This Python program provides a function to find the minimum value
#            in a list of integers. It is designed for unit testing in other files,
#            ensuring robustness against various edge cases.
# -----------------------------------------------------------------------------------


# Methods
def find_smallest(elements):
    """Returns the smallest element from the list while ensuring valid input."""
    
    # Raise an exception if the list is empty
    if not elements:
        raise ValueError("Input list is empty. Provide at least one integer.")
    
    # Validate input: All elements must be integers
    for element in elements:
        if not isinstance(element, int):
            raise ValueError(f"Invalid input '{element}'. Only integers are allowed.")

    # Temporarily store the first element as the smallest
    smallest = elements[0]

    # Compare each element with the smallest
    for index in range(1, len(elements)):
        # If the current element is smaller than the smallest found so far
        if elements[index] < smallest:
            # Update the smallest element
            smallest = elements[index]

    # Return the smallest element found
    return smallest

print(find_smallest([10, 23, 34, 81, 97]))  # Output: 10