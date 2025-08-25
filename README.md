This repository is a clone of Sir Gabrielle's GUI repository for Framework Development (first assignment in CSS123P). 
Task: Study the program pattern and implement the same when drawing Ellipse and Rectangle shapes.
Prior my initial commit, there was only Line.java under the draw/model/ module. 

On my first commit, I added the Ellipse and Rectangle classes and included their respective rendering classes to draw/service/ similar to how Line.java has LineRendererService.java.

For the second commit, I added setters to Shape.java so MoverService.java could call the method .setLocation(), but I found out I just didn't install Lombok on IntelliJ. Though it might still work during runtime.
