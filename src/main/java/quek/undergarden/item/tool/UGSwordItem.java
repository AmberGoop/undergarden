package quek.undergarden.item.tool;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import quek.undergarden.registry.UGItems;

import java.util.List;

public class UGSwordItem extends SwordItem {

	public UGSwordItem(Tier tier, Properties properties) {
		super(tier, properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
		if (stack.getItem() == UGItems.FROSTSTEEL_SWORD.get()) {
			tooltip.add(Component.translatable("tooltip.undergarden.froststeel_weapon").withStyle(ChatFormatting.AQUA));
		}
		if (stack.getItem() == UGItems.UTHERIUM_SWORD.get()) {
			tooltip.add(Component.translatable("tooltip.undergarden.utherium_weapon").withStyle(ChatFormatting.RED));
		}
		if (stack.getItem() == UGItems.FORGOTTEN_SWORD.get()) {
			tooltip.add(Component.translatable("tooltip.undergarden.forgotten_weapon").withStyle(ChatFormatting.GREEN));
		}
	}
}