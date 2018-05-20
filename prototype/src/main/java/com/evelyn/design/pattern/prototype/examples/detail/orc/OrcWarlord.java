package com.evelyn.design.pattern.prototype.examples.detail.orc;

import com.evelyn.design.pattern.prototype.examples.detail.Warlord;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class OrcWarlord extends Warlord {

    private String weapon;

    public OrcWarlord(String weapon) {
        this.weapon = weapon;
    }

    public OrcWarlord(OrcWarlord orcBeast) {
        this.weapon = orcBeast.weapon;
    }

    @Override
    public Warlord copy() throws CloneNotSupportedException {
        return new OrcWarlord(this);
    }

    @Override
    public String toString() {
        return "OrcWarlord{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
