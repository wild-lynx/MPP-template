# MPP-template

Kotlin MPP template with `JVM`, `JS`, `Android Lib` and `Android App` modules `expected by` a single `common` one. In addition, there is a plain `JVM` module which depends on the platform `JVM` module. The project contains a dummy multiplatfrom test

`gradle.properties` contains information about all the plugin versions used in the project modules
`local.properties` contains path to Android NDK and SDK —- you have to specify it with your own one
`settings.gradle` is about all the necessary repositories and included modules —- on addition of a new module to the project, don't forget to add its name there

`build.gradle` files for `android-lib`, `MPP-template-common`, `MPP-template-jvm`, `MPP-template-js` modules contain `publishing` sections, which are related to the publishing to the local Maven repository. To publish modules as libraries, specify all the parameters (e.g. artifact `group` or `version`) in the corresponding build file, `clean build` the project and then execute `publishToMavenLocal` task. To use such artifacts in another project, don't forget to add `mavenLocal()` repository.
