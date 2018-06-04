package com.evelyn.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年06月04日上午19:02]
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
