package cn.shadownullwow.omegaclient.modules.modules.movement;

import cn.shadownullwow.omegaclient.events.MotionUpdateEvent;
import cn.shadownullwow.omegaclient.modules.Module;
import cn.shadownullwow.omegaclient.modules.ModuleCategory;
import com.darkmagician6.eventapi.EventTarget;

public class Sprint extends Module {

    public Sprint() {
        super("Sprint", "Auto sprint when you move.", ModuleCategory.MOVEMENT);
    }

    @EventTarget
    public void onMove(MotionUpdateEvent event) {
        if(mc.thePlayer.moveForward > 0) {
            mc.thePlayer.setSprinting(true);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.thePlayer.setSprinting(false);
    }

}
