package org.design.patterns.behaviour.voice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SqueakVoice implements Voicable {
    @Override
    public void makeVoice() {
        log.info("Beep, beep");
    }
}
