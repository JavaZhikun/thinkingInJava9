package paragraph3;

import java.util.Random;

public class Bool 
{
	public static void main(String[] args) {
		Random rand = new Random(47);
		int[] array = new int[10];
		for(int i = 0; i < array.length;i++)
		{
			array[i] = rand.nextInt(100);
			System.out.println(array[i]);
		}
	}
}
