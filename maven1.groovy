node {
    stage('clone') {
        git branch: "main" , url: "https://github.com/Y1s2r3/Maven-demo.git"
    }
     stage('Build') {
        
        bat "cd initial && mvn clean install"
    }
}
