fun main() {
    (1..101).forEach {
        println("""
            @Produces
            @ApplicationScoped
            Service$it provideService$it(Service${it + 1} service) {
                return new DefaultService$it(service);
            }
            
        """.trimIndent())
    }
}
