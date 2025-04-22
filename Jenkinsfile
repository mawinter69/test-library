pipeline {
    agent {
        label 'linuxx86_64'
    }
    stages {
        stage('Test') {
            steps {
              script {
                println GroovySystem.version
                temporaryScript.mytest()
              }
            }
        }
    }
}