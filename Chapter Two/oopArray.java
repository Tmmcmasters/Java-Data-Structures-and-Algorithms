// This program will demonstrate array class with high-level interface. 

public class oopArray {
    private long[] arr; //Reference to an array
    private int numberOfItems; //Number of items

// -------------------------------------------------------------------------------

    public oopArray(int maxItems) {
        arr = new long[maxItems]; //Make array
        numberOfItems = 0; //Number of items
    }

// -------------------------------------------------------------------------------

    public boolean find(long searchKey) {
        int loopCounter; //Loop counter
        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            if (arr[loopCounter] == searchKey) { //If item is found
                break; //Break out of loop
            }
        }
        if (loopCounter == numberOfItems) { //If item is not found
            return false;
        } else {
            return true;
        }
    }

// -------------------------------------------------------------------------------

    public void insert(long insertKey) {
        arr[numberOfItems] = insertKey; //Insert item
        numberOfItems++; //Increase number of items
    }

// -------------------------------------------------------------------------------

    public boolean delete(long deleteKey) {
        int loopCounter; //Loop counter
        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            if (arr[loopCounter] == deleteKey) { //If item is found
                break; //Break out of loop
                
            }
        }
        if (loopCounter == numberOfItems) { //If item is not found
            return false;
        } else {
            for (int mover = loopCounter; mover < numberOfItems-1; mover++) { //Shift items down
                arr[mover] = arr[mover + 1];
            }
            numberOfItems--; //Decrement number of items
            return true;
            
        }
    }

// -------------------------------------------------------------------------------

    public void display() {
        int loopCounter; //Loop counter
        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            System.out.print(arr[loopCounter] + " ");
        }
        System.out.println(" ");
    }
} // End of Class oopArray

class oopArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; //Maximum number of items

        oopArray arr; //Reference to an array
        arr = new oopArray(maxSize); //Make array

        arr.insert(77); //Insert 10 items into array
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); //Display items

        int searchKey = 35; //Key of item to search for

        if (arr.find(searchKey)) { //If item is found
            System.out.println("Item found: " + searchKey);
        } else {
            System.out.println("Item not found: " + searchKey);
        }

        arr.delete(55); //Delete item
        arr.delete(00); //Delete item
        arr.delete(99); //Delete item

        arr.display(); //Display items
    } // End of main
} // End of Class oopArrayApp
