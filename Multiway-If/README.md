For all questions, implement only the pseudocode before developing the Java program.

**Question 1**<br/><br/>
Boots Company runs a small factory that makes shoes. The company employs factory workers who are paid one of three hourly rates depending on skill level:<br/>

Skill Level Hourly Pay Rate (RM)<br/>
1     17.00<br/>
2     20.00<br/>
3     22.00<br/>

Each factory worker might work any number of hours per week; any hours over 40 are paid at 1.5 times the usual rate. In addition, workers in Skill Level 2 and 3 can elect the following insurance option:<br/><br/>
Option    Explanation Weekly Cost to Employee (RM)<br/>
1         Medical Insurance 32.50<br/>
2         Dental Insurance 20.00<br/>
3         Disability Insurance 10.00<br/>

Also, workers in Skill Level 3 can elect to participate in the retirement plan at 3% of their gross pay. You are to develop an interactive payroll application that calculates the gross pay for a factory worker.<br/><br/> 
The program asks the user for skill level and hours worked, as well as appropriate insurance and retirement options for the employee’s skill level category. Your application will display:<br/>

i. The hours worked<br/>
ii. The hourly pay rate<br/>
iii. The regular pay for 40 hours<br/>
iv. The overtime pay<br/>
v. The total of regular and overtime pay<br/>
vi. The total itemized deductions. If the deductions exceed the gross pay, display an error message, otherwise calculate and display<br/>
vii. The net pay after all the deductions have been subtracted from the gross.<br/>

**Note**: you may choose to use multiway-if or combination of multiway-if and switch statement.<br/><br/>

**Question 2**<br/><br/>
The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the formula:<br/>

![image](https://github.com/irfanghapar/Java-Programming/assets/87377657/7184d5db-4ddd-4811-b9bf-30a3232009be)<br/>

b2 – 4ac is called the discriminant of the quadratic equation. If it’s positive, the equation has two real roots. If it’s zero, the equation has one root. If it’s negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots.”

**Note**:<br/>
1. Use Math.pow(x, 0.5) to compute √2<br/>
2. You may use if-else-if statement if you’re familiar, otherwise you may use a single if.<br/>
   
_**Sample run:**_<br/>
Enter a, b, c: 1.0 3 1 [enter]<br/>
The equation has two roots -0.381966 and -2.61803<br/>
Enter a, b, c: 1 2.0 1 [enter]<br/>
The equation has one root –1.0<br/>
Enter a, b, c: 1 2 3 [enter]<br/>
The equation has no real roots<br/><br/>

**Question 3**<br/><br/>
Mr. Ahmad runs a cafeteria business. Every morning, before opening his shop, he asked his cashier to exchange a certain amount of Malaysia Ringgit to the bank to get a minimum number of RM50, RM20, RM10, RM5 and RM1 notes.<br/>
<br/>Write a program that determines the minimum number of RM50, RM20, RM10, RM5 and RM1 notes denominations in each Malaysia Ringgit amount.<br/>

_**Sample run:**_<br/>
Enter Malaysia Ringgit amount: 179<br/>
Number of RM50 bills: 3<br/>
Number of RM20 bills: 1<br/>
Number of RM10 bills: 0<br/>
Number of RM5 bills: 1<br/>
Number of RM1 bills: 4<br/>
