//1번
class Practice {
	void random3(int n) {
		for(int i=0; i<n; i++) {
		 System.out.print( (int)(Math.random()*33+1)*3 + " " ); 
		}
		System.out.println();
	}
	
	static void div10(int n) {
		System.out.println(n%10);
	}
	
	void last_word(String s) {
		String[] srr = s.split(" ");
		System.out.println(srr[srr.length-1]);
	}
	
	void max_no(int val) {
		Integer VAL = val;
		String s = VAL.toString();	
		//System.out.println(s);
		char temp;
		char max='0';
		for(int i=0; i<s.length(); i++) {
			temp = s.charAt(i);
			if(temp>max) {
				max = temp;
			}
		}
		System.out.println(max);
	}
	
}
//2번
class TV {
	private int channel;  // 현재 채널번호
	TV(int ch){
		channel = ch;
	}
	int get_channel() {
		return channel;
	}
}
//3번
class AI_TV extends TV {
	private String name;
	AI_TV(String n, int ch){
		super(ch);
		name = n;
	}
	void command(String n) {
		if(n.equals(name)) {
			System.out.println("주인님! 현재 채널은 "+get_channel()+"번");
		} else {
			System.out.println("주인님! 저는 "+n+"가 아니예요.");
		}		
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번
		Practice ex = new Practice();
		ex.random3(7);
		
		Practice.div10(2973);
		
		System.out.println( lower('H'));
		
		ex.last_word("What's your name?");
		ex.last_word("I am a boy");
		
		ex.max_no(18670725);		//8
		ex.max_no(20030615);		//6
		
		//2번
		TV lg = new TV(7);
		System.out.println("현재채널은 "+lg.get_channel()+"번");
		//3번
		AI_TV siri = new AI_TV("시리야", 7);
		siri.command("시리야");
		siri.command("누구");
	}
	
	static char lower(char c) {
		return (char)(c+'a'-'A');
	}
	
}
