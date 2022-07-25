public class Corona {
    static int N=3;
    static int[][] mat = {
            {0,0,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0}
    };
    public static void main(String args[])
    {
        int noDays=0;
        while(checker()){
            spreadCase(0,0);
            PrintMatrix();
            System.out.println("__________________");
            noDays++;
        }
        System.out.println(noDays);
    }
    private static int spreadCase(int i,int j)
    {
        int mark = 0;
        if(mat[i][j]==1)
            mark = 1;

        if(i<=N && j<N) {
            spreadCase(i, j+1);
        }
        else if(i<N && j == N) {
            j=0;
            spreadCase(i+1,j);
        }
        else {}
        if(mark==1)
          infect(i,j);
        return 0;
    }

   private static void infect(int i, int j) {
        if(j+1<=N)
            mat[i][j+1]=1;
        if(i+1<=N)
            mat[i+1][j]=1;
        if(i-1>=0)
            mat[i-1][j]=1;
        if(j-1>=0)
            mat[i][j-1]=1;
    }

    private static boolean checker() {
        for(int i=0;i<N+1;i++)
        {
            for(int j=0;j<N+1;j++)
            {
                if(mat[i][j]==0)
                    return true;
            }
        }
        return false;
    }

    private static void PrintMatrix() {
        for(int i=0;i<N+1;i++)
        {
            for(int j=0;j<N+1;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
