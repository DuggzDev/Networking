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
       stage("Dockerfile"){
       steps{
       dockerfile {
               filename 'Dockerfile.build'
               dir 'build'
               label 'my-defined-label'
               registryUrl 'https://myregistry.com/'
               registryCredentialsId 'myPredefinedCredentialsInJenkins'
               }
       }
      }

}
}
