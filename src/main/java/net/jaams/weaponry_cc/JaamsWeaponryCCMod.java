package net.jaams.weaponry_cc;

import net.jaams.weaponry_cc.registry.SilverItems;
import net.jaams.weaponry_cc.registry.NecromiumItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(JaamsWeaponryCCMod.MODID)
public class JaamsWeaponryCCMod {

    public static final String MODID = "jaams_weaponry_cc";

    public JaamsWeaponryCCMod(IEventBus bus, ModContainer container) {
        SilverItems.REGISTRY.register(bus);
        NecromiumItems.REGISTRY.register(bus);
    }
}
