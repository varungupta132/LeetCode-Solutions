import java.util.*;

class Solution {
    List<List<Integer>> lst ;
    public List<List<Integer>> subsets(int[] nums) {
        lst = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        
        lst.add(new ArrayList<>()); // Empty subset ko pehle hi add kiya
        bt(nums , x , 0);
        return lst;
    }
    
    public void bt(int[] num , List<Integer> x , int idx){
        // Loop ke andar backtracking pattern: base case ki alag se zaroorat nahi padti
        // Kyunki loop condition (i < num.length) apne aap bound check kar leti hai
        for(int i = idx ; i < num.length ; i++){
            
            // Step 1: Element ko add karo
            x.add(num[i]);
            
            // FIX 1: 'x' ka address daalne ke bajaye uski fresh COPY (new ArrayList) add karein
            lst.add(new ArrayList<>(x));
            
            // Step 2: Agle elements ke liye recursion bhein (i + 1)
            bt(num , x , i + 1);
            
            // FIX 2: Poore list ko 'clear()' karne ke bajaye sirf aakhiri added element ko remove karein
            x.remove(x.size() - 1);
        }
    }
}
