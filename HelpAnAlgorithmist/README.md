# Help an Algorithmist 
Bob is an algorithmist (one who studies algorithms) and loves to write super-efficient programs with minimum time complexity. 
One day he wrote an `N` line program which raised a compilation error. 
From the debugger, he received the compilation status of each line in increasing order. 
He found that the remaining lines after the first occurrence of compilation error also failed to be compiled.

For example, the code contains 7 lines. The debugger returns compilation status for each line:

```
pass
pass
pass
fail
fail
fail
fail
```
As you can see, the program first failed to compile at the fourth line and then all the subsequent lines also failed to compile.

Can you help Bob to identify the line which raises the compilation error for the first time? 

### Input:
The first line contains the integer `N (1 <= N <= 5000) `, the length of Bob’s program.

The remaining `N` lines contain the compilation status for each line which can be either `pass` or `fail`.

### Output:
One line which contains the line number where the compilation error occurred first. It is guaranteed that the program has at least one line with failed compilation. 

<table>
    <tr>
        <th>Sample Input 1</th>
        <th>Sample Output 1</th>
    </tr>
    <tr>
        <td>
<pre>
7
pass
pass
pass
fail
fail
fail
fail</pre>
        </td>
        <td>
            4
        </td>
    </tr>
</table>

<table>
    <tr>
        <th>Sample Input 2</th>
        <th>Sample Output 2</th>
    </tr>
    <tr>
        <td>
<pre>
3
pass
fail
fail</pre>
        </td>
        <td>
            2
        </td>
    </tr>
</table>

<table>
    <tr>
        <th>Sample Input 1</th>
        <th>Sample Output 1</th>
    </tr>
    <tr>
        <td>
<pre>
1
fail</pre>
        </td>
        <td>
            1
        </td>
    </tr>
</table>
