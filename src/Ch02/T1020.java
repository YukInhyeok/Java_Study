package Ch02;

import java.io.*;
import java.util.Date;

public class T1020 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// ���� ���� �̸� ����
		String fname = "D:/test5.txt";
		
		//File ��ü ����
		
		File f = new File(fname);
		
		System.out.println("���� : " + f.getName() + " ���� :");
		System.out.println();
		System.out.println("\t�н� : " + f.getPath());
		System.out.println("\t�����н� : " + f.getAbsolutePath());
		System.out.println("\t�θ� : " + f.getParent());
		System.out.println("\t���⿩�� :" + f.canWrite());
		System.out.println("\t�б⿩�� :" + f.canRead());
		System.out.println("\t���࿩�� : " + f.canExecute());
		System.out.println("\t�������� : " + f.isDirectory());
		System.out.println("\t������ : " + new Date(f.lastModified()));
		System.out.println("\t����ũ�� : " + f.length());
	}

}
