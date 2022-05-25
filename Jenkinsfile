pipeline{
    agent any

    stages {
        stage("Deploy"){
            steps{
                echo 'Deploying...'
                }
       }
        stage("Test"){
            steps{
                echo 'Testing...'
                 }
       }
       stage("Finalizing"){
            steps{
                echo "Finalizing..."
                }
       }
       stage("Running docker"){
         steps{
                def docker = sh "docker ps -a"
                echo(docker)
       }
      }

}
}
