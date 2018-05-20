package com.evelyn.design.pattern.prototype.examples.detail.elf;

import com.evelyn.design.pattern.prototype.examples.detail.Beast;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class ElfBeast extends Beast {

    private String helpType;

    public ElfBeast(String helpType) {
        this.helpType = helpType;
    }

    public ElfBeast(ElfBeast elfBeast) {
        this.helpType = elfBeast.helpType;
    }

    @Override
    public Beast copy() throws CloneNotSupportedException {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "ElfBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
