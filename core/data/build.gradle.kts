plugins {
    alias(libs.plugins.runner.android.library)
    alias(libs.plugins.runner.jvm.ktor)
}

android {
    namespace = "com.tonio.core.data"

}
dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}