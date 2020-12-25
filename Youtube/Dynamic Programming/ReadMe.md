#Dynamic programming
Definition:
    Dynamic programming is both a mathematical optimization method and a computer programming 
    method. The method was developed by Richard Bellman in the 1950s and has found applications 
    in numerous fields, from aerospace engineering to economics.
    In both contexts it refers to simplifying a complicated problem by breaking it down into 
    simpler sub-problems in a recursive manner. While some decision problems cannot be taken 
    apart this way, decisions that span several points in time do often break apart recursively. 
    Likewise, in computer science, if a problem can be solved optimally by breaking it into 
    sub-problems and then recursively finding the optimal solutions to the sub-problems, then it 
    is said to have optimal substructure.
    If sub-problems can be nested recursively inside larger problems, so that dynamic programming 
    methods are applicable, then there is a relation between the value of the larger problem and 
    the values of the sub-problems.In the optimization literature this relationship is called 
    the Bellman equation.
*[Wikipedia](https://en.wikipedia.org/wiki/Dynamic_programming)*

Memoization:
    In computing, memoization or memoisation is an optimization technique used primarily to speed 
    up computer programs by storing the results of expensive function calls and returning the cached 
    result when the same inputs occur again. Memoization has also been used in other contexts 
    (and for purposes other than speed gains), such as in simple mutually recursive descent parsing.
    Although related to caching, memoization refers to a specific case of this optimization, distinguishing 
    it from forms of caching such as buffering or page replacement. In the context of some logic programming 
    languages, memoization is also known as tabling.
*[Wikipedia](https://en.wikipedia.org/wiki/Memoization#:~:text=In%20computing%2C%20memoization%20or%20memoisation,the%20same%20inputs%20occur%20again.)*

Tabulation hashing:
    In computer science, tabulation hashing is a method for constructing universal families of hash functions 
    by combining table lookup with exclusive or operations. It was first studied in the form of Zobrist 
    hashing for computer games; later work by Carter and Wegman extended this method to arbitrary fixed-length 
    keys. Generalizations of tabulation hashing have also been developed that can handle variable-length keys 
    such as text strings.
    Despite its simplicity, tabulation hashing has strong theoretical properties that distinguish it from some 
    other hash functions. In particular, it is 3-independent: every 3-tuple of keys is equally likely to be 
    mapped to any 3-tuple of hash values. However, it is not 4-independent. More sophisticated but slower 
    variants of tabulation hashing extend the method to higher degrees of independence.
    Because of its high degree of independence, tabulation hashing is usable with hashing methods that require 
    a high-quality hash function, including hopscotch hashing, cuckoo hashing, and the MinHash technique for 
    estimating the size of set intersections.
*[Wikipedia](https://en.wikipedia.org/wiki/Tabulation_hashing)*

Memoization problem:
    1.Make it work.
    
        - Visualize the problem as a tree.
        - Implement the tree using recursion.
        - test it.
        
    2.Make it efficient.
    
        - add a memo object.
        - add a base case to return memo values.
        - store return values into the memo.
        
