# Docker

### Installing Software
- download installer
- run installer
- get an error message during install > troubleshoot issue
- rerun installer
- get another error > troubleshoot issue

### Docker fixes this issue

example: run redis using docker
```bash
docker run -it redis
```
### Windows Powershell Console
 ![runredis](https://res.cloudinary.com/dqab7rimk/image/upload/v1693278204/devops/docker-redis_gjdgyt.png)

 ## What is Docker ?

 ### Docker is a platform or ecosystem around creating and running containers
 ### Docker Ecosystem:
 - docker client
 - docker server
 - docker machine
 - docker images
 - docker hub
 - docker compose

### Docker Image : Single file with all the dependencies and configurations required to run a program.

### Docker Container : Instance of an image, Runs a program

### Docker Client
- tool that we are going to isuue commands to
- Docker CLI

### Docker Server
- tool that is responsible for creating images, running containers, etc
- Docker Daemon

### check docker version in powershell
```bash
docker version
```
### run hello-world
```bash
docker run hello-world
```
![hello-world](https://res.cloudinary.com/dqab7rimk/image/upload/v1693279541/devops/docker-helloworld_d7qmkh.png)

![docker-process](https://res.cloudinary.com/dqab7rimk/image/upload/v1693279751/devops/docker-client_ud2qju.png)

  ## What is Container ?

  A container is a standard unit of software that packages up code and all its dependencies so the application runs quickly and reliably from one computing environment to another. A Docker container image is a lightweight, standalone, executable package of software that includes everything needed to run an application: code, runtime, system tools, system libraries and settings.

  ### Kernel :
  - Kernel is central component of an operating system that manages operations of computer and hardware.
  - It basically manages operations of memory and CPU time. 
  - It is core component of an operating system. 
  - Kernel acts as a bridge between applications and data processing performed at hardware level using inter-process communication and system calls.
  - Kernel loads first into memory when an operating system is loaded and remains into memory until operating system is shut down again.
  - It is responsible for various tasks such as disk management, task management, and memory management.
  - Kernel has a process table that keeps track of all active processes

### It basically acts as an interface between user applications and hardware. The major aim of kernel is to manage communication between software i.e. user-level applications and hardware i.e., CPU and disk memory.

![kernel](https://res.cloudinary.com/dqab7rimk/image/upload/v1693281041/devops/kernel-img_naovse.png)

### Namespacing :
- isolating resources per process or group of processes

### Control Groups :
- limit amount of resources used per process

### Container Architecture

![container-arch](https://res.cloudinary.com/dqab7rimk/image/upload/v1693281561/devops/Docker-container-architecture_lg3gor.png)
