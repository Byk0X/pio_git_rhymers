package edu.kis.vh.nursery;

/**
 * Klasa z implementacją stosu
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int IF_EMPTY = -1;
    private static final int EMPTY = -1;
    private static final int CAPACITY= ARRAY_SIZE-1;
    private final int[] numbers = new int[ARRAY_SIZE];
    
    private int total = EMPTY;

    /**
     * Funkcja dodaje liczbę do tablicy
     * @param in - liczba dodawana do tablicy
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Funkcja sprawdza czy tablica jest pusta
     * @return true albo false w zależności czy tablica jest pusta
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Funkcja sprawdza czy tablica jest pełna
     * @return true albo false w zależności czy tablica jest pełna
     */
    public boolean isFull() {
        return total == CAPACITY;
    }

    /**
     * Funkcja sprawdza ostatnio dodaną liczbę
     * @return ostatnio dodana liczba
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    /**
     * Funkcja usuwa liczbę z tablicy
     * @return zwraca usuwaną liczbę z końca tablicy
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
