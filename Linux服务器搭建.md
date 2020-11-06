# 基于 Linux 平台的 VPN 服务器搭建过程



OpenVPN

CentOS8（vpn 服务器）

vmnet1: 



```bash
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host
       valid_lft forever preferred_lft forever
2: eth0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether 00:16:3e:04:23:35 brd ff:ff:ff:ff:ff:ff
    inet 172.24.52.233/16 brd 172.24.255.255 scope global dynamic noprefixroute eth0
       valid_lft 314877963sec preferred_lft 314877963sec
    inet6 fe80::216:3eff:fe04:2335/64 scope link
       valid_lft forever preferred_lft forever
```

# Ping 命令

测试服务器是否可以访问外网

```
ping www.baidu.com
```

停止 ping

Ctrl + C