# Temperature Analysis

![Temperature analysis](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/All_palaeotemps.png/800px-All_palaeotemps.png)

You are given the temperature of a city for `N` days.
Find the mean and median temperature for those days.

### Input:
The first line contains the integer `N (1 <= N <= 100) `, the length of days.

The remaining `N` lines contain the temperature of each day as a floating-point number. 
The temperature will be between `0.0` to `100.0`.

### Output:
Two lines;
the first line should contain the mean temperature and the second line should contain the median.

The values should be displayed to exactly two decimal places.

For example, `0` should be displayed as `0.00`. Similarly, `55.579` should be displayed as `55.58`.

<table>
    <tr>
        <th>Sample Input 1</th>
        <th>Sample Output 1</th>
    </tr>
    <tr>
        <td>
<pre>
7
55.0
59.5
58.5
58.5
67.5
53.5
47.5</pre>
        </td>
        <td><pre>57.14
58.50</pre>
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
4
70.0
71.5
65.5
66.5</pre>
        </td>
        <td><pre>68.38
68.25</pre>
        </td>
    </tr>
</table>

### References
- [Mean, Median and Mode from Grouped Frequencies](https://www.mathsisfun.com/data/frequency-grouped-mean-median-mode.html)