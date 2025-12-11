# 🌟 Streams & Lambdas Exercise  
A Java practice project demonstrating how to rewrite traditional loops using **Java Streams** and **lambda expressions**. This project contains two branches that perform the same tasks but with different approaches.

---

## 🔀 Branches  
### **`main`** – Classic Java Approach  
Uses standard loops, booleans, and manual list-building.

### **`streams`** – Stream API + Lambdas  
Uses functional-style operations like `.map()`, `.filter()`, `.anyMatch()`, `.allMatch()`, and `.mapToInt()`.

---

## 📘 Description  
This exercise works with a small list of **Star Wars characters**, each containing:

- `name`  
- `height`  
- `mass`  
- `eyeColor`  
- `gender`

Both branches complete the exact same set of tasks:

1. Print all character names in uppercase  
2. Filter characters with mass greater than 80  
3. Create a list of just character names  
4. Check if any character has blue eyes  
5. Check if all characters are male  
6. Calculate the total mass of all characters  

The **streams** branch rewrites these operations using clean, expressive Stream pipelines.

---

## 🧩 What Each Branch Demonstrates  

### ✏️ `main` Branch (Imperative Style)  
✔ Loop through lists manually  
✔ Build new lists using `add()`  
✔ Track state with booleans  
✔ Accumulate totals using counters  
✔ Perform checks with `if` statements  

This branch shows the **baseline**, classic approach.

---

### ⚡ `streams` Branch (Functional Style)  
✔ `.stream()` and `.forEach()` for printing  
✔ `.map()` for transforming data  
✔ `.filter()` to produce filtered lists  
✔ `.anyMatch()` and `.allMatch()` for condition checks  
✔ `.mapToInt().sum()` to calculate totals  

This branch shows the **modern Java approach** that is concise, expressive, and easier to maintain.

---

## 🎯 Key Takeaways  
- Functional programming keeps code cleaner  
- Streams reduce repetitive boilerplate loops  
- Lambdas allow inline, concise operations  
- Stream pipelines provide clearer intent  
- Both branches demonstrate two valid coding styles  
