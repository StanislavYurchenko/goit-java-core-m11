# Java Stream API Practice (GoIT Java Core — Module 11)

This project contains implementations for advanced data manipulation tasks utilizing Java 17 Stream API, functional interfaces, and custom stream generators.

## 📋 Tasks Overview

* **Task 1: Odd-Indexed Names Filter:** Extracts names located at odd indices (1, 3, etc.) and formats them as `1. Name, 3. Name`.
* **Task 2: Uppercase & Reverse Sort:** Converts a collection of strings to uppercase and sorts them in descending order ($Z \rightarrow A$).
* **Task 3: Extract and Sort Numbers:** Parses embedded numbers from an array of comma-separated string records, sorts them in natural order, and joins them with commas.
* **Task 4: Linear Congruential Generator (LCG):** Implements an infinite pseudo-random number generator stream using `Stream.iterate` and mathematical recurrence relations.
* **Task 5: Stream Zip Combinator:** Implements a custom generic method `zip(Stream<T> first, Stream<T> second)` that alternates elements from two streams until the shorter stream terminates.

---

## 🛠 Prerequisites

* **Java Development Kit (JDK):** Version 17 or higher
* **Build Tool:** Apache Maven