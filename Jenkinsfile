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
    stage("Checking containers") {
      steps {
        echo bat(returnStdout: true, script: 'docker ps -a')

      }
    }
    stage("Starting linux image") {
      steps {
        echo bat(returnStdout: true, script: 'docker run bf1dca6e9a63')
      }
    }
  }
}