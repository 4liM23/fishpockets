plugins {
    kotlin("jvm") version "2.3.20"
    application
}

group = "com.scalestest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.scalestest.MainKt")
}

tasks.test {
    useJUnit()
}
