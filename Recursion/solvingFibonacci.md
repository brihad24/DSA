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
<br>

- there are 3 main variables in recursion
    - variable in argument (func(int n))
    - function as a variable (static int fun())
    - variables used inside the function 

we are trying to solve fibonacci problem

- write a reccurence formula

<img src="note ss/reccurence relation.png"  width="500" height="100">
<br><br>

- build a recursion tree

<img src="note ss/fiboTree.png"  width="500" height="300">
<br><br>

- base condtion is represented by answers already provided
    - if n < 2;
        return 2

<h4>order of calls listed below</h4>

<img src="note ss/order of calls.png"  width="500" height="300">