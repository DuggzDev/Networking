pipeline {
  agent any

  stages {
    stage("Deploy") {
      steps {
        echo 'Deploying...'
      }
    }
    stage("Test") {
      steps {
        echo 'Testing...'
      }
    }
    stage("Finalizing") {
      steps {
        echo "Finalizing..."
      }
    }
    stage("Checking available images") {
      steps {
        echo bat(returnStdout: true, script: 'docker ps -a')

      }
    }
    stage("Starting linux image") {
      steps {
        echo bat(returnStdout: true, script: 'docker run -it bf1dca6e9a63')
      }
    }
    stage("Check if container is running") {
      steps {
        echo bat(returnStdout: true, script: 'docker ps')
      }
    }
  }
}