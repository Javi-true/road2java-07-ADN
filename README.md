# DNA Sequencing Program in Java

## Overview
This Java program checks if a DNA sequence follows certain criteria to be classified as a protein. The program examines predefined DNA sequences, extracts the start and stop codons, and checks the sequence length to determine whether it meets the conditions for being a protein. This is a practical exercise in string manipulation, conditional statements, and DNA sequence analysis.

## Key Concepts Practiced

### 1. String Manipulation
The program assigns different DNA sequences to variables and selects one sequence (`dna2`) to analyze. It calculates the sequence's length using `.length()` and extracts specific parts of the sequence, like the start codon (first three characters) and stop codon (last three characters), using `.substring()`.

### 2. Conditional Logic
Conditional statements are used to verify the sequence's protein status:
- The program checks if the start codon is `"ATG"`.
- It verifies that the stop codon is `"TGA"`.
- It ensures that the total sequence length is a multiple of 3 (to satisfy the triplet codon structure of proteins).

If all these conditions are met, the program prints that the sequence is a protein; otherwise, it indicates that the sequence is not a protein.

### 3. DNA Sequencing Basics
In biological terms, proteins begin with a start codon (`ATG`) and end with a stop codon (`TGA`). Additionally, protein sequences should be a multiple of 3 to ensure each codon corresponds to an amino acid. This simple program mirrors these biological rules in code, making it a foundational exercise for bioinformatics programming.

### Output
Based on the checks above, the program outputs whether the DNA sequence qualifies as a protein.

## Purpose
This program serves as a practical introduction to using string methods, conditionals, and working with biological sequence data in Java.
