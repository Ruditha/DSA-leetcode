void moveZeroes(int* n, int s) {
    int j=0,t;
    for(int i=0;i<s;i++){
        if(n[i]!=0){
            t=n[i];
            n[i]=n[j];
            n[j]=t;
            j++;
        }
    }
    
}