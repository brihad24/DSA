# Stacks

- First in Last out || Last in First ouy
- Push -  add an item to the stack
- Pop - remove an item from the stack

![Alt text](image.png)

- Internally, it works with an array 
- Time Complexity in insertion & deletion = O(1) (Constant since we are using array)

<h2> To make the working of a stack </h2>

- initialize an array and maintain a pointer

![Alt text](image-3.png)

- inserting an item
    - increase index by 1, insert item in current index 

![Alt text](image-4.png)
![Alt text](image-5.png)

- removing an item 
    - remove item from current index, then decrement index

![Alt text](image-6.png)