import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayExerciseTest {

    ArrayExercise arrayExercise = new ArrayExercise();

    @Test
    public void testArrayToUpperCase() {
        String[] input = new String[]{"cat", "dog", "fish"};
        arrayExercise.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }

    @Test
    public void testIncrementArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        arrayExercise.incrementArray(input);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);
    }

    @Test
    public void testIncrementArray2() {
        int[] input = new int[]{6, 4, 2, 3, 8};
        arrayExercise.incrementArray(input);
        assertArrayEquals(new int[]{7, 5, 3, 4, 9}, input);
    }

}
