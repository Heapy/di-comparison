plugins {
    kotlin("jvm").version("1.4.31")
    application
}

application {
    mainClass.set("org.objectstyle.jvm.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
