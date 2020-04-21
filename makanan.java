class makanan {
	String nama="nasi goreng";
	
	String getNama() {
		return nama;
	}
}

class  pedas extends makanan{
	public static void main(String[] args) {
		pedas m = new pedas();
		System.out.println(m.getNama());
	}

}
