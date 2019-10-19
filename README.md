# Median-of-two-Sorted-array
## Given two arrays in sorted order, write program to find median of two array. Cover all different possibilities.
## Approach:-In the question we need take two different sorted merge them and find the median of that resultant sorted array.The given code solve the problem in O((n+m)/2) complexity,where n & m are the size of given array.The code compares two elements  one-one each from the two array,adds the smaller one from the two in the array list and increment a variable that stores index of the array at given time.It repeats the process till n+m/2,where n & m are the size of given array.If the valueof [n+m/2] is even then the average of last two elements in the array list is the required answer,if value is odd then the last element of the arraylist is the given answer.Following are some outputs with different possible inputs:- 
<img src="./da1.png"><img/>
<img src="./da2.png"><img/>
<img src="./Da3.png"><img/>
