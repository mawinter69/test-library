def buildBuilderImage(script) {
    sh "mkdir -vp empty"
    writeFile file:'empty/Dockerfile', text:'''FROM scratch'''
    def img = script.docker.build "jenkins-local-image:test", "empty/"
    return img
}

def mytest(script) {
    def img = buildBuilderImage(script)
    println "img is of type ${img.getClass()}"
}

def call(script) {
    mytest(script)
}