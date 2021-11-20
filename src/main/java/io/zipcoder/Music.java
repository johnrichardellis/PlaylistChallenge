package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        // need to return Integer
        // result will be the MIN number of presses needed to reach song SELECTION
        // if else statements

        int forward = 0;
        int backward = 0;
        int buttonPresses = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (!selection.equals(getPlayList()[i])) {
                forward++;
            }
        }

        for (int j = startIndex; j >= 0; j--) {
            if (!selection.equals(getPlayList()[j])) {
                backward++;
            }
        }

        if (forward < backward) {
            buttonPresses = forward;
        } else if (backward == forward) {
            buttonPresses = forward;
        } else {
            buttonPresses = backward;
        }

        return buttonPresses;
    }

    private Object[] getPlayList() {
        return playList;
    }
}
