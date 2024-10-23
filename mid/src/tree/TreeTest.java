package tree;
public class TreeTest {
	public static void main(String[] args) {
		// --- 1. Building the tree ---
		System.out.println("--- 1. [5 points] Building the tree ---");
		System.out.println("We will test your work with the following tree:");
		System.out.println("----------------------------------------------- ");
		System.out.println();
		System.out.println("                        1        ");
		System.out.println("                      /   \\     ");
		System.out.println("                     /     \\    ");
		System.out.println("                    2       3    ");
		System.out.println("                   / \\     / \\ ");
		System.out.println("                  /   \\   /   \\");
		System.out.println("          t =    4     5 6     7 ");
		System.out.println("                  \\           / ");
		System.out.println("                   8         9   ");

		// Please build your tree in here
		// Please do your work in here, i.e., build that "t" tree below
		Tree node9 = new Tree(9, null, null);
		Tree node8 = new Tree(8, null, null);
		Tree node7 = new Tree(7, node9, null);
		Tree node6 = new Tree(6, null, null);
		Tree node5 = new Tree(5, null, null);
		Tree node4 = new Tree(4, null, node8); 
		Tree node2 = new Tree(2, node4, node5); 
		Tree node3 = new Tree(3, node6, node7); 
		Tree t = new Tree(1, node2, node3); 
		//
		//
		//
		//
		//

		// Show it
		System.out.println();
		System.out.println("Use toString() meethod:");
		System.out.println("-----------------------");
		System.out.println();
		System.out.println(t);
		System.out.println();
		System.out.println("Use toStringAdv() method, i.e,. rotated, without edges:");
		System.out.println("------------------------------------------------------- ");
		System.out.println();
		System.out.println(t.toStringAdv());
		System.out.println();
		
		System.out.println("--- 2. [5 points] triple ---");
		t.triple();
		System.out.println("After triple() has been called:");
		System.out.println("------------------------------ ");
		System.out.println(t.toStringAdv());
		System.out.println();

		System.out.println("--- 3. [5 points] printDepthFirst ---");
		t.printDepthFirst();
		System.out.println("After printDepthFirst() has been called:");
		System.out.println("------------------------------ ");
		System.out.println();
		System.out.println();

		System.out.println("--- 4. [10 points] createFreshCopy ---");
		Tree u = t.createFreshCopy();
		t.mirror();
		System.out.println("After createFreshCopy() has been called:");
		System.out.println("------------------------------ ");
		System.out.println("t: ");
		System.out.println(t.toStringAdv());
		System.out.println("u: ");
		System.out.println(u.toStringAdv());
		System.out.println();

		System.out.println("--- 5. [5 points] saveDepthFirst ---");
		System.out.println("We will test with the following tree:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();
	    System.out.println("                             4        ");
	    System.out.println("                           /   \\     ");
	    System.out.println("                          /     \\    ");
	    System.out.println("          t =            5       6    ");
	    System.out.println("                        / \\     / \\ ");
	    System.out.println("                       7   8   9   10 ");
	    // Build the tree:
	    // Your code is in here
	    //
	    //
	    Tree treeNode10 = new Tree(10);
        Tree treeNode9 = new Tree(9);
        Tree treeNode8 = new Tree(8);
        Tree treeNode7 = new Tree(7);
        Tree treeNode6 = new Tree(6, treeNode9, treeNode10);
        Tree treeNode5 = new Tree(5, treeNode7, treeNode8);
        Tree treeRoot = new Tree(4, treeNode5, treeNode6);
        t = treeRoot;
        
	    //
	    //
	    //
	    int a[] = new int[13];
	    int beginning = 4;
	    int end = t.saveDepthFirst(a, beginning);
	    System.out.println("end: " + end); // The index of last node in array a
	    for (int i = 0; i < a.length; i++) {
	    	System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    System.out.println();
//
	    System.out.println("--- 6. [5 points] find ---");
		System.out.println("We will test with the following binary tree:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();
	    System.out.println("                             5        ");
	    System.out.println("                           /   \\     ");
	    System.out.println("                          /     \\    ");
	    System.out.println("          t =            3       8    ");
	    System.out.println("                        / \\     / \\ ");
	    System.out.println("                       1   4   7   10 ");
	    // Build the tree:
	    // Your code is in here
	    //
	    Tree node10 = new Tree(10);
        node7 = new Tree(7);
        node4 = new Tree(4);
        Tree node1 = new Tree(1);
        node8 = new Tree(8, node7, node10);
        node3 = new Tree(3, node1, node4);
        treeRoot = new Tree(5, node3, node8);
        t = treeRoot;
	    //
	    //
	    //
	    //
	    System.out.println(t.find(8));
		System.out.println("After find(8) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println();
//
	    System.out.println("--- 7.f [5 points] insert ---");
	    t = t.insert(9);
	    System.out.println("After insert(9) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(t);
	    System.out.println(t.toStringAdv());
	    t = t.insert(12);
	    System.out.println("After insert(12) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(t);
	    System.out.println(t.toStringAdv());
	    t = t.insert(8);
	    System.out.println("After insert(8) has been called:");
	    System.out.println("------------------------------------------- ");
	    System.out.println(t);
	    System.out.println(t.toStringAdv());
	}
}