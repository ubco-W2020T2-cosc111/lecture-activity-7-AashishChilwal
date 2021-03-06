# Lecture Activity 7 - Instructions

In lecture activity 7, we will practice writing some loops.

## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

Don't forget to change the name of the public class method for each file!

## Task 1: Needle in a haystack

Write Java code to **use a loop (required)** to find the smallest integer n such that n$^2$ (n squared, or n*n) is greater than 12,000.

## Task 2: Highest GPA

Write Java code **using a loop (required)** that prompts the user to enter a number of students (from 1 to 50) and students’ GPA (from 0 to 4.0), and then displays the highest GPA. The program should check the validity of each user’s input to make sure the GPA is between 0 and 4.0. You may assume that the input is a number.

### Sample Output

This is an example if there was a class of 5 students:

```
Enter the number of students (1 to 50): 5
Enter the GPA of Student 1 : 0.2
Enter the GPA of Student 2 : -0.5
Invalid GPA value. Try again: 5
Invalid GPA value. Try again: 3.9
Enter the GPA of Student 3 : 4.2
Invalid GPA value. Try again: 2.4
Enter the GPA of Student 4 : 10
Invalid GPA value. Try again: 4
Enter the GPA of Student 5 : 4
Top GPA is 4.0
```

## Task 3: Black Mirror

Write Java code **using a loop (required)** that prompts the user to enter a string and displays:

- a. The string in reverse order.
- b. The number of vowels in the string (assume the vowels are A, E, I, O, and U).
- c. The number of the uppercase letters in the string.

## Task 4: Bootleg Fibonacci Sequence

Write Java code **using a loop (required)** that prompts the user to enter an integer and then uses nested loops to display the patterns shown in the sample run below.

### Sample Output

```
Enter an integer: 6

Pattern I
---------
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 

Pattern II
----------
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```

## Task 5: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 1 Java file](./task1.java)

[Task 2 Java file](./task2.java)

[Task 3 Java file](./task3.java)

[Task 4 Java file](./task4.java)
