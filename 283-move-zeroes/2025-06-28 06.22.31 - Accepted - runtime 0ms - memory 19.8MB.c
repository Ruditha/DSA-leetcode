void moveZeroes(int* n, int s) {
    int j=0;
    for(int i=0;i<s;i++){
            if(n[i]!=0){
            n[j]=n[i];
            j++;
        }
    }
    for(j;j<s;j++){
        n[j]=0;
    }
}