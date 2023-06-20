public class AplikasiPeminjamanBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 2000);
        Buku buku2 = new Buku("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Anggota anggota1 = new Anggota("Ganjar Pranowo", "Jl. Koja No. 212", "A001");
        Anggota anggota2 = new Anggota("Puan Maharani", "Jl. Kota Tua No. 202", "A002");
        Peminjaman peminjaman1 = new Peminjaman(buku1, anggota1);
        peminjaman1.setTanggalPeminjaman("2023-06-20");
        peminjaman1.setTanggalPengembalian("2023-06-27");
        Peminjaman peminjaman2 = new Peminjaman(buku2, anggota2);
        peminjaman2.setTanggalPeminjaman("2023-06-21");
        peminjaman2.setTanggalPengembalian("2023-06-28");

        System.out.println("Data Peminjaman:");
        System.out.println(peminjaman1);
        System.out.println(peminjaman2);
    }
}

class Buku implements Comparable<Buku> {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public int compareTo(Buku buku) {
        return this.judul.compareTo(buku.judul);
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }
}

class Anggota {
    private String nama;
    private String alamat;
    private String nomorKeanggotaan;

    public Anggota(String nama, String alamat, String nomorKeanggotaan) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKeanggotaan = nomorKeanggotaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorKeanggotaan() {
        return nomorKeanggotaan;
    }

    public void setNomorKeanggotaan(String nomorKeanggotaan) {
        this.nomorKeanggotaan = nomorKeanggotaan;
    }

    @Override
    public String toString() {
        return "Anggota{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", nomorKeanggotaan='" + nomorKeanggotaan + '\'' +
                '}';
    }
}

class Peminjaman extends Buku {
    private Anggota anggota;
    private String tanggalPeminjaman;
    private String tanggalPengembalian;

    public Peminjaman(Buku buku, Anggota anggota) {
        super(buku.getJudul(), buku.getPenulis(), buku.getTahunTerbit());
        this.anggota = anggota;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public double hitungDenda() {
        // Implementasikan logika perhitungan denda (jika ada) di sini
        return 0.0;
    }

    @Override
    public String toString() {
        return "Peminjaman{" +
                "buku=" + super.toString() +
                ", anggota=" + anggota +
                ", tanggalPeminjaman='" + tanggalPeminjaman + '\'' +
                ", tanggalPengembalian='" + tanggalPengembalian + '\'' +
                '}';
    }
}