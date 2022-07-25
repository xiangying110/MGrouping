# Docker概述

## Docker为什么出现

​      一款产品从开发到上线，从操作系统，到运行环境，再到应用配置。作为开发+运维之间的协作我们需要
关心很多东西，这也是很多互联网公司都不得不面对的问题，特别是各种版本的迭代之后，不同版本环
境的兼容，对运维人员是极大的考验！

​       环境配置如此麻烦，换一台机器，就要重来一次，费力费时。很多人想到，能不能从根本上解决问题，
软件可以带环境安装？也就是说，安装的时候，把原始环境一模一样地复制过来。解决开发人员说的“ 在
我的机器上可正常工作”的问题。

之前在服务器配置一个应用的运行环境，要安装各种软件，就拿一个基本的工程项目的环境来说吧，
Java/Tomcat/MySQL/JDBC驱动包等。安装和配置这些东西有多麻烦就不说了，它还不能跨平台。假如
我们是在 Windows 上安装的这些环境，到了 Linux 又得重新装。况且就算不跨操作系统，换另一台同
样操作系统的服务器，要移植应用也是非常麻烦的。

传统上认为，软件编码开发/测试结束后，所产出的成果即是程序或是能够编译执行的二进制字节码文件
等（Java为例）。而为了让这些程序可以顺利执行，开发团队也得准备完整的部署文件，让维运团队得
以部署应用程式，**开发需要清楚的告诉运维部署团队，用的全部配置文件+所有软件环境。不过，即便如**
**此，仍然常常发生部署失败的状况。**

Docker之所以发展如此迅速，也是因为它对此给出了一个标准化的解决方案。

Docker镜像的设计，使得Docker得以打破过去「程序即应用」的观念。通过Docker镜像 ( images ) 将
应用程序所需要的系统环境，由下而上打包，达到应用程序跨平台间的无缝接轨运作。

 **DOcker思想就来源于集装箱**

 **核心思想：隔离，每个箱子都是互相隔离的**

 **Docker通过隔离机制，可以将服务器利用到极致**

  **本质：所有的技术都是因为出现了一些问题，需要去解决才出现**

> 历史

2010年，几个搞IT的年轻人，在美国旧金山成立了一家名'dotCloud'的公司。

这家公司主要提供基于PaaS的云计算技术服务。具体来说，是和LXC有关的容器技术。

后来，dotCloud公司将自己的容器技术进行了简化和标准化，并命名为——Docker。

Docker技术诞生之后，并没有引起行业的关注。而dotCloud公司，作为一家小型创业企业，在激烈的竞

争之下，也步履维艰。正当他们快要坚持不下去的时候，脑子里蹦出了“开源”的想法。

什么是“开源”？开源，就是开放源代码。也就是将原来内部保密的程序源代码开放给所有人，然后让大家一起参与进来，贡献代码和意见。

有的软件是一开始就开源的。也有的软件，是混不下去，创造者又不想放弃，所以选择开源。自己养不活，就吃“百家饭”嘛。

2013年3月，dotCloud公司的创始人之一，Docker之父，28岁的Solomon Hykes正式决定，将Docker项目开源。不

开则已，一开惊人。越来越多的IT工程师发现了Docker的优点，然后蜂拥而至，加入Docker开源社区。Docker的人

气迅速攀升，速度之快，令人瞠目结舌。

开源当月，Docker 0.1 版本发布。此后的每一个月，Docker都会发布一个版本。到2014年6月9日，Docker 1.0 版本

正式发布。此时的Docker，已经成为行业里人气最火爆的开源技术，没有之一。甚至像Google、微软、Amazon、

VMware这样的巨头，都对它青睐有加，表示将全力支持。Docker和容器技术为什么会这么火爆？说白了，就是因

为它“轻”。在容器技术之前，业界的网红是虚拟机。虚拟机技术的代表，是VMWare和OpenStack。相信很多人都用

过虚拟机。虚拟机，就是在你的操作系统里面，装一个软件，然后通过这个软件，再模拟一台甚至多台“子电脑”出

来。在“子电脑”里，你可以和正常电脑一样运行程序，例如开QQ。如果你愿意，你可以变出好几个“子电脑”，里

面都开上QQ。“子电脑”和“子电脑”之间，是相互隔离的，互不影响。虚拟机属于虚拟化技术。而Docker这样的容器

技术，也是虚拟化技术，属于轻量级的虚拟化。虚拟机虽然可以隔离出很多“子电脑”，但占用空间更大，启动更

慢，虚拟机软件可能还要花钱（例如VMWare）。而容器技术恰好没有这些缺点。它不需要虚拟出整个操作系统，

只需要虚拟一个小规模的环境（类似“沙箱”）。它启动时间很快，几秒钟就能完成。而且，它对资源的利用率很高

（一台主机可以同时运行几千个Docker容器）。此外，它占的空间很小，虚拟机一般要几GB到几十GB的空间，而

容器只需要MB级甚至KB级。正因为如此，容器技术受到了热烈的欢迎和追捧，发展迅速。

> Docker理念

