package Parsers.HTML;

/**
 * Created by devin on 8/30/15.
 */
public enum States {
    INITIAL(0), GREATER_THAN(0), LESS_THAN(0),
    FORWARD_SLASH(0), WHITE_SPACE(0), EQUAL_SIGN(0),
    QUOTATION_MARK(0), TEXT(1), NUMBER(2);

    private int nextArrayPosition;

    States(int nextArrayPosition) {
        this.nextArrayPosition = nextArrayPosition;
    }

    public int getNextArrayPosition() {
        return nextArrayPosition;
    }
}
