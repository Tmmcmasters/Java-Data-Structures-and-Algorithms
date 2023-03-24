//This is the procedural way to use arrays in Java.
//Procedural makes it a little disorganized.  



public class prodeduralArrayApp {
    
    public static void main(String[] args) {
        long[] arr; //Reference to an array
        arr = new long[100]; //Make array
        int numberOfItems = 0; //Number of items
        int loopCounter; //Loop counter
        long searchKey; //Key of item to search for

// -------------------------------------------------------------------------------

        arr[0] = 77; //Insert 10 items into array
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        numberOfItems = 10;  //THere are 10 items in this array. 

// -------------------------------------------------------------------------------

        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            System.out.print(arr[loopCounter] + " ");
        }
        System.out.println(" ");

// -------------------------------------------------------------------------------

     searchKey = 66; //Key of item to search for
        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            if (arr[loopCounter] == searchKey) { //If item is found 
                break; //Break out of loop
            }
        }
        if (loopCounter == numberOfItems) { //If item is not found
            System.out.println("Item not found: " + searchKey); 
        } else {
            System.out.println("Item found: " + searchKey);
        }

// -------------------------------------------------------------------------------

    System.out.println("Number of items before deletion: " + numberOfItems);
        searchKey = 55; //Key of item to delete

        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            if (arr[loopCounter] == searchKey) { //If item is found
                break; //Break out of loop
            }
        } 
        for (int mover = loopCounter; mover < numberOfItems-1; mover++) { //Shift items down
            arr[mover] = arr[mover + 1];
        }
        numberOfItems--; //Decrement number of items
        

// -------------------------------------------------------------------------------
        // Display all the items now at the end

        for (loopCounter = 0; loopCounter < numberOfItems; loopCounter++) { //Loop through array and display items
            System.out.print(arr[loopCounter] + " ");
        }
        System.out.println(" ");
        System.out.println("Number of items after deletion: " + numberOfItems);
        
    }

}
