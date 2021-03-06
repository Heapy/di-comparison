plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.springboot.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.springframework.boot:spring-boot-starter:2.4.3")
}
