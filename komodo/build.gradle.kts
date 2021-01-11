plugins {
    kotlin("jvm").version("1.4.30-M1")
    application
}

application {
    mainClass.set("org.objectstyle.komodo.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    jcenter()
    maven {
        url = uri("https://dl.bintray.com/heapy/heap-dev")
    }
}

dependencies {
    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("io.heapy.komodo:komodo-di:0.1.0-development+000084")
}
