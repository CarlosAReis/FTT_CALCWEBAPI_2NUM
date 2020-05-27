package ftt.ec.control;
import java.io.IOException;
import java.math.BigInteger;


public class CalculabigInteger {
	
	private BigInteger biga ;
	private BigInteger bigb ;
	//private BigInteger soma ;
	
	
	public CalculabigInteger (String a, String b){
		this.setA(a);
		this.setB(b);
	}
	
	 public void setA(String a) {
	        this.biga = new BigInteger(a);
	    }
	    
	    public void setB(String b) {
	        this.bigb = new BigInteger(b);
	    }

	 

	    public String getSum() {
	        return biga.add(bigb).toString();
	    }

}
