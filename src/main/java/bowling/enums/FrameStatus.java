package bowling.enums;

import bowling.domain.Pin;
import bowling.util.PinUtil;

public enum FrameStatus {
    NOT_START,
    STRIKE,
    SPARE,
    MISS,
    NOT_END;

    public static FrameStatus getStatus(Pin firstTry, Pin secondTry) {
        int numberOfFellPinOfFirstTry = PinUtil.getNumOfPin(firstTry);
        int numberOfFellPinOfSecondTry = PinUtil.getNumOfPin(secondTry);

        if(numberOfFellPinOfFirstTry < 0)
            return NOT_START;
        if(numberOfFellPinOfFirstTry == 10)
            return STRIKE;
        if(numberOfFellPinOfSecondTry < 0)
            return NOT_END;
        if(numberOfFellPinOfFirstTry + numberOfFellPinOfSecondTry == 10)
            return SPARE;

        return MISS;
    }

    public static boolean isEnd(FrameStatus status) {
        return status == STRIKE
                || status == SPARE
                || status == MISS;
    }

}
