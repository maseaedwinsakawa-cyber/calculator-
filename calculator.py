
print("********Welcome to the simple calculator program in python ************")
#Lets declare our variables 
a = float(input("Enter the value of a: "))
b = float(input("Enter the value of b: "))
operation = input("Enter the operation (+, -, *, /): ")
#Lets calculate the result based on the operation selected by the user 
if operation == "+":
    result = a+b 
    print("The result of addition is:", result)
elif operation == "-":
    result = a-b 
    print("The result of subtraction is:", result)
elif operation == "*":
    result = a*b 
    print("The result of multiplication is:", result)
elif operation == "/":
    result = a/b 
    print("The result of division is:", result)
else:
    print("Invalid operation. Please enter one of +, -, *, or /.")