Docker是基于Go语言实现的云开源项目。

Docker的主要目标是“Build，Ship and Run Any App , Anywhere”，也就是通过对应用组件的封装、分
发、部署、运行等生命周期的管理，使用户的APP（可以是一个WEB应用或数据库应用等等）及其运行
环境能够做到“一次封装，到处运行”。

Linux 容器技术的出现就解决了这样一个问题，而 Docker 就是在它的基础上发展过来的。将应用运行在
Docker 容器上面，而 Docker 容器在任何操作系统上都是一致的，这就实现了跨平台、跨服务器。只需
要一次配置好环境，换到别的机子上就可以一键部署好，大大简化了操作。

文档地址：https://docs.docker.com/ Docker文档非常的详细

仓库地址：https://hub.docker.com/

## Docker能干嘛

> 之前的虚拟机技术

虚拟机（virtual machine）就是带环境安装的一种解决方案。

它可以在一种操作系统里面运行另一种操作系统，比如在Windows 系统里面运行Linux 系统。应用程序
对此毫无感知，因为虚拟机看上去跟真实系统一模一样，而对于底层系统来说，虚拟机就是一个普通文
件，不需要了就删掉，对其他部分毫无影响。这类虚拟机完美的运行了另一套系统，能够使应用程序，
操作系统和硬件三者之间的逻辑不变。

**虚拟机的缺点：**
1、资源占用多
2、冗余步骤多
3 、启动慢

> 容器虚拟化技术

由于前面虚拟机存在这些缺点，Linux 发展出了另一种虚拟化技术：Linux 容器（Linux Containers，缩
写为 LXC）。

Linux 容器不是模拟一个完整的操作系统，而是对进程进行隔离。有了容器，就可以将软件运行所需的
所有资源打包到一个隔离的容器中。容器与虚拟机不同，不需要捆绑一整套操作系统，只需要软件工作
所需的库资源和设置。系统因此而变得高效轻量并保证部署在任何环境中的软件都能始终如一地运行。

![image-20220711195233014](C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220711195233014.png)

**比较了 Docker 和传统虚拟化方式的不同之处：**

- 传统虚拟机技术是虚拟出一套硬件后，在其上运行一个完整操作系统，在该系统上再运行所需应用进程；
- 而容器内的应用进程直接运行于宿主的内核，容器内没有自己的内核，而且也没有进行硬件虚拟。因此容器要比传统虚拟机更为轻便。
- 每个容器之间互相隔离，每个容器有自己的文件系统 ，容器之间进程不会相互影响，能区分计算资源。

> DecOps开发与运维

**更快速的应用交付和部署：**

传统的应用开发完成后，需要提供一堆安装程序和配置说明文档，安装部署后需根据配置文档进行繁杂
的配置才能正常运行。Docker化之后只需要交付少量容器镜像文件，在正式生产环境加载镜像并运行即
可，应用安装配置在镜像里已经内置好，大大节省部署配置和测试验证时间。
**更便捷的升级和扩缩容：**

随着微服务架构和Docker的发展，大量的应用会通过微服务方式架构，应用的开发构建将变成搭乐高积
木一样，每个Docker容器将变成一块“积木”，应用的升级将变得非常容易。当现有的容器不足以支撑业
务处理时，可通过镜像运行新的容器进行快速扩容，使应用系统的扩容从原先的天级变成分钟级甚至秒
级。

**更简单的系统运维：**
应用容器化运行后，生产环境运行的应用可与开发、测试环境的应用高度一致，容器会将应用程序相关
的环境和状态完全封装起来，不会因为底层基础架构和操作系统的不一致性给应用带来影响，产生新的
BUG。当出现程序异常时，也可以通过测试环境的相同容器进行快速定位和修复。

**更高效的计算资源利用：**
Docker是内核级虚拟化，其不像传统的虚拟化技术一样需要额外的Hypervisor [管理程序] 支持，所以在
一台物理机上可以运行很多个容器实例，可大大提升物理服务器的CPU和内存的利用率。

> 学习途径

Docker官网：http://www.docker.com
Docker中文网站：https://www.docker-cn.com
Docker Hub官网：https://hub.docker.com（仓库）
还是我那句话，只要学不死，就往死里学！
我还是坚信，真正好的教学就是授人以渔，避免大家少走弯路，让所有人能有一个公平的学习环境。我
的所有课程都是免费的，大家千万不要上当受骗哦，ok，让我们学习来！

# Docker安装

## Docker的基本组成

Docker架构图

![image-20220711200557147](C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220711200557147.png)

**镜像（image）：**

```shell
Docker 镜像（Image）就是一个只读的模板。镜像可以用来创建 Docker 容器，一个镜像可以创建很
多容器。 就好似 Java 中的 类和对象，类就是镜像，容器就是对象！
```

**容器（container）：**

```shell
Docker 利用容器（Container）独立运行的一个或一组应用。容器是用镜像创建的运行实例。
它可以被启动、开始、停止、删除。每个容器都是相互隔离的，保证安全的平台。
可以把容器看做是一个简易版的 Linux 环境（包括root用户权限、进程空间、用户空间和网络空间等）
和运行在其中的应用程序。。
容器的定义和镜像几乎一模一样，也是一堆层的统一视角，唯一区别在于容器的最上面那一层是可读可写
的。
```



