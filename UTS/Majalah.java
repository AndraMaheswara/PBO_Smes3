public class Majalah extends Koleksi {
    private String edisi;

    public Majalah(String kode, String judul, String edisi) {
        super(kode, judul);
        this.edisi = edisi;
    }

    public String getEdisi() {
        return edisi;
    }

    @Override
    public int hitungDenda() {
        return (int) Math.min((long) hariTerlambat * 500, Integer.MAX_VALUE);
    }

    @Override
    public String getJenis() {
        return "Majalah";
    }
}
