package remember;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    List<Integer>cards;
    public CardDeck() {
        cards=new ArrayList<>();
        for(int i=1;i<=52;i++) {
            cards.add(i);
        }
    }
    
    public void print() {
        for(int i=0;i<cards.size();i++) {
            int c=cards.get(i);
            System.out.print(code2label(c)+" ");
        }
        System.out.println();
    }
    
    public int getSize() {
        return cards.size();
    }
    
    public int getCodeAt(int x) {
        return cards.get(x);
    }
    
    private static String code2label(int code) {
        String n="";
        if((code-1)/13==0)n="S";
        else if((code-1)/13==1)n="H";
        else if((code-1)/13==2)n="D";
        else if((code-1)/13==3)n="C";
        String num[]= {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
        
        return n + num[(code-1)%13];
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public int takeCode() {
        return cards.remove(0);
    }
    
    public static void main(String args[]) {
        CardDeck deck=new CardDeck();
        System.out.println(deck.getCodeAt(3));
        System.out.println(deck.getSize());
        int c1=deck.getCodeAt(0);
        System.out.println(code2label(c1));
        int c2=deck.getCodeAt(2);
        System.out.println(code2label(c2));
        deck.print();
        deck.shuffle();
        deck.print();
    }
}
