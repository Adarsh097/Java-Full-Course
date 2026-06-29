This code introduces **Stack**, one of the most important data structures in Java and a favorite topic in interviews.

---

# 1. What is a Stack?

A **Stack** is a linear data structure that follows:

## LIFO (Last In First Out)

The element inserted last is removed first.

Example:

```text
Push 7
Push 9
Push 1
```

Stack becomes:

```text
Top
 |
 1
 9
 7
```

Now if we remove:

```text
Pop
```

Then:

```text
1
```

is removed first.

---

## Real-Life Examples

### Plate Stack

```text
Top
Plate 3
Plate 2
Plate 1
```

You always remove the top plate first.

---

### Browser Back Button

```text
Google
YouTube
LeetCode
```

Back:

```text
LeetCode removed
```

Back:

```text
YouTube removed
```

---

# 2. Creating a Stack

```java
Stack<Integer> stack = new Stack<>();
```

Generic:

```java
Stack<String>
Stack<Student>
Stack<Double>
```

---

# 3. push()

Adds element to top.

```java
stack.push(7);
```

Stack:

```text
Top
 |
 7
```

---

```java
stack.push(9);
```

Stack:

```text
Top
 |
 9
 7
```

---

```java
stack.push(1);
```

Stack:

```text
Top
 |
 1
 9
 7
```

---

# 4. peek()

Returns top element without removing it.

```java
System.out.println(stack.peek());
```

Top:

```text
1
```

Output:

```text
1
```

Stack remains:

```text
Top
 |
 1
 9
 7
```

---

## Difference

### peek()

```java
stack.peek();
```

Returns:

```text
1
```

Does NOT remove.

---

### pop()

```java
stack.pop();
```

Returns:

```text
1
```

AND removes it.

---

# 5. pop()

```java
stack.pop();
```

Before:

```text
Top
 |
 1
 9
 7
```

After:

```text
Top
 |
 9
 7
```

Returned value:

```text
1
```

---

# 6. Printing Stack

```java
System.out.println(stack);
```

Output:

```text
[7, 9]
```

Important:

Java prints from bottom to top.

```text
Bottom → Top

[7, 9]
```

Actual stack:

```text
Top
 |
 9
 7
```

---

# 7. Enhanced For Loop

```java
for(Integer i : stack){
    System.out.println(i);
}
```

Output:

```text
7
9
```

Because iteration happens:

```text
Bottom → Top
```

Not:

```text
Top → Bottom
```

---

# Full Execution

## Step 1

```java
stack.push(7);
```

```text
Top
 |
 7
```

---

## Step 2

```java
stack.push(9);
```

```text
Top
 |
 9
 7
```

---

## Step 3

```java
stack.push(1);
```

```text
Top
 |
 1
 9
 7
```

---

## Step 4

```java
System.out.println(stack.peek());
```

Output:

```text
1
```

Stack unchanged.

---

## Step 5

```java
stack.pop();
```

Removes:

```text
1
```

Stack:

```text
Top
 |
 9
 7
```

---

## Step 6

```java
System.out.println(stack);
```

Output:

```text
[7, 9]
```

---

## Step 7

```java
for(Integer i : stack)
```

Output:

```text
7
9
```

---

# Final Output

```text
1
[7, 9]
Raw
7
9
```

---

# Important Stack Methods

## push()

```java
stack.push(10);
```

Add element.

---

## pop()

```java
stack.pop();
```

Remove top element.

---

## peek()

```java
stack.peek();
```

View top element.

---

## isEmpty()

```java
stack.isEmpty();
```

Returns:

```java
true
false
```

---

## size()

```java
stack.size();
```

Returns number of elements.

---

## search()

```java
stack.search(9);
```

Example:

```text
Top
 |
 1
 9
 7
```

Returns:

```text
2
```

Position from top.

---

# Exception Handling

## Empty Stack

```java
Stack<Integer> stack = new Stack<>();

stack.pop();
```

Throws:

```java
EmptyStackException
```

---

Safe way:

```java
if(!stack.isEmpty()){
    stack.pop();
}
```

---

# Internal Working

Important Interview Question

---

Many people think:

```text
Stack
```

is implemented using linked list.

In Java:

```java
Stack<E>
```

inherits from:

```java
Vector<E>
```

Hierarchy:

```text
Object
   |
Vector
   |
Stack
```

Internally it uses:

```text
Dynamic Array
```

similar to ArrayList.

---

# Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| push()    | O(1)       |
| pop()     | O(1)       |
| peek()    | O(1)       |
| isEmpty() | O(1)       |
| size()    | O(1)       |
| search()  | O(n)       |

---

# Stack Applications

## 1. Balanced Parentheses

```text
()
{}
[]
```

Example:

```text
({[]})
```

Valid.

Uses stack.

---

## 2. Undo Feature

MS Word:

```text
Type A
Type B
Type C
```

Undo:

```text
Remove C
```

Undo:

```text
Remove B
```

Stack.

---

## 3. Browser History

```text
Google
YouTube
LeetCode
```

Back button uses stack.

---

## 4. Function Calls

```java
main()
   |
fun1()
   |
fun2()
```

Java uses a call stack internally.

---

## 5. DFS (Depth First Search)

Used in:

* Graphs
* Trees
* Backtracking

---

# Modern Recommendation

For interviews and production code, prefer:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

Instead of:

```java
Stack<Integer> stack = new Stack<>();
```

Because:

* Faster
* Modern API
* Recommended by Java documentation

Example:

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);

System.out.println(stack.pop());
```

---

# Practice Questions

## Q1: Reverse a String Using Stack

### Answer

```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "JAVA";

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
```

Output:

```text
AVAJ
```

---

## Q2: Print Stack Top Element

### Answer

```java
Stack<Integer> stack = new Stack<>();

stack.push(5);
stack.push(10);

System.out.println(stack.peek());
```

Output:

```text
10
```

---

## Q3: Check Stack Empty

### Answer

```java
Stack<Integer> stack = new Stack<>();

System.out.println(stack.isEmpty());
```

Output:

```text
true
```

---

## Q4: Count Elements

### Answer

```java
Stack<Integer> stack = new Stack<>();

stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack.size());
```

Output:

```text
3
```

---

## Q5: Print Stack From Top to Bottom

### Answer

```java
Stack<Integer> stack = new Stack<>();

stack.push(7);
stack.push(9);
stack.push(1);

for(int i = stack.size()-1; i >= 0; i--){
    System.out.println(stack.get(i));
}
```

Output:

```text
1
9
7
```

---

## Interview Questions

1. Difference between `peek()` and `pop()`?
2. Why does Stack follow LIFO?
3. What exception does `pop()` throw on an empty stack?
4. Why is `ArrayDeque` preferred over `Stack`?
5. Implement a Min Stack in O(1).
6. Check balanced parentheses using Stack.
7. Reverse a string using Stack.
8. Evaluate a postfix expression using Stack.

Master these concepts and you'll be ready for most Java Stack questions in coding interviews and Java collections assessments.
