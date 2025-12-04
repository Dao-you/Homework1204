import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String filename = "student.txt";
        
        // 寫入檔案
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("學生姓名：王小明\n");
            writer.write("學號：A12345678\n");
            writer.write("成績：85分\n");
            System.out.println("檔案寫入成功！");
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
        }
        
        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\n讀取檔案內容：");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
