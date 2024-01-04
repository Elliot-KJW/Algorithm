plugins {
    id("java")
    id("com.adarshr.test-logger") version "4.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.assertj:assertj-core:3.22.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>{
    options.encoding = "UTF-8"
}

allprojects {
    apply{
        plugin("com.adarshr.test-logger")
    }
}

tasks{
    test{
        testLogging.showExceptions = true
        useJUnitPlatform()
    }
}

testlogger{
    setTheme("mocha")
}
