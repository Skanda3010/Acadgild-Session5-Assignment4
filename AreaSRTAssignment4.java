import java.util.Scanner;

public class AreaSRTAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the length of square to calculate area");
		Scanner sc = new Scanner(System.in);
		Area areaSquare = new Area(sc.nextInt());
		
		System.out.println("Enter the length and breadth of rectangle to calculate area");
		Area areaRect = new Area(sc.nextInt(), sc.nextInt());

		sc.close();
	}

}
