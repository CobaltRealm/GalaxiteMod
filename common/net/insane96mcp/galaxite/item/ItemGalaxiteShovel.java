package net.insane96mcp.galaxite.item;

import java.util.List;

import net.insane96mcp.galaxite.Galaxite;
import net.insane96mcp.galaxite.lib.Names;
import net.insane96mcp.galaxite.lib.Properties;
import net.insane96mcp.galaxite.lib.Tooltips;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemGalaxiteShovel extends ItemSpade{
	public ItemGalaxiteShovel(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		setRegistryName(name);
		setCreativeTab(tab);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Galaxite.RESOURCE_PREFIX + Names.GALAXITE_SHOVEL;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if (GuiScreen.isShiftKeyDown()) {
			tooltip.add(I18n.format(Tooltips.Tools.adv_info_increased_efficency, Properties.Tool.endEfficencyBonus));
			tooltip.add(I18n.format(Tooltips.Tools.adv_info_increased_damage, Properties.Tool.endDamageBonus));
		}
		else {
			tooltip.add(I18n.format(Tooltips.Tools.base_info_increased_efficency));
			tooltip.add(I18n.format(Tooltips.Tools.base_info_increased_damage));
			tooltip.add(I18n.format(Tooltips.General.shiftForMore));
		}
	}
}
