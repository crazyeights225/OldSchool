
public class Arrays_2 {
	public void main(String [] args){
int [][] Number=new int[6][5];

//1-4
//1-5
Number[0][0]=10;
Number[0][1]=10;
Number[0][2]=10;
Number[0][3]=10;
Number[0][4]=10;
Number[1][1]=10;
Number[1][2]=10;



int rows=6;
int columns=5;
int i,j;

for(i=0;i<rows;i++){
	for(j=0;j<columns; j++){
		System.out.print(Number[i][j]+"");
		
	}
	System.out.println("");
}
		
		
	}
	}
