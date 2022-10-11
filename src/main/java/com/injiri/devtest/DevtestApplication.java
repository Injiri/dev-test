package com.injiri.devtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevtestApplication {

	public static void main(String[] args) {
		//Find out second occurance of a  number and the smallest/shortest distance from the rootNode
		TreeNode node = new TreeNode();
		iterativeLevelOrder(2);

		SpringApplication.run(DevtestApplication.class, args);
	}

	/**
	recursiveLevelOrder approach
	- Height of tree : No. of levels  to be traversed. Function height(rootNode)  returns the height of tree 'h'.
	- Loop from level = 0 to h - 1 and traversing each level in the tree.
	i.e call @function processCurrentLevel(rootNode, lvl) function  to visit and process nodes at the
	current level lvl.
	- Move ove to level 1 and process all nodes in the left subtree. 
	i.e height -  @function height(rootNode)  
		rootNode->left 
		and lvl - 1 as a function parameter.
	When current level is 1 then  lvl - 1 distance away from the root->left.
	
	- Process all nodes at level l in the right subtree. 
	i.e  call the same function : 
		height -  @function height(rootNode)  
		rootNode->right 
		and lvl - 1 as a function parameter.
	When current level is 1 then lvl - 1 distance away from the root->right.

	When lvl == 0 from the rootNode in context during the recursive calls then process the node. In this case all the nodes at the
	level lvl can be accessed recursively, considering the path as the shortest distance from the root node in the binary tree traversal.
	**/
	public  void recursiveLevelOrder(TreeNode root)
{
    int h = height(rootNode)
    for (int lvl = 0; lvl < h; lvl = lvl + 1)
    processCurrentLevel(rootNode, lvl)
}

	/**   
		iterativeLevelOrder approach 
		1.Create a queue and initialize as root node.

		2.Loop over the initialized queue is not empty.

		3.Traverse by poping front node from queue and assigning curent node object. 

		4.Process and insert left and right child nodes into the queue while on the currently inialized note.

		5.If the left child of the current node is not null then insert left child into queue.

		6.If the right child of the current Node is not NULL, we insert right child into queue.
		
		6.The level order traversal closes when the rightmost node processed on the last level of the tree.
	**/
	public void iterativeLevelOrder(TreeNode rootNode){	
	Queue<TreeNode> treeQueue;
	treeQueue.enqueue(rootNode);
	while (treeQueue.empty() == false)
		{
			TreeNode currentNode = treeQueue.dequeue()
			process(currentNode->data)
				if (currentNode->left != NULL){
					treeQueue.enqueue(currentNode->left)
				}
				if (currentNode->right != NULL){
					treeQueue.enqueue(currentNode->right)
				}
			return;
		}
}

/**
 Process the nodes at passed level param
 @Param rooteNode
 @Param lvl
**/
public void processCurrentLevel(TreeNode rootNode, int lvl)
{
    if (rootNode == NULL)
     return
    if (lvl == 0){
    process(rootNode->data)
	}
    else if (lvl > 0)
    {
    processCurrentLevel(rootNode->left, lvl - 1)
    processCurrentLevel(rootNode->right, lvl - 1)
    }
}

/**
Calculating the height of tree
@Param rootNode
**/
public int height(TreeNode rootNode)
{
if (rootNode == NULL)
	return 0
else
    {
        int leftHeight = height(rootNode->left)
        int rightHeight = height(rootNode->right)
        if (leftHeight > rightHeight)
            return (rightHeight + 1)
        else
            return(rightHeight + 1)
    }
}




}



