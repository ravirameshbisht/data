There are two classes, Parent and Child. The Child class extends the Parent class.
Both classes have a static method named display().
In the main method of the StaticMethods class, an object obj is created with Parent as its reference type and Child as its actual object type.
The display() method is called on obj. However, since static methods cannot be overridden in Java (they are associated with the class, not instances), the display() method from the Parent class is called, and the output is "parent class display()".
