
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printBinary(0.25));
		
		System.out.println(swapOddEvenBits(43));
	}
	
	//swap odd and even bits in an integer with as few instructions as possible
	
	public static int swapOddEvenBits(int n){
		return ((n&0xaaaaaaaa)>>1)|((n&0x55555555)<<1);
	}

}
