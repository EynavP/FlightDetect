# FlightDetect
A Java project we made during the semester.

![screenShot](https://github.com/EynavP/FlightDetect/blob/main/screenShot.jpg)
## Introduction
This project was written during an advanced software development course.</br>
We studied how to perform Object-Oriented Analysis and Design, advanced principles in object-oriented design and architecture using the Java language.</br>
In addition, we learned to work with streams of communication and files, as well as event-oriented programming that implemented by using a GUI in JavaFX technology.</br>

The goal of the project is to visualize flight information to understand what is happening on each flight.</br>
The application exports the flight data and displays it in a user-friendly GUI.</br>
In addition, the system gives an option to interrogate the flight and find anomaly errors during flight with algorithms.</br>

## The Appliction
Given the CSV file with flight data, the application displays the flight as a video.</br>
The application is connected to the Flight Gear simulator for use as a projector. </br>
In the GUI there are 6 main elements:
* *Joystick* - display the aileron and elevator status, slider as a rudder, and slider as a throttle.
* *Control Panel* - airplane clocks for height, direction, speed, roll, pitch, and yaw.
* *Attributes list* - list of the attributes from the CSV file.
* *Graphs* - one graph that represents the chosen attribute, one graph for the most correlated attribute, and the graph for the algorithm and its detection.
* *Open Files* - alowed the user load XML, CSV files and Algorithm class.
* *Buttons bar* - the flight record can be controlled by play, pause, stop, forward, double forward, backward and double backward. The time of the flight can be changed by the time slider. The speed of record can be changed by the speed choice box.</br>

With these elements, we can control the flight record and see the pilot commands from the airplane.
The anomaly errors will be displayed in the algorithm graph by red X at the specific time.

## Algorithms
######  _Linear Regression Algorithm:_
The linear regression algorithm is a type of regression analysis where the number of independent variables is one, and there is a linear relationship between the independent(x) and dependent(y) variables.</br>
Based on the given data from the CSV file we create a list of points and, we try to plot a line that models the points the best.

######  _Z Score Algorithm:_
This algorithm is a Univariate algorithm which means an algorithm that looks for anomalies on any variable with itself
Only, and not to other variables.</br>
The Z score is defined as the distance between a point 𝑥 and a collection of points represented by their mean 𝑥 in units of deviations standard.

######  _Welzl Algorithm:_
This algorithm is finding the minimal enclosing circle.</br>
The algorithm will find for each pair of columns with such a correlation the minimum circle (center + radius),
Which encompasses all the two-dimensional points obtained.

######  _Hybrid:_
This algorithm split into several cases.</br>
When a column has only a weak correlation or no correlation with any other column, the algorithm will measure the z-score.</br>
If there is a correlation
High with another column so the algorithm can act as linear regression.</br>

* We will use *Linear Regression* when a correlation greater than or equal to an absolute value of 0.95, will be considered as high.</br>
* We will use *Z Score* when a correlation lower than 0.5, will be considered weak.</br>
* We will use *Welzl* when a correlation is between 0.5 to 0.95.
## Architecture 
