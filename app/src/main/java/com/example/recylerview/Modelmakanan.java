package com.example.recylerview;

public class Modelmakanan{
      private String namaMakanan;

      private String hargaMakanan;

      private int image;

      public Modelmakanan(String namaMakanan, String hargaMakanan, int image){
          this.setNamaMakanan(namaMakanan);
          this.setHargaMakanan(hargaMakanan);
          this.setImage(image);

      }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
