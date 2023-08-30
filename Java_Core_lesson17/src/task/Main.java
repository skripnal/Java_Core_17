package task;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		Integer[] arr = new Integer[30];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		Colection colection = new Colection(arr);
		Iterator iteratorForvard = colection.createForvard();
		
		

		while(iteratorForvard.hasNext()) {
			System.out.println(iteratorForvard.next());
		}
		
		System.out.println("-------------------------------");
		
		Iterator iteratorBackward = colection.createBackward();
		while(iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}
		
		System.out.println("-------------------------------");

//Не використовується разом з iteratorForvard		
//		Iterator AbstractIterator = new Iterator() {
//			private int count = arr.length - 1;
//				
//			@Override
//			public boolean hasNext() {
//				return count >= 0;
//			}
//
//			@Override
//			public Object next() {
//				int currentIndex = count;
//                count--;
//
//                if ((currentIndex + 1) % 3 == 0 && arr[currentIndex] % 2 != 0) {
//                    return arr[currentIndex];
//                }
//
//                return null;
//			}
//			
//		};
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("----------------------------");
//		
//		while (AbstractIterator.hasNext()) {
//			Object nextElement = AbstractIterator.next();
//            if (nextElement != null) {
//                System.out.println(nextElement);
//            }
//		}
	}

}
