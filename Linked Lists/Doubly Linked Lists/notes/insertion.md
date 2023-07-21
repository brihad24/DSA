# Adding a new node at the beginning

- create a new node

![Alt text](image-2.png)

- ```node.next = head```

![Alt text](image-3.png)

- ```node.prev = null```

![Alt text](image-4.png)

- ```head.prev = node```

![Alt text](image-5.png)

- ```head = node```

![Alt text](image-6.png)

# Insertion at the end

- create a new node

![Alt text](image-7.png)

- traverse the list till we reach the end (`while last.next != null`)

![Alt text](image-8.png)

- `last.next = node`

![Alt text](image-9.png)

- `node.prev = last`

![Alt text](image-10.png)

- `node.next = null`

![Alt text](image-11.png)