# calculation_assignment
Problem Statement - “In a language of your choice, using all best practice principles you’re aware of, could you please provide code that iterates in multiples of A until X, then in multiples of A + 1 until 2X, then multiples of A + 2 until 3X. Please state any assumptions you’ve made.

Assumptions/Pre Requisite - Java and Maven are installed

Steps to Execute -
1. Clone the project on your local machine
2. Goto java class src/main/java/calculation/Calculation.java
3. Run main method
4. Check the terminal. You will be asked to enter value for A
5. Enter the value for A
6. You will be asked to enter value for X
7. Enter the value for X
Result will be displayed. 

Logic -
There are three for loops. The first for loop starts from value A and iterates in multiple of A until A is less than X. If we want to start from zero then we can set value of interger i as 0.
I am using one integer variable called 'start' to ave value of integer 'i' from each loop. 
In second loop , we will start from the value of 'start' variable which has stored last value of int i from first loop. Same logic with third loop.

I have considered edge case if A has value as zero and added error message.

