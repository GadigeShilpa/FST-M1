	
# Ask user to enter lists
listOne = list(input("Enter some values for listOne seperated by commas: ").split(", "))
listTwo = list(input("Enter some valuesfor listTwo seperated by commas: ").split(", "))
# Print the lists
print("First List is: ", listOne)
print("Second List is: ", listTwo)
 
# Declare a third list that will contain the result	
thirdList = []
# Iterate through first list to get odd elements
for num in listOne:
    if (int(num) % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (int(num) % 2 == 0):
        thirdList.append(num)
 
# Print result
print("result List is:")
print(thirdList)