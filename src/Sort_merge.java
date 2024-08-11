import java.util.Arrays;
import java.util.List;


class Sort_merge {

    public static String[] mergeSortString(String[] src) {
        if (src.length <= 1) return src;
        String[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        String[] right = Arrays.copyOfRange(src, left.length, src.length);
        return mergeString(mergeSortString(left), mergeSortString(right));
    }

    private static String[] mergeString(String[] left, String[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        String[] result = new String[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if ((left[leftIn].compareTo(right[rightIn])) < 0)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }

    public static int[] mergeSortInt(int[] src) {
        if (src.length <= 1) return src;
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return mergeInt(mergeSortInt(left), mergeSortInt(right));
    }

    private static int[] mergeInt(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        return result;
    }

    public static int[] cr_massive (List<Integer> list) {
        int[] massive = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            massive[i] = list.get(i);
        }
        return massive;
    }

}
