<h2>  Function Calls</h2>

- functions while executing enter into a stack to track their status of execution
- main() functions is the first method to enter the stack 
- while a function is executing, it will remain in the stack
- when a function is done executing, the function is removed from the stack
    - after this, the flow of program is restored to where the function was called

Example:
<img src="note ss/functionCall.png"  width="300" height="300" align = left> 

- here, we can see that print 1 calls print 2, print 2 calls print 3, print 3 calls print 4, print 4 calls print 5
- once print 5 is done executing, it pops out of the stack and flow of program is restored to print 4
- this keeps repeating till the main function is out of the stack and the program has finished
<br><br><br><br><br><br><br><br>

<h2>Recursion</h2>

* look at recursion.java
* here, we call the function rec() within itself
    - this process is called recursion
    - it is used to call multiple functions when the body of the function remains same
- in the recursive funtion, we have a base condition that terminates the recursive function to prevent it from running again

the call stack would look like this:

<img src="note ss/image.png"  width="300" height="300" align = left>

- every function call will take memory in the stack separately
- this is where base function is important
    - the stack will keep filling up with function calls
    - after a certain point, the memory will exxceed limit
<br><br><br><br><br><br><br><br><br><br><br>

<h4>Definition:</h4> Recursion is a function calling itself
<h4>Need:</h4> useful to implement dynamicc programming
<br><br>

* you can convert recursion into interation(loops), & vice-versa
* space complexity is not constant due to recursive function calls

<h2>Visualising Recursion (also called recursion tree)</h2>
<img src="note ss/recursionTree.png"  width="300" height="300">
<br>

