#Arrays


##### var to declore an arrays is

```
var myArray = new int[10]; // This is valid.
````
you can not use brackets on the left side of a _var_ declaration. And you can not use var with an array initializer.

```
var[] myArray = new int[10]; // Wrong

var myArray[] = new int[10]; // Wrong

var myArray = { 1, 2, 3 }; // Wrong
```