node {
    stage 'Checkout'
        checkout scm

    stage 'Prepare'
        bat 'nuget restore "HelloWorld4.sln"'
        bat 'nuget install NUnit.Runners -Version 3.2.1 -OutputDirectory testrunner'

    stage 'Build'
        bat "MSBuild.exe /p:Configuration=Release \"HelloWorld4.sln\""
        stage 'Test'
        bat "testrunner\\NUnit.ConsoleRunner.3.2.1\\tools\\nunit3-console.exe HelloWorld4.Tests\\bin\\Release\HelloWorld4.Tests.dll"            
     }