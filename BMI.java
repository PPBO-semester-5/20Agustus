public class BMI {
	public static void main(String[] args) {
		double tinggi = 156, berat = 48;
		double meter = tinggi/100;
		double bmi = berat/(meter * meter);
		if(bmi < 18.5) {
            		System.out.println("BMI kamu adalah: "+bmi+"Kamu kekurangan berat badan");
        	}
		else if (bmi < 25) {
            		System.out.println("BMI kamu adalah: "+bmi+", Berat kamu normal");
        	}
		else if (bmi < 30) {
            		System.out.println("BMI kamu adalah: "+bmi+", kamu kelebihan berat badan");
        	}
		else {
            		System.out.println("BMI kamu adalah: "+bmi+", Cepat periksa ke dokter");
        	}
	}
}