# Binary Tree and Binary Search Tree (BST)

## Binary Tree

<img src="https://miro.medium.com/v2/resize:fit:942/1*5LIURkrDDbz_S9paZ9EdZw.png"/>

A Binary Tree is a data structure where each node has at most two children, known as the left child and the right child. This hierarchical structure starts with a single root node, and each node can have 0, 1, or 2 children. Binary trees are utilized in various applications, such as expression parsing, hierarchical data representation, and more.

### Properties of a Binary Tree

- **Root**: The topmost node in the tree.
- **Leaf Nodes**: Nodes that do not have any children.
- **Height**: The longest path from the root to a leaf.
- **Depth**: The distance from the root to a specific node.

## Binary Search Tree (BST)

<img src="https://cdn-media-1.freecodecamp.org/images/2rTqYlcrnWtICedt131tDft0CmkzZaViExJX" width=500/>

A Binary Search Tree (BST) is a specialized form of a binary tree where nodes are arranged in a specific order:

- **Left Subtree**: Contains nodes with values less than the node's value.
- **Right Subtree**: Contains nodes with values greater than the node's value.

This ordering property makes BSTs efficient for search operations, as each comparison allows you to eliminate half of the remaining tree.

### Operations in a BST

- **Search**: Begin at the root and compare the target value to the node's value. Move left if the target is smaller and right if it’s larger.
- **Insertion**: Place the new node in the correct position to maintain the BST property.
- **Deletion**: Remove a node while ensuring the tree remains a valid BST.

BSTs are widely used in applications that require dynamic data storage with efficient searching, insertion, and deletion operations.

