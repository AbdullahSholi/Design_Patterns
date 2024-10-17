package org.example.strategy;

// Context Class
public class SortingContext {
    // Context Class hold a reference to a strategy object
    private SortingStrategy sortingStrategy;

    public SortingContext( SortingStrategy sortingStrategy ) {
        this.sortingStrategy = sortingStrategy;
    }
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}
