class Solution {    
    public String largestOddNumber(String s) {
        int length= s.length();
        int i,j=-1;
        for( i = length-1; i>=0; i--){
            if((s.charAt(i)-'0')%2==1){
                j= i;
                break;
            }
        }
        if(j== -1)
            return "";
        i = 0;
        while(i<j && s.charAt(i) == '0')
            i++;
        return (s.substring(i,j+1));   
    }
}
