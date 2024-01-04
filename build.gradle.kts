plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng:testng:7.1.0")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.assertj:assertj-core:3.22.0")
    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useJUnitPlatform()
}
