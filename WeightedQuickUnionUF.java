public class WeightedQuickUnionUF {
    private int[] parent;
    private int[] size;

    public WeightedQuickUnionUF(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) return;
        if(size[rootP] < size[rootQ]) { parent[rootP] = rootQ; size[rootQ] += size[rootP];}
        else                          { parent[rootQ] = rootP; size[rootP] += size[rootQ];}

    }

    public int root(int p) {
        while (parent[p] != p) { p = parent[p]; }
        return p;
    }
}
