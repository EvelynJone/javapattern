package com.evelyn.design.pattern.prototype.examples.detail.elf;

import com.evelyn.design.pattern.prototype.examples.detail.Warlord;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class ElfWarlord extends Warlord {

    private String help;

    public ElfWarlord(String help) {
        this.help = help;
    }

    public ElfWarlord(ElfWarlord elfMage) {
        this.help = elfMage.help;
    }


    @Override
    public Warlord copy() throws CloneNotSupportedException {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "ElfWarlord{" +
                "help='" + help + '\'' +
                '}';
    }
}
