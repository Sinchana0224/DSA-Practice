/*
🧮 Problem: Betting Game  
📂 Topic: Arrays / Simulation  
⚙️ Difficulty: Basic  
📅 Date Solved: 2025-07-28  

🎯 Problem Summary:
You're given a string 's' of 'W' and 'L' characters representing win/loss rounds. 
- Start with $4 and a $1 initial bet.
- Win ➜ add bet to balance, reset bet to $1.
- Lose ➜ subtract bet from balance, double the bet.
- End game if balance < bet or if all rounds are played.
Return final balance or -1 if balance goes negative during the game.
*/

public class BettingGame {
    static int betBalance(String s) {
        int bal = 4;
        int bet = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (bal < bet) return -1;
            char c = s.charAt(i);
            
            if (c == 'W') {
                bal += bet;
                bet = 1;
            } else if (c == 'L') {
                bal -= bet;
                bet *= 2;
            }
        }
        
        return bal;
    }

    // Sample usage
    public static void main(String[] args) {
        System.out.println(betBalance("WL"));           // Output: 4
        System.out.println(betBalance("WLWLLLWWLW"));   // Output: -1
    }
}
