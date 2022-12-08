pipeline{
    agent any
    stages{
        stage("Running Appium Sample"){
            steps{
                echo "======== Build Number - %BUILD_NUMBER% ========"
                bat './gradlew build'
            }
        }
    }
    post{
        success{
            echo "======== job executed successfully ========"
        }
        failure{
            echo "======== job execution failed ========"
        }
    }
}