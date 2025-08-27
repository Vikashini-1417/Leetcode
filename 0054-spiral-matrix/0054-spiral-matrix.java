class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++; // move top boundary down

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // move right boundary left

            // Traverse bottom row if still valid
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--; // move bottom boundary up
            }

            // Traverse left column if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return list;
    }
}
