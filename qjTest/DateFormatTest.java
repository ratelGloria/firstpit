package qjTest;

import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.helpers.DateTimeDateFormat;
import org.w3c.dom.ls.LSException;

import com.sun.javafx.image.impl.IntArgb;

import apple.eagle.importDb;
import apple.login.newclient;
import oracle.jdbc.ttc7.TTC7Protocol;
import oracle.net.aso.i;
import sun.net.www.content.audio.x_aiff;

public class DateFormatTest implements Runnable{
	
	static int  i =100;
	private  Object object = new Object();
	
	public static void  main (String[] args){
		
		 int a = 0;
		
//		for(int i = 0;i<20;i++) {
//			a = (int)(Math.random()*(1000-1)+1000);
//			System.out.println("---ww----"+a);
//		}
	
//		moreLine();

		DateFormatTest d = new DateFormatTest();
//		DateFormatTest d1 = new DateFormatTest();
//		DateFormatTest d2 = new DateFormatTest();
	 	Thread t1 = new Thread(d,"A");
	 	Thread t2 = new Thread(d,"B");
	 	Thread t3 = new Thread(d,"C");
	 	
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	
//	 	d.run();
//		int ww = aboutCollection();
	
//		datetoSomeOne();
	}
	
	boolean flage = false;
	public static void moreLine() {
		
		DateFormatTest d = new DateFormatTest();
	 	Thread t1 = new Thread(d,"A");
	 	Thread t2 = new Thread(d,"B");
	 	Thread t3 = new Thread(d,"C");
	 	Long t1Id = t1.getId();
	 	Long t2Id = t2.getId();
	 	
	 	String t1Name = t1.getName();
	 	
	 	String t2Name = t2.getName();	
	 	
	 	t1.start();
	 	t2.start();
	 	t3.start();
	 	try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static int num ;
	static int num2 ;
	public  void tt() {
		
			while (true) {
				
				synchronized (object) {
				if(i<=0){
					return;
				}
		
				System.out.println("-----------"+Thread.currentThread().getName()+"=="+num);
				i--;
				num ++;
				}
			}
	}
	private int ww =100;
	public  void tt2() {
		
		for(;ww>=0;ww--) {
			
			synchronized (object) {
			if(ww<=0){
				return;
			}
	
			System.out.println("----wwwwwwwwww-------"+Thread.currentThread().getName()+"=="+num2);
		
			num2 ++;
			}
		}
}
	@Override
	public  void run() {
		
			tt();
		
		
//			tt2();
		
		
		
		
//		try {
//			TimeUnit.SECONDS.sleep(3);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}
	
	public static void bioAbout() {
		
		
		
		Socket socket = new  Socket();
		
		try {
			socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void datetoSomeOne() {
		
		Date date = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String date1 = simpleDateFormat.format(date);
		
		 Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		
		int a = Calendar.YEAR;
		System.out.println(year);
		System.out.println(a);
		
//		System.out.println(date1);
	}
	
	
	public static int aboutCollection() {
	
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		list2.add("aa");
		list2.add("bb");
		list2.add("cc");
		
		list.add("DD");
		list.addAll(list2);
		
		
		
		HashMap hashMap = new HashMap();
		
//		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		TreeMap treeMap = new TreeMap();
		
		hashMap.put("1", "aaa");
	
	
		for(int i = 0;i<2 ;i++) {
			
			hashMap.put(i, "aaa"+ i);
			
			treeMap.put(i, "aaa"+ i);
		}
		int a = 0;
		try {
//			treeMap.put(666f, "aaa666");
			a = 1;
			System.out.println("-----"+a);
			return a;
		} catch (Exception e) {
			// TODO: handle exception
			treeMap.clear();
			treeMap.put(0f, "aaaaa0fff");
			treeMap.put(666f, "aaa666");	
			a = 2;
			System.out.println("-----"+a);
//			return a;
		}
		finally {
			a = 3;
			System.out.println("-----"+a);
		}
		return a;
		
//		System.out.println(a);
		
//		Object dobleKey = hashMap.get(1);
//		
//		Object key = hashMap.get("1");
//		
//		int key_hashcode = key.hashCode();
		 
//		System.out.println(Integer.toBinaryString(key_hashcode)+"-------"+key_hashcode);
//		System.out.println(Integer.toBinaryString(3)+"-------");
		
//		int key_bit_opertion = key_hashcode^(key_hashcode>>>16);
		
//		System.out.println(key_bit_opertion);
		
//		System.out.println("===hashMap===="+hashMap);
//		System.out.println("==treeMap===="+treeMap);
//		System.out.println("==dobleKey===="+dobleKey);
	
	} 

	public static void getConnectionWithApple()throws Exception  {

		Connection con = importDb.oracleCon210();
		Statement con1 = con.createStatement();
		/*
		 * Connection con = importDb.oracleCon210();
		 * 
		 * Statement con1 = con.createStatement(); SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd");
		 * 
		 * Date date = new Date();
		 */
		
		String sql =" select * from XT_DISKCODE where companyid=9 and id=117521 ";
		ResultSet rs = con1.executeQuery(sql);
		//hfuser
		String hruser ="";
		if(rs.next()){
			hruser=rs.getString("HFUSER") ;
			System.out.print("--------"+hruser);
			if(hruser !=""&&hruser!=null) {
				System.out.print("--------");
			};
		}
		
		/*
		 * while(rs.next()) {
		 * 
		 * String strDate = rs.getString("INPUT_DATE");
		 * 
		 * try {
		 * 
		 * sdf.parse(strDate);
		 * 
		 * }catch (Exception e) {
		 * 
		 * System.out.println(strDate);
		 * 
		 * }
		 * 
		 * }
		 */
	}


	

}
