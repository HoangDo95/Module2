package ss16_steam.bai_tap.copy_file_c2;
import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException{
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("src/ss16_steam/bai_tap/copy_file/file1.csv"));
            outStream = new FileOutputStream(new File("src/ss16_steam/bai_tap/copy_file/file2.csv"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inStream.close();
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
