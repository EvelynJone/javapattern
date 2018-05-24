package com.evelyn.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月24日上午9:39]
 */
public class Composite extends Component {

    List<Component> children  = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(DepthString.depth("-",depth) + name);

        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
