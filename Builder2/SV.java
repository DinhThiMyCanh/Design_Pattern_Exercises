package Builder2;
//Tạo đối tượng Immutable
//Constructor là private, điều này có nghĩa là class này không thể gọi khởi tạo trực tiếp từ bên ngoài.
//Tất cả các thuộc tính đều là private final, vì vậy nó chỉ được gán giá trị trong constructor và nó chỉ có thể được cung cấp các phương thức getter().
//Việc khởi tạo đối tượng chỉ có thể thông qua Builder.
import java.util.Date;

public class SV {
	private final String maSV; //bat buoc
	private final String hoTen;//bat buoc
	private final int gioiTinh;
	private final Date ngaySinh;
	private final String noiSinh;
	private final String tinhTrang;
	private final String email;
	
	private SV(SVBuilder build) {
		this.maSV = build.maSV;
		this.hoTen = build.hoTen;
		this.gioiTinh = build.gioiTinh;
		this.ngaySinh = build.ngaySinh;
		this.noiSinh = build.noiSinh;
		this.tinhTrang = build.tinhTrang;
		this.email = build.email;
	}
	@Override 
	public String toString() {
		return "SV[maSV:"+this.maSV + "\nhoTen:"+this.hoTen+
				"\ngt:"+ this.gioiTinh+"\nngay Sinh:"+this.ngaySinh+
				"\nnoi sinh:"+this.noiSinh + "\ntinh trang:"+this.tinhTrang
				+"\nEmail:"+this.email+"]";
	}
	
	
	public static class SVBuilder {
		private String maSV;
		private String hoTen;
		private Date ngaySinh;
		private String noiSinh;
		private int gioiTinh;
		private String tinhTrang;
		private String email;
		
		//Vì maSV và hoTen là các thuộc tính bắt buôc
		public SVBuilder(String maSV, String hoTen) {
			this.maSV = maSV;
			this.hoTen = hoTen;
		}
		
		public SVBuilder withGioiTinh(int gt) {
			this.gioiTinh = gt;
			return this;
		}
		public SVBuilder withNgaySinh(Date ns) {
			this.ngaySinh = ns;
			return this;
		}
		public SVBuilder withNoiSinh(String noiSinh) {
			this.noiSinh = noiSinh;
			return this;
		}
		
		public SVBuilder withTinhTrang(String tt) {
			this.tinhTrang =tt;
			return this;
		}
		public SVBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		
		public SV build() {
			return new SV(this);
		}
	}
	
}
