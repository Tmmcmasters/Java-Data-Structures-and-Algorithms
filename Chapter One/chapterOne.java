// *The array is the most basic data structure in computer science. 


//*Data structures are used in four basic ways: 
// ->Reading
// ->Searching
// ->Inserting
// ->Deleting


// *Measuring the speed of a program is also know as its "time complexity". 
// ->The time complexity of a program is the number of operations it takes to execute.


// -> A computer can jump to any memory address in one step. For example, if you asked a computer to inspect whatever’s at memory address 1063, it can access that without having to perform any search process. As an analogy, if I ask you to raise your right pinky finger, you wouldn’t have to search all your fingers to find which one is your right pinky. You’d be able to identify it immediately.
// -> Whenever a computer allocates an array, it also makes note at which memory address the array begins. So, if we asked the computer to find the first element of the array, it would be able to instantly jump to the appropriate memory address to find it.

public class chapterOne {
    public static void main(String[] args) {
        
        //->Example Array:
        String[] food = {"apples", "bananas", "cucumbers", "dates", "elderberries"};

        // ->Reading an array in one step:
        System.out.println(food[0]);

        // ->Linear search is step by step going through the array until you find the element you are looking for:
        for (int i = 0; i < food.length; i++) {
            if (food[i].equals("dates")) {
                System.out.println("We found the dates!");
                break;
                
            }
        }

        // ->Insertion efficiency depends on where in the aarray you are inserting the data:
        // If we want to insert "figs" into index 2, we need to shift everything proceeding it up one index.
        // The maximum number of steps that insertion would take is N + 1, where N is the length of the array.
        
        
        // ->Deletion efficiency depends on where in the aarray you are deleting the data:
        // If we want to delete "dates", we need to shift everything proceeding it down one index as to not leave an empty space.
        // The maximum steps that deletion would take is N steps. 


// ----->>>> Now moving on to sets
        // ->Sets are a data structure that stores unique elements. They do not allow duplicates to be store in it. 
        // We will be using array based sets. 
        //  -> Reading, Seaching, and deleting from a set is the same as reading from an array. Reading takes one step. Search takes N steps. Deleting takes N steps.
        //  -> Inserting is different because the computer needs to determine if the element is already in the set. If it is, it does not add it. If it is not, it adds it.This means: every insertion requires a "search" step.
        // Inserting into sets takes 2N + 1 steps.

// IMPORTANT:
        // -> You must always analyze what you need to do and then decide what data structure fits your needs.
        // -> THINKING ABOUT "TIME COMPLEXITY" is very important in computer science. It determines whether or not you will bear a heavy load or collapsing under it. 

// ------>>>EXERCISE:
// 1. For an array containing 100 elements, provide the number of steps the following operations would take:
    // Reading : 1 step
    // Searching for a value not contained within the array : N steps
    // Insertion at the beginning of the array : N + 1steps
    // Insertion at the end of the array : 1 step
    // Deletion at the beginning of the array : N steps
    // Deletion at the end of the array : N steps

// 2. For an array-based set containing 100 elements, provide the number of steps the following operations would take:
    // Reading : *1 step
    // Searching for a value not contained within the array : *N steps
    // Insertion of a new value at the beginning of the set: *N + 1 steps
    // Insertion of a new value at the end of the set : *1 step
    // Deletion at the beginning of the set: N Steps
    // Deletion at the end of the set: 1 Steps

// 3. Normally the search operation in an array looks for the first instance of a given value. But sometimes we may want to look for every instance of a given value. For example, say we want to count how many times the value “apple” is found inside an array. How many steps would it take to find all the “apples”? Give your answer in terms of N.
        // N steps

    }
}
