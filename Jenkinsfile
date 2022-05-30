pipeline {
  agent any

  stages {
    stage("Checking available images") {
      steps {
        echo bat(returnStdout: true, script: 'docker ps -a')
      }
    }
//     stage("Removing unused containers") {
//       steps {
//         echo bat(returnStdout: true, script: 'docker system prune -a -f')
//
//       }
//     }
    stage("Starting linux image") {
      steps {
        echo bat(returnStdout: true, script: 'docker run -it linux')
      }
    }
    stage("Check if container is running") {
      steps {
        echo bat(returnStdout: true, script: 'docker ps')
      }
    }
  }
}