package chapter6;

import chapter7.User;

import java.io.*;

class FileTransfer<T> {
    FileOutputStream fout;
    BufferedOutputStream bout;
    FileInputStream fin;
    BufferedInputStream bin;
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    void transferObject(T data, File file) throws IOException {
        if(!file.exists()) {
            file.createNewFile();
        }

        try {
            fout = new FileOutputStream(file);
            bout = new BufferedOutputStream(fout);
            objectOutputStream = new ObjectOutputStream(bout);
            try {
                objectOutputStream.writeObject(data);
            } catch (Exception e) {
                System.out.println("Object parsing Err: " + e.getMessage());
            } finally {
                objectOutputStream.flush();
                objectOutputStream.close();
                fout.close();
            }
        } catch (Exception e) {
            System.out.println("File parsing Err: " + e.getMessage());
        }
    }

    T readObject (File file) {
        T data = null;
        try {
            fin = new FileInputStream(file);
            bin = new BufferedInputStream(fin);
            objectInputStream = new ObjectInputStream(bin);
            try {
                data =  (T) objectInputStream.readObject();
            } catch (Exception e) {
                System.out.println("Object parsing Err: " + e.getMessage());
            } finally {
                objectInputStream.close();
                fout.close();
            }
        } catch (Exception e) {
            System.out.println("File parsing Err: " + e.getMessage());
        }
        return data;
    }

    public static void main(String[] args) {
        User user;
        FileTransfer<User> fileTransfer = new FileTransfer<>();
        File file = new File("/home/hardik/IdeaProjects/CoreJava-master/src/chapter6/user.txt");
        try {
            fileTransfer.transferObject(new User(1,"sumit"),file);
            if(fileTransfer.readObject(file) != null){
                user = fileTransfer.readObject(file);
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

