public class LList<T> implements ListInterface<T>{

private Node firstNode;
private int numOfEntries;

    public LList () {
        initializeDataFields();
    }

    public void clear () {
        initializeDataFields();
    }

    public void add (T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty) {
            firstNode = newNode;
        } else {
            lastNode = getNodeAt(numOfEntries);
            lastNode.setNextNode(newNode);
        }
        numOfEntries++;
    }

    public void add (int newPos, T newEntry) {
        if((newPos < numOfEntries) && (newPos > 0)) {
            Node newNode = new Node(newEntry);
            if (newPos == 1) {
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            } else {
                Node nodeBefore = getNodeAt(newPos - 1);
                Node nodeAfter = nodeBefore.getNextNode();
                newNode.setNextNode(nodeAfter);
                nodeBefore.setNextNode(newNode);
            }
            numOfEntries++;
        } else {
            throw new e("Nope");
        }
    }

    public boolean isEmpty(){
        return ((numOfEntries > 0));
    }

    public T[] toArray () {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numOfEntries];
        Node currentNode = firstNode;
        for (int i = 0; i < numOfEntries; i++) {
            result[i] = currentNode.getData();
            currentNode = currentNode.getNextNode();
        }
        return result;
    }

    public T remove (int givenPos) {
        T result = null;
        if (givenPos <= numOfEntries && givenPos > 0) {
            if (!isEmpty()) {
                if (givenPos == 1) {
                    result = firstNode.getData();
                    firstNode = firstNode.getNextNode();
                } else {
                    Node nodeBefore = getNodeAt(givenPos - 1);
                    Node nodeToRemove = nodeBefore.getNextNode();
                    result = nodeToRemove.getData();
                    Node nodeAfter = nodeToRemove.getNextNode();
                    nodeBefore.setNextNode(nodeAfter);
                    }
                numOfEntries--;
                return result;
                } else {
                    throw new e("NOOO");
                }
            }
        }

    public T replace (int givenPos, T newEntry) {
        if(givenPos > 0 && givenPos <= numOfEntries) {
            Node desiredNode = getNodeAt(givenPos);
            T originalEntry = desiredNode.getData();
            desiredNode.setData(newEntry);
            return originalEntry;
        } else {
            throw new e("NOOOOOO");
        }
    }

// Start from node

    private class Node {
        private T data;
        private Node next;

        private Node (T dataPortion) {
            this(dataPortion, null);
        }

        private Node (T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        private T getData () {
            return data;
        }

        private void setData (T newData) {
            data = newData;
        }

        private Node getNextNode () {
            return next;
        }

        private Node setNextNode (Node nextNode) {
            next = NextNode;
        }
    }
}
