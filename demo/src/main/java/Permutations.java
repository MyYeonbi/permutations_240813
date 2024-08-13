import java.util.*;


public class Permutations {

        public List<List<Integer>>permute(int[]nums){
            List<List<Integer>>result = new ArrayList<>();
            boolean[]visited = new boolean[nums.length];
            backtrack(new ArrayList<>(),nums, visited, result);
            return result;
        }
        void backtrack(List<Integer>curr, int[]nums, boolean[]visited, List<List<Integer>> result){
            if(curr.size() == nums.length){
                result.add(new ArrayList<>(curr));
                return;
            }
            for(int i=0; i<nums.length; i++){
                if(!visited[i])continue;

                curr.add(nums[i]);
                visited[i] = true;
                backtrack(curr, nums, visited,result);
                curr.remove(curr.size()-1);
                visited[i] = false;
            }

        }

    public class Permutations {
        // 기존 코드 유지
        // permute 메서드와 backtrack 메서드가 여기에 포함됩니다.

        public static void main(String[] args) {
            Permutations solution = new Permutations();  // Solution 대신 Permutations 클래스 사용
            int[] nums = {1, 2, 30, 40};
            List<List<Integer>> permutations = solution.permute(nums);

            for (List<Integer> permutation : permutations) {
                System.out.println(permutation);
            }
        }
    }
    }