**仓库（repository）：**

```shell
仓库（Repository）是集中存放镜像文件的场所。
仓库(Repository)和仓库注册服务器（Registry）是有区别的。仓库注册服务器上往往存放着多个仓
库，每个仓库中又包含了多个镜像，每个镜像有不同的标签（tag）。
仓库分为公开仓库（Public）和私有仓库（Private）两种形式。
最大的公开仓库是 Docker Hub(https://hub.docker.com/)，存放了数量庞大的镜像供用户下载。
国内的公开仓库包括阿里云 、网易云 等
```



**小结：**

- 需要正确的理解仓储/镜像/容器这几个概念 :
  Docker 本身是一个容器运行载体或称之为管理引擎。我们把应用程序和配置依赖打包好形成一个
  可交付的运行环境，这个打包好的运行环境就似乎 image镜像文件。只有通过这个镜像文件才能生
  成 Docker 容器。image 文件可以看作是容器的模板。Docker 根据 image 文件生成容器的实例。
  同一个 image 文件，可以生成多个同时运行的容器实例。
- image 文件生成的容器实例，本身也是一个文件，称为镜像文件。
- 一个容器运行一种服务，当我们需要的时候，就可以通过docker客户端创建一个对应的运行实例，
  也就是我们的容器
- 至于仓库，就是放了一堆镜像的地方，我们可以把镜像发布到仓库中，需要的时候从仓库中拉下来
  就可以了。

## 环境说明

> 环境准备

1、需要会一些linux基础

2、Centos7  目前，CentOS 仅发行版本中的内核支持 Docker。Docker 运行在 CentOS 7 上，要求系统为64位、系统内核版本为       3.10 以上。

> 环境查看

```shell
uname -r 命令用于打印当前系统相关信息（内核版本号、硬件架构、主机名称和操作系统类型等）。
#系统内核版本为       3.10 以上。
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# uname -r
3.10.0-1160.53.1.el7.x86_64
```

**查看版本信息：**

`cat /etc/os-release`

```shell
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# cat /etc/os-release
NAME="CentOS Linux"
VERSION="7 (Core)"
ID="centos"
ID_LIKE="rhel fedora"
VERSION_ID="7"
PRETTY_NAME="CentOS Linux 7 (Core)"
ANSI_COLOR="0;31"
CPE_NAME="cpe:/o:centos:centos:7"
HOME_URL="https://www.centos.org/"
BUG_REPORT_URL="https://bugs.centos.org/"

CENTOS_MANTISBT_PROJECT="CentOS-7"
CENTOS_MANTISBT_PROJECT_VERSION="7"
REDHAT_SUPPORT_PRODUCT="centos"
REDHAT_SUPPORT_PRODUCT_VERSION="7"

```



## 安装步骤

1、官网安装参考手册：https://docs.docker.com/engine/install/centos/
2、确定你是CentOS7及以上版本，我们已经做过了
3、**yum安装gcc相关环境**（需要确保 虚拟机可以上外网 ）

```shell
yum -y install gcc
yum -y install gcc-c++
```

4、卸载旧版本

```shell
yum remove docker \
docker-client \
docker-client-latest \
docker-common \
docker-latest \
docker-latest-logrotate \
docker-logrotate \
docker-engine
```

5、需要安装的软件包

```shell
yum install -y yum-utils
```

6、设置镜像仓库

```shell
# 错误
yum-config-manager --add-repo
https://download.docker.com/linux/centos/docker-ce.repo
## 报错
[Errno 14] curl#35 - TCP connection reset by peer
[Errno 12] curl#35 - Timeout
# 正确推荐使用国内的
yum-config-manager --add-repo http://mirrors.aliyun.com/docker-
ce/linux/centos/docker-ce.repo
```

7、更新yum软件包索引

```shell
yum makecache fast
```

8、安装 Docker CE

```shell
#docker-ce社区办，ee企业版
yum install docker-ce docker-ce-cli containerd.io
```

9、启动 Docker

```shell
systemctl start docker
```

10、测试命令

```shell
docker version

docker run hello-world

docker images
```

```shell
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker images
REPOSITORY      TAG          IMAGE ID       CREATED        SIZE
<none>          <none>       e619f88231ff   3 months ago   41.8MB
wordpress       latest       c3c92cc3dcb1   6 months ago   616MB
mysql           5.7          c20987f18b13   6 months ago   448MB
elasticsearch   7.16.1       405db9d10ee0   7 months ago   642MB
logstash        7.16.1       eeed133b351f   7 months ago   999MB
kibana          7.16.1       02f1088fcc07   7 months ago   1.3GB
redis           alpine       3900abf41552   7 months ago   32.4MB
python          3.6-alpine   3a9e80fa4606   7 months ago   40.7MB
python          3.7-alpine   a1034fd13493   7 months ago   41.8MB
centos          latest       5d0da3dc9764   9 months ago   231MB
```



