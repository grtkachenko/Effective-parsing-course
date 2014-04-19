import org.StructureGraphic.v1.DSTreeNode;
import org.StructureGraphic.v1.DSutils;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    public void solve() throws IOException {
        try {
            Tree tree = new Parser().parse(new FileInputStream("input.txt"));
            DSutils.show(tree, 100, 50);
            System.out.println(tree);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            in = new FastScanner(new File("input.txt"));
            out = new PrintWriter(new File("output.txt"));
            solve();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public static void main(String[] arg) {
        new Main().run();
    }
}