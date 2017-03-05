
public class NamesHolder {
    private static final int MAX = 100;

    private String[] names = new String[MAX];
    private int size = 0;

    public void add(String name) throws DuplicateException {
        if (!contains(name)) {
            names[size] = name;
            size++;
        } else {
            throw new DuplicateException();
        }

    }

    public boolean contains(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(name))
                return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}