11、卸载

```shell
systemctl stop docker

yum -y remove docker-ce docker-ce-cli containerd.io

#这是docker默认的工作路径/var/lib/docker
rm -rf /var/lib/docker
```







## 阿里云镜像加速

1、介绍：https://www.aliyun.com/product/acr
2、注册一个属于自己的阿里云账户(可复用淘宝账号)
3、进入管理控制台设置密码，开通
4、查看镜像加速器自己的

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712202657386.png" alt="image-20220712202657386" style="zoom:60%;" />



5、配置镜像加速

```shell
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://n4vku47u.mirror.aliyuncs.com"]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```

> 测试 HelloWorld

1、启动hello-world

```shell
docker run hello-world
```

2 run干了什么？

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712203044676.png" alt="image-20220712203044676" style="zoom:67%;" />





## 底层原理

**Docker是怎么工作的**

Docker是一个Client-Server结构的系统，Docker守护进程运行在主机上， 然后通过Socket连接从客户
端访问，守护进程从客户端接受命令并管理运行在主机上的容器。 容器，是一个运行时环境，就是我们
前面说到的集装箱。

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712203302610.png" alt="image-20220712203302610" style="zoom:50%;" />

**为什么Docker比较 VM 快**

1、docker有着比虚拟机更少的抽象层。由亍docker不需要Hypervisor实现硬件资源虚拟化,运行在
docker容器上的程序直接使用的都是实际物理机的硬件资源。因此在CPU、内存利用率上docker将会在
效率上有明显优势。
2、docker利用的是宿主机的内核,而不需要Guest OS。因此,当新建一个容器时,docker不需要和虚拟机
一样重新加载一个操作系统内核。仍而避免引寻、加载操作系统内核返个比较费时费资源的过程,当新建
一个虚拟机时,虚拟机软件需要加载Guest OS,返个新建过程是分钟级别的。而docker由于直接利用宿主
机的操作系统,则省略了返个过程,因此新建一个docker容器只需要几秒钟。

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712203549958.png" alt="image-20220712203549958" style="zoom: 67%;" />

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712203655545.png" alt="image-20220712203655545" style="zoom:50%;" />

所以说新建一个容器的时候，docker不需要加载一个操作系统内核，避免引导，虚拟机是加载centos，分钟级别，而docker是使用宿主机的操作系统，省略了一些复杂过程，秒级

# Docker常用命令

## 帮助命令

```she
docker version  # 显示 Docker 版本信息。

docker info   # 显示 Docker 系统信息，包括镜像和容器数。获取详细信息

docker 命令 --help  # 帮助
```

```shell
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker images --help

Usage:  docker images [OPTIONS] [REPOSITORY[:TAG]]

List images

Options:
  -a, --all             Show all images (default hides intermediate images)
      --digests         Show digests
  -f, --filter filter   Filter output based on conditions provided
      --format string   Pretty-print images using a Go template
      --no-trunc        Don't truncate output
  -q, --quiet           Only show image IDs
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# 
```



也可查看官网的帮助文档 ：https://docs.docker.com/reference/

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712204358419.png" alt="image-20220712204358419" style="zoom:50%;" />



## 镜像命令

### **docker images**

```shell
# 列出本地主机上的镜像
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker images 
REPOSITORY      TAG          IMAGE ID       CREATED        SIZE
<none>          <none>       e619f88231ff   3 months ago   41.8MB
wordpress       latest       c3c92cc3dcb1   6 months ago   616MB
mysql           5.7          c20987f18b13   6 months ago   448MB

# 解释
REPOSITORY 镜像的仓库源
TAG 镜像的标签
IMAGE ID 镜像的ID
CREATED 镜像创建时间
SIZE 镜像大小

# 同一个仓库源可以有多个 TAG，代表这个仓库源的不同版本，我们使用REPOSITORY：TAG 定义不同的镜像，如果你不定义镜像的标签版本，docker将默认使用 lastest 镜像！

# 可选项
-a：列出本地所有镜像
-q：只显示镜像id
--digests： 显示镜像的摘要信息
```

### **docker search**

```shell
# 搜索镜像
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker search mysql
NAME                           DESCRIPTION                                     STARS     OFFICIAL   AUTOMATED
mysql                          MySQL is a widely used, open-source relation…   12858     [OK]       
mariadb                        MariaDB Server is a high performing open sou…   4928      [OK]

# docker search 某个镜像的名称 对应DockerHub仓库中的镜像
# 可选项
--filter=stars=50 ： 列出收藏数不小于指定值的镜像。
```

也可以在网页上搜索镜像

https://www.docker.com/products/docker-hub/

### **docker pull**

