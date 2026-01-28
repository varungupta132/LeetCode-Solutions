class Solution {
    public int[] rotateElements(int[] nums, int k) {
     ArrayList<Integer> arr = new ArrayList<>();
    for(int i : nums){
        if(i >=0){
            arr.add(i);
        }

    }

    rotatearrktimes(arr , k);

    int idx = 0;
    int[] res = new int[nums.length];
    for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] >= 0){
            res[i] = arr.get(idx++);
        }
        else{
            res[i] = nums[i];
        }
    }
    
    
    return res ;
    }

    public void rotatearrktimes(ArrayList<Integer> arr , int k){
        int n = arr.size();
        if(n == 0) return;
    
        k = k % n;
        rotate(arr , 0 , k-1);
        rotate(arr , k , arr.size()-1);
        rotate(arr ,0 , arr.size() -1);

    }
    public void rotate(ArrayList<Integer> arr , int s , int e){
        while(s < e){
        int temp = arr.get(s);
        arr.set(s, arr.get(e));
        arr.set(e, temp);
        s++;
        e--;
    }
    }



    }
