package org.j4g.effectivejava;

/**
 * Explanation and Samples of a Static Factory Pattern.
 */
public class StaticFactory {

    private StaticFactory() {

    }

    private static StaticFactory SINGLETON = new StaticFactory();

    private static class SpecialStaticFactory extends StaticFactory {}

    /**
     * Advantage 1: Static methods have names and they can be distinguished even if they have the same
     * parameter combination.
     */
    public static StaticFactory getRemoteFactory(String remoteURL, int maxInstances, int retries) {
        return new StaticFactory();
    }

    /**
     * Advantage 1: Code is more readable and meaningful with names, as per Chapter 2 of Clean Code book suggest.
     */
    public static StaticFactory createLocalizableFactory(int maxInstances, String label, int port) {
        return new StaticFactory();
    }

    /**
     * Advantage 2: You are not required to create an instance on each invoke.
     */
    public static StaticFactory localFactory() { return SINGLETON; }

    /**
     * Advantage 3: You are not required to create an instance of the class but a subclass.
     */
    public static StaticFactory specialStaticFactory() { return new SpecialStaticFactory(); }
}
