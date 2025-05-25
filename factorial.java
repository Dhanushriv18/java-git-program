public class factorial{

	public static void main(String[] args) {
		int numbers= {1,2,3,4,5};
		System.out.println("the elements of the array");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
			
		}
		System.out.println("sum of the values"+sum);
	}

}