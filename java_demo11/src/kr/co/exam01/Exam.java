package kr.co.exam01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exam {
	
	/*
	 * 	로또 번호 생성
	 * 	  - 1 ~ 45 까지의 랜덤 번호를 생성하여 리스트에 담는다.
	 * 	  - 중복된 값 없이 리스트에 담도록 한다.
	 * 	  - 총 6개의 정수값이 리스트에 저장될 수 있도록 한다.
	 * 	  - 마지막에 출력할 때 오름차순으로 정렬이 되도록 한다.
	 */
	private static ArrayList<Integer> getLotto() {
		Random random = new Random();
		ArrayList<Integer> lottoList = new ArrayList<Integer>();

		while (lottoList.size() < 6) {
			int num = random.nextInt(45) + 1;
			boolean isExists = lottoList.contains(Integer.valueOf(num));
			if (!isExists) {
				lottoList.add(num);
			}
		}
		Collections.sort(lottoList);
		return lottoList;
	}

	public static void main(String[] args) {
		
		/*
		 * 	위에서 생성한 로또 번호 6개를 1세트라고 하자.
		 * 
		 * 	1. 사용자가 원하는 수의 세트로 로또 번호가 생성되어 파일에 저장될 수 있도록 한다.
		 * 	2. 저장할 때 D:\\ 에 lotto.txt 파일로 저장되도록 한다.
		 * 	3. 한 줄에 1세트의 번호가 출력되어야 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로또 번호 몇 세트를 생성할까요?");
		int count = sc.nextInt();
		
		File f = new File("D:\\lotto.txt");
		try (FileWriter fw = new FileWriter(f, true)) {

			for(int i = 0; i < count; i++) {
				fw.write(getLotto().toString());
				fw.write("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
