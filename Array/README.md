**Question 1**

Write a DailyPayroll class that uses the following arrays as fields:<b/>

• employeeId. <b/>

An array of seven integers to hold employee identification numbers. The array should be initialized with the following numbers:<b/>
5658845 4520125 7895122 8777541<b/>
8451277 1302850 7580489<b/>

• hours. An array of seven integers to hold the number of hours worked by each employee<b/>
• payRate. An array of seven doubles to hold each employee’s hourly pay rate<b/>
• wages. An array of seven doubles to hold each employee’s gross wages<b/>

The class should relate the data in each array through the subscripts. For example, the number in index 0 of the hours array should be the number of hours worked by the employee whose identification is stored in index 0 of the employeeId array. That same employee’s pay rate should be stored in index 0 of the payRate array. In addition, the class should have a method that accept an employee’s identification number as an argument and returns the gross wages for that employee. Note: gross wages = hours x pay rate. Input validation: Do not accept negative values for hours or number less than 6.00 for pay rate.<b/><b/>

**Question 2**<b/>

Write a method that returns a new array by eliminating the duplicate values in the array using the method header:<b/>
_public static int[] eliminateDuplicate(int[] list)_ <b/>

Write a test program that reads 10 integers, invokes the method, and displays the distinct numbers separated by exactly one space.<b/>

Sample run:<b/>
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2<b/>
The distinct numbers are: 1 2 3 6 4 5<b/>

**Question 3**<b/>

A teacher has five students who have taken four tests. The teacher uses the following grading scale to assign a letter grade to a student, based on the average of his or her four test scores:


![image](https://github.com/irfanghapar/Java-Programming/assets/87377657/8eeab507-f1f8-4552-aebd-aa1cdfffa5c7)


Write a program that uses a String array to hold the five students’ names, an array of five characters to hold five students’ letter grades, and five arrays of four doubles each to hold
each student’s set of test scores. The program should have methods that return a specific students’ name, average test score, and a letter grade based on the average.
Demonstrate the program that allows the user to enter each student’s name and his or her four test scores. It should then display each student’s average test score and letter grade.
