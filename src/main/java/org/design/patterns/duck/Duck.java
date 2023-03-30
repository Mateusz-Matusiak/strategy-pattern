package org.design.patterns.duck;

import org.design.patterns.behaviour.fly.Flyable;
import org.design.patterns.behaviour.voice.Voicable;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter
public abstract class Duck {

    private Flyable flying;
    private Voicable voicable;

    public void fly() {
        flying.fly();
    }

    public void voice() {
        voicable.makeVoice();
    }
}
