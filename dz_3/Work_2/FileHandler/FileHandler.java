package dz_3.Work_2.FileHandler;

import java.io.*;

public class FileHandler implements Writable {
    @Override
    public boolean save(Object ob, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(ob);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Object read(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void copy(String filePath, String filePathCopy) {
        save(read(filePath), filePathCopy);

    }


}
