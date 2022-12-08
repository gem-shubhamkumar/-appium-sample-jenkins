pipeline{
    agent any

    tools {
        gradle 'Gradle-8.0-m4'
    }


    stages{
        stage("Running Appium Sample"){
            steps{
                bat 'echo ======== Build Number - %BUILD_NUMBER% ========'
                bat './gradlew build'
            }
        }
    }
    post{
        always{
            bat './gradlew reports'
            publishHTML(
                [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: false,
                    reportDir: 'target/site/serenity',
                    reportFiles: 'serenity-summary.html',
                    reportName: 'Serenity Summay Report',
                    reportTitles: 'Serenity Summay Report',
                    useWrapperFileDirectly: true
                ]
            )
            publishHTML(
                [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: false,
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'Serenity Detailed Report',
                    reportTitles: 'Serenity Detailed Report',
                    useWrapperFileDirectly: true
                ]
            )
        }
        success{
            echo "======== job executed successfully ========"
        }
        failure{
            echo "======== job execution failed ========"
        }
    }
}