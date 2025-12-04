import java.util.*;

public class LotteryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> participants = new ArrayList<>();
        
        System.out.println("=== 隨機抽獎系統 ===");
        System.out.print("請輸入參加人數：");
        int count = scanner.nextInt();
        scanner.nextLine(); // 清除換行符號
        
        // 輸入參加者名單
        for (int i = 0; i < count; i++) {
            System.out.print("請輸入第 " + (i + 1) + " 位參加者姓名：");
            String name = scanner.nextLine();
            participants.add(name);
        }
        
        System.out.println("\n參加者名單：" + participants);
        
        System.out.print("\n請輸入要抽出的得獎人數：");
        int winnerCount = scanner.nextInt();
        
        if (winnerCount > participants.size()) {
            System.out.println("得獎人數不能超過參加人數！");
            scanner.close();
            return;
        }
        
        // 打亂名單並抽獎
        Collections.shuffle(participants);
        
        System.out.println("\n🎉 恭喜以下得獎者 🎉");
        for (int i = 0; i < winnerCount; i++) {
            System.out.println("第 " + (i + 1) + " 名得獎者：" + participants.get(i));
        }
        
        scanner.close();
    }
}
