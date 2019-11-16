public class task4 {

    private int myCX;
    private String myPRLayer;
    private boolean tRes;
    private int getTCount;

    public task4(int fBounds, int cSetting, String uCon) {
        tRes = true;
        myCX = cSetting;
        myPRLayer = uCon;
        if (cSetting <= fBounds) {
            tRes = false;
        }
    }

    public String getTersonomy() {
        getTCount += 1;
        // tRes switch if tRes = true switch to false
        if (tRes == true){
            tRes = false;
        }
        // else tRes is already false so switch to true
        else
            tRes = true;

        if (tRes == false) {
            return myPRLayer + "- disguised";
        }
        return myPRLayer + "- masked";
    }

    public String getMyPRLayer() {
        return myPRLayer;
    }

    public void update(int fBounds, int cSetting){
        // when count = 0 do this
        if (getTCount == 0){
            if (cSetting <= fBounds){
                tRes = false;
            }
        }
        // when count is higher than 1 and divides by 2 (even) do this
        else if (getTCount > 1 && getTCount / 2 == 0){
            if (cSetting > fBounds){
                tRes = false;
            }
        }
        // else count is odd so do this
        else{
            if (cSetting <= fBounds){
                tRes = false;
            }
        }
    }
}
