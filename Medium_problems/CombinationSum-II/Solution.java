import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        // return ans;

    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> list, List<List<Integer>> ans) {

        if (target == 0 && !ans.contains(list)) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (target < 0)
            return;

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;

            list.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
