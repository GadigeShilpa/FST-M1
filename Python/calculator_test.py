import pytest
import math
 
 #Addition test
def test_addition():
   # initialize two numbers
   num1 = 10
   num2 = 15
   
   #Add the numbers
   sum = num1 + num2

   #Assertion
   assert sum == 25
# Substraction test 
def test_substraction():
   num1 = 50
   num2 = 35
   
   #substarct the second number
   minus = num1 - num2
   assert minus == 15
 
def test_product():
   num1 = 3
   num2 = 6
   
   #multiply the second number
   product = num1 * num2
   assert product == 18
def test_division():
   num1 = 9
   num2 = 3
   
   #divide the first number
   divide = num1 / num2
   assert divide == 3
