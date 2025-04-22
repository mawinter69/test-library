import org.jenkinsci.plugins.docker.workflow.Docker

Docker.Image buildBuilderImage() {
    sh "mkdir -vp empty"
    writeFile file:'empty/Dockerfile', text:'''FROM scratch'''
    def img = docker.build "jenkins-local-image:test", "empty/"
    return img
}

def mytest() {
    Docker.Image img = buildBuilderImage()
    println "img is of type ${img.getClass()}"
}

def call() {
    mytest()
}