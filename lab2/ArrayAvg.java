public class ArrayAvg{
	public static void main(String[] args){
	double score[] = {120,150,170,190,220};
	int i, sum, avg;
	sum = 0;
	for(i=0; i<score.length; i++){
	 sum +=score[i];
	}
	avg =sum/score.length;
	System.out.println("The average of given score:" +avg);
	}
}