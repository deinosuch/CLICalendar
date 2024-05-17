package cz.cuni.mff.pasekaad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Events implements Iterable<Event> {
    private List<Event> eventsList;
    
    public Events() {
        this.eventsList = new ArrayList<>();
    }
    
    public void addEvent(Event event) {
        eventsList.add(event);
    }

    @Override
    public Iterator<Event> iterator() {
        return new EventIterator();
    }
    
    private class EventIterator implements Iterator<Event> {
        private int currentIndex = 0;
        
        @Override
        public boolean hasNext() {
            return currentIndex < eventsList.size();
        }

        @Override
        public Event next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iteration");
            }
            return eventsList.get(currentIndex++);
        }
    }
    
    public static void run(Scanner scnr) {

    }
}
