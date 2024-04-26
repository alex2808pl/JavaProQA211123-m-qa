package de.telran.lesson_9;

import java.util.Comparator;

public class CatNameCompare implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getName().equals(o2.getName())) {
            return 0;
        }
        else if (o1.getName().charAt(0)<o2.getName().charAt(0)) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
