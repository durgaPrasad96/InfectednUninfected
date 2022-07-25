# InfectednUninfected
Given a matrix of 0's and 1's, that represents an uninfected and infected person respectively in a ward, In a day, an infected person can infect an uninfected person adjacent to it( left, right, top , bottom). Find the minimum number of days required to infect all the people.
Input 1:
0 0 0
0 1 0
0 0 0
Output 1:
 2
Explanation:
At day 1,
0 1 0
1 1 1
0 1 0
At day 2,
 1 1 1
 1 1 1
 1 1 1
Total number of days = 2
Input 2:
 1 0 0
 0 0 0
 0 0 0
Output 2:
 4
