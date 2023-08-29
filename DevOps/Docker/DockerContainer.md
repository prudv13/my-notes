# Docker Container

### creating and running a container from an image
```bash
docker run <image-name>
```
- docker - docker client
- run - try to create and run a container
- image-name - name of the image to use for this conatiner

![docker-run](https://res.cloudinary.com/dqab7rimk/image/upload/v1693282665/devops/docker-container_iuetq1.png)

### Command :
```bash
docker run busybox echo hi there
```
### Output :

![docker-busybox](https://res.cloudinary.com/dqab7rimk/image/upload/v1693282830/devops/docker-buzybox_rtzqrz.png)

### Command with override :
```bash
docker run busybox ls
```

## List all running containers
```bash
docker ps
docker ps --all
```
### Example :
```bash
docker run busybox ping google.com
docker ps
```
![](https://res.cloudinary.com/dqab7rimk/image/upload/v1693283559/devops/docker-ps_t8mrmf.png)