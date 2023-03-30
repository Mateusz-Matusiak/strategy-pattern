package org.design.patterns.behaviour.voice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuackVoice implements Voicable {
    @Override
    public void makeVoice() {
        log.info("Quack quack");
    }
}
