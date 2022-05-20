package remember;

public class Sample {

    public static void main (String args[]) {
        Sample sample = new Sample();
        sample.hello();
        sample.morning("サトシ");
        sample.printAllCodes();
        sample.printOddCodes();
        sample.printSpadeCodes();
        sample.printDiamondCodes();
        sample.printNot3Codes();
        sample.printNot3Codes2();
        sample.printNot23Codes();
        sample.printNot23Codes2();
        System.out.println(sample.code2num(17));
        System.out.println(sample.code2suit(17));
    }
    

    void hello() {
        System.out.println("Hello, world");
    }
    
    void morning(String name) {
        System.out.println("おはよう"+name);
    }
    
    void printAllCodes() {
        for(int i=1; i<=52; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    
    void printOddCodes() {
        for (int i=1; i<=52; i++) {
            if(i%2==1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printSpadeCodes() {
        for (int i=1; i<=52; i++) {
            if(i<=13) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printDiamondCodes() {
        for (int i=1; i<=52; i++) {
            if(i>=27&&i<=39) {
                    System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printNot3Codes() {
        for (int i=1; i<=52; i++) {
            if(i%3!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printNot3Codes2() {
        for (int i=1; i<=52; i++) {
            if(!(i%3==0)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printNot23Codes() {
        for (int i=1; i<=52; i++) {
            if(i%3!=0&&i%2!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    void printNot23Codes2() {
        for (int i=1; i<=52; i++) {
            if(!(i%3==0)&&!(i%2==0)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    int code2num(int code) {
        int n;
        n=code%13;
        return n;
    }
    
    String code2suit(int code) {
        String n = null;
        if(code/13<=1) {
            n="スぺド";
        }else if(code/13>1&&code/13<=2) {
            n="ハート";
        }else if(code/13>2&&code/13<=3) {
            n="ダイヤ";
        }else if(code/13>3&&code/13<=4) {
            n="クロバ";
        }
        return n;
       
    }
}
