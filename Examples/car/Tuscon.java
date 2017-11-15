package car;

public abstract class Tuscon implements Car , Sedan , FourxFour  { 
//implements i30Interface ,SantaFeInterface {
	
	//public abstract static class t1 extends i30 {
	//	public abstract static class t2 extends Santa_Fe {
		
	
	public static void main(String [] Args) {
		
		Tuscon t = new Tuscon() {
		
		@Override
		public void park() {
			// TODO Auto-generated method stub			
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
		}

		@Override
		public void drive() {
			// TODO Auto-generated method stub
		}

		@Override
		public void openTrunk() {
			// TODO Auto-generated method stub
		}

		@Override
		public void FourWeelDrive() {
			// TODO Auto-generated method stub
		}
		
		};
		
		t.openTrunk();
		t.FourWeelDrive();
		t.openTrunk();
	}
//}
//}
}