```shell
# 下载镜像 docker pull 镜像名[:tag]
[root@kuangshen ~]# docker pull mysql
Using default tag: latest # 不写tag，默认是latest
latest: Pulling from library/mysql
54fec2fa59d0: Already exists # 分层下载 docker images 的核心，联合文件系统
bcc6c6145912: Already exists
951c3d959c9d: Already exists
05de4d0e206e: Already exists
319f0394ef42: Already exists
d9185034607b: Already exists
013a9c64dadc: Already exists
42f3f7d10903: Pull complete
c4a3851d9207: Pull complete
82a1cc65c182: Pull complete
a0a6b01efa55: Pull complete
bca5ce71f9ea: Pull complete
Digest:
sha256:61a2a33f4b8b4bc93b7b6b9e65e64044aaec594809f818aeffbff69a893d1944 #签名
Status: Downloaded newer image for mysql:latest
docker.io/library/mysql:latest # 真实位置
#等价于
docker pull mysql
docker pull docker.io/library/mysql:latest

# 指定版本下载
[root@kuangshen ~]# docker pull mysql:5.7
....
```



### **docker rmi**

```shell
# 删除镜像
docker rmi -f 镜像id # 删除单个
docker rmi -f 镜像名:tag 镜像名:tag # 删除多个
docker rmi -f 镜像id 镜像id 镜像id 镜像id # 删除多个
docker rmi -f $(docker images -qa) # 删除全部
```

   rm是linux的删除指令，rmi删除镜像，i是images的i    (这样类比，和原有的知识建立连接)

​    $()作为参数传过去

## 容器命令

**说明：**有镜像才能创建容器，我们这里使用 centos 的镜像来测试，就是虚拟一个 centos ！

```shell
docker pull centos
```

### **新建容器并启动**

```shell
# 命令
docker run 可选参数 IMAGE 

# 常用参数说明
--name="Name" # 给容器指定一个名字 tomcat01 Tomcat02 用来区分容器
-d # 后台方式运行容器，并返回容器的id！
-i # 以交互模式运行容器，通过和 -t 一起使用
-t # 给容器重新分配一个终端，通常和 -i 一起使用
-P # 随机端口映射（大写）
-p # 指定端口映射（小写），一般可以有四种写法
ip:hostPort:containerPort
ip::containerPort
hostPort:containerPort (常用)
containerPort
  -p ip:主机端口:容器端口
  -p 主机端口:容器端口(常用)
  -p 容器端口
  容器端口
  
# 测试
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker images 
REPOSITORY      TAG          IMAGE ID       CREATED        SIZE
<none>          <none>       e619f88231ff   3 months ago   41.8MB
wordpress       latest       c3c92cc3dcb1   6 months ago   616MB
mysql           5.7          c20987f18b13   6 months ago   448MB
elasticsearch   7.16.1       405db9d10ee0   7 months ago   642MB

# 使用centos进行用交互模式启动容器，在容器内执行/bin/bash命令！
[root@kuangshen ~]# docker run -it centos /bin/bash
[root@dc8f24dd06d0 /]# ls # 注意地址，已经切换到容器内部了！
bin etc lib lost+found mnt proc run srv tmp var
dev home lib64 media
opt root sbin sys usr
[root@dc8f24dd06d0 /]# exit # 使用 exit 退出容器
exit
[root@kuangshen ~]#
```

### **列出所有运行的容器**

```shell
# 命令
docker ps [OPTIONS]
# 常用参数说明
   # 列出当前所有正在运行的容器
-a # 列出当前所有正在运行的容器 + 历史运行过的容器
-l # 显示最近创建的容器
-n=? # 显示最近n个创建的容器
-q # 静默模式，只显示容器编号。

[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker ps 
CONTAINER ID   IMAGE                  COMMAND                  CREATED        STATUS        PORTS                                                                                  NAMES
35c59d529d7a   kibana:7.16.1          "/bin/tini -- /usr/l…"   3 months ago   Up 2 months   0.0.0.0:5601->5601/tcp, :::5601->5601/tcp                                              kibana73
7833f8fdb1bb   elasticsearch:7.16.1   "/bin/tini -- /usr/l…"   3 months ago   Up 2 weeks    0.0.0.0:9200->9200/tcp, :::9200->9200/tcp, 0.0.0.0:9300->9300/tcp, :::9300->9300/tcp   es73


```

### **退出容器**

```shell
exit # 容器停止退出
ctrl+P+Q # 容器不停止退出
```

### **启动停止容器**

```shell
docker start (容器id or 容器名) # 启动容器
docker restart (容器id or 容器名) # 重启容器
docker stop (容器id or 容器名) # 停止容器
docker kill (容器id or 容器名) # 强制停止容器
```

### **删除容器**

```shell
docker rm 容器id # 删除指定容器  不能删除正在运行的容器，如果删除需要强制删除-f
docker rm -f $(docker ps -a -q) # 删除所有容器
docker ps -a -q|xargs docker rm # 删除所有容器
```



## 常用其他命令

### **后台启动容器**

```shell
# 命令
docker run -d 镜像名

# 例子
docker run -d centos # 启动centos，使用后台方式启动
# 问题： 使用docker ps 查看，发现容器已经退出了！
# 解释：Docker容器后台运行，就必须有一个前台进程，容器运行的命令如果不是那些一直挂起的命令，就会自动退出。
# 比如，你运行了nginx服务，但是docker前台没有运行应用，这种情况下，容器启动后，会立即自杀，因为他觉得没有程序了，所以最好的情况是，将你的应用使用前台进程的方式运行启动。
```



