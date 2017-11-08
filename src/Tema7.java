
    public class Tema7 {
        public boolean consecutive(int x, int y) {

            if (x-y==1) {
                return true;
            }
            else if ((x==1) && (y==2)){
                return true;
            }
            else if ((x-y==1) && (y-x==1)){
                return true;
            }
            else if (x%2==0 && x<0){
                return true;
            }
            else
                return false;

        }

        public static void main(String[] args) {

        }
    }

// nu am stiut cum sa fac mai departe...
