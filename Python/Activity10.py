num_tuple = tuple(input("Enter some values seperated by commas: ").split(", "))
 	
print("Given list is ", num_tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)