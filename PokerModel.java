package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerModel{
    int games;
    int chips;
    List<Integer> deckcards;
    List<Integer> handcards;
    String buttonLabel;
    String message;
    
    public PokerModel() {
        deckcards = new ArrayList<>();
        handcards = new ArrayList<>();
    }
    
    public void reset() {
        games=0;
        chips = 500;

    }
    
        
    public void nextgame() {
        deckcards.clear();
        for (int i=1; i<=52; i++) {
            Collections.shuffle(deckcards);
            deckcards.add(i);
        }
        handcards.clear();
        for (int i=0; i<5; i++) {
            int n = deckcards.remove(0);
            handcards.add(n);
        }
        System.out.printf("%d: ", deckcards.size());
        for (int n: deckcards) {
            System.out.printf("%d ", n);
        }
        System.out.println();
        message = "交換するカードをチェックしてください";
        buttonLabel = "交換";
        games++;
    }
    public void change(List<String> index) {
        System.out.println("index="+index);
        for (int i=0; i<index.size(); i++) {
            int c = deckcards.remove(0); 
            int x = Integer.parseInt(index.get(i));
            handcards.set(x, c); 
        }
        evaluate();
        buttonLabel = "次のゲーム";
        }
        
    void evaluate() {
        chips -= 100;
        message = "ノーペアです -100";
        if (chips == 0) {
            message += " ゲームオーバー";
        }
    }
    
    public int getGames() {
        return games;
    }

    public int getChips() {
        return chips;
    }
    
    public int getHandcardAt(int i) {
        return handcards.get(i);
    }
    
    public String getButtonLabel() {
        return buttonLabel;
    }
    
    public String getMessage() {
        return message;
    }
   
}