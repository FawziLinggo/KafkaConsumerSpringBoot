package tes.example.KafkaConsumer.model;

public class DaftarBank {
    private String type;
    private String nama_bank;
    private String kota;
    private String nama;
    private Integer tabungan;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNama_bank() {
        return nama_bank;
    }

    public void setNama_bank(String nama_bank) {
        this.nama_bank = nama_bank;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getTabungan() {
        return tabungan;
    }

    public void setTabungan(Integer tabungan) {
        this.tabungan = tabungan;
    }

    public DaftarBank() {
    }

    public DaftarBank(String type, String nama_bank, String kota, String nama, Integer tabungan) {
        this.type = type;
        this.nama_bank = nama_bank;
        this.kota = kota;
        this.nama = nama;
        this.tabungan = tabungan;
    }

    @Override
    public String toString() {
        return "DaftarBank{" +
                "nama_bank='" + nama_bank + '\'' +
                ", kota='" + kota + '\'' +
                ", nama='" + nama + '\'' +
                ", tabungan=" + tabungan +
                '}';
    }
}
