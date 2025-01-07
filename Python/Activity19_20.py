	
# Import pandas
import pandas
from pandas import ExcelWriter
 
# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
 
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
# Write the dataframe to a Excel file
writer = ExcelWriter('activities/outputs/sampleAct19.xlsx')
dataframe.to_excel(writer, 'DatasheetAct19', index = False)
 
# Commit data to the Excel file
writer.close() # save the Excel file


# Read data from Excel sheet
dataframe2 = pandas.read_excel('activities/outputs/sampleAct19.xlsx')
 
# Print the dataframe
print(dataframe2)
 
# Print the number of rows and columns
print("====================================")
print("Number of rows and columns:", dataframe2.shape)
print("Number of rows:", dataframe2.shape[0])
print("Number of columnss:", dataframe2.shape[1])
# Print the data in the emails column only
print("====================================")
print("Emails:")
print(dataframe2['Email'])
 
# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(dataframe2.sort_values('FirstName'))
