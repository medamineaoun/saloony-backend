// src/config/eureka.js
import { Eureka } from 'eureka-js-client';

export const eurekaClient = new Eureka({
  instance: {
    app: 'NOTIFICATION-SERVICE',         
    instanceId: 'notification-service-node',
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
    statusPageUrl: 'http://localhost:5000',
    port: {
      '$': 5000,
      '@enabled': true,
    },
    vipAddress: 'notification-service',
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    },
  },
  eureka: {
    host: 'localhost',     // Adresse du serveur Eureka
    port: 8761,
    servicePath: '/eureka/apps/',
  },
});
