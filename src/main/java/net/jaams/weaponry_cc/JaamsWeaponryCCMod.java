package net.jaams.weaponry_cc;

import net.jaams.weaponry_cc.registry.SilverItems;
import net.jaams.weaponry_cc.registry.NecromiumItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("jaams_weaponry_cc")
public class JaamsWeaponryCCMod {

    public static final String MODID = "jaams_weaponry_cc";

    public JaamsWeaponryCCMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SilverItems.REGISTRY.register(bus);
        NecromiumItems.REGISTRY.register(bus);
    }
}
