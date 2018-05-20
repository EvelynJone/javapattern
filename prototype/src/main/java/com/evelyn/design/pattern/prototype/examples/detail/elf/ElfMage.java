package com.evelyn.design.pattern.prototype.examples.detail.elf;

import com.evelyn.design.pattern.prototype.examples.detail.Mage;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class ElfMage extends Mage {

    private String help;

    public ElfMage(String help) {
        this.help = help;
    }

    public ElfMage(ElfMage elfMage) {
        this.help = elfMage.help;
    }


    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "ElfMage{" +
                "help='" + help + '\'' +
                '}';
    }
}
