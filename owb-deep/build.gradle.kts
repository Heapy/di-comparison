plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.owb.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.apache.geronimo.specs:geronimo-annotation_1.3_spec:1.0")
    implementation("org.apache.geronimo.specs:geronimo-atinject_1.0_spec:1.0")
    implementation("org.apache.geronimo.specs:geronimo-jcdi_2.0_spec:1.0")
    implementation("org.apache.geronimo.specs:geronimo-interceptor_1.2_spec:1.0")
    implementation("org.apache.openwebbeans:openwebbeans-impl:2.0.16")
    implementation("org.apache.openwebbeans:openwebbeans-spi:2.0.16")
    implementation("org.apache.openwebbeans:openwebbeans-se:2.0.16")
}
