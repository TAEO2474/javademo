package java013_api.part06;
// 소문자 (int, double 등) | 👉 기본 자료형 (Primitive Type) 
// 대문자 (Integer, Double 등) | 👉 참조 자료형 / 객체형 (Wrapper Class) 
//1. 기본자료형을 클래스로 정의해 놓은 것을 Wrapper라 한다.
//char		-> Character
//byte		-> Byte
//short		-> Short
//int		-> Integer
//long		-> Long
//float		-> Float
//double		-> Double
//boolean	-> Boolean
//
//2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
//Wrapper클래스를 제공한다.
//
// 3. auto boxing 과 auto unboxing은 jdk5.0에서 추가된 기능이다.
// auto boxing 오토박싱 (기본형 → 객체형) => 스택 -> 힙 영역에 복사
// auto unboxing 오토언박싱 (객체형 → 기본형)  => 힙 -> 
// 기본형(primitive) 값을 동으로 객체형(wrapper class) 으로 변환해 주는 기능입니다.
// 즉, Java가 자동으로 감싸주는 것이에요.
//  int → Integer, double → Double, boolean → Boolean 등

public class Java150_Wrapper {
		public static void main(String[] args) {
				String data = "123";
				// 문자열 (String)-> 기본지료형(integer,double,long, float...)으로 변환
				Integer it = new Integer(data); //java9 deprecated //문자열(String)을 정수(int)로 바꿔주는 메서드
				int num = it.intValue(); 
				System.out.println(num);
				
				int num2 = Integer.parseInt(data);//문자열을 double (소수 포함된 숫자)로 바꿔줍니다.
				System.out.println(num2);
				
				double num3 = Double.parseDouble(data);//문자열을 long (정수지만 더 큰 범위)으로 바꿔줍니다.
				System.out.println(num3);
				
				long num4 = Long.parseLong(data);
				System.out.println(num4);
				////////////////////////////////////////
				//문자열 (String)-> 객체(Integer,Double,Long, Float...)로 변환.
				Integer ie = Integer.valueOf(data);
				System.out.println(ie);
				
				Double de = Double.valueOf(data);
				System.out.println(de);
				
				Long lg = Long.valueOf(data);
				System.out.println(lg);
				
				////////////////////////////////////////
				//auto boxing, auto unboxing
				Integer ik = new Integer(data);
				int ac = ik.intValue();		
				int ad = ik;  //auto unboxing(stack <<- heap)
				double dk = ik;
				System.out.printf("%d %d %,1f\n", ac, ad, dk);
				
				double dc = ik.doubleValue();
				double dd = ik;//auto unboxing(stack <<- heap)
				System.out.printf("%.1f  %.1f\n", dc, dd);
				
				int k = 10;
				Integer ii = new Integer(k);
				Integer ia = Integer.valueOf(k);
				Integer ir = k; //auto boxing(stack ->> heap)
				
				////////////////////////
				//Boolean
				Boolean ba = new Boolean("true");
				boolean bn = ba.booleanValue();
				System.out.println(bn);
				
				boolean bp = Boolean.parseBoolean("true");
				System.out.println(bp);
				
				boolean ew = true;
				Boolean bk = Boolean.valueOf(ew);
				System.out.println(bk);
				Boolean  bo = ew;
				System.out.println(bo);
				
				String  sw = Boolean.toString(bp);
				System.out.println(sw);
				
				
			}// end main()
		}// end class

	

