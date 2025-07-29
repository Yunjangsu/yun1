pipeline {
    agent {
        kubernetes {
            label 'docker' // PodTemplate의 라벨과 동일해야 함
            defaultContainer 'docker'
        }
    }
    stages {
        stage('Build') {
            steps {
                container('docker') {
                    sh 'docker version'
                    sh 'docker build -t yunjangsu/app:latest .'
                }
            }
        }
    }
}
