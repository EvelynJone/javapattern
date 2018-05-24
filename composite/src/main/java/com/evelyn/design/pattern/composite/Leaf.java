package com.evelyn.design.pattern.composite;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月24日上午9:37]
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("can not add to a leaf.");
    }

    @Override
    public void remove(Component c) {
        System.out.println("can not remove from a leaf.");
    }

    @Override
    public void display(int depth) {
        System.out.println(DepthString.depth("-",depth) + name);
    }
}