### **查看日志**

```shell
# 命令
docker logs -f -t --tail 容器id

# 例子：我们启动 centos，并编写一段脚本来测试玩玩！最后查看日志
[root@kuangshen ~]# docker run -d centos /bin/sh -c "while true;do echo kuangshen;sleep 1;done"
[root@kuangshen ~]# docker ps
CONTAINER ID  IMAGE
c8530dbbe3b4  centos
# -t 显示时间戳
# -f 打印最新的日志
# --tail 数字 显示多少条！

[root@kuangshen ~]# docker logs -tf --tail 10 c8530dbbe3b4
2020-05-11T08:46:40.656901941Z kuangshen
2020-05-11T08:46:41.658765018Z kuangshen
2020-05-11T08:46:42.661015375Z kuangshen
2020-05-11T08:46:43.662865628Z kuangshen
2020-05-11T08:46:44.664571547Z kuangshen
2020-05-11T08:46:45.666718583Z kuangshen
2020-05-11T08:46:46.668556725Z kuangshen
2020-05-11T08:46:47.670424699Z kuangshen
2020-05-11T08:46:48.672324512Z kuangshen
2020-05-11T08:46:49.674092766Z kuangshen
```



### **查看容器中运行的进程信息，支持 ps 命令参数。**

```shell
# 命令
docker top 容器id
# 测试
[root@kuangshen ~]# docker top c8530dbbe3b4
UID PID PPID C STIME TTY TIME CMD
root 27437 27421 0 16:43 ? 00:00:00 /bin/sh -c ....
```



### **查看容器/镜像的元数据**

```shell
# 命令
docker inspect 容器id
# 测试
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker inspect 35c59d529d7a
[
    {
    # 完整的id，有意思啊，这里上面的容器id，就是截取的这个id前几位！
        "Id": "35c59d529d7a397011f1d0e30c758d223e0a61a44030a51d68da882e514f3e6f",
        "Created": "2022-03-27T06:30:35.822589527Z",
        "Path": "/bin/tini",
        "Args": [
            "--",
            "/usr/local/bin/kibana-docker"
        ],
        # 状态
        "State": {
            "Status": "running",
            "Running": true,
            "Paused": false,
            "Restarting": false,
            "OOMKilled": false,
            "Dead": false,
            "Pid": 18849,
            "ExitCode": 0,
            "Error": "",
            "StartedAt": "2022-04-23T06:46:07.711164445Z",
            "FinishedAt": "2022-04-23T06:46:06.188657262Z"
        },

// ...........
]
```



### **进入正在运行的容器**

```shell
# 命令1
docker exec -it 容器id bashShell
# 测试1
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker ps
CONTAINER ID   IMAGE                  COMMAND                  CREATED        STATUS        PORTS                                                                                  NAMES
35c59d529d7a   kibana:7.16.1          "/bin/tini -- /usr/l…"   3 months ago   Up 2 months   0.0.0.0:5601->5601/tcp, :::5601->5601/tcp                                              kibana73
7833f8fdb1bb   elasticsearch:7.16.1   "/bin/tini -- /usr/l…"   3 months ago   Up 2 weeks    0.0.0.0:9200->9200/tcp, :::9200->9200/tcp, 0.0.0.0:9300->9300/tcp, :::9300->9300/tcp   es73

[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker exec -it 35c59d529d7a /bin/bash
bash-4.4$  ps -ef
UID        PID  PPID  C STIME TTY          TIME CMD
kibana       1     0  0 Apr23 ?        00:02:26 /bin/tini -- /usr/local/bin/kibana-docker
kibana       7     1  1 Apr23 ?        1-09:30:09 /usr/share/kibana/bin/../node/bin/node /usr/share/kibana/bin/../src/cli/dist --ops.cGroupOverrides.cpuPath=/ --ops.cGroup
kibana    1241     0  0 13:42 pts/0    00:00:00 /bin/bash
kibana    1248  1241  0 13:43 pts/0    00:00:00 ps -ef
bash-4.4$ 


# 命令2
docker attach 容器id
# 测试2
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker attach 35c59d529d7a

# 区别
# exec 是在容器中打开新的终端，并且可以启动新的进程
# attach 直接进入容器启动命令的终端，不会启动新的进程
```

### **从容器内拷贝文件到主机上**

```shell
# 命令
docker cp 容器id:容器内路径 目的主机路径
# 测试
# 容器内执行，创建一个文件测试
[root@c8530dbbe3b4 /]# cd /home
[root@c8530dbbe3b4 home]# touch f1
[root@c8530dbbe3b4 home]# ls
f1
[root@c8530dbbe3b4 home]# exit
exit
# linux复制查看，是否复制成功
[root@kuangshen ~]# docker cp c8530dbbe3b4:/home/f1 /home
[root@kuangshen ~]# cd /home
[root@kuangshen home]# ls
f1
```



