package it.tarczynski.interoperability.demo.error;

import lombok.Builder;

/**
 * A package-private class exposes a public builder class via Lombok annotation.
 */
@Builder
class InternalErrorHandlerPolicy implements ErrorPolicy {

    private final Object dependency;
}
