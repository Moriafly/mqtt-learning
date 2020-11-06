云服务器 (Elastic Compute Service, 简称 *ECS*)

云服务器 ECS

# SSH

Secure Shell(SSH) 是由 IETF(The Internet Engineering Task Force) 制定的建立在应用层基础上的安全网络协议。它是专为[远程登录](https://baike.baidu.com/item/远程登录/1071998)会话(甚至可以用Windows远程登录Linux服务器进行文件互传)和其他网络服务提供安全性的协议，可有效弥补网络中的漏洞。通过SSH，可以把所有传输的数据进行加密，也能够防止DNS欺骗和IP欺骗。还有一个额外的好处就是传输的数据是经过压缩的，所以可以加快传输的速度。目前已经成为Linux系统的标准配置。

SSH只是一种协议，存在多种实现，既有商业实现，也有开源实现。本文主要介绍OpenSSH免费开源实现在Ubuntu中的应用，如果要在Windows中使用SSH，需要使用另一个软件PuTTY

但并不是说SSH就是绝对安全的，因为它本身提供两种级别的验证方法：

第一种级别（基于口令的安全验证）：只要你知道自己帐号和口令，就可以登录到远程主机。所有传输的数据都会被加密，但是不能保证你正在连接的服务器就是你想连接的服务器。可能会有别的服务器在冒充真正的服务器，也就是受到“中间人攻击”这种方式的攻击。`

第二种级别（基于密钥的安全验证）：你必须为自己创建一对密钥，并把公钥放在需要访问的服务器上。如果你要连接到SSH服务器上，客户端软件就会向服务器发出请求，请求用你的密钥进行安全验证。服务器收到请求之后，先在该服务器上你的主目录下寻找你的公钥，然后把它和你发送过来的公钥进行比较。如果两个密钥一致，服务器就用公钥加密“质询”(challenge)并把它发送给客户端软件。客户端软件收到“质询”之后就可以用你的私钥在本地解密再把它发送给服务器完成登录。与第一种级别相比，第二种级别不仅加密所有传输的数据，也不需要在网络上传送口令，因此安全性更高，可以有效防止中间人攻击。

- SSH 22



# PuTTY

PuTTY是一个Telnet、SSH、rlogin、纯TCP以及串行接口连接软件。较早的版本仅支持Windows平台，在最近的版本中开始支持各类Unix平台，并打算移植至Mac OS X上。除了官方版本外，有许多第三方的团体或个人将PuTTY移植到其他平台上，像是以Symbian为基础的移动电话。PuTTY为一开放源代码软件，主要由Simon Tatham维护，使用MIT licence授权。随着Linux在服务器端应用的普及，Linux系统管理越来越依赖于远程。在各种远程登录工具中，Putty是出色的工具之一。Putty是一个免费的、Windows x86平台下的Telnet、SSH和rlogin客户端，但是功能丝毫不逊色于商业的Telnet类工具。最新的版本为 0.73



一般默认 SSH 端口是 22 号



# OpenSSH

```powershell
Add-WindowsCapability -Online -Name OpenSSH-Client
```

```powershell
Path          :
Online        : True
RestartNeeded : False
```

## 帮助

SSH 客户端

```powershell
ssh --help
```

SSH 登录

```powershell
ssh [用户名]@[IP]
```

例子

```
ssh colin@192.168.0.200
```

输入 yes，再输入密码



获取服务器地址

```
ip addr | grep inet
```

SSH Client 基本

```
shh user@remote -p port
```

- user 是你在远程服务器上的用户名，阿里云 



```
ssh root@101.133.142.45 -p 22
```

```
The authenticity of host '101.133.142.45 (101.133.142.45)' can't be established.
ECDSA key fingerprint is SHA256:0R34YygFHZRlRJrDdXRdUYo+e6AqLR9wYdhzFMIlUA8.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
```

```
`123456q
```

