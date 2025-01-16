class Solution {
    int[][] dxy = {{1,0}, {0,1}, {-1,0}, {0,-1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void fill(int[][] image, int x, int y, int color, int start) {
        if(image[x][y] != start) return;
        image[x][y] = color;

        for (int[] dir : dxy) {
            if(valid(x + dir[0], y + dir[1], image)) {
                fill(image, x + dir[0], y + dir[1], color, start);
            }
        }
    }

    public boolean valid(int x, int y, int[][] image) {
        if (x >= image.length || y >= image[0].length || x < 0 || y < 0) return false;
        return true;
    }
}