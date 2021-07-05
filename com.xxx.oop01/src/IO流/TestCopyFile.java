package IO流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyFile {
    public static void copyDirecotry(File fromDir, File toDir) throws Exception {
        // File f = new File(fromDir.getName());
        toDir.mkdir();
        if (fromDir.isDirectory()) {
            File[] Dirname = fromDir.listFiles();

            for (int i = 0; i < Dirname.length; i++) {
                if (Dirname[i].isDirectory()) {
                    copyDirecotry(Dirname[i], new File(toDir.getAbsoluteFile()
                            + "\\" + Dirname[i].getName()));
                } else {
                    copyFile(Dirname[i], Dirname[i].getName());
                }
            }
        }
    }

    public static void copyFile(File fromFile, String toFile)
            throws IOException {
        FileReader from = new FileReader(fromFile);
        File ff = new File(toFile);
        if (!ff.exists()) {
            ff.createNewFile();
        }
        FileWriter to = new FileWriter(ff);
        char[] ch = new char[(int) fromFile.length()];
        while (from.read(ch) != -1)
            ;
        from.close();
        to.write(ch);
        to.flush();
        to.close();
        //System.out.println("文件成功复制！！！");
    }

    public static void main(String[] args) throws Exception {
        String getFile = System.getProperty("user.dir");
        File fromDir = new File(getFile + File.separator + "bin");
        File toDir = new File(getFile + File.separator + "bin1");
        if(toDir!=null) System.out.println(toDir);//D:\Program Files\MyEclipseProject\Exercise\bin1
        if(!toDir.isDirectory())  toDir.mkdirs();    //记得要写这一句
        copyDirecotry(fromDir, toDir);//函数名首字母小写

    }

}