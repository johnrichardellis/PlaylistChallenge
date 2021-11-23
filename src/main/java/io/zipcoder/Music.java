package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
//        // need to return Integer
//        // result will be the MIN number of presses needed to reach song SELECTION
//        // if else statements
//        List<String> list = new ArrayList<>(Arrays.asList(playList));
//        int forward = 0;
//        int backward = 0;
//        int buttonPresses = 0;
//
//        for (int i = startIndex; i <= list.size() - 1; i++) {
//            if (!selection.equals(list.get(i))) {
//                forward++;
//            }
//        }
//
//        for (int j = startIndex; j <= list.size() - 1; j--) {
//            backward++;
//            if (selection.equals(list.get(list.size() - 1 - j))) {
//                break;
//            }
//        }
//
//        if (forward < backward) {
//            buttonPresses = forward;
//        }
//        if (backward == forward) {
//            buttonPresses = forward;
//        }
//        if (backward < forward) {
//            buttonPresses = backward;
//        }
//
//        return buttonPresses;


        List<String> stringMatch = new ArrayList<String>(Arrays.asList(playList));
        startIndex = 1;
        for (int i = startIndex; i <= stringMatch.size(); i++) {
            if (stringMatch.contains(selection)) {

            }
        }
        System.out.println(stringMatch.indexOf(selection) - startIndex);
        return stringMatch.indexOf(selection) - startIndex;
    }




    private Object[] getPlayList() {
        return playList;
    }
}
