pipeline {
  agent any

  stages {
    stage('Clone') {
      steps {
        checkout scm
        sh 'echo ✅ 코드 클론 완료'
      }
    }

    stage('Build JAR') {
      steps {
        //권한부여
        chmod +x ./gradlew 
        // 별도의 하위 경로 지정 없이 최상위에서 실행
        sh './gradlew clean build'
      }
    }

    stage('Build Docker Image') {
      steps {
        sh 'docker build -t yunjangsu/app:latest .'
      }
    }
  }
}
