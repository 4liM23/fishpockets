import org.gradle.jvm.toolchain.JavaLanguageVersion

plugins {
    kotlin("jvm") version "1.9.22"
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
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

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

javafx {
    version = "17.0.8"
    modules = listOf("javafx.controls")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.scalestest.MainJava")
}

tasks.test {
    useJUnit()
}
