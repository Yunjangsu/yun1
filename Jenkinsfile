pipeline {
    agent {
        kubernetes {
            label 'docker'
            defaultContainer 'jnlp'
            yaml """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: docker
    image: docker:24.0.7
    command:
    - cat
    tty: true
    volumeMounts:
    - name: docker-socket
      mountPath: /var/run/docker.sock
  volumes:
  - name: docker-socket
    hostPath:
      path: /run/docker.sock
"""
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
