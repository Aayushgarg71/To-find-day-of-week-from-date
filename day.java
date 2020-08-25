import java.util.*;

public class Main
{
     static int month(int k){
    switch(k){
        case 1:
            return 11;
            case 2:
                return 12;
                case 3:
                    return 1;
                    case 4:
                        return 2;
                        case 5:
                            return 3;
                            case 6:
                                return 4;
                                case 7:
                                    return 5;
                                    case 8:
                                        return 6;
                                        case 9:
                                            return 7;
                                            case 10:
                                            return 8;
                                            case 11:
                                            return 9;
                                            case 12:
                                                return 10;
    }
    return -1;
}
static String day(int k){
    switch(k){
         case 0:
            return "Sunday";
            case 1:
                return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                    case 4:
                        return "Thursday";
                        case 5:
                            return "Friday";
                            case 6:
                                return "Saturday";
                    
    }
    return "wrong";
}
	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();            // Day
	b= sc.nextInt();        //month
	c=sc.nextInt();               //year
	//using Zeller Rule
	int m= month(b);
	int k=a+((13*m-1)/5);
	int l;
	if(m>10){
	     l=-1;
	}
	else{
	    l=0;
	}
	l+=(c%100);
	k+=l+(l/4)+((c/100)/4)-2*(c/100);
	if(k<0){
	    k=(k%7)+7;
	}
	else{
	    k=k%7;
	}
	System.out.println(day(k));
}}
