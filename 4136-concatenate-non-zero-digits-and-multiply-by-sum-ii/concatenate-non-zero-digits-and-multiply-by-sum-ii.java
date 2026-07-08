class Solution {

    long MOD = 1000000007L;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> dig = new ArrayList<>();

        for(int i=0;i<n;i++){
            int d = s.charAt(i)-'0';
            if(d!=0){
                pos.add(i);
                dig.add(d);
            }
        }

        int m = dig.size();

        long[] preSum = new long[m];
        long[] preNum = new long[m];
        long[] pow10 = new long[m+1];

        pow10[0]=1;
        for(int i=1;i<=m;i++)
            pow10[i]=(pow10[i-1]*10)%MOD;

        for(int i=0;i<m;i++){

            preSum[i]=dig.get(i);

            if(i>0)
                preSum[i]+=preSum[i-1];

            if(i==0)
                preNum[i]=dig.get(i);
            else
                preNum[i]=(preNum[i-1]*10+dig.get(i))%MOD;
        }

        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){

            int l=queries[i][0];
            int r=queries[i][1];

            int left=lowerBound(pos,l);
            int right=upperBound(pos,r)-1;

            if(left>right){
                ans[i]=0;
                continue;
            }

            long sum=preSum[right];
            if(left>0)
                sum-=preSum[left-1];

            long num=preNum[right];

            if(left>0){

                num=(num-
                        preNum[left-1]*pow10[right-left+1]
                        )%MOD;

                if(num<0)
                    num+=MOD;
            }

            ans[i]=(int)((sum%MOD)*num%MOD);
        }

        return ans;
    }

    int lowerBound(ArrayList<Integer> arr,int x){

        int l=0,r=arr.size();

        while(l<r){

            int mid=(l+r)/2;

            if(arr.get(mid)>=x)
                r=mid;
            else
                l=mid+1;
        }

        return l;
    }

    int upperBound(ArrayList<Integer> arr,int x){

        int l=0,r=arr.size();

        while(l<r){

            int mid=(l+r)/2;

            if(arr.get(mid)>x)
                r=mid;
            else
                l=mid+1;
        }

        return l;
    }
}