class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m!=r*c) return mat;
        int[][] ans=new int[r][c];
        int k=0;
        int l=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat[k][l];
                l++;
                if(l==m){
                    l=0;
                    k++;
                }
            }
        }
        return ans;
    }
}