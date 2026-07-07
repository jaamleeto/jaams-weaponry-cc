package net.jaams.weaponry_cc.mixins.common;

import com.teamabnormals.caverns_and_chasms.common.item.silver.KunaiItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(KunaiItem.class)
public class KunaiItemMixin {

    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z"))
    private boolean preventKunaiSpawn(Level level, Entity entity) {
        return false;
    }
}
