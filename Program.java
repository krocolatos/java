public class Program {
    public static void main(String[] args) {

        Toko pulpen = new Toko();
        pulpen.name = "Bolpoint";
        pulpen.stock = 10;
        pulpen.setStock(10);
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




        System.out.println("Harga "+pulpen.name+" = "+pulpen.getHrg());
        System.out.println("Dengan Jumlah Stok "+pulpen.getStock()+" pcs");

        System.out.println("Harga "+pensil.name+" = "+pensil.getHrg());
        System.out.println("Dengan Jumlah Stok "+pensil.getStock()+" pcs");

        System.out.println("Harga "+penghapus.name+" = "+penghapus.getHrg());
        System.out.println("Dengan Jumlah Stok "+penghapus.getStock()+" pcs");
    }
}

