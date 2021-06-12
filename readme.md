[![LinkedIn][linkedin-shield]][linkedin-url]


<br />

  <h3 align="center">BST vs Binary Search</h3>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project
### The Program

To generate different data sizes between 100 and 10000 I use Math.rand().

Then using a hash set I populate the data structures with unique numbers.

Every recursive run through the method is a comparison of the nodes of the binary search tree and every run though the loop is a comparison of the elements in the sorted array.

Data is collected from 1000 iterations and MATLAB is used to plot the graphs.

### Observations

<img src="picture1.PNG" alt="queue" width="450"/>

From the graphs you can see that both the BST and binary search of a sorted array plot logarithmic graphs inferring a time complexity of O(log n). However, unlike the sorted array the BST does not consistently produce the same results. Since the tree is randomly generated, sometimes an unbalanced tree is produced which leads to the worst-case time complexity of O(n).

The graphs below demonstrate different results produced by different outputs, with the worst-case time complexity being O(n).

<img src="picture2.PNG" alt="queue" width="250"/>
<img src="picture4.PNG" alt="queue" width="250"/>
<img src="picture5.PNG" alt="queue" width="250"/>
<img src="picture6.PNG" alt="queue" width="250"/>
<img src="picture7.PNG" alt="queue" width="250"/>
<img src="picture8.PNG" alt="queue" width="250"/>

### Built With

Built with Java and plotted with MatLab

<!-- CONTACT -->
## Contact

Linda Scoon - [@linda_scoon](https://twitter.com/linda_scoon) - Twitter

<!-- MARKDOWN LINKS & IMAGES --> 
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/linda-scoon/
