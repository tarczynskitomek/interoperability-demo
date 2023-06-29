package it.tarczynski.interoperability.demo

import it.tarczynski.interoperability.demo.error.ErrorPolicy
import it.tarczynski.interoperability.demo.error.Policies

class KotlinErrorPolicyClient {

    fun use() {
        // this is illegal in Kotlin, won't compile due to package-private access
        consume(
            Policies.internalErrorPolicy()
                .dependency(Object())
                .build()
        )
    }

    fun consume(policy: ErrorPolicy) {
    }
}
