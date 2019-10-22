import tanvd.kosogor.proxy.publishJar

group = rootProject.group
version = rootProject.version

dependencies {
    api(project(":schema"))

    implementation(kotlin("reflect"))
    implementation(project(":dsl:kotless:lang"))
    implementation(project(":dsl:common:lang-parser-common"))
    implementation(kotlin("compiler-embeddable"))
}

publishJar {
    bintray {
        username = "tanvd"
        repository = "io.kotless"
        info {
            description = "Kotless DSL Parser"
            githubRepo = "https://github.com/JetBrains/kotless"
            vcsUrl = "https://github.com/JetBrains/kotless"
            labels.addAll(listOf("kotlin", "serverless", "web", "devops", "faas", "lambda"))
        }
    }
}
