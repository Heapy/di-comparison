fun main() {
    (1..101).forEach {
        println("""
            @Provides
            @Singleton
            Service$it provideService$it(Service${it + 1} service) {
                return new DefaultService$it(service);
            }
            
        """.trimIndent())
    }
}
