pipeline {
    agent {
        label 'linuxx86_64'
    }
    stages {
        stage('Test') {
            steps {
                println GroovySystem.version
                temporaryScript()
            }
        }
    }
}