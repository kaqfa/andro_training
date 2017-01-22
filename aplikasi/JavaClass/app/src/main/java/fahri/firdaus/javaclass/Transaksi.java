package fahri.firdaus.javaclass;

import java.util.ArrayList;

/**
 * Created by kaqfa on 1/22/17.
 */

public class Transaksi {
    public ArrayList<Barang> items = new ArrayList<>();
    public String kode;

    public Transaksi(String kode) {
        this.kode = kode;
    }

    public void addItem(String nama, int jenis, int harga){
        Barang barang = new Barang(nama, jenis, harga);
        this.items.add(barang);
    }

    public void addItem(Barang barang){
        this.items.add(barang);
    }

    public int totalTransaksi(){
        int total = 0;
        for (int i = 0; i < items.size(); i++){
            total += items.get(i).getHarga();
        }
        return total;
    }

    public String getTextItems(){
        String string = "";
        for (int i = 0; i < items.size(); i++){
            string += items.get(i).toString()+"\n";
        }
        return string;
    }

    @Override
    public String toString() {
        String string = "Kode: "+this.kode+" | Jumlah: "+this.items.size()+
                        " item | Total: "+this.totalTransaksi();
        return string;
    }
}
