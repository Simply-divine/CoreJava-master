package chapter7;

import java.io.*;

public class CustomFileStream {
    private FileOutputStream fileOutputStream;
    private FileInputStream fileInputStream,fin1,fin2;
    private SequenceInputStream seq;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    public void fileoutputstream(File file,String data) throws IOException {
        if(file.exists()&&file.canWrite()){
            fileOutputStream=new FileOutputStream(file,true);
            byte[] b=data.getBytes();
            fileOutputStream.write(b);
            System.out.println("Success.....");
        }
        else{
            throw new IOException("You are not permitted to write in file");
        }
    }
    public void fileinputstream(File file) throws IOException {
        if(file.exists()){
            fileInputStream=new FileInputStream(file);
            int i;
            if(file.canRead()&&file.isFile()&&!file.isHidden()){

                while((i=fileInputStream.read())!=-1){
                    System.out.print((char)i);
                }
            }
            else throw new IOException("file reading permission denied");
        }else{
            throw new FileNotFoundException("No such file found");
        }
    }
    public StringBuffer sequenceinputstream(File file1,File file2) throws IOException {
        StringBuffer stringBuffer=new StringBuffer();
        if(file1.exists()&&file2.exists()) {
            fin1 = new FileInputStream(file1);
            fin2 = new FileInputStream(file2);
            seq = new SequenceInputStream(fin1,fin2);
            int i;
            if(file1.isFile()&&file1.canRead()&&!file1.isHidden()&&file2.isFile()&&file2.canRead()&&!file2.isHidden()){
                while((i =seq.read())!=-1){
                    stringBuffer.append((char)i);
                }
            }
            else{
                throw new IOException("permission to read file denied");
            }
        }else throw new FileNotFoundException("either of the files does not exists");
    return stringBuffer;
    }
    public void transferObject(User user,File file) throws IOException {
        fileOutputStream=new FileOutputStream(file);
        objectOutputStream=new ObjectOutputStream(fileOutputStream);
        if(file.exists()){
            if(file.canWrite()&&file.isFile()){
                objectOutputStream.writeObject(user);
                objectOutputStream.flush();
                objectOutputStream.close();
            }
            else throw new IOException("you have no permission to write");
        }else{
            throw new FileNotFoundException("no such file found");
        }
    }
    public User readObject(File file) throws IOException, ClassNotFoundException {
        User user;
        if(file.exists()) {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            if(file.canRead()&&file.isFile()){
                user = (User) objectInputStream.readObject();
            }else{
                throw new IOException("file read permission denied");
            }

        }else{
            throw new FileNotFoundException("no such file found");
        }
        return user;
    }
    
}
