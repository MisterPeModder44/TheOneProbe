package mcjty.theoneprobe.api;

/**
 * Main interface for this mod. Use this to build probe information
 * Get a reference to an implementation of this interface by calling:
 *         FMLInterModComms.sendFunctionMessage("theoneprobe", "getTheOneProbe", "<whatever>.YourClass$GetTheOneProbe");
 */
public interface ITheOneProbe {

    /**
     * Optionally register a provider for your probe information. You don't have to do this. You
     * can also implement IProbeInfoAccessor in your block instead.
     * @param provider
     */
    void registerProvider(IProbeInfoProvider provider);

    /**
     * Create a new probe info object.
     */
    IProbeInfo create();
}
