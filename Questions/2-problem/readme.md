# Footwear Program Problem Statement

## Class: Footwear

Create a class **Footwear** with the following private attributes:

* footwearId : int
* footwearName : String
* footwearType : String
* price : int

### Requirements

* All attributes should be private.
* Provide:

  * Parameterized Constructor
  * Getter Methods
  * Setter Methods

---

## Class: FootwearProgram

Create a class **FootwearProgram** containing the `main()` method.

Implement the following two static methods:

### 1. getCountByType()

#### Method Signature

```java
public static int getCountByType(Footwear[] footwears, String footwearType)
```

#### Functionality

* Accepts:

  * Array of Footwear objects
  * Footwear type (String)
* Counts the number of footwears whose type matches the given footwear type.
* Search should be case-insensitive.
* Returns:

  * Count if matching footwears are found.
  * 0 if no matching footwear is found.

---

### 2. getSecondHighestPriceByBrand()

#### Method Signature

```java
public static Footwear getSecondHighestPriceByBrand(
        Footwear[] footwears,
        String inputFootwearName)
```

#### Functionality

* Accepts:

  * Array of Footwear objects
  * Brand name (String)
* Finds all footwears whose brand name matches the given input.
* Search should be case-insensitive.
* Among the matching footwears, sort them by price in descending order.
* Return the footwear object having the second highest price.
* If no footwear with the given brand exists, return null.

### Note

* No two footwear objects will have the same footwearId.
* All searches must be case-insensitive.

---

## Output Rules

### For getCountByType()

If returned value is greater than 0:

```text
Print the count
```

Otherwise print:

```text
Footwear not available
```

---

### For getSecondHighestPriceByBrand()

If returned object is not null:

```text
Print:
footwearId
footwearName
price
```

Otherwise print:

```text
Brand not available
```

---

## Sample Input 1

```text
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok
```

## Sample Output 1

```text
3
99
reebok
5666
```

### Explanation

Count of footwears having type:

```text
Running shoes
```

is:

```text
Puma
reebok
Reebok
```

Count = 3

For brand:

```text
reebok
```

Matching footwears:

| Id  | Brand  | Price |
| --- | ------ | ----- |
| 102 | reebok | 5667  |
| 101 | Reebok | 5656  |
| 99  | reebok | 5666  |

Descending order of price:

```text
5667
5666
5656
```

Second highest price footwear:

```text
99
reebok
5666
```

---

## Sample Input 2

```text
100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
103
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata
```

## Sample Output 2

```text
Footwear not available
Brand not available
```

### Explanation

* No footwear has type "running shoes".
* No footwear has brand "bata".

Therefore:

```text
Footwear not available
Brand not available
```
