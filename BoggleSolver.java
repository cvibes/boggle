public class BoggleSolver
{
    TrieST<Integer> st;
    public BoggleSolver(String[] dictionary) {
        st = new TrieST<Integer>();        
        for (int i = 0; i < dictionary.length; i++)
            st.put(dictionary[i], scoreOf(dictionary[i]));
    }

    public Iterable<String> getAllValidWords(BoggleBoard board) {
        return new Bag<String>();
    }

    public int scoreOf(String word) {
        return 0;
    }

    public static void main(String[] args) {
    }
}
