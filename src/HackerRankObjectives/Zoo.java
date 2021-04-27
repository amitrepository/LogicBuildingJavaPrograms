package HackerRankObjectives;

public class Zoo {

	public static void main(String[] args) {
		
		try {
			throw new RuntimeException();
		}
		catch(Exception e) {
			System.out.println("C");
		}
		catch(Throwable e) {
			System.err.println("B");
		}
		finally {
			System.out.println("D");
			return;
		}
	}

}
