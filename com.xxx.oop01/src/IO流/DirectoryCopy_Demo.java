package IO流;
import java.io.*;

//目录拷贝
public class DirectoryCopy_Demo {
    public static void main(String[] args) {
        File srcFile = new File("E:\\MarkDown笔记文件\\");
        File desFile = new File("F:\\");
        copyDir(srcFile,desFile);
    }

    public static void copyDir(File srcFile,File desFile){
        if(srcFile.isFile()){
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(srcFile);
                String path2 = desFile + srcFile.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path2);
                byte[] by = new byte[1024*1024];
                int count = 0;
                while((count = fis.read(by))!= -1){
                    fos.write(by,0,count);
                }
                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] files = srcFile.listFiles();
        for(File f : files){
            if(f.isDirectory()){
                //System.out.println(f.getAbsolutePath());
                String srcDir = f.getAbsolutePath();
                String desDir = desFile + srcDir.substring(3);
                //System.out.println(desDir);
                File newfile = new File(desDir);
                if(!newfile.exists()){
                    newfile.mkdirs();
                }
            }
            copyDir(f,desFile);
        }

    }
}
