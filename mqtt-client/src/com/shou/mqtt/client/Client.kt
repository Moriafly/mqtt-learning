package com.shou.mqtt.client

import org.fusesource.mqtt.client.MQTT

/**
 * MQTT 客户端类
 * @author Wu Shihao
 * @since 2020/9/25
 */
class Client {
    private val mqtt = MQTT()

    /**
     * 初始化 mqtt
     */
    fun initMqtt() {
        mqtt.apply {
            setHost("localhost", 1883) // 设置端口
        }

    }
}