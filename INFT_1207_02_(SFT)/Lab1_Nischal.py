# ------------------------------------------------------------------
# Title:     Lab1_Group_9
# Author:    Nischal Shrestha Kasula, StudentID: 100995481
# Date:      June 1, 2025
# Purpose:   To generate a strong, randomized password based on user specifications.
# ------------------------------------------------------------------

import random

# Function to get a valid integer input from the user
def get_valid_integer(prompt, min_value=1):
    do_continue = True  # Initialize a control variable

    while do_continue:
        try:
            value = int(input(prompt)) # Prompt user for input and convert to integer
            # Check if the value meets the minimum requirement
            if value >= min_value:
                return value
            else:
                print("-"*60)
                print(f"Error: Please enter a number greater than or equal to {min_value}.")
                print("-"*60)
        except ValueError:
            print("Error: Invalid input. Please enter a whole number.")

# Function to generate random letters
def generate_random_letters(count):
    letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    # Picks characters randomly according to count and 
    # Converts the list of characters into a single string before returning it
    return ''.join(random.choices(letters, k=count))

# Function to generate random digits
def generate_random_digits(count):
    digits = "0123456789"
    return ''.join(random.choices(digits, k=count))

# Function to generate random special characters
def generate_random_specials(count):
    specials = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~"
    return ''.join(random.choices(specials, k=count))

# Function to shuffle password for randomness
def shuffle_password(password):
    password_list = list(password) # "Hello" to ['H', 'e', 'l', 'l', 'o']
    random.shuffle(password_list)
    return ''.join(password_list)

# Main function to generate a password based on user input
def generate_password():
    print("\n🔒 Random Password Generator 🔒")
    print("-"*70)
    print("Please enter a password length of at least 8 for strong security.")

    # Get the total password length
    print("-"*70)
    password_length = get_valid_integer("Enter the total length of the password: ", min_value=8)

    # Get the number of letters, digits, and special characters
    print("-"*70)
    num_letters = get_valid_integer("Enter the number of letters in the password: ")
    print("-"*70)
    num_digits = get_valid_integer("Enter the number of digits in the password: ")
    print("-"*70)
    num_specials = get_valid_integer("Enter the number of special characters in the password: ")

    # Validate that the sum of all parts matches the total password length
    while num_letters + num_digits + num_specials != password_length:
        print("-"*80)
        print(f"\n⚠️ Error: The total of letters ({num_letters}), digits ({num_digits}), and special characters ({num_specials}) must equal {password_length}.⚠️")
        print("-"*60)
        print("Please re-enter the values correctly.")
        print("-"*60)
        num_letters = get_valid_integer("Enter the number of letters in the password: ")
        print("-"*70)
        num_digits = get_valid_integer("Enter the number of digits in the password: ")
        print("-"*70)
        num_specials = get_valid_integer("Enter the number of special characters in the password: ")

    # Generate the password
    letters = generate_random_letters(num_letters)
    digits = generate_random_digits(num_digits)
    specials = generate_random_specials(num_specials)
    raw_password = letters + digits + specials
    final_password = shuffle_password(raw_password)

    # Display the generated password
    print("-"*60)
    print("\n🔐 Your Secure Password:", final_password)
    print("Make sure to store it securely!")

# Run the password generator
generate_password()
