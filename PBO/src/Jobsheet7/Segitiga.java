package Jobsheet7;

public class Segitiga {
    private int sudut;
    
    public int totalSudut(int A){
        return sudut = 180 - A;
    }
    
    public int totalSudut(int A, int B){
        return sudut = 180 - (A+B);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
    }
}

class Tugas1{
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Sudut = "+ s.totalSudut(90));
        System.out.println("Sudut 2 = "+ s.totalSudut(90, 45));
        System.out.println("Keliling = "+ s.keliling(4, 6, 9));
        System.out.println("Keliling 2 = "+ s.keliling(2, 4));
    }
}
