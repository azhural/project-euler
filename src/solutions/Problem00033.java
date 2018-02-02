package solutions;

public class Problem00033 {
    public static void main(String[] args) {
        int produktZaehler = 1;
        int produktNenner = 1;
        
        // same number in the back
        for(int i = 1; i < 10; i++){
            for(int bottom = 2; bottom < 10; bottom++){
                for(int top = 1; top < bottom - 1; top++){ //satisfies <1
                    int zaehler = top*10 + i;
                    int nenner = bottom*10 + i;
                    if(Math.abs(((double) zaehler / nenner) - (double) top / bottom) < 0.000001f){
                        produktZaehler *= zaehler;
                        produktNenner *= nenner;
                        System.out.println(zaehler + " / " + nenner);
                    }
                }
            }
        }
        //same number in the front
        for(int i = 1; i < 10; i++){
            for(int bottom = 2; bottom < 10; bottom++){
                for(int top = 1; top < bottom - 1; top++){ //satisfies <1
                    int zaehler = top + i*10;
                    int nenner = bottom + i*10;
                    if(Math.abs(((double) zaehler / nenner) - (double) top / bottom) < 0.000001f){
                        produktZaehler *= zaehler;
                        produktNenner *= nenner;
                        System.out.println(zaehler + " / " + nenner);
                    }
                }
            }
        }
        // same number /
        for(int i = 1; i < 10; i++){
            for(int bottom = 1; bottom < 10; bottom++){
                for(int top = 1; top < 10; top++){
                    int zaehler = top*10 + i;
                    int nenner = bottom + i*10;
                    if((double) zaehler / nenner < 1.0 && Math.abs(((double) zaehler / nenner) - (double) top / bottom) < 0.000001f){
                        produktZaehler *= zaehler;
                        produktNenner *= nenner;
                        System.out.println(zaehler + " / " + nenner);
                    }
                }
            }
        }
        // same number \
        for(int i = 1; i < 10; i++){
            for(int bottom = 1; bottom < 10; bottom++){
                for(int top = 1; top < 10; top++){
                    int zaehler = top + i*10;
                    int nenner = bottom*10 + i;
                    if((double) zaehler / nenner < 1.0 && Math.abs(((double) zaehler / nenner) - (double) top / bottom) < 0.000001f){
                        produktZaehler *= zaehler;
                        produktNenner *= nenner;
                        System.out.println(zaehler + " / " + nenner);
                    }
                }
            }
        }

        System.out.println(produktZaehler +" / " + produktNenner);
        // 387296 / 38729600 no need for prime factors :P
    }
}
