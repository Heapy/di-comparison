fun main() {
    (1..101).forEach {
        println("""
            <bean id="service$it" class="io.heapy.sample.common2.DefaultService$it">
                <constructor-arg ref="service${it + 1}"/>
            </bean>
            
        """.trimIndent())
    }
}
