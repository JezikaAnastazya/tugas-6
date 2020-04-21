class hewan {
	
	void suara() {
		System.out.println("Suara hewan biasa");
	}	

}
 //Memasukkan jenis hewan 
class anjing extends hewan {
	// mengeluarkan jenis suara hewan yang telah di masukkan
	void suara() {
		System.out.println("guk guk guk");
	}
}

class kucing extends hewan {
	
	void suara() {
		System.out.println("meongggg");
	}
}

class jangkrik extends hewan {
	
	void suara() {
		System.out.println("krik krik krik krik");
	}
}


class demo{
	
	public static void main(String[] args) {
		hewan h = new hewan();
		h.suara();
		
		
		hewan k = new kucing();
		k.suara();
		
		hewan a = new anjing();
		a.suara();
	}
}

//output:
Suara hewan biasa
guk guk guk
meongggg
krik krik krik krik












