class manusia {
	int umur=20;
	
	int getUmur() {
		return umur;
	}
}

class  mamalia extends manusia{
	public static void main(String[] args) {
		mamalia h = new mamalia();
		System.out.println(h.getUmur());
	}

}
