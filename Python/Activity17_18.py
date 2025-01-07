	
# Import pandas
import pandas

#create a dictionary to hold your data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)
# Print the DataFrame
print(dataframe)

#Write data frame to csv file and don't include index column
dataframe.to_csv("activities/outputs/sampleAct17.csv", index=False)

# Read the CSV file and store it into a DataFrame
dataframe1 = pandas.read_csv("activities/outputs/sampleAct17.csv")
 
# Print the full data
print("Full Data: ")
print(dataframe1)
 
# Print the values in the Usernames column only
print("===============")
print("Usernames:")
print(dataframe1["Usernames"])
 
# Print the username and password of the second row
print("===============")
print("Username: ", dataframe1["Usernames"][1], " | ", "Password: ", dataframe1["Passwords"][1])
 
#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe1.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe1.sort_values('Passwords', ascending=False))
