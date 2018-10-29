import java.util.Arrays;

public class JackOLantern {
    private String [][] faceFeatures;

    public JackOLantern (String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public String[][] getFaceFeatures()
    {
        return faceFeatures;
    }

    public void setFaceFeatures(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace ,int row, int column)
    {
        faceFeatures[row][column] = replace;
        faceFeatures[row][column + 2] = replace;
        row = 3;
        column = 1;
        replace = "-";
        for(int i = 0;i<5;i++) {
            faceFeatures[row][column + i] = replace;
        }
        for (int i = 0;i<faceFeatures.length;i++)
        {
            System.out.println(Arrays.deepToString(faceFeatures[i]).replace("[","").replace("]","").replace(",",""));
        }
    }

    public void fill(String str)
    {
        for (int i = 0;i<5;i++)
        {
            faceFeatures[i][0] = "";
            for (int j = 0;j<7;j++)
            {
                faceFeatures[i][j] = str;
            }
        }
        faceFeatures[0][0] = " ";
        faceFeatures[0][6] = "";
        faceFeatures[4][0] = "";
        faceFeatures[4][1] = "";
    }

    public String toString()
    {
        String pumpkin = "";
        for(int i = 0;i<faceFeatures.length;i++)
        {
            for(int j = 0;j<faceFeatures[i].length;j++)
            {
                System.out.println(faceFeatures[i]);
            }
        }
        return pumpkin;
    }
}
