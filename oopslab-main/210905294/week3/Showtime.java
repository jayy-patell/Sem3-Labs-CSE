import java.util.Scanner;

class Time
{
	int hours;
	int minutes;
	int seconds;

	void set(int h,int m, int s){
		hours= h;
		seconds= s;
		minutes= m;
	}

	void display(){
		System.out.println(hours+ ":" +minutes+ ":" +seconds);
	}

	Time add(Time t2){
		Time tAdd = new Time();
		int hAdd = hours + t2.hours;
		int mAdd = minutes + t2.minutes;
		int sAdd = seconds + t2.seconds;
		if(sAdd>60){
			sAdd=sAdd%60;
			mAdd++;
		}
		if(mAdd>60){
			mAdd=mAdd%60;
			hAdd++;
		}
		/*
		tAdd.hours = hours + t2.hours;
		tAdd.minutes = minutes + t2.minutes;
		tAdd.seconds = seconds + t2.seconds;
		*/
		tAdd.set(hAdd,mAdd,sAdd);
		return tAdd;
	}

	Time subtract(Time t2){
		Time tSub = new Time();
		tSub.seconds = seconds - (t2.seconds);
		tSub.minutes = minutes - (t2.minutes);
		tSub.hours =  hours - t2.hours;
		if(tSub.seconds <= 0){
			tSub.seconds = tSub.seconds + (60-t2.seconds);
			tSub.minutes--;
		}
		if(tSub.minutes <=0){
			tSub.minutes = tSub.minutes + (60-t2.minutes);
			tSub.hours--;
		}
		return tSub;
	}

	void Compare(Time t1, Time t2){
		int sec1 = t1.hours*3600 + t1.minutes*60 + t1.seconds;
		int sec2 = t2.hours*3600 + t2.minutes*60 + t2.seconds;

		if(sec1>sec2){
			System.out.println("Time1 is greater than Time2.");
		}else if(sec1<sec2){
			System.out.println("Time2 is greater than Time1.");
		}else{
			System.out.println("Waqt kisi ke liye rukta nahi.");
		}
	}
}

class Showtime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();

		System.out.println("Enter time1 in hours minutes seconds: ");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int s1 = sc.nextInt();

		System.out.println("Enter time2 in hours minutes seconds: ");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int s2 = sc.nextInt();

		t1.set(h1,m1,s1);
		t2.set(h2,m2,s2);

		System.out.println("Time1 is: ");
		t1.display();
		System.out.println("Time2 is: ");
		t2.display();

		t3=t1.add(t2);
		System.out.println("Time after adding is: ");
		t3.display();

		if(t1.hours > t2.hours){
			t3=t1.subtract(t2);
			System.out.println("Time after subtracting is: ");
			t3.display();
		}else{
			System.out.println("Subtraction not possible.");
		}

		t3.Compare(t1,t2);

		sc.close();
	}
}