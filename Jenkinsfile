pipeline {
    agent {
        kubernetes {
            label 'podman'  // GUI에서 등록한 PodTemplate 라벨과 일치해야 함
            defaultContainer 'podman'
        }
    }
    stages {
        stage('Build JAR') {
            steps {
                container('podman') {
                    // podman 관련 명령어 주석 처리
                    // sh 'podman --version'
                    // sh 'podman build -t yunjangsu/app:latest .'

                    // jar 파일 빌드 (예: Maven 사용 시)
                    sh 'mvn clean package'

                    // gradle 사용 시 아래처럼 변경
                    // sh './gradlew clean build'
                }
            }
        }
    }
}
