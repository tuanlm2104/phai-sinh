package ps;
public class ObjectHistory {
	String hdkhop;
	String LoaiLenh;
	String Ngay;
	String GiaDat;
	String hdChuaKhop;
	String TinhTrang;

	

	public String getHdkhop() {
		return hdkhop;
	}
	public void setHdkhop(String hdkhop) {
		this.hdkhop = hdkhop;
	}
	public String getLoaiLenh() {
		return LoaiLenh;
	}
	public void setLoaiLenh(String loaiLenh) {
		LoaiLenh = loaiLenh;
	}
	public String getNgay() {
		return Ngay;
	}
	public void setNgay(String ngay) {
		Ngay = ngay;
	}
	public String getGiaDat() {
		return GiaDat;
	}
	public void setGiaDat(String giaDat) {
		GiaDat = giaDat;
	}
	
	public String getHdChuaKhop() {
		return hdChuaKhop;
	}
	public void setHdChuaKhop(String hdChuaKhop) {
		this.hdChuaKhop = hdChuaKhop;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public ObjectHistory(String hdkhop,String LoaiLenh,String Ngay,String GiaDat,String hdChuaKhop,String TinhTrang) {
		this.hdkhop=hdkhop;
		this.LoaiLenh=LoaiLenh;
		this.Ngay=Ngay;
		this.GiaDat=GiaDat;
		this.hdChuaKhop=hdChuaKhop;
		this.TinhTrang=TinhTrang;

		
		// TODO Auto-generated constructor stub
	}
	
}