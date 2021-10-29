public class Jumlah {
    public static void main(String[] args) {
        Toko pulpen = new Toko();
        pulpen.name = "Bolpoint";


        pulpen.stock = 10;


        pulpen.setStock(10);
        pulpen.hrg = 2000;
        pulpen.setHrg(2000);

        Toko pensil = new Toko();
        pensil.name = "Pensil";
        pensil.stock = 10;
        pensil.setStock(10);
        pensil.setHrg(1000);



        Toko penghapus = new Toko();
        penghapus.name = "Penghapus";
        penghapus.stock = 10;
        penghapus.setStock(10);
        penghapus.setHrg(500);

        int totalPulpen = pulpen.stock*pulpen.getHrg();
        int totalPensil = pensil.stock*pensil.getHrg();
        int totalPenghapus = penghapus.stock* penghapus.getHrg();


        System.out.println("Jumlah uang yang diterima penjual ketika semuanya laku adalah");
        System.out.println(pulpen.name+" = "+totalPulpen);
        System.out.println(pensil.name+" = "+totalPensil);
        System.out.println(penghapus.name+" = "+totalPenghapus);

        int jml = totalPulpen+totalPensil+totalPenghapus;
        System.out.print("Total Keseluruhan adalah = ");
        System.out.println(jml);
    }
}

