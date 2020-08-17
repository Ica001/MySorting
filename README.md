# Sort #

## We have a vector "v" of integers and we want to sort those integers.
## In order to do that we follow the next steps:
 1) Create a new empty vector "vf" of integers.
 2) Insert in this empty vector the first two integers from v.
 3) Sort those two integers.
 4) Construct a funtion say f(int nextInt,int left ,int right) which get the next integer from v and insert this integer, in a sorted vector
    such taht mentain vector sorted.
	The function will compare next integer with the left element and the right elemnet of a given sorted vector. There are three cases:
	1.0 if: nextInt<=left_element insert at the left_element position.
	2.0 else if: nextInt>=right_element insert at the right_element position.
	3.0 else 
	{ 3.1 if: left+1==right insert between left and right.
	  3.2 else if: left_element<=nextInt<=(left+right)/2_element recall f(nextInt,left,(left+right)/2).
	  3.3 else recall f(nextInt,(left+right)/2,right).
	}.
 5) Call f( nextInt,0,vf.size()-1)
 
	
	
	
