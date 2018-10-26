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

    public void edit(String replace,int row, int column)
    {

    }

    public void fill(String str)
    {

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
