package com.company;

public class Barang {
 String kode, jenis, nama;
 int stok;

 public Barang(String kode, String jenis, String nama, int stok) {
  this.kode = kode;
  this.jenis = jenis;
  this.nama = nama;
  this.stok = stok;
 }

 @Override
 public String toString() {
  return "Barang [kode=" + kode + ", jenis=" + jenis + ", nama=" + nama + ", stok=" + stok + "]";
 }

}
