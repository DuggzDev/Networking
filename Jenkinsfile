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
       stage("Checking containers"){
         steps{
            powershell(returnStdout: true, script: 'docker ps')
            echo(powershell)
       }
      }

}
}
