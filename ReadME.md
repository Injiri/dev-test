`` Search a number in a binary tree considering the shortest distance from the root node ``

Usin BFS traversal, it require O(n) time  to visit every node in the binary tree exactly once.
The nodes are traversed level by level takig a case of in the order of their
distance from the root node in the tree.

In this test psudocode the roblem is to search for the ocurrance of a given number that is closer to
the root node. This is showcased by leavaraging on the Queue data structure to store the nodes at various levels
during traversal.

`Memory and space`

In this BFS Traversal we assume space of say O(w) where w is the number of nodes to be traversed at the same level(max width of the binary tree).

#### :(
If the tree to be traversed in search of a passed @param  happens to be a ballanced tree then more spaced will be incured in the processing.
