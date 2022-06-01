package tes.example.KafkaConsumer.model;

public class Debit {
    private String type;
    private String nama_bank;
    private String nama;
    private Integer jumlah;

    public Debit() {
    }

    public Debit(String type, String nama_bank, String nama, Integer jumlah) {
        this.type = type;
        this.nama_bank = nama_bank;
        this.nama = nama;
        this.jumlah = jumlah;
    }

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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Debit{" +
                "nama_bank='" + nama_bank + '\'' +
                ", nama='" + nama + '\'' +
                ", jumlah=" + jumlah +
                '}';
    }
}
