package dependencies

object Dependencies {

    //path to common dependencies (disscussed later)
    private const val path = "../commonFiles/gradleScript/"
    const val common = "${path}common.gradle"

    //path to local dependencies (disscussed later)
    const val dependency = "./gradleScript/dependencies.gradle"

    object Module {
        //Add your modules here
        const val data = ":data"
        const val cache = ":cache"
        const val remote = ":remote"
    }

}