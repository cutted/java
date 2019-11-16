public class task2 {

    private int myCX;
    private String myPRLayer;
    private boolean tRes;

    public task2(int fBounds, int cSetting, String uCon){
        tRes = true;
        myCX = cSetting;
        myPRLayer = uCon;
        if (cSetting <= fBounds){
            tRes = false;
        }
    }

    public String getTersonomy(){
        if(tRes == false){
            return myPRLayer + "- disguised";
        }
        return myPRLayer + "- masked";
    }

    public String getMyPRLayer(){
        return myPRLayer;
    }
}
