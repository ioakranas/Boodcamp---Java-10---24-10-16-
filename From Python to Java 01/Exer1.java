class Exer1 {
	public static void  main (String args[]){
		for (int i=1;i<10;i++){
			for (int j=0;j<9-i;j++){
				System.out.print("0");
			}
			for (int z=0;z<i;z++){
				System.out.print(+i);
			}
			System.out.print("\n");

		}
}
}