Excellent! 🎉

You've now reached **HashMap**, arguably the most important collection in Java.

If you learn HashMap deeply, you'll understand:

* Caching
* Database indexing
* JSON objects
* Frequency counting
* LRU Cache
* Graphs
* Most coding interview problems

---

# 1. What is a Map?

Unlike List and Set:

* List stores values
* Set stores unique values

A **Map stores key-value pairs**.

Example:

```java
1 -> "shashwat"
2 -> "shikhar"
7 -> "rajesh"
17 -> "dinesh"
```

Think of it like a dictionary:

```text
Roll No      Name

1            shashwat
2            shikhar
7            rajesh
17           dinesh
```

---

# 2. HashMap Hierarchy

```text
Map (Interface)
   |
HashMap
   |
LinkedHashMap
   |
TreeMap
```

Your code:

```java
Map<Integer,String> map = new HashMap<>();
```

Interface reference:

```java
Map<Integer,String>
```

Implementation:

```java
HashMap<Integer,String>
```

---

# 3. Important Properties

### Keys must be unique

```java
map.put(1,"A");
map.put(1,"B");
```

Result:

```text
1 -> B
```

Old value gets replaced.

---

### Values can be duplicated

```java
map.put(1,"A");
map.put(2,"A");
```

Valid.

---

# 4. put()

Adds a key-value pair.

```java
map.put(1,"shashwat");
map.put(2,"shikhar");
map.put(7,"rajesh");
map.put(17,"dinesh");
```

Map:

```text
{
 1=shashwat,
 2=shikhar,
 7=rajesh,
 17=dinesh
}
```

---

# 5. Internal Working

HashMap internally stores:

```text
Key -> Value
```

Example:

```java
map.put(17,"dinesh");
```

Internally:

```text
17 -> dinesh
```

HashMap uses:

```text
Hash Table
```

and computes:

```java
key.hashCode()
```

to determine where to store data.

---

# 6. containsKey()

```java
System.out.println(map.containsKey(19));
```

Current keys:

```text
1,2,7,17
```

19 doesn't exist.

Output:

```text
false
```

---

# 7. containsValue()

```java
System.out.println(map.containsValue("shashwat"));
```

Value exists.

Output:

```text
true
```

---

# 8. get()

```java
map.get(17)
```

Returns:

```text
dinesh
```

---

# String Concatenation

```java
String fullName =
        map.get(17) + " pandit";
```

Result:

```text
dinesh pandit
```

---

Update:

```java
map.put(17, fullName);
```

Map becomes:

```text
17 -> dinesh pandit
```

---

# 9. getOrDefault()

One of the most important HashMap methods.

```java
String defaultName =
    map.getOrDefault(90,"Rahul");
```

Key:

```text
90
```

doesn't exist.

So:

```text
Rahul
```

is returned.

---

Then:

```java
defaultName + " tiwari"
```

Result:

```text
Rahul tiwari
```

---

Store:

```java
map.put(90, defaultName);
```

Map becomes:

```text
90 -> Rahul tiwari
```

---

# Current Map

```text
1  -> shashwat
2  -> shikhar
7  -> rajesh
17 -> dinesh pandit
90 -> Rahul tiwari
```

---

# 10. entrySet()

Most efficient way to iterate.

```java
for(Map.Entry<Integer,String> entry
        : map.entrySet())
```

Each entry contains:

```java
entry.getKey()
entry.getValue()
```

---

Example:

```java
1 -> shashwat
```

Key:

```java
entry.getKey()
```

returns:

```text
1
```

Value:

```java
entry.getValue()
```

returns:

```text
shashwat
```

---

# Possible Output

HashMap does NOT maintain order.

Possible:

```text
false
true
1 -> shashwat
17 -> dinesh pandit
2 -> shikhar
7 -> rajesh
90 -> Rahul tiwari
```

Or another order.

Order is NOT guaranteed.

---

# Three Ways to Iterate

---

## 1. entrySet() ✅ Recommended

```java
for(Map.Entry<Integer,String> entry :
        map.entrySet()){

    System.out.println(
        entry.getKey() +
        " -> " +
        entry.getValue()
    );
}
```

