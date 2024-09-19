public class ContoohRekursi {
    public static int faktorial(int nilaifaktorial) {
        if (nilaifaktorial == 0) {
            return 1;
        } else {
            return nilaifaktorial * faktorial(nilaifaktorial - 1);
        }
    }

    public static void main(String[] args) {
        int hasil = faktorial(5);
        System.out.println("Faktorial dari 5 adalah : " + hasil);
    }
}
