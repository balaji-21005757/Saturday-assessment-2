public class Main{
    public static void main(String args[]){
        int x[][]={{1,1,1},{1,1,1},{1,1,1}};
        int y[][]={{2,2,2},{2,2,2},{2,2,2}};
        int z[][]=new int[3][3];
        System.out.println("The sum of two matrix is: ");
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<y.length;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}