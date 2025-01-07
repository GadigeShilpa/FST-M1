# Define function to calculate sum
def calculateSum(num):
  if num:
    print(num)
    # Recursive function call
    return num + calculateSum(num-1)
  else:
    return 0
 
# Call calculateSum() function
result = calculateSum(int(input("Enter a number for which you want sum:")))
 
# Print result
print(result)