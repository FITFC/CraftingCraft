package net.blay09.mods.craftingcraft.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.blay09.mods.craftingcraft.CraftingCraft;
import net.blay09.mods.craftingcraft.container.InventoryCraftingContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class InventoryCraftingScreen extends ContainerScreen<InventoryCraftingContainer> {

    private final ResourceLocation texture = new ResourceLocation(CraftingCraft.MOD_ID, "textures/gui/portable_crafting.png");

    public InventoryCraftingScreen(InventoryCraftingContainer container, PlayerInventory playerInventory, ITextComponent displayName) {
        super(container, playerInventory, displayName);
        xSize = 218;
        ySize = 102;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        func_230459_a_(matrixStack, mouseX, mouseY); // renderHoveredTooltip
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mouseX, int mouseY) {
        font.func_243248_b(matrixStack, title, 8, ySize - 96 + 1, 4210752); // drawString
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        Minecraft.getInstance().getTextureManager().bindTexture(texture);
        blit(matrixStack, guiLeft, guiTop, 0, 0, xSize, ySize);
    }

}
