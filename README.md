#Recursive Graphics - HTRee

The H-tree is another example of a fractal pattern like the Koch snowflake and Sierpinski triangle. It also of practical interest in circuit design. For example, imagine that we want to lay out circuit components on a microprocessor chip so that the length of wire connecting each component to the clock is the same. This property is desirable to achieve uniform wiring delay. The H-tree pattern is an elegant solution: position the clock in the center of the biggest H, and put each circuit component at one of the exposed endpoints of the smallest H's.
<br />
Though the H-tree pattern looks complex, it can be generated with a short recursive program.


#Usage

Compile javafiles by running:
```
javac *.java
```
<br />
Plot an HTree pattern of depth 2 by running
```
java HTree 2
```

#References

http://introcs.cs.princeton.edu/java/assignments/htree.html