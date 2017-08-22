import jp.vstone.RobotLib.CRobotMem;
import jp.vstone.RobotLib.CRobotPose;
import jp.vstone.RobotLib.CRobotUtil;
import jp.vstone.RobotLib.CSotaMotion;
import jp.vstone.sotatalk.MotionAsSotaWish;

public class App {
    public static void main(String[] args) {
        CRobotMem memory            = new CRobotMem();
        CSotaMotion motion          = new CSotaMotion(memory);
        MotionAsSotaWish sotawish   = new MotionAsSotaWish(motion);
        sotawish.Say("ハローワールド");
    }
}
