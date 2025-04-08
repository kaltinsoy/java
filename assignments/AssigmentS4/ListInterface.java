public interface ListInterface<T> {
    /**
     * Adds a new entry to the end of the list.
     * @param newEntry The object to be added as a new entry.
     */
    void add(T newEntry);

    /**
     * Adds a new entry at a specified position within the list.
     * @param newPosition An integer that specifies the desired position of the new entry.
     * @param newEntry The object to be added as a new entry.
     * @throws IndexOutOfBoundsException if newPosition is out of bounds.
     */
    void add(int newPosition, T newEntry);

    /**
     * Removes the entry at a given position from the list.
     * @param givenPosition An integer that indicates the position of the entry to be removed.
     * @return A reference to the removed entry.
     * @throws IndexOutOfBoundsException if givenPosition is out of bounds.
     */
    T remove(int givenPosition);

    /**
     * Removes all entries from the list.
     */
    void clear();

    /**
     * Replaces the entry at a given position in the list.
     * @param givenPosition An integer that indicates the position of the entry to be replaced.
     * @param newEntry The object that will replace the entry at the given position.
     * @return The original entry that was replaced.
     * @throws IndexOutOfBoundsException if givenPosition is out of bounds.
     */
    T replace(int givenPosition, T newEntry);

    /**
     * Retrieves the entry at a given position in the list.
     * @param givenPosition An integer that indicates the position of the desired entry.
     * @return A reference to the indicated entry.
     * @throws IndexOutOfBoundsException if givenPosition is out of bounds.
     */
    T getEntry(int givenPosition);

    /**
     * Retrieves all entries that are in this list in the order in which they occur in the list.
     * @return An array of all the entries in the list.
     */
    T[] toArray();

    /**
     * Determines whether the list contains a given entry.
     * @param anEntry The object that is the desired entry.
     * @return True if the list contains anEntry, or false if not.
     */
    boolean contains(T anEntry);

    /**
     * Gets the length of this list.
     * @return The integer number of entries currently in the list.
     */
    int getLength();

    /**
     * Determines whether this list is empty.
     * @return True if the list is empty, or false if not.
     */
    boolean isEmpty();
}