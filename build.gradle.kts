plugins {
    id("hydraulic.build-logic")

    id("architectury-plugin") version("3.4-SNAPSHOT")
    id("dev.architectury.loom") version("0.12.0-SNAPSHOT") apply(false)
}

val platforms = setOf(
    projects.fabric,
    projects.forge,
    projects.shared
).map { it.dependencyProject }

subprojects {
    apply {
        plugin("java-library")
        plugin("hydraulic.build-logic")
    }

    when (this) {
        in platforms -> plugins.apply("hydraulic.platform-conventions")
        else -> plugins.apply("hydraulic.base-conventions")
    }
}

allprojects {
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    repositories {
        mavenCentral()

        maven("https://repo.opencollab.dev/main")
        maven("https://jitpack.io") {
            content {
                includeGroupByRegex("com\\.github\\..*")
            }
        }

        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}