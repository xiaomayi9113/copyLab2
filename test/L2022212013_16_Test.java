import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class L2022212013_16_Test {

    /*
     * 测试用例设计总体原则：
     * 1. 等价类划分原则：
     *    - 测试正常情况（多个不同的非负整数）
     *    - 测试包含零的情况（如 [0, 0]）
     *    - 测试单个元素情况（如 [5]）
     * 2. 边界条件：
     *    - 输入数组为空的情况（如 []）
     *    - 输入数组只有一个元素 [0] 或 [5]
     */

    private final Solution16 solution = new Solution16();

    // 测试目的：检查输入为 [10, 2] 时，输出是否正确
    // 用到的测试用例： [[10, 2]]
    @Test
    public void testLargestNumber_case1() {
        int[] nums = {10, 2};
        String expected = "210";
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }

    // 测试目的：检查输入为 [3, 30, 34, 5, 9] 时，输出是否正确
    // 用到的测试用例： [[3, 30, 34, 5, 9]]
    @Test
    public void testLargestNumber_case2() {
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }

    // 测试目的：检查输入为 [0, 0] 时，输出是否正确
    // 用到的测试用例： [[0, 0]]
    @Test
    public void testLargestNumber_case3() {
        int[] nums = {0, 0};
        String expected = "0";
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }

    // 测试目的：检查输入为 [5] 时，输出是否正确
    // 用到的测试用例： [[5]]
    @Test
    public void testLargestNumber_case4() {
        int[] nums = {5};
        String expected = "5";
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }

    // 测试目的：检查输入数组为空的情况
    // 用到的测试用例： [[]]
    @Test
    public void testLargestNumber_case5() {
        int[] nums = {};
        String expected = "0"; // 如果数组为空，返回的最大数字应为“0”
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }

    // 测试目的：检查输入为 [0, 1, 2] 时，输出是否正确
    // 用到的测试用例： [[0, 1, 2]]
    @Test
    public void testLargestNumber_case6() {
        int[] nums = {0, 1, 2};
        String expected = "210";
        String result = solution.largestNumber(nums);
        System.out.println(Objects.equals(result, expected));
    }
}
