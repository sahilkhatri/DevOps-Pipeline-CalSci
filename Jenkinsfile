pipeline {
    agent any
    stages {	
	stage('Git Pull') {
	    steps{
		git url: 'https://github.com/sahilkhatri/DevOps-Pipeline-CalSci.git', branch: 'main'
		echo 'This is Git Pull stage'
	    }
	}

	stage('Maven Build') {
	    steps{
		sh "mvn clean package"
                echo 'This is Maven Build stage'
	    }
	}

	stage('Build Docker Images') {
	    steps{
		sh "docker build -t ascay/devopsimg ."
		echo 'This is Docker build images'
	    }
	}

	stage('Publish Docker Images') {
	    steps{
		withCredentials([usernamePassword(credentialsId: "dockerhub_ascay", passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')])
		{
			sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
			sh "docker push ascay/devopsimg"
		}
	    }
	}

	stage('Clean Docker Images') {
	    steps{
		sh "docker rmi ascay/devopsimg"
		//sh "docker rm -vf \$(docker ps -aq)"
		//sh "docker rmi -f \$(docker images -aq)"
		
		echo 'This is Clean Docker Images stage'
	    }
	}

	stage('Deploy and run images') {
	    steps{
		//sh "docker rm devopspipelinecalsci"
		ansiblePlaybook(credentialsId: 'ansible_private_key', inventory: 'inventory', playbook: 'playbook.yml')
		echo 'This is Deploy and run image stage'
	    }
	}

	stage('Declarative Post Actions') {
	    steps{
//		sh "chmod +x openterminal.sh"
//		sh "./openterminal.sh"
		echo 'This is Declarative Post Actions stage'
	    }
	}
    }
}