Fastest.

---

## 2. keySet()

```java
for(Integer key : map.keySet()){
    System.out.println(
        key + " -> " +
        map.get(key)
    );
}
```

Works but slower.

---

## 3. values()

```java
for(String value : map.values()){
    System.out.println(value);
}
```

Prints only values.

---

# Important HashMap Methods

## put()

```java
map.put(1,"Java");
```

Insert/update.

---

## get()

```java
map.get(1);
```

Retrieve value.

---

## remove()

```java
map.remove(1);
```

Delete entry.

---

## containsKey()

```java
map.containsKey(1);
```

Check key existence.

---

## containsValue()

```java
map.containsValue("Java");
```

Check value existence.

---

## size()

```java
map.size();
```

Returns number of entries.

---

## isEmpty()

```java
map.isEmpty();
```

---

## clear()

```java
map.clear();
```

Removes everything.

---

# Time Complexity

| Operation     | Complexity   |
| ------------- | ------------ |
| put()         | O(1) Average |
| get()         | O(1) Average |
| containsKey() | O(1) Average |
| remove()      | O(1) Average |

This is why HashMap is so powerful.

---

# HashMap vs HashSet

HashSet:

```java
HashSet<Integer>
```

Stores:

```text
1
2
3
```

Only values.

---

HashMap:

```java
HashMap<Integer,String>
```

Stores:

```text
1 -> Aman
2 -> Rahul
3 -> Raj
```

Key-value pairs.

---

# Most Important Interview Use Case

## Frequency Count

Input:

```text
a a b c a b
```

Output:

```text
a -> 3
b -> 2
c -> 1
```

Code:

```java
HashMap<Character,Integer> freq =
        new HashMap<>();

for(char ch : str.toCharArray()){
    freq.put(
        ch,
        freq.getOrDefault(ch,0)+1
    );
}
```

Very common interview pattern.

---

# Internal Structure

Java 8+

HashMap uses:

```text
Bucket Array
```

If collisions occur:

```text
Linked List
```

and when many collisions occur:

```text
Red Black Tree
```

for better performance.

```text
Bucket
 |
 +-- Node
 |
 +-- Node
 |
 +-- Node
```

becomes

```text
Bucket
 |
Red Black Tree
```

---

# Practice Questions

## Q1 Count Frequency

```java
String str = "aabbca";

Map<Character,Integer> map =
        new HashMap<>();

for(char ch : str.toCharArray()){
    map.put(
        ch,
        map.getOrDefault(ch,0)+1
    );
}

System.out.println(map);
```

Output:

```text
{a=3, b=2, c=1}
```

---

## Q2 Find Highest Frequency

```java
int max = 0;

for(int count : map.values()){
    max = Math.max(max,count);
}
```

---

## Q3 Check Key Exists

```java
System.out.println(
        map.containsKey(17)
);
```

Output:

```text
true
```

---

## Q4 Print All Keys

```java
for(Integer key : map.keySet()){
    System.out.println(key);
}
```

---

## Q5 Print All Values

```java
for(String value : map.values()){
    System.out.println(value);
}
```

---

# HashMap vs LinkedHashMap vs TreeMap

| Feature          | HashMap    | LinkedHashMap            | TreeMap        |
| ---------------- | ---------- | ------------------------ | -------------- |
| Duplicate Keys   | ❌          | ❌                        | ❌              |
| Duplicate Values | ✅          | ✅                        | ✅              |
| Ordering         | ❌          | Insertion Order          | Sorted by Key  |
| put()            | O(1)       | O(1)                     | O(log n)       |
| get()            | O(1)       | O(1)                     | O(log n)       |
| Internal DS      | Hash Table | Hash Table + Linked List | Red Black Tree |

Example input:

```text
7 -> Rajesh
1 -> Shashwat
17 -> Dinesh
```

HashMap:

```text
Random Order
```

LinkedHashMap:

```text
7 -> Rajesh
1 -> Shashwat
17 -> Dinesh
```

TreeMap:

```text
1 -> Shashwat
7 -> Rajesh
17 -> Dinesh
```

---

