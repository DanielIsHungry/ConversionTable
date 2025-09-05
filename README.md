# Conversion Table Program

## 📖 Overview

This Java program prints two conversion tables **side by side** using
loops.\
The tables convert between **feet, miles, and kilometers**, with all
numbers formatted to **three decimal places**.

-   **Left table:** Feet → Miles → Kilometers\
-   **Right table:** Miles → Feet → Kilometers

It demonstrates: - Use of **loops** for repeated calculations.\
- Use of **constants** for unit conversions (`5280 feet = 1 mile`,
`1 mile = 1.609 km`).\
- Use of `System.out.printf` for formatted decimal output.

------------------------------------------------------------------------

## 🧮 Conversion Formulas

-   **Miles from Feet:**

        miles = feet / 5280

-   **Kilometers from Miles:**

        kilometers = miles * 1.609

-   **Feet from Miles:**

        feet = miles * 5280

------------------------------------------------------------------------

## 🖥️ Example Output

    Feet      Miles       Km           Miles     Feet        Km
    ---------------------------------------------------------------
    1000      0.189       0.304        1         5280        1.609
    2000      0.379       0.609        2         10560       3.218
    3000      0.568       0.913        3         15840       4.827
    4000      0.758       1.218        4         21120       6.436
    5000      0.947       1.523        5         26400       8.045
    6000      1.136       1.827        6         31680       9.654
    7000      1.326       2.132        7         36960      11.263
    8000      1.515       2.437        8         42240      12.872
    9000      1.705       2.741        9         47520      14.481
    10000     1.894       3.046        10        52800      16.090

------------------------------------------------------------------------

## 🚀 How to Run

1.  Save the program as `m_k.java`.\

2.  Compile the program:

    ``` bash
    javac ConversionTable.java
    ```

3.  Run the program:

    ``` bash
    java ConversionTable
    ```

------------------------------------------------------------------------

## ✨ Key Features

-   Side-by-side tables for clear comparison.\
-   Proper column alignment using `printf`.\
-   Loops used instead of manually printing values.\
-   Values rounded to **3 decimal places**.
