package org.design.patterns.duck;

import org.design.patterns.behaviour.fly.Flyable;
import org.design.patterns.behaviour.voice.Voicable;

public class WoodenDuck extends Duck {

    public WoodenDuck(Flyable flying, Voicable voicable) {
        super(flying, voicable);
    }
}
