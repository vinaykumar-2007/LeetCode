bool isPerfectSquare(int num) {
    if(num ==1) return true;
    for(int i=0;i<=num/2;i++){
        int p = pow(i,2);
        if( p == num){
            return true;
        }
    }
    return false;
}