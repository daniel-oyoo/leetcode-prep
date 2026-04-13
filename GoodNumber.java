class GoodNumber {
    public int rotatedDigits(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isGood(int num) {
        boolean hasDifferent = false;
        
        while (num > 0) {
            int digit = num % 10;
            
            // Invalid digits - number is bad immediately
            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }
            
            // Digits that change when rotated (make number "good")
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                hasDifferent = true;
            }
            
            num = num / 10;
        }
        
        // Must have at least one digit that changes
        return hasDifferent;
    }
}
