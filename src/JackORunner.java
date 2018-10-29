public class JackORunner {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 7;
        String[][] faceFeatures = new String[rows][columns];
        JackOLantern pumpkin = new JackOLantern(faceFeatures);
        pumpkin.fill("0");
        pumpkin.edit("X",1,2);
    }
}
