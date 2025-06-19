#-------------------------------------------------------------------------------
# Program Name:     Lab2_Matthew_Nischal.py
# Program Author:   Matthew Flores 100624787, Nischal Shrestha Kasula 100995481
# Date Created:     6/4/25
# Date Modified:    6/5/25
#                   
# Description:      Allows reading and writing of a .csv file containing book data from a user
# Notes:            For assistance with csv modules: https://www.w3resource.com/python/python-handling-csv-files-with-examples.php
#                   For help with os directory manipulation: https://stackoverflow.com/a/5137509
#-------------------------------------------------------------------------------

import csv
import os
# Import modules for handling csv files and getting OS directories

FILENAME_DEFAULT='books'
# Default file name for all csv file-related functions
HEADERS=['Title', 'Author', 'Year']
# Default headers, inserted when csv file is generated and used for some indexing
MENU_OPTIONS=["Add Book","Find Book","Show Collection","End Program"]
# Menu options for the text menu
data_added=[]
# Initialized blank list variable for user with the function to add data to csv
menu_selection=""
# Initialized blank string variable for text menu operation
data_query=""
# Initialized blank string variable for function that looks up a row from the csv
fetched_data=[]
# Initialized blank list variable used for displaying manipulated data from the csv in a user friendly way
kill_program=False
# Initialized boolean for letting the user end the program whenever they want

def generate_csv(filename,data):
    try:
        with open(filename+'.csv','x') as file:
            writer=csv.writer(file,)
            # Generate object for creating and writing to a csv file
            writer.writerow(data)
            # Write the rows
        print("\nDatabase does not exist. Generating file in the following path:")
        # Attempt to generate new csv file with initial data as headers
    except:
        print("\nDatabouse found. Fetching data from the following path:")
        # Print alternative message if file already exists

def validate_int(number):
    try:
        number = int(number)
    except:
        return False
    return True
#Define function to check if argument is of type int, return False if not, True otherwise

def validate_range(number,min,max):
    return min<=number<=max
#Define function that returns True if argument is within a given range, False otherwise

def add_row(filename,new_entry):
    with open(filename+'.csv','a') as file:
        writer=csv.writer(file)
        writer.writerow(new_entry)
    print("Data added successfully")
    # Generate object for appending new row to csv, appends the new row, then prints a notification to the user

def check_duplicate(filename,new_entry):
    with open(filename+'.csv','r') as file:
        reader=csv.reader(file)
        for row in reader:
            if row==new_entry:
                return True
        return False
    # Generate object for reading the csv, check each part of the new data against each part of existing data, return True if theres a match, False otherwise

def find_row(filename,data):
    with open(filename+'.csv','r') as file:
        reader=csv.reader(file)
        # Generate object for reading csv file
        for row in reader:
            if not row==[]:
                if not row[0]==HEADERS[0]:
                    if row[0]==data:
                        return True
            
        return False
    # Iterate through element 0 in every row excluding the header row, find the row with element 0 matching the data argument, return True if such a row exists, False otherwise

def fetch_row(filename,data):
    data_indexed=[]
    concat_list=[]
    # Initialized blank local variables
    with open(filename+'.csv','r') as file:
            reader=csv.reader(file)
            # Generate object for reading csv file

            for row in reader:
                if not row==[]:
                    if row[0]==data:
                        for element in row:
                            data_indexed.append(element)
                    #Iterate through csv rows, find row with element 0 matching data argument
    for x in range(len(HEADERS)):
        concat_list.append(HEADERS[x]+": "+data_indexed[x])
        # Create a list of formatted strings with concatenated headers and csv data
    return concat_list

def list_rows(filename):
    with open(filename+'.csv','r') as file:
        reader=csv.reader(file)
        # Generate object for reading csv file
        for row in reader:
            # Iterate through each row in csv
            data_indexed=[]
            concat_list=[]
            # Blank local lists for data manipulation, reinitialized with each iteration
            if row==HEADERS:
                print("\nDisplaying all data.")
                #Prevents the header row from being printed as if it were actual data
            else:
                for element in row:
                    data_indexed.append(element)
                #Append each element as a separate list item to data_indexed
            if not data_indexed==[]:
                for x in range (len(HEADERS)):
                    concat_list.append(HEADERS[x]+": "+data_indexed[x])
                    # If data_indexed is not a blank list, format an output list by concatenating the header with the data
            for element in concat_list:
                print(element)
            print()
            # Print each item in the concat_list, plus a blank line

def text_menu():
    print("=============\n= Main Menu =\n=============\n")
    for option in MENU_OPTIONS:
        print(str(MENU_OPTIONS.index(option)+1)+": "+option)
    return(input("\nPlease choose a menu option: "))
    # Generates the text menu with all options and a banner

while kill_program==False:
    # Keep user in loop while kill_program is False

    generate_csv(FILENAME_DEFAULT,HEADERS)
    print(os.getcwd())
    print()
    # Create csv file if applicable, and display path of csv file + a blank line

    while menu_selection=="":
            # Keep user in this loop while menu_selection is a blank string
            print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            # Graphical line separator
            menu_selection=text_menu()
            # Get and store menu choice
            if validate_int(menu_selection):
                menu_selection=int(menu_selection)
                # Validate that menu choice was an int, cast it to int if so
                if validate_range(menu_selection,1,len(MENU_OPTIONS)):
                    # Validate that menu choice is within the range of menu options
                    if MENU_OPTIONS[menu_selection-1]==MENU_OPTIONS[0]:
                        data_added=[]
                        # Reinitalize data_added to clean data from older runs of the app
                        print("\nAdding a new entry.\n")
                        for header in HEADERS:
                            data_added.append(input("Please enter the "+str.lower(header)+": "))
                            # For each header element, append a corresponding data element to data_added
                        if check_duplicate(FILENAME_DEFAULT,data_added):
                            print("\nThat exact data already exists")
                            # Check that the new data isn't already in the list
                        else:
                            add_row(FILENAME_DEFAULT,data_added)
                            # If no duplicate data found, write a new row to the csv
                        menu_selection=""
                        # Reinitialize menu_selection
                    elif MENU_OPTIONS[menu_selection-1]==MENU_OPTIONS[1]:
                        print("\nSearching for entry. NOTE: If multiple matches exist, only the first match found will be displayed.\n")
                        data_query=input("Please enter the "+str.lower(HEADERS[0])+": ")
                        # Prompt user for data corresponding to the header that will be indexed
                        print()
                        if find_row(FILENAME_DEFAULT,data_query):
                            fetched_data=fetch_row(FILENAME_DEFAULT,data_query)
                            for element in fetched_data:
                                print(element)
                                # If the data is found, fetch the whole row, store it in fetched_data, and print fetched_data in a user friendly way
                            print()
                        else:
                            print("\nData entry not found (search is case sensitive; use menu option 3 to display all entries)\n")
                            # Feedback to user if there is no match
                        menu_selection=""
                        #Reinitialize menu selection
                    elif MENU_OPTIONS[menu_selection-1]==MENU_OPTIONS[2]:
                        list_rows(FILENAME_DEFAULT)
                        menu_selection=""
                        # Call function, reinitialize menu selection
                    else:
                        print("\nEnding program. Have a nice day.\n")
                        kill_program=True
                        # Print goodbye message, change kill_program to True (breaks out of loop)
                else:
                    print("Error, ensure input is within range corresponding to menu options\n")
                    menu_selection=""
                    # Print feedback, reinitialize menu selection
            else:
                print("Error, ensure input is whole numeric value corresponding to menu options\n")
                menu_selection=""
                # Print feedback, reinitialize menu selection

