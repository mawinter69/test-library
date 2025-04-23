pipeline {
    agent {
        label 'linuxx86_64'
    }
    stages {
        stage('Test') {
            steps {
              script {
                skippableStage("skip", false) {
                  echo "not skipped"
                }
              }
            }
        }
    }
}