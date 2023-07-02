<h2>How to solve recursion problems</h2>

- identify if you can break the problem into smaller problems
- write the recurence relation if needed
- draw the recursive tree
- about the tree
    - see the flow of functions, how they are getting in stack
    - identify the flow of left tree calls and right tree calls
    - draw the tree and call pointers
    - use debugger to see the flow 
- see how the values are returned at each step & where the function call is coming out of

<h4>Types of recurence relations:</h4>

- Linear -> fibonacci
    - added/subtracted linearly
- Divide & Conquer -> binary search
    - search space being divided
<br>

- there are 3 main variables in recursion
    - variable in argument (func(int n))
    - function as a variable (static int fun())
    - variables used inside the function 

we are trying to make Binary Search with recursion
- recurence relation

<img src="note ss/bin search rel.png"  width="400" height="150">
<br><br>

- recursion tree

<img src="note ss/BS rec tree.png"  width="400" height="150">
<br><br>

- variables that need to be passed in future function calls, put them in the arguments
- variables that are valuable in the body of the function, put them in the body
- <b> always return a recursive function call 
<br><br>
