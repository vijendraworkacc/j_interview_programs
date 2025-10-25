package com.javadevta.ds;

/*
 * Binary Tree - Core Features and Functionalities
 *
 * 1. Node Structure
 *    - Each node should have:
 *        → data: stores the actual value
 *        → left: reference to the left child node
 *        → right: reference to the right child node
 *
 * 2. Initialization
 *    - A BinaryTree class should have:
 *        → root: reference to the root node of the tree
 *
 * 3. Insertion Operations
 *    - insert(data): add a new node to the tree following binary tree rules
 *    - (for Binary Search Tree) insert maintains the order:
 *        → values smaller than parent go to the left subtree
 *        → values greater than parent go to the right subtree
 *
 * 4. Traversal Operations
 *    - inorderTraversal(): left → root → right
 *    - preorderTraversal(): root → left → right
 *    - postorderTraversal(): left → right → root
 *    - levelOrderTraversal(): visit nodes level by level (using queue)
 *
 * 5. Search Operation
 *    - search(value): check if a specific value exists in the tree
 *
 * 6. Deletion Operation
 *    - delete(value): remove a node from the tree while maintaining structure
 *    - handle three cases:
 *        → deleting a leaf node
 *        → deleting a node with one child
 *        → deleting a node with two children (replace with inorder successor)
 *
 * 7. Utility Functions
 *    - getHeight(): return the height (maximum depth) of the tree
 *    - countNodes(): return total number of nodes
 *    - isEmpty(): return true if root is null
 *
 * 8. Advanced Operations
 *    - findMin(): return the minimum value node
 *    - findMax(): return the maximum value node
 *    - mirror(): create a mirror image of the binary tree
 *    - getLevel(value): return the level (depth) of a specific node
 *
 * 9. Tree Properties
 *    - check if tree is balanced
 *    - check if tree is full (every node has 0 or 2 children)
 *    - check if tree is complete (all levels filled except possibly last)
 *    - check if tree is perfect (full and all leaves are on same level)
 *
 * 10. Optional Advanced Features
 *    - Lowest Common Ancestor (LCA) of two nodes
 *    - Diameter of the tree (longest path between two nodes)
 *    - Path sum (check if there exists a path with a given sum)
 *    - Serialize and deserialize tree (convert to and from string)
 *
 * These features together make a complete implementation of a Binary Tree.
 */
class BinaryTree {

}
public class CustomBT {
}
