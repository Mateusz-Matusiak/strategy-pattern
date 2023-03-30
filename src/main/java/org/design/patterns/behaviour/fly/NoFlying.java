package org.design.patterns.behaviour.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoFlying implements Flyable {

    @Override
    public void fly() {
        log.warn("I can't fly");
    }
}
