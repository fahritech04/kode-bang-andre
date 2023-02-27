package com.company;

import java.util.*;

public class Main {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  ArrayList<Barang> listA = new ArrayList<>();
  ArrayList<Barang> listB = new ArrayList<>();
  ArrayList<Barang> listC = new ArrayList<>();

  int pilihan;

  do {
   System.out.println("1. Add data\n2. Edit data\n3. Remove data\n4. Display data");
   pilihan = sc.nextInt();

   switch (pilihan) {
    case 1:
     listA.add(new Barang("A001", "Spidol", "Snowman", 4));
     listA.add(new Barang("A001", "Spidol", "Snowman", 4));

     listB.add(new Barang("B006", "Buktul", "itulah", 5));

     listC.add(new Barang("C003", "asa", "asd", 3));
     break;

    case 2:
     String cariKode = sc.next();

     for (int i = 0; i < listA.size(); i++) {
      if (listA.get(i).kode.equals(cariKode)) {
       listA.set(i, new Barang(listA.get(i).kode, sc.next(), sc.next(), sc.nextInt()));
      }
     }
     for (int i = 0; i < listB.size(); i++) {
      if (listB.get(i).kode.equals(cariKode)) {
       listB.set(i, new Barang(listB.get(i).kode, sc.next(), sc.next(), sc.nextInt()));
      }
     }
     for (int i = 0; i < listC.size(); i++) {
      if (listC.get(i).kode.equals(cariKode)) {
       listC.set(i, new Barang(listC.get(i).kode, sc.next(), sc.next(), sc.nextInt()));
      }
     }
     break;

    case 3:
     String kodeDelete = sc.next();
     for (int i = 0; i < listA.size(); i++) {
      if (listA.get(i).kode.equals(kodeDelete)) {
       listA.remove(i);
      }
     }
     for (int i = 0; i < listB.size(); i++) {
      if (listB.get(i).kode.equals(kodeDelete)) {
       listB.remove(i);
      }
     }
     for (int i = 0; i < listC.size(); i++) {
      if (listC.get(i).kode.equals(kodeDelete)) {
       listC.remove(i);
      }
     }
     break;

    case 4:
     for (Barang barang : listA) {
      System.out.println(barang);
     }
     for (Barang barang : listB) {
      System.out.println(barang);
     }
     for (Barang barang : listC) {
      System.out.println(barang);
     }

     break;

    case 5:
     System.exit(0);
   }
  } while (true);
 }
}
