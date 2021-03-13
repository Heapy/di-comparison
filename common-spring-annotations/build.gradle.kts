plugins {
    kotlin("jvm").version("1.4.31")
}

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib-jdk8"))
    implementation("org.springframework:spring-context:5.3.4")
}
