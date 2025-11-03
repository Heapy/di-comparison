fun main() {
    (1..101).forEach {
        println("""
            @Bean
            public Service$it service$it(Service${it + 1} service) {
                return new DefaultService$it(service);
            }
            
        """.trimIndent())
    }
}
