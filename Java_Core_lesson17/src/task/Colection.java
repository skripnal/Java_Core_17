package task;

public class Colection {
	
	private static Number[] arr;

	public Colection(Number[] arr) {
		super();
		Colection.arr = arr;
	}
	
	public class forvard implements Iterator {
		private int count = 0;
		
		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			if ((int)arr[count]%2 != 0 ) {
				arr[count] = 0;
			}
			return arr[count++];
		}
	}
	
	public forvard createForvard() {
		return new forvard();
	}
	
	public class backward implements Iterator{
		private int count = arr.length - 1;
		private boolean skip = false;
		
		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Object next() {
			int curentIndex = count;
			count--;
			if(!skip) {
				skip = true;
				return arr[curentIndex];
			}else {
				skip = false;
				return next();
			}
		}
		
	}
	
	public backward createBackward() {
		return new backward();
	}
	
}
