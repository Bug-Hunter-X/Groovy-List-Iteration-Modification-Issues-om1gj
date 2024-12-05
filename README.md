# Groovy List Iteration Bug

This repository demonstrates a common error when working with lists in Groovy: modifying a list while iterating over it using `eachWithIndex`.  The code in `bug.groovy` shows the problem.  The solution is provided in `bugSolution.groovy`.

## The Problem

The `myMethod` function attempts to print each item of a list along with its index. If the index is 2, it removes the element at that index. This approach is problematic because removing an element changes the list's size and shifts the indices of subsequent elements. This leads to skipping items or causing `IndexOutOfBoundsException`s.

## The Solution

The solution avoids directly modifying the list while iterating. Instead, it creates a new list containing only the desired elements. Alternatively, one could iterate over a copy of the list.