//This program will demonstrate an ordered array class. 

public class orderedArray {
    private long[] arr; //Reference to an array
    private int numberOfItems; //Number of items

//--------------------------------------------------------------

    public orderedArray(int maxItems) { //constructor
        arr = new long[maxItems]; //Make array

        numberOfItems = 0; //Number of items
    }

//--------------------------------------------------------------

    public int size() {
        {
            return numberOfItems;
        }
    }

//--------------------------------------------------------------

    public int find(long searchKey) {
        int lowerBound = 0; //Lower bound
        int upperBound = numberOfItems - 1; //Upper bound
        int currentIntegar; //Loop counter

        while (true) {
            currentIntegar = (lowerBound + upperBound) / 2; //Calculate middlepoint

            if (arr[currentIntegar] == searchKey) { //If item is found
                return currentIntegar; //Return index
            } else if (lowerBound > upperBound) { //If item is not found
                return numberOfItems; //Return number of items
            } else {
                if (arr[currentIntegar] < searchKey) { //If item is less than search key
                    lowerBound = currentIntegar + 1; //Move lower bound
                } else {
                    upperBound = currentIntegar - 1; //Move upper bound
                } 
            } //end else divide range
        } //end while
    } //end find

//--------------------------------------------------------------

    public void insert(long insertKey) {
        int insertCounter; //Loop counter
        
        for (insertCounter = 0; insertCounter < numberOfItems; insertCounter++) { //Loop through array and display items
            if (arr[insertCounter] > insertKey) { //If item is less than search key
                break; //Break out of loop
            }
        }
        for (int mover = numberOfItems; mover > insertCounter; mover--) { //Shift items down
            arr[mover] = arr[mover - 1];
        }
        arr[insertCounter] = insertKey; //Insert item
        numberOfItems++; //Increase number of items
    } //end insert

    
}
