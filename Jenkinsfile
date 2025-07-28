pipeline {
    agent {
        kubernetes {
            label 'docker'
            defaultContainer 'jnlp'
        }
    }
    stages {
        stage('Build Docker Image') {
            steps {
                container('docker') {
                    sh 'docker version'
                    sh 'docker build -t yunjangsu/app:latest .'
                }
            }
        }
    }
}
