package Exception;

public class Exception1 {

	public static void main(String[] args) {

		if (true) {

			try {
				throw new CustomException("Error");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
