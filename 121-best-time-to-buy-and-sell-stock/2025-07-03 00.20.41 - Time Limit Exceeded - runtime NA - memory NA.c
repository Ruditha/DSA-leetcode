int maxProfit(int* prices, int s) {
   int diff=0;
    for(int i=0;i<s;i++){
        for(int j=i+1;j<s;j++){
            if (prices[j]-prices[i]>diff)
            diff=prices[j]-prices[i];
        }
    }return diff;
}