pipeline {
  agent {
    kubernetes {
      yamlFile 'jenkins/k8s-agent.yaml' // 필요 시
    }
  }

  environment {
    IMAGE_NAME = "yunjangsu/test"
    TAG = "${env.BUILD_NUMBER}"
  }

  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/Yunjangsu/yun1'
      }
    }

    stage('Build JAR') {
      steps {
        sh './gradlew clean build -x test'
      }
    }

    stage('Build Docker Image') {
      steps {
        sh """
        docker build -t docker.io/${IMAGE_NAME}:${TAG} .
        echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin
        docker push docker.io/${IMAGE_NAME}:${TAG}
        """
      }
    }

    stage('Update Manifest') {
      steps {
        sh """
        git config --global user.email "jenkins@example.com"
        git config --global user.name "Jenkins"
        git clone https://github.com/Yunjangsu/k8s-manifests.git
        cd k8s-manifests

        yq eval '.spec.template.spec.containers[0].image = "${IMAGE_NAME}:${TAG}"' -i deployment.yaml

        git add .
        git commit -m "Update image to ${IMAGE_NAME}:${TAG}"
        git push https://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@github.com/Yunjangsu/k8s-manifests.git HEAD:main
        """
      }
    }
  }
}
