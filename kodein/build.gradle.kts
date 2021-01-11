plugins {
    kotlin("jvm").version("1.4.30-M1")
    application
}

application {
    mainClass.set("org.objectstyle.kodein.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("org.kodein.di:kodein-di-jvm:7.2.0")
}
