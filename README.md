# kataClashOfClans

*************************************  EX1  ******************************************

We are going to build a game. No game knowldege needed to resolve the exercises :)

As with most of the games the essential need are resources.
We have several type of resources : gems, gold, blue elixir and black elixir.
The purpose of our first exercise is to validate our black elixir production formula. 
Our black elixir is extracted from
deep inside earth by greedy dwarfs and they are not happy if we do not pay the correct price.

The rules are simple:
	- For producing black elixir two other resources are needed gems and blue elixir
	- The formula states that for producing 100 units of black elixir we need 5 gems and 200 units  of blue elixir
	  or 2 gems and 500 units of blue elixir
	- If quantity of gems supplied is bellow 2 gems or 200 units of blue elixir the dwarfs are not happy 
	- If the quantities suplied are not the exact ones (or exact multiplication of them) the dwars are also not happy they 
	do not like complex computations and will ask you to pay the exact price
	- BlackElixir is produced by BlackElixirFactory building

The purpose of the exercise:
	- write all tests defined in the "Ex1.java" based on the information provided above 
	- the code which should be covered by tests is found in "BlackElixirFactory.java"
	- are all the tests defined enough to cover all cases ?  if not please complete with the missing tests

* Estimated time: 5-10 minutes *
* 
*************************************  EX2  ******************************************

So we are advancing well in our development, nice job :0 . It is time to add some troops into our game play.
Troops are tricky little thing our game can have troops which can be produced with blue or black elixir.
In order to produce troops you will have to have some training camps (training camps are buiddings responsible for producing your troops).
Training camps can be of 2 types 
	- "BlueTrainingCamp" which can train the following troops consuming blue elixir resources : Bomber, Giant and Miner
	- "BlackTrainingCamp" which can train the following consuming black elixir resources : Dragon
	
Each unit has offensive and defensive hitpoints as described bellow:
 - "Dragon" | OffensiveHitpoints: 7500 | DefensiveHitpoints: 5000 |
 - "Giant"  | OffensiveHitpoints: 3000 | DefensiveHitpoints: 4500 |
 - "Miner"  | OffensiveHitpoints: 1200 | DefensiveHitpoints:  800 |
 - "Bomber" | OffensiveHitpoints:  800 | DefensiveHitpoints:  350 |


 Question 1:
  - Based on the information provided above please complete the implementation of the units : Dragon,Bomber,Giant and Miner
  in order to pass all tests included in  "Ex2.java"
  - Feel free to describe your solution and what are you planning to do.
  - Very important: You are not allowed to change the tests, the purpose of the exercise is to complete the implementation and 
  make the tests valid
 
 * Estimated time: 5-10 minutes *

 Question 2:
	When a unit takes a hit his life (DefensiveHitpoints) are decresing based on the offensiveHitpoint of the attack.
	When the unit Defensive Hitpoints are equal to 0 or fall bellow 0 the unit emits a last message shout before dyning .
	Each unit has a special shout message which it emits when is dying:
	  - "Dragon" - "I WILL RISE AGAIN FROM THE ASHES"
	  - "Giant"  - "OUR IRON FISTS WILL BE REMEMBERED FOREVER"
	  - "Bomber" - "WHEN YOU play with Explosives is dangerous bussiness"
	  - "Miner"  - "we return in the ground"
  
  Your role is to finish the implementation of the "ReceiveHit" method for all units in order to pass all tests 
  included in unde the namespace: "Ex2.java"
    
 * Estimated time: 5-10 minutes *

 Question 3:
	You arrived at a step where you have implemented quite a few things. Is there something you would have done differrent or you would want to
	refactor ? Explain your ideas and suggestions.

	Implement them.

 * Estimated time: 5-15 minutes *

*************************************  EX3  ******************************************

Now that we have our troop units ready is time to see some action.

Each unit has the ability to move around the map in different ways.
The map is splited in equaly divided space units.
There are 3 types of movement behaviours:
	- Walk - when a unit walks it can cover 3 map spaces in 1 second
	- TunnelUnder - when a unit tunnels under it can cover 5 map spaces in 1 second
	- Fly - when a unit flies it can cover 8 map spaces in 1 second

Our troop units movement type is the following:
	- Bomber => Walk
	- Giant  => Walk
	- Dragon => Fly
	- Miner  => TunnelUnder

Question 1:
    - Provide the code implementation of the Move action for each of the troop units above
	- All tests included into the namespace "Ex3.java" should pass

* Estimated time: 5-15 minutes *

Question2: 

=> Uncomment the Q2 tests and comment With_Bomber_Unit_For_1_second_Then_It_Should_Walk_And_Cover_3_Map_Spaces

	- We have decided that the bomber moves too slow so we want him to run :)
	- Implement the Run behaviour : when a unit runs it can cover 6 map spaces into one second
	- All tests included into the namespace "Ex3.java" should pass

* Estimated time: 5-10 minutes *


