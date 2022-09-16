#include<stdio.h>

void Mult(int mat1[10][10], int mat2[10][10], int m,int n,int a,int b){
    int i,j,k,c[10][10];
    for(int i=0;i<m;i++){
        for(int j=0;j<b;j++){
            c[i][j]=0;
            for(int k=0;k<n;k++){
                c[i][j] += mat1[i][k]*mat2[k][j];
            }
        }
    }

    printf("After multiplication: ");
    for(i=0;i<m;i++){
        for(j=0;j<b;j++){
            printf("%d\t", c[i][j]);
        }
        printf("\n");
    }

}

int main(){
    int m,n,i,j,a,b;
    int c[10][10];

    printf("Enter size of matrix1: ");
    scanf("%d%d", &m,&n);
    int mat1[m][n];
    printf("Enter elemts for matrix1: ");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            scanf("%d", &mat1[i][j]);
        }
    }
    printf("Entered matrix1 is: ");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            printf("%d\t", mat1[i][j]);
        }
        printf("\n");
    }


    printf("Enter size of matrix2: ");
    scanf("%d%d", &a,&b);
    int mat2[a][b];
    printf("Enter elemts for matrix1: ");
    for(i=0;i<a;i++){
        for(j=0;j<b;j++){
            scanf("%d", &mat2[i][j]);
        }
    }
    printf("Entered matrix2 is: ");
    for(i=0;i<a;i++){
        for(j=0;j<b;j++){
            printf("%d\t", mat2[i][j]);
        }
        printf("\n");
    }

    if(n!=a){
        printf("Cannot multiply.");
        return 1;
    }else{
        Mult(mat1,mat2,m,n,a,b);
    }

    return 0;
}
