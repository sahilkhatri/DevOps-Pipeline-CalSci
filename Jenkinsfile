pipeline {
    agent any
    stages {
        stage('Declarative Checkout SCM') {
	    steps{
		echo 'This is declarative checkout scm stage'
	    }
	}
	
	stage('Git Pull') {
	    steps{
		echo 'This is Git Pull stage'
	    }
	}

	stage('Maven Build') {
	    steps{
		echo 'This is Maven Build stage'
	    }
	}

	stage('Build Docker Images') {
	    steps{
		echo 'This is Build Docker Images stage'
	    }
	}

	stage('Publish Docker Images') {
	    steps{
		echo 'This is Publish Docker Image stage'
	    }
	}

	stage('Clean Docker Images') {
	    steps{
		echo 'This is Clean Docker Images stage'
	    }
	}

	stage('Deploy and run images') {
	    steps{
		echo 'This is Deploy and run images stage'
	    }
	}

	stage('Declarative Post Actions') {
	    steps{
		echo 'This is Declarative Post Actions stage'
	    }
	}
    }
}
