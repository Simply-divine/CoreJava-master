package chapter7;

import java.io.*;
import java.security.PermissionCollection;

/**
 * FileStream Demo class
 */
public class FileStreamDemo {
	private FileInputStream fin, fin2;
	private FileOutputStream fout;
	private SequenceInputStream seq;
	private ObjectOutputStream objectOutputStream;
	private ObjectInputStream objectInputStream;
	private Writer writer;
	private StringBuffer stringBuffer = new StringBuffer();
	private Reader reader;
	private PrintStream printStream;
	/**
     * @param file takes file as an arguments
     * @param Data takes data to write in the file
     * @throws IOException
     */
	void fileoutputstream (File file, String Data) throws IOException {
        try {
			fout = new FileOutputStream(file, true);
            String s = Data;
			byte[] b = s.getBytes();//converting string into byte array
            fout.write(b);
            System.out.println("success...");
        } catch (Exception e) {
            throw new IOException("File Write Error");
		} finally {
			fout.flush();
			fout.close();
		}
    }
    
    /**
     * FileOutputStream needs one parameter as file and return data as StringBuffer
     *
     * @param file takes file as an arguments
     * @return string buffer
     * @throws IOException
     */
    StringBuffer fileinputstream (File file) throws IOException {
        StringBuffer s = new StringBuffer();
        try {
            fin = new FileInputStream(file);
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i = 0;
            /*
             * Reads the file to the EOF
             * */
			int stop = bin.available();
	
			System.out.println(bin.markSupported());
			while ((i = bin.read()) != -1) {
                /*
                 * Append the characters into the Buffer
                 * */
				if (bin.markSupported()) {
					s.append((char) i);
				}
			}
			bin.close();
            System.out.println("success...");
        } catch (FileNotFoundException e) {
            System.err.println("Given file " + file + " not Found!");
        } catch (IOException e) {
            throw new IOException("File Read Error");
        }
        return s;
    }
    
    StringBuffer seqinputstream (File file1, File file2) throws IOException {
        StringBuffer s = new StringBuffer();
        try {
            fin = new FileInputStream(file1);
            fin2 = new FileInputStream(file2);
            seq = new SequenceInputStream(fin, fin2);
			//String data[] = {"sumit","more"};
            int i = 0;
            /*
             * Reads the file to the EOF
             * */
            while ((i = seq.read()) != -1) {
                /*
                 * Append the characters into the Buffer
                 * */
                s.append((char) i);
            }
            fin.close();
            fin2.close();
            seq.close();
            System.out.println("success...");
        } catch (FileNotFoundException e) {
            System.err.println("Given file " + file1 + "/" + file2 + " not Found!");
        } catch (IOException e) {
            throw new IOException("File Read Error");
        }
        return s;
    }
	
	void transferObject (User user, File file) throws IOException {
    	if(file.isFile()&&file.canWrite()) {
			try {
				fout = new FileOutputStream(file);
				objectOutputStream = new ObjectOutputStream(fout);
				try {
					objectOutputStream.writeObject(user);
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
		}else throw new IOException("error reading file  ");
	}
	
	User readObject (File file) {
		User user = null;
		try {
			fin = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fin);
			try {
				user = (User) objectInputStream.readObject();
			} catch (Exception e) {
				System.out.println("Object parsing Err: " + e.getMessage());
			} finally {
				//objectInputStream.flush();
				objectInputStream.close();
				fout.close();
			}
		} catch (Exception e) {
			System.out.println("File parsing Err: " + e.getMessage());
		}
		return user;
	}
	
	void fileWriterWithAppend (File file, String Data) {
		try {
			FilePermission file1 = new FilePermission(file.toString(), "read,write");
			PermissionCollection permission = file1.newPermissionCollection();
			permission.add(file1);
			if (permission.implies(new FilePermission(file.toString(), "read,write"))) {
				writer = new FileWriter(file, true);
				writer.append("\n" + Data);
				writer.close();
				System.out.println("File writing done");
			} else {
				throw new IOException("File permission is not granted.");
			}
/*
			writer = new FileWriter(file,true);
			writer.append(Data);
			writer.close();
*/
		} catch (Exception e) {
			System.err.println("Error : " + e);
		}
	}
	
	StringBuffer fileReader (File file) {
		try {
			reader = new FileReader(file);
			int data;
			while ((data = reader.read()) != -1) {
				stringBuffer.append((char) data);
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		return stringBuffer;
	}
	
	void fileprintstream (File file, String Data) throws IOException {
		try {
			fout = new FileOutputStream(file);
			printStream = new PrintStream(fout);
			printStream.println(Data);
			printStream.println(Data);
			printStream.println(Data);
			fout.flush();
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			throw new IOException("File Write Error");
		}
	}
}
