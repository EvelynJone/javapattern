package com.evelyn.design.pattern.prototype.examples.detail.orc;

import com.evelyn.design.pattern.prototype.examples.detail.Beast;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class OrcBeast extends Beast {

    private String weapon;

    public OrcBeast(String weapon) {
        this.weapon = weapon;
    }

    public OrcBeast(OrcBeast orcBeast) {
        this.weapon = orcBeast.weapon;
    }

    @Override
    public Beast copy() throws CloneNotSupportedException {
        return new OrcBeast(this);
    }

    @Override
    public String toString() {
        return "OrcBeast{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
