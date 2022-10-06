package tema3;

public class ex1 {

	public static void main(String[] args) {
		
		int discount;
		int factura = 190;
		discount = (factura>100)?factura*10/100:(factura<100)?factura*5/100:0;
		
		System.out.println("Discountul tau este :" + discount);

	}

}
