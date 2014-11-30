class ObjectArrayTest {

	private static native int[][] initInt2DArray(int size);

	public static void main(String[] args)
	{
		//init a 2d array, put data in that and then print data out row by row	
		
		final int dimension = 10;
		int[][] i2arr = initInt2DArray(dimension);
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				System.out.print("    " + i2arr[i][j]);
			}
			System.out.println();
		}
	}
	static {
		System.loadLibrary("ObjectArrayTest");
	}
}
