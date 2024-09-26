class SeparateEvenOddNumber {
    public static void main(String[] args) {
        int[] input={20,12,23,17,7,8,10,2,1,0};
        int output[]=new int[input.length];
        
        int evenIndex=0;
        int oddIndex=input.length-1;
        for(int i=0;i<input.length;i++){
            if(input[i]%2==0){
                output[evenIndex++]=input[i];
            }
            if(input[input.length-1-i]%2==1){
                output[oddIndex--]=input[input.length-1-i];
            }
        }
        
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}