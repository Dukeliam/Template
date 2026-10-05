first_number = float(input("Enter First number: "))
second_number = float(input("Enter Second number: "))
result = first_number / second_number
print(result)

if second_number == 0:
        print("Can be divide by zero")
else:
         print("Cannot be divide by zero:")


first_number = int(input("Enter First number: "))
second_number = int(input("Enter Second number: "))
third_number = int(input("Enter Third number: "))

largest = first_number

if second_number > largest: 
        largest = second_number

if third_number > largest:
        largest = third_number
print(largest)

age = int(input("Enter your age: "))

if age <= 5:
    print("Free")

elif age <= 12:
    print("$5")
elif age <= 64:
    print("$12")
else:
#   print("$8")

weight = float(input("What is your weight: "))
height = float(input("What is your height: "))
compute_bmi = weight /(height * height)

if compute_bmi < 18.5:
    print("Underweigh")

elif compute_bmi < 24.9:
    print("Normal")

elif compute_bmi < 29.9:
    print("Overweight")

#else:
#    print("obese")
total_bill = int(input("Ask for Total Bill: ")) 
is_member = str(input("Is he a member Yes or No: "))

if total_bill >= 1000 and is_member == "yes"
    print("10% off")
elif total_bill >= 1000 and is_member == "no":
    print("5% off") 
else: 
    print("No discount")

first_number = int(input("Enter First number: "))
second_number = int(input("Enter Second number: "))

if first_number > 0 and second_number > 0:
    print("Q1")
elif first_number < 0 and second_number > 0:
    print("Q2")
elif first_number < 0 and second_number < 0:
    print("Q3")
elif first_number > 0 and second_number < 0:
    print("Q4")
elif  first_number == second_number:
    print("Origin")
elif y == 0 and x != 0:
    print("X-axis")
elif x == 0 and y != 0:
    print("Y-axis")

player_one = str(input("Player One Enter rock, paper, or scissors: "))
player_two = str(input("Player Two Enter rock, paper, or scissors: "))

if player_one == "rock" and player_two == "scissors":
    print("Player one Wins")

elif player_one == "paper" and player_two == "scissors":
    print("Player two Wins")

elif player_one == "paper" and player_two == "rock":
    print("Player one Wins")

elif player_one == "paper" and player_two == "scissors":
    print("Player two Wins")

elif player_one == "rock" and player_two == "paper":
    print("Player two Wins")

elif player_one == "scissors" and player_two == "paper":
    print("Player one Wins")

elif player_one == "scissor" and player_two == "rock":
    print("Player two Wins")

else:
    print("Tie")
