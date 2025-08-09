import mawinter69.MsBuild.Platform
def call(String config = "Release", Platform platform = Platform.ANYCPU) {
       echo("echo Platform=${platform.toString()}")
}

