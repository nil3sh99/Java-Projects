###Introduction
A class behavior can be changed at run time.

Objects 		--> Various Strategies
Context Object 	--> Behavior varies as per its strategy object
Strategy object --> Changes the executing algo of the context object

Example: Google maps:
Place A --> Place B, there are different modes of transportation and according to the mode of transporatation, the
strategy of finding the route from A to B changes. Ex: Cycling, Walking, Car, Two wheeler etc.

##Classes:

Context class		--> its behavior is dependent on the strategy object it has.
Strategy class		--> Abstract class/Interface which has methods that needs to be implemented in each strategy.
ConcreteStrategy	--> Actual implementation of the strategies.



UML Diagram Notation:

-->		:	has-a  	-> this means composition
--I>	:	is-a	-> this means inheritance