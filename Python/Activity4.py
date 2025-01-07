# Get the users names
player1 = input("Enter name of Player1 : ")
player2 = input("Enter name of Player2 : ")
while True:
# Get the users choices
    player1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    player2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()

    if player1_answer == player2_answer:
        print("It's a tie!")
    elif player1_answer == 'rock':
        if player2_answer == 'sicssors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif player1_answer == 'scissors':
        if player2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif player1_answer == 'paper':
        if player2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
        repeat = input("Do you want to play another round? Yes/No: ").lower()
        
        # If they say yes, don't do anything
        if(repeat == "yes" or repeat == 'y'):
            pass
        # If they say no, exit the game
        elif(repeat == "no" or repeat == 'n'):
            raise SystemExit
        # If they say anything else, exit with an error message.
        else:
            print("You entered an invalid option. Exiting now.")
            print("End of the game")
            break        