fun main() {
    (100 downTo 1).forEach {
        println("""
            @Provides
            @Singleton
            Service$it provideService$it(Service${it + 1} service) {
                return new DefaultService$it(service);
            }
            
        """.trimIndent())
    }
}
