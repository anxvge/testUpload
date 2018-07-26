package com.jas.compositeTest;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ClassName:CompositeTest
 * Package:com.jas.compositeTest
 * Descrip: 组合模式 用于表示树形结构时比较方便
 *
 * @Date:2018/7/21 下午10:40
 * @Author:jas
 */
public class CompositeTest {
    public static void main(String[] args) {
        Tree tree = new Tree("ROOT");
        TreeNode node1 = new TreeNode("node1" , tree.root);
        TreeNode node2 = new TreeNode("node2" , tree.root);
        TreeNode node3 = new TreeNode("node3" , node1);
        tree.root.addChildrenNode(node1);
        tree.root.addChildrenNode(node2);
        node1.addChildrenNode(node3);

        Enumeration<TreeNode> childrenNodes = tree.root.getChildrenNodes();
        while(childrenNodes.hasMoreElements()){

            System.out.println(childrenNodes.nextElement());
        }

    }
}

//定义树节点
class TreeNode {
    //定义节点名字
    private String name;
    //定义父节点
    private TreeNode parentNode;
    //定义节点的子节点
    private Vector<TreeNode> childrenNodes = new Vector<TreeNode>();

    public TreeNode(String name , TreeNode parentNode){
        this.name = name;
        this.parentNode = parentNode;

    }

    public String getName(){
        return this.name;
    }

    //增加子节点的时候定义父节点
    public void addChildrenNode(TreeNode node){
        childrenNodes.add(node);
    }

    public TreeNode getParentNode(){
        return parentNode;
    }

    public Enumeration<TreeNode> getChildrenNodes() {
        return childrenNodes.elements();
    }

    @Override
    public String toString() {
        return this.getName() + "---" + (this.parentNode == null ? "null" : this.parentNode.getName());
    }
}

//定义一棵树
class Tree {
    private String name;
    public TreeNode root;

    public Tree (String name){
        this.name = name;
        this.root = new TreeNode(name , null);
    }

}