## 小结

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220712215054620.png" alt="image-20220712215054620" style="zoom:67%;" />

常用命令

```shell
attach  Attach to a running container# 当前 shell 下attach 连接指定运行镜像
build   Build an image from a Dockerfile # 通过 Dockerfile 定制镜像
commit  Create a new image from a container changes # 提交当前容器为新的镜像
cp      Copy files/folders from the containers filesystem to the host path#从容器中拷贝指定文件或者目录到宿主机中
create Create a new container # 创建一个新的容器，同run，但不启动容器
diff   Inspect changes on a container's filesystem # 查看 docker 容器变化
events Get real time events from the server # 从 docker 服务获取容器实时事件
exec Run a command in an existing container# 在已存在的容器上运行命令
export Stream the contents of a container as a tar archive # 导出容器的内容流作为一个 tar 归档文件[对应 import ]
history Show the history of an image# 展示一个镜像形成历史
images List images# 列出系统当前镜像
import Create a new filesystem image from the contents of a tarball # 从tar包中的内容创建一个新的文件系统映像[对应export]
info Display system-wide information# 显示系统相关信息
inspect Return low-level information on a container # 查看容器详细信息
kill Kill a running container# kill 指定 docker 容器
load Load an image from a tar archive# 从一个 tar 包中加载一个镜像[对应 save]
login Register or Login to the docker registry server # 注册或者登陆一个docker 源服务器
logout  Log out from a Docker registry server# 从当前 Dockerregistry 退出
logs  Fetch the logs of a container# 输出当前容器日志信息
port Lookup the public-facing port which is NAT-ed to PRIVATE_PORT #查看映射端口对应的容器内部源端口
pause Pause all processes within a container# 暂停容器
ps List containers # 列出容器列表
pull Pull an image or a repository from the docker registry server #从docker镜像源服务器拉取指定镜像或者库镜像
push Push an image or a repository to the docker registry server #推送指定镜像或者库镜像至docker源服务器
restart Restart a running container# 重启运行的容器
rm Remove one or more containers# 移除一个或者多个容器
rmi Remove one or more images# 移除一个或多个镜像[无容器使用该镜像才可删除，否则需删除相关容器才可继续或 -f 强制删除]
run  Run a command in a new container # 创建一个新的容器并运行一个命令
save Save an image to a tar archive# 保存一个镜像为一个tar 包[对应 load]
search Search for an image on the Docker Hub# 在 docker hub 中搜索镜像
start Start a stopped containers# 启动容器
stop Stop a running containers# 停止容器
tag Tag an image into a repository # 给源中镜像打标签
top Lookup the running processes of a container # 查看容器中运行的进程信息
unpause Unpause a paused container# 取消暂停容器
version Show the docker version information# 查看 docker 版本号
wait Block until a container stops, then print its exit code # 截取容器停止时的退出状态值
```

docker的命令是十分多的





## 作业练习

> 使用Docker 安装 Nginx

```shell
# 1、搜索镜像
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker search nginx
NAME         DESCRIPTION                                     STARS     OFFICIAL   AUTOMATED
nginx         Official build of Nginx.                        17121     [OK]       

# 2、拉取镜像
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker pull nginx
Using default tag: latest
latest: Pulling from library/nginx
a2abf6c4d29d: Already exists 
a9edb18cadd1: Pull complete 
589b7251471a: Pull complete 
186b1aaa4aa6: Pull complete 
b4df32aa5a72: Pull complete 
a0bcbecc962e: Pull complete 
Digest: sha256:0d17b565c37bcbd895e9d92315a05c1c3c9a29f762b011a10c54a66cd53c9b31
Status: Downloaded newer image for nginx:latest
docker.io/library/nginx:latest

# 3、启动容器
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker images
REPOSITORY      TAG          IMAGE ID       CREATED         SIZE
<none>          <none>       e619f88231ff   3 months ago    41.8MB
nginx           latest       605c77e624dd   6 months ago    141MB
wordpress       latest       c3c92cc3dcb1   6 months ago    616MB
mysql           5.7          c20987f18b13   7 months ago    448MB
elasticsearch   7.16.1       405db9d10ee0   7 months ago    642MB
logstash        7.16.1       eeed133b351f   7 months ago    999MB
kibana          7.16.1       02f1088fcc07   7 months ago    1.3GB
redis           alpine       3900abf41552   7 months ago    32.4MB
python          3.6-alpine   3a9e80fa4606   7 months ago    40.7MB
python          3.7-alpine   a1034fd13493   7 months ago    41.8MB
centos          latest       5d0da3dc9764   10 months ago   231MB 

# -d  后台运行
# --name 给容器命名
# -p 宿舍主机端口:容器内部端口
[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker run -d --name mynginx -p 3500:80 nginx
7a2107b48f989afecd36ffd435ec9fbab71758b0843d931e9dbd9743ed5ba2a6

[root@iZ2ze0hojhrob2v7mjyayoZ ~]# docker ps
CONTAINER ID  IMAGE  COMMAND                 CREATED        STATUS          PORTS                  NAMES
7a2107b48f98  nginx  "/docker-entrypoint.…"  22 seconds ago  Up 20 seconds  0.0.0.0:3500->80/tcp, :::3500->80/tcp                                                  mynginx

# 4、测试访问
[root@kuangshen ~]# curl localhost:3500
<html>
<title>Welcome to nginx!</title> # ok
....
</html>

# 5、进入容器
[root@kuangshen ~]# docker exec -it mynginx /bin/bash
root@a95d5f2f057f:/# whereis nginx  # 寻找nginx
nginx: /usr/sbin/nginx /usr/lib/nginx /etc/nginx /usr/share/nginx

root@7a2107b48f98:~# cd /etc/nginx/
root@7a2107b48f98:/etc/nginx# ls
conf.d	fastcgi_params	mime.types  modules  nginx.conf  scgi_params  uwsgi_params

root@a95d5f2f057f:/# cd /usr/share/nginx # nginx 的路径
root@a95d5f2f057f:/usr/share/nginx# ls
html
root@a95d5f2f057f:/usr/share/nginx# cd html # 首页的位置
root@a95d5f2f057f:/usr/share/nginx/html# ls
50x.html index.html
root@a95d5f2f057f:/usr/share/nginx/html# cat index.html
<!DOCTYPE html>
<html>
<head>
<title>Welcome to nginx!</title>
<style>
body {
width: 35em;
margin: 0 auto;
font-family: Tahoma, Verdana, Arial, sans-serif;
}
</style>
</head>
<body>
<h1>Welcome to nginx!</h1>
</html>
```

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220719221132514.png" alt="image-20220719221132514" style="zoom:50%;" />

