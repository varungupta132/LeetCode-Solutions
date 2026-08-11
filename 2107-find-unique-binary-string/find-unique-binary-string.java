class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int x = nums[0].length();
        int n = nums.length ;
        int idx = 0;
        int xx = nums.length+1 ;
        List<String> list = Arrays.asList(nums);
        while(xx > 0){
            // String str = Integer.toBinaryString(idx++);
            String binary = Integer.toBinaryString(idx++);
            StringBuilder sb = new StringBuilder();

        // Append leading zeros until the length reaches 5
        while (sb.length() + binary.length() < n) {
            sb.append('0');
        }
        sb.append(binary);
        String str = sb.toString();


        if(!list.contains(str)){
            return str ;
        }
        xx--;

            // boolean flag = true;


        }

        return "";

    }
}