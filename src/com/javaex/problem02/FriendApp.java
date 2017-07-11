package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	
    	System.out.println("친구를 3명 등록해주세요.");
    	
    	for(int i=0; i<3; i++) {
    		String str = sc.nextLine();
    		String[] info = str.split(" ");
    		Friend friend = new Friend();
    		
    		friend.setName(info[0]);
    		friend.setHp(info[1]);
    		friend.setSchool(info[2]);
    		
    		fList.add(friend);
    	}
    	
    	for(Friend fr : fList) {
    		fr.showInfo();
    	}
    	
    	
    	
    	
    	sc.close();
    }

}
