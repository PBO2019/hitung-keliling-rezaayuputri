public class bujursangkar {
        private int sisi = 8;
        private int keliling;

        public void Bujur(){
            keliling = 4*sisi;
            System.out.println("Keliling Bujursangkar "+ keliling);


        }
        public static void main(String [] args){
            bujursangkar hitung = new bujursangkar();
            hitung.Bujur();
        }
    }
