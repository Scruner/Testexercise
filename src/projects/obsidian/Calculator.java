package projects.obsidian;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("---------------------------");
      System.out.println("�������� �����");
      System.out.println("1.��������");
      System.out.println("2.���������");
      System.out.println("3.���������");
      System.out.println("4.�������");
      System.out.println("5.�����");

      int person = scanner.nextInt();
      int result;
      if (person == 5) {
        break;
      } else if (person == 1) {
        System.out.println("������� ������ ����� : ");
        int a = scanner.nextInt();
        System.out.println("������� ������ ����� : ");
        int b = scanner.nextInt();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        result = a + b;
        System.out.println("����� : " + result);
      } else if (person == 2) {
        System.out.println("������� ������ ����� : ");
        int a = scanner.nextInt();
        System.out.println("������� ������ ����� : ");
        int b = scanner.nextInt();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        result = a - b;
        System.out.println("����� : " + result);
      } else if (person == 3) {
        System.out.println("������� ������ ����� : ");
        int a = scanner.nextInt();
        System.out.println("������� ������ ����� : ");
        int b = scanner.nextInt();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        result = a * b;
        System.out.println("����� : " + result);
      } else if (person == 4) {
        System.out.println("������� ������ ����� : ");
        int a = scanner.nextInt();
        System.out.println("������� ������ ����� : ");
        int b = scanner.nextInt();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        result = a / b;
        System.out.println("����� : " + result);
      }

    }
  }
}
