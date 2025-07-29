pipeline {
    agent {
        kubernetes {
            label 'podman'  // GUI에서 등록한 PodTemplate 라벨과 일치해야 함
            defaultContainer 'podman'
        }
    }
    stages {
        stage('Build with Podman') {
            steps {
                container('podman') {
                    sh 'podman --version'
                    sh 'podman build -t yunjangsu/app:latest .'
                    // 필요시 podman push 등 추가
                }
            }
        }
    }
}
