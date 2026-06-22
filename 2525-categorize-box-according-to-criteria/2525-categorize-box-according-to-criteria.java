class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String decider = "";
        String decider2 = "";

        
        if (length >= 10000 || width >= 10000 || height >= 10000 
            || (long)length * width * height >= 1000000000) {
            decider = "Bulky";
        }

        
        if (mass >= 100) {
            decider2 = "Heavy";
        }

        
        if (decider.equals("Bulky") && decider2.equals("Heavy")) {
            return "Both";
        } else if (decider.equals("Bulky")) {
            return "Bulky";
        } else if (decider2.equals("Heavy")) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}