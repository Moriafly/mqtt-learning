# 规划

| 主机           | 操作系统              | 角色           |
| -------------- | --------------------- | -------------- |
| 阿里云服务器   | Alibaba Cloud Linux 2 | OpenVPN 服务器 |
| 本地笔记本电脑 | Windows 10            | OpenVPN 客户端 |

# 准备







# 服务器

公网

```
47.103.83.146
```

密码

```
`12345qwer
```





# 开启 OpenVPN 服务

开启服务

```
openvpn --daemon --config server.conf
```



kaiq

```
open /etc/openvpn/server.conf
ss -nutl |grep 1194
```



```
Options error: Unrecognized option or missing or extra parameter(s) in server.conf:1: penVPN (2.4.9)
Use --help for more information.
```



#### 检查 1194 端口

```
netstat -lntup | grep 1194
```



```
cd /usr/share/doc/openvpn-2.2.2/easy-rsa/2.0
```



cp /usr/share/doc/openvpn-2.4.9/sample/sample-config-files/server.conf /etc/openvpn/

req: /usr/share/easy-rsa/3.0.8/pki/reqs/server.req
key: /usr/share/easy-rsa/3.0.8/pki/private/server.key

Certificate created at: /usr/share/easy-rsa/3.0.8/pki/issued/server.crt





![image-20201106093744900](C:\Users\24568\AppData\Roaming\Typora\typora-user-images\image-20201106093744900.png)