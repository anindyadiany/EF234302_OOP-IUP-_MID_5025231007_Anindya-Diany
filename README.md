# EF234302_OOP-IUP-_MID_5025231007_Anindya-Diany
Midterm exam for OOP by Anindya Diany 5025231007 

<img width="624" alt="OOP DECLARATION" src="https://github.com/user-attachments/assets/f009d62e-d866-4943-8b4b-29b92f1bed24">

Test Cases:
# TREE
--- 1. [5 points] Building the tree ---
We will test your work with the following tree:
----------------------------------------------- 

                        1        
                      /   \     
                     /     \    
                    2       3    
                   / \     / \ 
                  /   \   /   \
          t =    4     5 6     7 
                  \           / 
                   8         9   

Use toString() meethod:
-----------------------

branch(1,branch(2,branch(4,empty,branch(8,empty,empty)),branch(5,empty,empty)),branch(3,branch(6,empty,empty),branch(7,branch(9,empty,empty),empty)))

Use toStringAdv() method, i.e,. rotated, without edges:
------------------------------------------------------- 

        7
            9
    3
        6
1
        5
    2
            8
        4


--- 2. [5 points] triple ---
After triple() has been called:
------------------------------ 
        21
            27
    9
        18
3
        15
    6
            24
        12


--- 3. [5 points] printDepthFirst ---
3 6 12 24 15 9 18 21 27 After printDepthFirst() has been called:
------------------------------ 


--- 4. [10 points] createFreshCopy ---
After createFreshCopy() has been called:
------------------------------ 
t: 
        12
            24
    6
        15
3
        18
    9
            27
        21

u: 
        21
            27
    9
        18
3
        15
    6
            24
        12


--- 5. [5 points] saveDepthFirst ---
We will test with the following tree:
------------------------------------------- 

                             4        
                           /   \     
                          /     \    
          t =            5       6    
                        / \     / \ 
                       7   8   9   10 
end: 10
0 0 0 0 4 5 7 8 6 9 10 0 0 

--- 6. [5 points] find ---
We will test with the following binary tree:
------------------------------------------- 

                             5        
                           /   \     
                          /     \    
          t =            3       8    
                        / \     / \ 
                       1   4   7   10 
branch(8,branch(7,empty,empty),branch(10,empty,empty))
After find(8) has been called:
------------------------------------------- 

--- 7.f [5 points] insert ---
After insert(9) has been called:
------------------------------------------- 
branch(5,branch(3,branch(1,empty,empty),branch(4,empty,empty)),branch(8,branch(7,empty,empty),branch(10,branch(9,empty,empty),empty)))
        10
            9
    8
        7
5
        4
    3
        1

After insert(12) has been called:
------------------------------------------- 
branch(5,branch(3,branch(1,empty,empty),branch(4,empty,empty)),branch(8,branch(7,empty,empty),branch(10,branch(9,empty,empty),branch(12,empty,empty))))
            12
        10
            9
    8
        7
5
        4
    3
        1

After insert(8) has been called:
------------------------------------------- 
branch(5,branch(3,branch(1,empty,empty),branch(4,empty,empty)),branch(8,branch(7,empty,empty),branch(10,branch(9,empty,empty),branch(12,empty,empty))))
            12
        10
            9
    8
        7
5
        4
    3
        1

## LIST
--- 8. [5 points] negateAll ---
list1: -2, 5, -8, 0
list2 is the negation of list1: 2, -5, 8, 0

--- 9. [5 points] find ---
list3: 7, 5, 3, 8
Finding the position of the first 3 (starting from 0) in list3: 2
Finding the position of the first 2 (starting from 0) in list3: -1

--- 10. [5 points] allPositive ---
Check whether all of its elements are positive in list1: false
Check whether all of its elements are positive in list3: true

--- 11. [10 points] positives ---
list4: 2, 3, -5, 8, -2
list5 is the positive elements of list4: 2, 3, 8

--- 12. [10 points] sorted ---
list4: 2, 3, -5, 8, -2. It is unsorted (Increment Order).
list5: 2, 3, 8. It is sorted (Increment Order).

--- 13. [10 points] merge ---
Merging two sorted lists
list6: 2, 5, 5, 8
list7: 5, 7, 8, 9
Merging list6 & list7 into list8: 2, 5, 5, 5, 7, 8, 8, 9
list9: 9
Merging list6 & list9 into list10: 2, 5, 5, 8, 9

--- 14. [10 points] removeDuplicate ---
Remove all duplicate copies at list8 into list11: 2, 5, 7, 8, 9

--- 15. [5 points] skip ---
Element 5 skipped at list8, assigned into list12: 2, 7, 8, 8, 9
anindyadianyputri@Anindyas-MacBook-Pro mid % 

