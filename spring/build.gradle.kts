plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.spring.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("org.springframework:spring-context:5.3.4")
}
