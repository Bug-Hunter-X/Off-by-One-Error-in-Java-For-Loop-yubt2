# Off-by-One Error in Java

This repository demonstrates a subtle off-by-one error in a Java `for` loop.  The loop's condition is checked *after* the loop body executes, leading to an unexpected result. The solution provides a corrected version. 

## Bug Description
The provided Java code contains an off-by-one error in its loop logic.  The loop terminates only after the variable 'x' exceeds 10. It prints 15 instead of the expected value when it reaches above 10. 

## Solution
The solution modifies the code to correct the off-by-one error by ensuring the loop condition is checked before the loop body executes and stops if the condition is reached.