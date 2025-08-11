plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
    implementation(libs.avaje.jsonb)
    annotationProcessor(libs.avaje.jsonb.generator)}


// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

application {
    // Define the main class for the application.
    mainClass = "com.bitfiddling.App"
}
