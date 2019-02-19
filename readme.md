# 使用的版本
* springboot 2.0.8.RELEASE
* springcloud Finchley.RELEASE

# 启动顺序
* eureka-server
* config-server
* provider或consumer

# 访问地址
* 注册中心：http://localhost:8761/
* 提供者测试地址：http://localhost:7080/hello
* 消费者测试地址：http://localhost:8081/hello