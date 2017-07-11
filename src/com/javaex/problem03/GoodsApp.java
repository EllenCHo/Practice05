package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int count = 0;				//상품의 총갯수
    	
    	List<Goods> glist = new ArrayList<Goods>();
    	
    	System.out.println("상품 3개를 입력해주세요.");
    	
    	for(int i = 0; i<3; i++) {
    		String str = sc.nextLine();
    		String[] good = str.split(" ");
    		
    		Goods goods = new Goods(good[0], Integer.parseInt(good[1]), Integer.parseInt(good[2]));
    		
    		glist.add(goods);    		
    	}
    	
    	for(Goods good : glist) {
    		good.showInfo();
    		
    		count += good.getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + count + "개입니다.");
    	
    	
    	
    	sc.close();

       
    }

}
