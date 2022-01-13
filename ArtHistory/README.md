# Art History

![The Metropolitan Museum of Art](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/The_Metropolitan_Museum_of_Art.jpg/600px-The_Metropolitan_Museum_of_Art.jpg)


The Metropolitan Museum of Art has a huge collection of artworks; even as old as 5000 years. While visiting the great
museum little *Tuba* took notes of the art title and the accession year of the art for each artwork that she enjoyed.

At first line of her notebook, *Tuba* wrote `N`, number of artworks she enjoyed. Then she wrote two lines for each
artwork; first line contains the art title and second line contains the accession year of the art.

Now she wants to get a list of these artworks sorted by the accession year. If several artworks have same accession
year, then she wants to sort them alphabetically. To simplify, the list should be sorted by the accession year and then
by the title.

### Input:

The first line contains the integer `N (1 <= N <= 1000) `, the number of artworks *Tuba* enjoyed.

The remaining `2*N` lines contain the art title and accession year.

Art title contains a line of consists of uppercase, lowercase, and spaces.

The accession year contains an integer between 0 to 5000.

### Output:

Print `N` lines, each line contain art title from the sorted list of the artworks.

<table>
    <tr>
        <th>Sample Input</th>
        <th>Sample Output</th>
    </tr>
    <tr>
        <td>
<pre>5
A Ship At Sea
1960
Intaglio In Ring
1917
Justice Welch
1917
Traveling Set
2010
Shabti Of Tjebure
1944</pre>
        </td>
        <td>
<pre>Intaglio In Ring
Justice Welch
Shabti Of Tjebure
A Ship At Sea
Traveling Set</pre>
        </td>
    </tr>
</table>

**Explanation on Sample Output:**
Here `Intaglio In Ring` and `Justice Welch` have the same accesson year (`1917`). As `Intaglio In Ring` is
alphabetically smaller than `Justice Welch`, `Intaglio In Ring` appears first in the output.

### References

- [The Metropolitan Museum of Art Website](https://www.metmuseum.org/)
- [The Metropolitan Museum of Art API](https://metmuseum.github.io)