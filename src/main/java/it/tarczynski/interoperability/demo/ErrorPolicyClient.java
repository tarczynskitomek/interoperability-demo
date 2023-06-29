package it.tarczynski.interoperability.demo;

import it.tarczynski.interoperability.demo.error.ErrorPolicy;
import it.tarczynski.interoperability.demo.error.Policies;

class ErrorPolicyClient {

    public void use() {
        // this is legal in Java
        consumer(
                Policies.internalErrorPolicy()
                        .dependency(new Object())
                        .build()
        );

        // this is illegal though:
        // final InternalErrorHandlerPolicy police = Policies
        //        .internalErrorPolicy().build();
    }

    private void consumer(ErrorPolicy errorPolicy) {
    }
}
