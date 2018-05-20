package com.evelyn.design.pattern.prototype.examples.detail.orc;

import com.evelyn.design.pattern.prototype.examples.detail.Mage;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class OrcMage extends Mage {

    private String weapon;

    public OrcMage(String weapon) {
        this.weapon = weapon;
    }

    public OrcMage(OrcMage orcBeast) {
        this.weapon = orcBeast.weapon;
    }

    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new OrcMage(this);
    }

    @Override
    public String toString() {
        return "OrcMage{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
