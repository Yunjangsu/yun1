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
        sh 'chmod +x ./gradlew'
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
