	
fruit_price = {
    "apple": 10,
    "pappaya": 20,
    "pinapple": 30,
    "guava": 15
}

search_item = input("What fruit would you like? ")

if(search_item in fruit_price):
    print(search_item + " costs" + str(fruit_price[search_item]) + " bucks")
else:
    print("Fruit is out of stock")