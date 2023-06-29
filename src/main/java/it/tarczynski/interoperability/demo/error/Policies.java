package it.tarczynski.interoperability.demo.error;


public class Policies {

    /**
     * A factory helper class exposes a public static class via a reference to the package private
     * class.
     */
    public static InternalErrorHandlerPolicy.InternalErrorHandlerPolicyBuilder internalErrorPolicy() {
        return InternalErrorHandlerPolicy.builder();
    }
}
