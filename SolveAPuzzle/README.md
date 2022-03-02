# Solve A Puzzle 

You are given an undirected connected graph with n vertices. To remind, the degree of a vertex is the number of edges that are connected to the vertex. The graph is said to have an Eulerian path if and only if it has **either 0 or 2 vertices of odd degree**.

You can draw this graph on paper without lifting the pencil from the paper and without using any edges more than once if it has an Eulerian path.

You will be given an adjacency matrix representation of an undirected connected graph with n nodes. You need to identify whether it has an Eulerian path or not.
#### Example 1

For example, see the following graph, and it's adjacency matrix:

![Graph with Eulerian path](../drawing/eulerian.png)

From the figure, we can see that:

- The degree of vertex A is 2
- The degree of vertex B is 3
- The degree of vertex C is 2
- The degree of vertex D is 2
- The degree of vertex E is 3

It has 2 vertices (vertex B and vertex E) with odd degree. Thus, the graph is said to have an Eulerian path.
So, we can draw this graph on paper without lifting the pencil from the paper and without using any edges twice. 
If we start drawing from either vertex B or vertex E, we can draw this on paper with a continuous stroke.
We should return `true` for this case.

#### Example 2

Let's see another example:

![Graph without Eulerian path](../drawing/non_eulerian.png)

From the figure, we can see that:

- The degree of vertex A is 1
- The degree of vertex B is 3
- The degree of vertex C is 2
- The degree of vertex D is 3
- The degree of vertex E is 3

It has 4 vertices (vertex A, vertex B, vertex D, and vertex E) with odd degree. 
Thus, the graph does not have an Eulerian path.
So, we cannot draw this graph on paper without lifting the pencil from the paper and without using any edges twice. 
We should return `false` for this case.

### Input constraints
An integer `N (1 <= N <= 100)`, the number of nodes of the graph.

A two-dimensional integer array `adjacencyMatrix` of size `N x N` representing the adjacency matrix of the graph. 
```
adjacencyMatrix[i][j] = 1, if there is an edge between node i and node j
adjacencyMatrix[i][j] = 0, otherwise
```


### Output constraints
Return `true` if the graph has an Eulerian path. Otherwise, return `false`

### Sample Input and Output

<table>
    <tr>
        <th>Sample Input 1</th>
        <th>Sample Output 1</th>
    </tr>
    <tr>
        <td>
<pre>
5
{{0, 0, 0, 0, 1},
{0, 0, 1, 1, 1},
{0, 1, 0, 1, 0},
{0, 1, 1, 0, 1},
{1, 1, 0, 1, 0}}</pre>
        </td>
        <td>
            true
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
5
{{0, 0, 0, 0, 1},
{0, 0, 1, 1, 1},
{0, 1, 0, 1, 0},
{0, 1, 1, 0, 1},
{1, 1, 0, 1, 0}}</pre>
        </td>
        <td>
            false
        </td>
    </tr>
</table>

### References
- [Wikipedia contributors. (2022, February 16). Degree (graph theory)](https://en.wikipedia.org/wiki/Degree_(graph_theory))