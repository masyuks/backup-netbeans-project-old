package Jobsheet7;

public class Manusia {
    public void bernafas(){
        System.out.println("Manusia bisa bernafas");
    }
    public void makan(){
        System.out.println("Manusia butuh makan");
    }
}

class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen butuh makan");
    }
    public void lembur(){
        System.out.println("Dosen bisa lembur");
    }
}

class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa butuh makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa butuh tidur");
    }
}

class Tugas2{
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();
        a.bernafas();
        a.makan();
        System.out.println("---------------------");
        b.makan();
        b.lembur();
        System.out.println("---------------------");
        c.makan();
        c.tidur();
    }
}
