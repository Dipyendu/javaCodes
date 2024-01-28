// -> Mountain Array Example -> https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png
// -> Problem Link -> https://leetcode.com/problems/find-in-mountain-array/description/
public class Solution1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        MountainArray mountainArr = new MountainArrayImpl(arr);
        int target = 3;
        System.out.println("Answer -> " + findInMountainArray(target, mountainArr));

    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int peak = peakIndexInMountainArray(mountainArr);
        int end = mountainArr.length() - 1;
        // -> binary search in ascending array
        int asc = orderAgnosticBinarySearch(mountainArr, target, start, peak, true);
        if (asc == -1) {
            // -> binary search in descending array
            int desc = orderAgnosticBinarySearch(mountainArr, target, peak + 1, end, false);
            return desc;
        }
        return asc;
    }

    public static int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        int mid = -1;

        while (start < end) {

            mid = start + ((end - start) / 2);

            if (arr.get(mid) > arr.get(mid + 1)) {
                // -> you are in the decreasing part of the array which might be the answer but
                // we will also check the left side of the array for more possible answers
                end = mid;
            } else {
                // -> you are in increasing part of the array
                start = mid + 1;
            }
        }

        return start;
    }

    public static int orderAgnosticBinarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr.get(mid)) {
                    start = mid + 1;
                } else if (target < arr.get(mid)) {
                    end = mid - 1;
                }
            } else {
                if (target < arr.get(mid)) {
                    start = mid + 1;
                } else if (target > arr.get(mid)) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

class MountainArrayImpl implements MountainArray {
    private final int[] array;

    public MountainArrayImpl(int[] arr) {
        this.array = arr;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int length() {
        return array.length;
    }
}

interface MountainArray {
    int get(int index);

    int length();
}