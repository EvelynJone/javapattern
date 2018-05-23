package com.evelyn.design.pattern.memento.examples;

/**
 * 功能说明：TODO
 *
 * @auther by zhaoxl
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2018年05月23日上午19:38]
 */
public class GameRole {

    // 生命力
    private int vitality;

    // 攻击力
    private int attack;

    // 防御力
    private int defense;

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality,attack,defense);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void stateDisplay() {
        System.out.println("the state now of the role: ");
        System.out.println("live: " + vitality);
        System.out.println("attach: " + attack);
        System.out.println("defense : " + defense);
    }

    public void getInitState() {
        this.vitality = 100;
        this.defense = 100;
        this.attack = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.defense = 0;
        this.attack = 0;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
