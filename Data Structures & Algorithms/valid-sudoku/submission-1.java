class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curVal = board[i][j];
                if (curVal != '.') {
                    String rowToken = curVal + "in row" + i;
                    String colToken = curVal + "in col" + j;
                    String boxToken = curVal + "in box" + i / 3 + "-" + j / 3;

                    if (!seen.add(rowToken) || !seen.add(colToken) || !seen.add(boxToken))
                        return false;
                }
            }
        }
        return true;
    }
}
