package com.evelyn.design.pattern.builder.examples;

import java.util.List;

/**
 * @auther zhaoxl
 * @date 2018/5/20.
 */
public class Character {

    private String name;
    private String fighterClass;
    private String wizardClass;
    private String weapon;
    private String spell;
    private List<String> abilities;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFighterClass() {
        return fighterClass;
    }

    public void setFighterClass(String fighterClass) {
        this.fighterClass = fighterClass;
    }

    public String getWizardClass() {
        return wizardClass;
    }

    public void setWizardClass(String wizardClass) {
        this.wizardClass = wizardClass;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", fighterClass='" + fighterClass + '\'' +
                ", wizardClass='" + wizardClass + '\'' +
                ", weapon='" + weapon + '\'' +
                ", spell='" + spell + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
