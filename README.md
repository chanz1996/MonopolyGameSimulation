# MonopolyGameSimulation

Project involves the implementation of the monopoly game where a number of players compete, indulge in the buying/selling of properties.

#Game Rules Implemented
The players start at the Go tile of the game. A typical turn begins with the rolling of the dice and advancing their piece clockwise around the board the corresponding number of squares

Initially every player is given $1500;

If the player lands on a property , he/she has the option of buying the property in the case when the property is not already bought by any player but, if not so, the player should pay the determined rent to the owner.

Construction of buildings can be done on these which will increase the rent for an arriving player

If a player lands on Chance or Community Chest, they draw the top card from the respective pile and obey its instructions.

A player will land in jail if they land on "Go to Jail

A player who lands or passes the Go space collects $200 (unless they automatically go to jail).

Players who land on either Income Tax or Luxury Tax pay the indicated amount to the bank

#Data Structures Used
1. Board: Circular Linked List , HashMap : maps Nodes to place
2.CommunityChestCards & ChanceCards :Circular Linked List.
3.Players:ArrayList
4.GUI elements

The following classes inherit from the Node class:
1.CityNode
2.ChanceNode 
3.CommunityChestNode - specific cards implemented using Queue
4.UtilityNode 
5.Tax Node

Java Swing and AWT were used to create the interactive graphic frontend.




