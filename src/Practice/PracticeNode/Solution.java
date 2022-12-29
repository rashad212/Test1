package Practice.PracticeNode;

import java.util.Iterator;

public abstract class Solution implements Iterator {
    static Iterator itr = new Iterator() {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    };

}