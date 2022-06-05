////1��
//class Practice {
//	void random3(int n) {
//		for(int i=0; i<n; i++) {
//		 System.out.print( (int)(Math.random()*33+1)*3 + " " );
//		}
//		System.out.println();
//	}
//
//	static void div10(int n) {
//		System.out.println(n%10);
//	}
//
//	void last_word(String s) {
//		String[] srr = s.split(" ");
//		System.out.println(srr[srr.length-1]);
//	}
//
//	void max_no(int val) {
//		Integer VAL = val;
//		String s = VAL.toString();
//		//System.out.println(s);
//		char temp;
//		char max='0';
//		for(int i=0; i<s.length(); i++) {
//			temp = s.charAt(i);
//			if(temp>max) {
//				max = temp;
//			}
//		}
//		System.out.println(max);
//	}
//
//}
////2��
//class TV {
//	private int channel;  // ���� ä�ι�ȣ
//	TV(int ch){
//		channel = ch;
//	}
//	int get_channel() {
//		return channel;
//	}
//}
////3��
//class AI_TV extends TV {
//	private String name;
//	AI_TV(String n, int ch){
//		super(ch);
//		name = n;
//	}
//	void command(String n) {
//		if(n.equals(name)) {
//			System.out.println("���δ�! ���� ä���� "+get_channel()+"��");
//		} else {
//			System.out.println("���δ�! ���� "+n+"�� �ƴϿ���.");
//		}
//	}
//}
//
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 1��
//		Practice ex = new Practice();
//		ex.random3(7);
//
//		Practice.div10(2973);
//
//		System.out.println( lower('H'));
//
//		ex.last_word("What's your name?");
//		ex.last_word("I am a boy");
//
//		ex.max_no(18670725);		//8
//		ex.max_no(20030615);		//6
//
//		//2��
//		TV lg = new TV(7);
//		System.out.println("����ä���� "+lg.get_channel()+"��");
//		//3��
//		AI_TV siri = new AI_TV("�ø���", 7);
//		siri.command("�ø���");
//		siri.command("����");
//	}
//
//	static char lower(char c) {
//		return (char)(c+'a'-'A');
//	}
//
//}
