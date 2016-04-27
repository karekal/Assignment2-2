

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j,count;
     for(i=0;i<=100;i++){
    	 count=0;
    	 for(j=2;j<=i;j++){
    		 if(i%j==0){
    			 count++;
    		 }
    	 }
     if(count<2){
    	 System.out.print(i+" ");
    	 }
     }
	}

}
