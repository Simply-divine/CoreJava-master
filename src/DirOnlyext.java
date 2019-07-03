import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
class OnlyExt implements FilenameFilter {
    String ext;
    OnlyExt(String ext){
        this.ext="."+ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
public class DirOnlyext {


    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/hardik/IdeaProjects/CoreJava-master/src/chapter7/txt");
        if(file.isDirectory()){
            String s[]=file.list();
            for (int i = 0; i <s.length ; i++) {
                File f=new File("/home/hardik/IdeaProjects/CoreJava-master/src/chapter7/txt"+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println("its a directory");
                }
                else {
                    if(f.isFile()){
                        OnlyExt o=new OnlyExt("txt");
                        System.out.println("the txt extension of the file "+f.getName()+" is "+o.accept(f, f.getName()));
                    }
                    else throw new FileNotFoundException();
                }
            }
        }
    }
}
