package com.evelyn.design.pattern.composite;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月24日上午19:54]
 */
public class DepthString {

    private int depth;

    public static String depth(String prefix,int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(prefix);
        }
        return sb.toString();
    }

}
