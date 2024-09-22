package pichyy.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.CameraType;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LockProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		if (Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
			Minecraft.getInstance().options.setCameraType(CameraType.THIRD_PERSON_BACK);
		}
	}
}
