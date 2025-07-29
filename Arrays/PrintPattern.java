/*
🟨 PROBLEM: Print Pattern Without Loops
🧮 Problem Name: Print Pattern Without Loops
🔗 Source: GFG
📂 Topic: Arrays/Recursion
⚙️ Difficulty: Easy


2️⃣ What is asked:
Given a number n, print a pattern:
- Decrease by 5 until ≤ 0
- Then increase back by 5 to n
- Without using loops

4️⃣ Sample:
Input: 10 → Output: [10, 5, 0, 5, 10]

5️⃣ Notes:
- No loops allowed!
- Use recursion to go down and backtrack up

🧠 Follow-Ups:
Q: Can this be done with loops? A: Yes, but recursion is required here.
*/

import java.util.ArrayList;

public class PrintPatternWithoutLoops {

    private void generatePattern(int cur, ArrayList<Integer> res) {
        res.add(cur);
        if (cur <= 0) return;
        generatePattern(cur - 5, res);
        res.add(cur);
    }

    public ArrayList<Integer> pattern(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        generatePattern(n, res);
        return res;
    }
}
