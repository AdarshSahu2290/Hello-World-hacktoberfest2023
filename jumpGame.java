public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If you've reached an index that is beyond the current maximum reachable index, return false.
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                // If you can reach or go beyond the last index, return true.
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = jumpGame.canJump(nums);
        System.out.println("Can reach the last index: " + result);
    }
}
