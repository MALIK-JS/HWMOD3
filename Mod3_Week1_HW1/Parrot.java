
public class Parrot{
	public static boolean getUp(boolean squaqking,int currentHour){
		
		//We have to get up if the parrot is squawking before 6 or after 22 hours so in that case return true.
		//All other cases will return false. 
		//If the currentHour parameter is less than 0 or greater than 23 return false.
		
		if( (currentHour <= 6 && currentHour > 0)  || ( currentHour >= 22 && currentHour < 23 )) {
			return true;
		} else {
			return false;
		}
}
	 

	public static void main(String[] args) {
		
		//test cases
		System.out.println(getUp(true, -5));
		System.out.println(getUp(true, 10));
		System.out.println(getUp(true, 5));
		System.out.println(getUp(true, 28));


	}

}
