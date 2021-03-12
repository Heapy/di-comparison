plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.spring.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))
    implementation("org.springframework:spring-context:5.3.4")
}
