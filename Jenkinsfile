def IMAGE_ID

pipeline {
  agent any

  stages {
    stage("Checking available images") {
      steps {
        echo bat(returnStdout: true, script: 'docker images')
      }
    }
    stage("Removing unused containers") {
      steps {
        echo bat(returnStdout: true, script: 'docker system prune -a -f')

      }
    }
    stage("Starting linux image") {
      steps {
        echo bat(returnStdout: true, script: 'docker build .')
      }
    }
    stage("Running container from image") {
      steps {
        echo bat(returnStdout: true, script: 'winpty docker run -it 41efda415944')
      }
    }
  }
}