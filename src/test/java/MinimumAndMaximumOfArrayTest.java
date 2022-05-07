import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MinimumAndMaximumOfArrayTest{
        public int[] expectedMinMax(int[] arr){
               int MinElement = arr[0];
               int Maxelement = arr[0];

                for(int i=1 ; i< arr.length;i++){
                        MinElement = Integer.min(MinElement,arr[i]);
                        Maxelement = Integer.max(Maxelement,arr[i]);
                }
                return new int[]{MinElement,Maxelement};

        }

        @Test
        public void MinimumAndMaximumOfArrayTest(){
                int[] arr = {1,2,-10,24,-777};


                MinimumAndMaximumOfArray MinimumAndMaximumOfArray = new MinimumAndMaximumOfArray();
                int[] res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {-2, 1, -47};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {32, -1, 17};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {52, 31, 337};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {12, -31, -47};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {-12, -221, -732};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {122, 12341, 2227};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

                arr = new int[] {-213213, -1421312, -71232};
                res = MinimumAndMaximumOfArray.ComputeMinMax(arr);
                assertArrayEquals(expectedMinMax(arr),res);

        }
}
