# Word Chain Solver

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://openjdk.org/)
[![License](https://img.shields.io/badge/license-MIT-green)](LICENSE)

## Features
- Backtracking algorithm
- Case-insensitive comparison
- Input from file/console

## Project Structure

word-chain-solver/  
├── LICENSE           
├── .gitignore  
├── README.md  
└── src/  
    └── solver/  
        └── WordChainSolver.java 

This project solves a word chain puzzle: arranging words so that the last letter of each word matches the first letter of the next.

## Problem Statement

Given a list of words (e.g., "Kiev", "New-York", "Amsterdam", "Vienna", "Melbourne"),
reorder them so that each word starts with the last letter of the previous one.

## Approach

This solution uses a backtracking algorithm to explore all valid permutations of the word list and find a valid sequence.

## Example

**Input**: `Kiev New-York Amsterdam Vienna Melbourne`  
**Output**: `Amsterdam Melbourne New-York Kiev Vienna`

## How to Run

Compile and run the `WordChainSolver.java` file using any Java IDE or command line.

```bash
javac src/solver/WordChainSolver.java -d out/
java -cp out/ solver.WordChainSolver

