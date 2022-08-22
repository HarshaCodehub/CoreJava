package Heart;

import java.util.ArrayList;

public class CollectionsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 2, 3, 4, 3, 4, 4, 5 };
		// we need to know the unique number and no of duplicates of each number
		ArrayList<Integer> al = new ArrayList<Integer>();// first create an empty Array list
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j])
						k++;
				}
				System.out.println(a[i]);
				System.out.println("Repeated " + k + " times");
				if (k == 1)
					System.out.println(a[i] + " is unique number");
			}
		}

	}

}
