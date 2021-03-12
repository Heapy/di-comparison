plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("io.heapy.komodo.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.kotlin.link")
    }
}

dependencies {
    implementation(project(":common-deep"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.heapy.komodo:komodo-di:0.1.0-development.000092")
}
