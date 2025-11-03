import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    (1..101).forEach {
        println("""
            binder.bind(Service$it.class).toProvider(ServiceProvider$it.class);
        """.trimIndent())

        generateProvider(it)
    }
}

fun generateProvider(it: Int) {
    Files.write(
        Paths.get("./cayennedi-deep/src/main/java/org/objectstyle/cayenne/ServiceProvider$it.java"),
        """
            package io.heapy.cayenne;

            import io.heapy.sample.common2.*;
            import org.apache.cayenne.di.DIRuntimeException;
            import org.apache.cayenne.di.Inject;
            import org.apache.cayenne.di.Provider;

            public class ServiceProvider$it implements Provider<Service$it> {

                @Inject
                private Service${it + 1} service;

                @Override
                public Service${it} get() throws DIRuntimeException {
                    return new DefaultService${it}(service);
                }
            }
        """.trimIndent().toByteArray(),
        StandardOpenOption.CREATE,
        StandardOpenOption.TRUNCATE_EXISTING
    )
}
