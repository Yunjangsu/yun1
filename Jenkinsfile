pipeline {
    agent any
    environment {
        DOCKER_HOST = "unix:///run/podman/podman.sock"
    }
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t yunjangsu/app:latest .'
            }
        }
        stage('Push') {
            steps {
                sh 'docker push yunjangsu/app:latest'
            }
        }
    }
}