思考：我们每次改动ngnix配置文件，都要进入容器内部？这样十分的麻烦，我们是否可以在容器外部提供一个映射路径，达到在容器外部修改文件内容，容器内部就可以修改的目的，-v数据卷

> 使用docker安装 tomcat

```shell
# 官方文档解释
# -it ：交互模式
# --rm：容器启动成功并退出以后容器就自动移除，一般在测试情况下使用！
docker run -it --rm tomcat:9.0
# 1、下载tomcat镜像
docker pull tomcat
# 2、启动
docker run -d -p 8080:8080 --name tomcat9 tomcat
# 3、进入tomcat
docker exec -it tomcat9 /bin/bash
# 4、思考：我们以后要部署项目，还需要进入容器中，是不是十分麻烦，要是有一种技术，可以将容器内和我们Linux进行映射挂载就好了？我们后面会将数据卷技术来进行挂载操作，也是一个核心内容，这里大家先听听名词就好，我们很快就会讲到！
```



> 使用docker 部署 es + kibana

```shell
# 我们启动es这种容器需要考虑几个问题
1、端口暴露问题 9200、9300
2、数据卷的挂载问题 data、plugins、conf
3、吃内存 - "ES_JAVA_OPTS=-Xms512m -Xmx512m"
# 扩展命令
docker stats 容器id # 查看容器的cpu内存和网络状态
# 1、启动es测试
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e
"
discovery.type=single-node" elasticsearch:7.6.2
# 2、启动之后很卡，使用 docker stats 容器id 查看下cpu状态 ，发现占用的很大
CONTAINER ID	NAME	CPU %	MEM USAGE / LIMIT	MEM %
249ae46da625	elasticsearch	0.00%	1.036GiB / 1.716GiB	60.37%
# 3、测试访问
[root@kuangshen data]# curl localhost:9200
{
19	"name" : "249ae46da625",
20	"cluster_name" : "docker-cluster",
21	"cluster_uuid" : "_Ho_i4fOTUesNc_II35sSA",
22	"version" : {
23	"number" : "7.6.2",
24	"build_flavor" : "default",
25	"build_type" : "docker",
26	"build_hash" : "ef48eb35cf30adf4db14086e8aabd07ef6fb113f", 27	"build_date" : "2020-03-26T06:34:37.794943Z",
 
28	"build_snapshot" : false, "lucene_version" : "8.4.0",
"minimum_wire_compatibility_version" : "6.8.0", "minimum_index_compatibility_version" : "6.0.0-beta1"
},
"tagline" : "You Know, for Search"
}

# 4、增加上内存限制启动
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" -e ES_JAVA_OPTS="-Xms64m -Xmx512m" elasticsearch:7.6.2

# 5、启动之后，使用 docker stats 查看下cpu状态
CONTAINER ID	NAME	CPU %	MEM USAGE / LIMIT	MEM %
d2860684e7e4	elasticsearch	0.24%	358.3MiB / 1.716GiB	20.40%

# 6、测试访问，效果一样，ok！
[root@kuangshen data]# curl localhost:9200

# 思考：如果我们要使用 kibana , 如果配置连接上我们的es呢？网络该如何配置呢？



```

<img src="C:\Users\chen_ll\AppData\Roaming\Typora\typora-user-images\image-20220720123812187.png" alt="image-20220720123812187" style="zoom:50%;" />

## 可视化

# Docker镜像

# 容器数据卷

# DockerFile

# Docker 网络讲解

# IDEA整合Docker