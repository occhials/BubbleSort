
public class BubleSort {

	public static void main(String[] args) {
		
		int array[] = {2,4,3,5,6,100,8,10,0};
		
		int k = 10 ;
		int sw=1;
		int i=0;
		do {
	     i= 0;
		 sw= 0;
		do{
			
			if(array[i] > array[i+1]) {
				int appoggio = array[i];
				array[i]=array[i+1];
				array[i+1]= appoggio;
				sw=1;
			}
			i=i+1;
			
		}	while(i<k-2);
		k=k-1;
	}while(sw == 1 && k>0);
	
		/*
		for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                if(array[j]>array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
                

            }

            if(!flag) break; 
        }
*/
		
	int y=0;
	while (y<array.length) {
		System.out.println(array[y]);
	y=y+1;	
		
	}
		
			
}

}
