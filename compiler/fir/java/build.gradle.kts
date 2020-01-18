
plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    compile(project(":compiler:frontend.common"))
    compile(project(":compiler:frontend.java"))
    compile(project(":compiler:fir:resolve"))
    implementation(project(":compiler:fir:jvm"))

    compileOnly(intellijCoreDep()) { includeJars("intellij-core") }
}


sourceSets {
    "main" { projectDefault() }
    "test" {}
}

val compileKotlin: org.jetbrains.kotlin.gradle.tasks.KotlinCompile by tasks
compileKotlin.kotlinOptions.freeCompilerArgs += "-Xno-use-ir"
