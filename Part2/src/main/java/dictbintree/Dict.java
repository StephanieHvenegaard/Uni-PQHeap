/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2.dictbintree;

/**
 * provided interface.
 */
public interface Dict {
    public void insert(int k);
    public int[] orderedTraversal();
    public boolean search(int k);
}

