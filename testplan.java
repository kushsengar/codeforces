import java.util.Scanner;

public class testplan {
   public static boolean isAdditiveNumber(String num) {
		long number1=0;
		for(int i=0; i<num.length()-1; i++){
			number1=number1*10+num.charAt(i)-'0';
			long number2=0;
			for(int j=i+1; j<num.length(); j++){
				number2=number2*10+num.charAt(j)-'0';
				if(solv(number1, number2, j+1, num, 2))
					return true;
				if(number2==0)
					break;
			}
			if(number1==0)
				break;
		}
		return false;
	}
	public static boolean solv(long number1, long number2, int curr, String num, int count) {
		if(curr>=num.length()){
			if(count>=3)
				return true;
			return false;
		}
		if(num.charAt(curr)=='0' && number1+number2!=0)
			return false;
    
		long number=0;
		long target=number1+number2;
		for(int i=curr; i<num.length(); i++) {
			number=number*10+num.charAt(i)-'0';
			if(number==target && solv(number2, target, i+1, num, count+1))
				return true;
			else if(number>target)
				break;
		}
		return false;
	}    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isAdditiveNumber(str));
      //   boolean flag = true;
      //    for(int i=2;i<str.length();i++){
      //       if((str.charAt(i)-'0')!= (str.charAt(i-1)-'0') + (str.charAt(i-2)-'0')){
      //            flag = false;
      //       }
      //    }
      //    if (flag) {
      //       System.out.println("true");
      //    }else{
      //       System.out.println("false");
      //    }
    }
}