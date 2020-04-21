class mamaliaa {
	int umur=2;
	
	int getUmur() {
		return umur;	
	}
}

class kucing extends mamalia {
	
	int getUmur() {
		return 19;	
	}

	public static void main(String[] args){
		kucing k = new kucing();
		System.out.println(k.getUmur());	
	}
	

}

