# Get the users names
player1 = input("Enter name of Player1 : ")
player2 = input("Enter name of Player2 : ")

# Get the users choices
player1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").upper()
player2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").upper()
print(player1_answer)
if player1_answer == player2_answer:
    print("It's a tie!")
elif player1_answer == 'ROCK':
    if player2_answer == 'SICSSORS':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif player1_answer == 'SCISSORS':
    if player2_answer == 'PAPAER':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif player1_answer == 'PAPAER':
    if player2_answer == 'ROCK':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")