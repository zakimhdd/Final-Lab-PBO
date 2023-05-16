// Class abstrak Toko
abstract class Toko {
  // Metode abstrak stokToko yang akan diimplementasikan di kelas turunan
  public abstract void stokToko();
}

// Kelas turunan Piring
class Piring extends Toko {
  // Variabel enkapsulasi stokPiring dengan access modifier private
  private int stokPiring = 60;

  // Implementasi metode stokToko
  public void stokToko() {
      System.out.println("Stok piring: " + stokPiring + " lusin");
  }

  // Metode pengeluaran barang
  public void keluarBarang(int jumlah) {
      if (stokPiring >= jumlah) {
          stokPiring -= jumlah;
          System.out.println(jumlah + " lusin piring berhasil terjual");
      } else {
          System.out.println("Stok piring tidak mencukupi");
      }
  }

  // Metode pemasukan barang
  public void masukBarang(int jumlah) {
      stokPiring += jumlah;
      System.out.println(jumlah + " lusin piring berhasil ditambahkan ke stok");
  }
}

// Kelas turunan Gelas
class Gelas extends Toko {
  // Variabel enkapsulasi stokGelas dengan access modifier private
  private int stokGelas = 20;

  // Implementasi metode stokToko
  public void stokToko() {
      System.out.println("Stok gelas: " + stokGelas + " lusin");
  }

  // Metode pengeluaran barang
  public void keluarBarang(int jumlah) {
      if (stokGelas >= jumlah) {
          stokGelas -= jumlah;
          System.out.println(jumlah + " lusin gelas berhasil terjual");
      } else {
          System.out.println("Stok gelas tidak mencukupi");
      }
  }

  // Metode pemasukan barang
  public void masukBarang(int jumlah) {
      stokGelas += jumlah;
      System.out.println(jumlah + " lusin gelas berhasil ditambahkan ke stok");
  }
}

public class Main {
  public static void main(String[] args) {
      // Membuat objek Piring dan Gelas
      Piring piring = new Piring();
      Gelas gelas = new Gelas();

      // Menampilkan stok toko
      piring.stokToko();
      gelas.stokToko();

      // Mengeluarkan barang dari stok
      piring.keluarBarang(10);
      gelas.keluarBarang(5);

      // Menampilkan stok toko setelah pengeluaran barang
      piring.stokToko();
      gelas.stokToko();

      // Menambahkan barang ke stok
      piring.masukBarang(20);
      gelas.masukBarang(10);

      // Menampilkan stok toko setelah penambahan barang
      piring.stokToko();
      gelas.stokToko();
  }
}
