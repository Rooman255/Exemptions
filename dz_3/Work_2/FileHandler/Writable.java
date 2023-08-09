package dz_3.Work_2.FileHandler;

public interface Writable {
    public boolean save(Object ob, String filePath);

    public Object read(String filePath);

    public void copy(String filePath, String filePath1);
}