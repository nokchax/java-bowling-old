package bowling.domain.state;

import bowling.domain.Pin;

public class Spare extends State {
    private Pin firstFallenPin;
    private Pin secondFallenPin;

    public Spare(Pin firstFallenPin, Pin secondFallenPin) {
        this.firstFallenPin = firstFallenPin;
        this.secondFallenPin = secondFallenPin;
    }

    @Override
    public State bowlBall(Pin fallenPin) {
        return this;
    }

    @Override
    public boolean isFrameEnd() {
        return true;
    }

    @Override
    public String toFrameView() {
        return String.format("%s|/", firstFallenPin.toString());
    }

    @Override
    public boolean isCalculable() {
        return true;
    }
}
