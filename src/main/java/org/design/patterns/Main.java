package org.design.patterns;

import org.design.patterns.behaviour.fly.FlyingWithWings;
import org.design.patterns.behaviour.fly.NoFlying;
import org.design.patterns.behaviour.voice.QuackVoice;
import org.design.patterns.behaviour.voice.SqueakVoice;
import org.design.patterns.duck.Duck;
import org.design.patterns.duck.WoodenDuck;

public class Main {

    public static void main(String[] args) {

        Duck duck = new WoodenDuck(new NoFlying(), new SqueakVoice());
        duck.fly();
        duck.voice();
        duck.setFlying(new FlyingWithWings());
        duck.setVoicable(new QuackVoice());
        duck.fly();
        duck.voice();
    }
}
