package com.shou.mqtt.client

import org.fusesource.mqtt.client.MQTT
import org.fusesource.mqtt.client.QoS


/**
 * MQTT 客户端类
 * https://github.com/fusesource/mqtt-client
 * @author Wu Shihao
 * @since 2020/9/25
 */
class Client {
    companion object {
        private val mqtt = MQTT()
    }

    init {
        // 初始化 mqtt
        initMqtt()
    }

    /**
     * 初始化 mqtt
     */
    private fun initMqtt() {
        mqtt.apply {
            setHost("localhost", 1883) // 设置端口
            setClientId("") // 用于设置会话的客户端 ID。这是 MQTT 服务器用来标识正在使用的会话。ID 必须为 23 个字符或更少。默认为自动生成的 ID（基于套接字地址、端口和时间戳）

        }

    }

    /**
     * 设置阻塞 API
     */
    fun setBlockConnect() {
        val connection = mqtt.blockingConnection()
        // 连接
        connection.connect()
        // 发送消息
        connection.publish("foo", "Hello".toByteArray(), QoS.AT_LEAST_ONCE, false)


        // 断开连接
        connection.disconnect()
    }



}