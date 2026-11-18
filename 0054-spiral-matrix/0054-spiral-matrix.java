class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int [] r={0,1,0,-1};
        int [] c={1,0,-1,0};
        int row=0;
        int col=0;
        int pos=0;

        while(ans.size()!=m*n){
            ans.add(matrix[row][col]);
            matrix[row][col]=1000;
            int next_r=row+r[pos];
            int next_c=col+c[pos];

            if(next_r>=m || next_r<0 || next_c>=n || next_c<0 || matrix[next_r][next_c]==1000){
                pos=(pos+1)%4;
            }

            row+=r[pos];
            col+=c[pos];
        }
        return ans;
    }
}