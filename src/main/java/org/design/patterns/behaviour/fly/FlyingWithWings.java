package org.design.patterns.behaviour.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyingWithWings implements Flyable {

    @Override
    public void fly() {
        log.info("Flying with wings!");
    }
}
