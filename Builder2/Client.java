package Builder2;
import java.util.Date;
public class Client {

	public static void main(String[] args) {
		SV a = new SV
				.SVBuilder("01", "A")
				.withNgaySinh(new Date("12/10/2002"))
				.withNoiSinh("BÐ")
				.build();
				
	    System.out.print(a);	

	}

}
