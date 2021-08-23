# Roomba Reflex Agent

Author: Kevin Gao on 2020-9-29

Roomba's Roamings is a full standalone simulation of a Roomba AI complete with a Behavior Tree modeled by node objects implemented in a modular fashion that facilitates updates to the Behavior Tree structure.

![alt text](https://tufts.box.com/s/bptweblpao4s6i5uav8fb7ljro42s3eo)

## Key Implementation Details
The program was designed with modularity and expandability as key considerations. As such, the Roomba's Behavior Tree is implemented as a Tree of nodes, each inheriting from the abstract TreeNode class and implementing their own run() functions. 

The structure of the tree is defined in the enum BehaviorTreeStructure, which allows for easy modifications of the BehaviorTree structure. The program builds trees directly based on the specifications of this enum, so any changes are instantly available.

For more details on the locations of these files, please refer to the Directories section.

## Directories
main
* Driver function and Roomba Class

tree
* Classes outlining the structure of nodes and the Behavior Tree

node
* Implementation of each TreeNode subclass, including composite, decorator, task, and condition nodes

util
* Useful enums that standardize inter-class communication, increase modularity, and reduce runtime


## Usage and Testing
All necessary files and libraries have been compiled into the executable "Roomba's Roamings.jar".

If desired, you can compile and run in your editor, e.g. Eclipse, for ease of view Javadocs.

Testing was designed to be all-inclusive, so two modes are included:
* System-Generated Randomized Input of Commands and Sensors
* User-Selected Input of Commands and Sensors

To run the test program, navigate to the directory with "Roomba's Roamings.jar" and use
```bash
java -jar "Roomba's Roamings.jar"
```

Simply run the program and follow the prompts.


