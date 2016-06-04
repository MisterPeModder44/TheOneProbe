package mcjty.theoneprobe.apiimpl;

import mcjty.theoneprobe.api.IProbeConfig;

public class LazyProbeConfig implements IProbeConfig {

    private IProbeConfig original;
    private boolean dirty = false;

    public LazyProbeConfig(IProbeConfig original) {
        this.original = original;
    }

    private IProbeConfig realCopy() {
        if (!dirty) {
            dirty = true;
            original = new ProbeConfig()
                    .setRFMode(original.getRFMode())
                    .showChestContents(original.getShowChestContents())
                    .showCropPercentage(original.getShowCropPercentage())
                    .showHarvestLevel(original.getShowHarvestLevel())
                    .showMobHealth(original.getShowMobHealth())
                    .showMobPotionEffects(original.getShowMobPotionEffects())
                    .showRedstone(original.getShowRedstone());
        }
        return original;
    }

    @Override
    public IProbeConfig setRFMode(int showRF) {
        realCopy().setRFMode(showRF);
        return this;
    }

    @Override
    public int getRFMode() {
        return original.getRFMode();
    }

    @Override
    public IProbeConfig showHarvestLevel(ConfigMode mode) {
        realCopy().showHarvestLevel(mode);
        return this;
    }

    @Override
    public ConfigMode getShowHarvestLevel() {
        return original.getShowHarvestLevel();
    }

    @Override
    public IProbeConfig showCropPercentage(ConfigMode mode) {
        realCopy().showCropPercentage(mode);
        return this;
    }

    @Override
    public ConfigMode getShowCropPercentage() {
        return original.getShowCropPercentage();
    }

    @Override
    public IProbeConfig showChestContents(ConfigMode mode) {
        realCopy().showChestContents(mode);
        return this;
    }

    @Override
    public ConfigMode getShowChestContents() {
        return original.getShowChestContents();
    }

    @Override
    public IProbeConfig showRedstone(ConfigMode mode) {
        realCopy().showRedstone(mode);
        return this;
    }

    @Override
    public ConfigMode getShowRedstone() {
        return original.getShowRedstone();
    }

    @Override
    public IProbeConfig showMobHealth(ConfigMode mode) {
        realCopy().showMobHealth(mode);
        return this;
    }

    @Override
    public ConfigMode getShowMobHealth() {
        return original.getShowMobHealth();
    }

    @Override
    public IProbeConfig showMobPotionEffects(ConfigMode mode) {
        realCopy().showMobPotionEffects(mode);
        return this;
    }

    @Override
    public ConfigMode getShowMobPotionEffects() {
        return original.getShowMobPotionEffects();
    }
}