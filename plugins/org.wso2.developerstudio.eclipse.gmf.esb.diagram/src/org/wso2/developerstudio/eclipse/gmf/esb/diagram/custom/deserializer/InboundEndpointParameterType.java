/*
 * Copyright 2016 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import static org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage.Literals.*;

import org.eclipse.emf.ecore.EAttribute;
import org.wso2.developerstudio.eclipse.gmf.esb.persistence.InboundEndpointConstants;

/**
 * This Enum represent inbound endpoint parameters with parameter name , related EAttribute and boolean value indicating
 * whether it could hold key attribute
 *
 */
public enum InboundEndpointParameterType {

    INBOUND_HTTP_PORT_TYPE(InboundEndpointConstants.INBOUND_HTTP_PORT, INBOUND_ENDPOINT__INBOUND_HTTP_PORT, true),
    INTERVAL_TYPE(InboundEndpointConstants.INTERVAL, INBOUND_ENDPOINT__INTERVAL, true),
    INBOUND_WORKER_POOL_SIZE_CORE_TYPE(InboundEndpointConstants.INBOUND_WORKER_POOL_SIZE_CORE, 
            INBOUND_ENDPOINT__INBOUND_WORKER_POOL_SIZE_CORE,true),
    INBOUND_WORKER_POOL_SIZE_MAX_TYPE(InboundEndpointConstants.INBOUND_WORKER_POOL_SIZE_MAX,
            INBOUND_ENDPOINT__INBOUND_WORKER_POOL_SIZE_MAX, true),
    INBOUND_WORKER_THREAD_KEEP_ALIVE_SEC_TYPE(InboundEndpointConstants.INBOUND_WORKER_THREAD_KEEP_ALIVE_SEC,
            INBOUND_ENDPOINT__INBOUND_HTTP_PORT, true),
    INBOUND_WORKER_POOL_QUEUE_LENGTH_TYPE(InboundEndpointConstants.INBOUND_WORKER_POOL_QUEUE_LENGTH,
            INBOUND_ENDPOINT__INBOUND_WORKER_POOL_QUEUE_LENGTH, true),
    INBOUND_THREAD_GROUOP_ID_TYPE(InboundEndpointConstants.INBOUND_THREAD_GROUOP_ID,
            INBOUND_ENDPOINT__INBOUND_THREAD_GROUP_ID, true),
    INBOUND_THREAD_ID_TYPE(InboundEndpointConstants.INBOUND_THREAD_ID, INBOUND_ENDPOINT__INBOUND_THREAD_ID, true),
    DISPATCH_FILTER_PATTERN_TYPE(InboundEndpointConstants.DISPATCH_FILTER_PATTERN,
            INBOUND_ENDPOINT__DISPATCH_FILTER_PATTERN, true),
    
    VFS_FILE_URI_TYPE(InboundEndpointConstants.VFS_FILE_URI, INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_URI, true),
    VFS_CONTENT_TYPE_TYPE(InboundEndpointConstants.VFS_CONTENT_TYPE, INBOUND_ENDPOINT__TRANSPORT_VFS_CONTENT_TYPE, true),
    VFS_FILE_NAME_PATTERN_TYPE(InboundEndpointConstants.VFS_FILE_NAME_PATTERN,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_NAME_PATTERN, true),
    VFS_FILE_PROCESS_INTERVAL_TYPE(InboundEndpointConstants.VFS_FILE_PROCESS_INTERVAL,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_INTERVAL,true),
    VFS_FILE_PROCESS_COUNT_TYPE(InboundEndpointConstants.VFS_FILE_PROCESS_COUNT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_PROCESS_COUNT, true),
    VFS_MAX_RETRY_COUNT_TYPE(InboundEndpointConstants.VFS_MAX_RETRY_COUNT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MAX_RETRY_COUNT, true),
    VFS_RECONNECT_TIMEOUT_TYPE(InboundEndpointConstants.VFS_RECONNECT_TIMEOUT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_RECONNECT_TIMEOUT, true),
    VFS_MOVE_AFTER_PROCESS_TYPE(InboundEndpointConstants.VFS_MOVE_AFTER_PROCESS, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_PROCESS, true),
    VFS_MOVE_AFTER_FAILURE_TYPE(InboundEndpointConstants.VFS_MOVE_AFTER_FAILURE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_AFTER_FAILURE, true),
    VFS_MOVE_TIMESTAMP_FORMAT_TYPE(InboundEndpointConstants.VFS_MOVE_TIMESTAMP_FORMAT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_MOVE_TIMESTAMP_FORMAT,true),
    VFS_AUTO_LOCK_RELEASE_INTERVAL_TYPE(InboundEndpointConstants.VFS_AUTO_LOCK_RELEASE_INTERVAL,
            INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE_INTERVAL, true),
    VFS_DISTRIBUTED_TIMEOUT_TYPE(InboundEndpointConstants.VFS_DISTRIBUTED_TIMEOUT, 
            INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_TIMEOUT, true),
    VFS_SUBFOLDER_TIMESTAMP_FORMAT_TYPE(InboundEndpointConstants.VFS_SUBFOLDER_TIMESTAMP_FORMAT,
            INBOUND_ENDPOINT__TRANSPORT_VFS_SUB_FOLDER_TIMESTAMP_FORMAT, true),
    
    JMS_JAVA_NAMING_FACTORY_INITIAL_TYPE(InboundEndpointConstants.JMS_JAVA_NAMING_FACTORY_INITIAL, 
            INBOUND_ENDPOINT__JAVA_NAMING_FACTORY_INITIAL,true),
    JMS_JAVA_NAMING_PROVIDER_URL_TYPE(InboundEndpointConstants.JMS_JAVA_NAMING_PROVIDER_URL,
            INBOUND_ENDPOINT__JAVA_NAMING_PROVIDER_URL, true),
    JMS_CONNECTION_FACTORY_JNDI_NAME_TYPE(InboundEndpointConstants.JMS_CONNECTION_FACTORY_JNDI_NAME,
            INBOUND_ENDPOINT__TRANSPORT_JMS_CONNECTION_FACTORY_JNDI_NAME, true),
    JMS_DESTINATION_TYPE(InboundEndpointConstants.JMS_DESTINATION, INBOUND_ENDPOINT__TRANSPORT_JMS_DESTINATION, true),
    JMS_USERNAME_TYPE(InboundEndpointConstants.JMS_USERNAME, INBOUND_ENDPOINT__TRANSPORT_JMS_USER_NAME, true),
    JMS_PASSWORD_TYPE(InboundEndpointConstants.JMS_PASSWORD, INBOUND_ENDPOINT__TRANSPORT_JMS_PASSWORD, true),
    JMS_JMS_SPEC_VERSION_TYPE(InboundEndpointConstants.JMS_JMS_SPEC_VERSION, 
            INBOUND_ENDPOINT__TRANSPORT_JMSJMS_SPEC_VERSION, true),
    JMS_SUBSCRIPTION_DURABLE_TYPE(InboundEndpointConstants.JMS_SUBSCRIPTION_DURABLE, 
            INBOUND_ENDPOINT__TRANSPORT_JMS_SUBSCRIPTION_DURABLE,true),
    JMS_DURABLE_SUBSCRIBER_CLIENT_ID_TYPE(InboundEndpointConstants.JMS_DURABLE_SUBSCRIBER_CLIENT_ID,
            INBOUND_ENDPOINT__TRANSPORT_JMS_DURABLE_SUBSCRIBER_CLIENT_ID, true),
    JMS_MESSAGE_SELECTOR_TYPE(InboundEndpointConstants.JMS_MESSAGE_SELECTOR,
            INBOUND_ENDPOINT__TRANSPORT_JMS_MESSAGE_SELECTOR, true),
    JMS_RECIEVE_TIMEOUT_TYPE(InboundEndpointConstants.JMS_RECIEVE_TIMEOUT, 
            INBOUND_ENDPOINT__TRANSPORT_JMS_RECEIVE_TIMEOUT, true),
    JMS_CONTENT_TYPE_TYPE(InboundEndpointConstants.JMS_CONTENT_TYPE, INBOUND_ENDPOINT__TRANSPORT_JMS_CONTENT_TYPE, true),
    JMS_REPLY_DESTINATION_TYPE(InboundEndpointConstants.JMS_REPLY_DESTINATION,
            INBOUND_ENDPOINT__TRANSPORT_JMS_REPLY_DESTINATION, true),
    JMS_PUB_SUB_NO_LOCAL_TYPE(InboundEndpointConstants.JMS_PUB_SUB_NO_LOCAL,
            INBOUND_ENDPOINT__TRANSPORT_JMS_PUB_SUB_NO_LOCAL, true),
    JMS_DURABLE_SUBSCRIBER_NAME_TYPE(InboundEndpointConstants.JMS_DURABLE_SUBSCRIBER_NAME,
            INBOUND_ENDPOINT__TRANSPORT_JMS_DURABLE_SUBSCRIBER_NAME, true),
    JMS_CONTENT_TYPE_PROPERTY_TYPE(InboundEndpointConstants.JMS_CONTENT_TYPE_PROPERTY, 
            INBOUND_ENDPOINT__TRANSPORT_JMS_CONTENT_TYPE_PROPERTY,true),
    JMS_SUBSCRIPTION_NAME(InboundEndpointConstants.JMS_SUBSCRIPTION_NAME,INBOUND_ENDPOINT__TRANSPORT_JMS_SUBSCRIPTION_NAME,true),
    INBOUND_ENDPOINT_PINNED_SERVERS(InboundEndpointConstants.INBOUND_ENDPOINT_PINNED_SERVERS,INBOUND_ENDPOINT__TRANSPORT_JMS_PINNED_SERVERS,true),
    KEYSTORE_TYPE(InboundEndpointConstants.KEYSTORE, INBOUND_ENDPOINT__KEYSTORE, true),
    TRUSTSTORE_TYPE(InboundEndpointConstants.TRUSTSTORE, INBOUND_ENDPOINT__TRUSTSTORE, true),
    SSL_VERIFY_CLIENT_TYPE(InboundEndpointConstants.SSL_VERIFY_CLIENT, INBOUND_ENDPOINT__SSL_VERIFY_CLIENT, true),
    SSL_PROTOCOL_TYPE(InboundEndpointConstants.SSL_PROTOCOL, INBOUND_ENDPOINT__SSL_PROTOCOL, true),
    HTTPS_PROTOCOLS_TYPE(InboundEndpointConstants.HTTPS_PROTOCOLS, INBOUND_ENDPOINT__HTTPS_PROTOCOLS, true),
    CERTIFICATE_REVOCATION_VERIFIER_TYPE(InboundEndpointConstants.CERTIFICATE_REVOCATION_VERIFIER,
            INBOUND_ENDPOINT__CERTIFICATE_REVOCATION_VERIFIER, true),
    INBOUND_HL7_PORT_TYPE(InboundEndpointConstants.INBOUND_HL7_PORT, INBOUND_ENDPOINT__INBOUND_HL7_PORT, true),
    INBOUND_HL7_TIMEOUT_TYPE(InboundEndpointConstants.INBOUND_HL7_TIMEOUT, INBOUND_ENDPOINT__INBOUND_HL7_TIME_OUT, true),
    INBOUND_HL7_MESSAGE_PRE_PROCESSOR_TYPE(InboundEndpointConstants.INBOUND_HL7_MESSAGE_PRE_PROCESSOR,
            INBOUND_ENDPOINT__INBOUND_HL7_MESSAGE_PRE_PROCESSOR, true),
    INBOUND_HL7_CHARSET_TYPE(InboundEndpointConstants.INBOUND_HL7_CHARSET, INBOUND_ENDPOINT__INBOUND_HL7_CHAR_SET, true),
    INBOUND_HL7_BUILD_INVALID_MESSAGES_TYPE(InboundEndpointConstants.INBOUND_HL7_BUILD_INVALID_MESSAGES,
            INBOUND_ENDPOINT__INBOUND_HL7_BUILD_INVALID_MESSAGES, true),
    INBOUND_HL7_PASSTHROUHG_INVALID_MESSAGES_TYPE(InboundEndpointConstants.INBOUND_HL7_PASSTHROUHG_INVALID_MESSAGES,
            INBOUND_ENDPOINT__INBOUND_HL7_PASS_THROUGH_INVALID_MESSAGES, true),
    INBOUND_MQTT_CONNECTION_FACTORY_TYPE(InboundEndpointConstants.INBOUND_MQTT_CONNECTION_FACTORY,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_CONNECTION_FACTORY, true),
    INBOUND_MQTT_SERVER_HOST_NAME_TYPE(InboundEndpointConstants.INBOUND_MQTT_SERVER_HOST_NAME,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SERVER_HOST_NAME,true),
    INBOUND_MQTT_SERVER_PORT_TYPE(InboundEndpointConstants.INBOUND_MQTT_SERVER_PORT,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SERVER_PORT, true),
    INBOUND_MQTT_TOPIC_NAME_TYPE(InboundEndpointConstants.INBOUND_MQTT_TOPIC_NAME,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_TOPIC_NAME, true),
    INBOUND_MQTT_SSL_ENABLE_TYPE(InboundEndpointConstants.INBOUND_MQTT_SSL_ENABLE,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SSL_ENABLE, true),
    INBOUND_MQTT_TEMPORARY_STORE_DIRECTORY_TYPE(InboundEndpointConstants.INBOUND_MQTT_TEMPORARY_STORE_DIRECTORY,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_TEMPORARY_STORE_DIRECTORY, true),
    INBOUND_MQTT_SUBSCRIPTION_USERNAME_TYPE(InboundEndpointConstants.INBOUND_MQTT_SUBSCRIPTION_USERNAME,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SUBSCRIPTION_USERNAME, true),
    INBOUND_MQTT_SUBSCRIPTION_PASSWORD_TYPE(InboundEndpointConstants.INBOUND_MQTT_SUBSCRIPTION_PASSWORD,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SUBSCRIPTION_PASSWORD, true),
    INBOUND_MQTT_CLIENT_ID_TYPE(InboundEndpointConstants.INBOUND_MQTT_CLIENT_ID, 
            INBOUND_ENDPOINT__TRANSPORT_MQTT_CLIENT_ID, true),
    INBOUND_MQTT_RECONNECTION_INTERVAL_TYPE(InboundEndpointConstants.INBOUND_MQTT_RECONNECTION_INTERVAL, 
            INBOUND_ENDPOINT__INTERVAL, true),
    ZOOKEEPER_CONNECT_TYPE(InboundEndpointConstants.ZOOKEEPER_CONNECT, INBOUND_ENDPOINT__ZOOKEEPER_CONNECT, true),
    GROUP_ID_TYPE(InboundEndpointConstants.GROUP_ID, INBOUND_ENDPOINT__GROUP_ID, true),
    SIMPLE_TOPIC_TYPE(InboundEndpointConstants.SIMPLE_TOPIC, INBOUND_ENDPOINT__SIMPLE_CONSUMER_TOPIC, true),
    SIMPLE_BROKERS_TYPE(InboundEndpointConstants.SIMPLE_BROKERS, INBOUND_ENDPOINT__SIMPLE_CONSUMER_BROKERS, true),
    SIMPLE_PORT_TYPE(InboundEndpointConstants.SIMPLE_PORT, INBOUND_ENDPOINT__SIMPLE_CONSUMER_PORT, true),
    SIMPLE_PARTITION_TYPE(InboundEndpointConstants.SIMPLE_PARTITION, INBOUND_ENDPOINT__SIMPLE_CONSUMER_PARTITION, true),
    SIMPLE_MAX_MESSAGES_TO_READ_TYPE(InboundEndpointConstants.SIMPLE_MAX_MESSAGES_TO_READ,
            INBOUND_ENDPOINT__SIMPLE_CONSUMER_MAX_MESSAGES_TO_READ, true),
    THREAD_COUNT_TYPE(InboundEndpointConstants.THREAD_COUNT, INBOUND_ENDPOINT__THREAD_COUNT, true),
    CONSUMER_ID_TYPE(InboundEndpointConstants.CONSUMER_ID, INBOUND_ENDPOINT__CONSUMER_ID, true),
    SOCKET_TIMEOUT_MS_TYPE(InboundEndpointConstants.SOCKET_TIMEOUT_MS, INBOUND_ENDPOINT__SOCKET_TIMEOUT_MS, true),
    SOCKET_RECEIVE_BUFFER_BYTES_TYPE(InboundEndpointConstants.SOCKET_RECEIVE_BUFFER_BYTES,
            INBOUND_ENDPOINT__SOCKET_RECEIVE_BUFFER_BYTES, true),
    FETCH_MESSAGE_MAX_BYTES_TYPE(InboundEndpointConstants.FETCH_MESSAGE_MAX_BYTES,
            INBOUND_ENDPOINT__FETCH_MESSAGE_MAX_BYTES, true),
    NUM_CONSUMER_FETCHES_TYPE(InboundEndpointConstants.NUM_CONSUMER_FETCHES, INBOUND_ENDPOINT__NUM_CONSUMER_FETCHES,
            true),
    AUTO_COMMIT_ENABLE_TYPE(InboundEndpointConstants.AUTO_COMMIT_ENABLE, INBOUND_ENDPOINT__AUTO_COMMIT_ENABLE, true),
    AUTO_COMMIT_INTERVAL_MS_TYPE(InboundEndpointConstants.AUTO_COMMIT_INTERVAL_MS, 
            INBOUND_ENDPOINT__AUTO_COMMIT_INTERVAL_MS, true),
    QUEUED_MAX_MESSAGE_CHUNKS_TYPE(InboundEndpointConstants.QUEUED_MAX_MESSAGE_CHUNKS, 
            INBOUND_ENDPOINT__QUEUED_MAX_MESSAGE_CHUNKS, true),
    REBALANCE_MAX_RETRIES_TYPE(InboundEndpointConstants.REBALANCE_MAX_RETRIES, 
            INBOUND_ENDPOINT__REBALANCE_MAX_RETRIES, true),
    FETCH_MIN_BYTES_TYPE(InboundEndpointConstants.FETCH_MIN_BYTES, INBOUND_ENDPOINT__FETCH_MIN_BYTES, true),
    FETCH_WAIT_MAX_MS_TYPE(InboundEndpointConstants.FETCH_WAIT_MAX_MS, INBOUND_ENDPOINT__FETCH_WAIT_MAX_MS, true),
    REBALANCE_BACKOFF_MS_TYPE(InboundEndpointConstants.REBALANCE_BACKOFF_MS, INBOUND_ENDPOINT__REBALANCE_BACKOFF_MS,
            true),
    REFRESH_LEADER_BACKOFF_MS_TYPE(InboundEndpointConstants.REFRESH_LEADER_BACKOFF_MS, 
            INBOUND_ENDPOINT__REFRESH_LEADER_BACKOFF_MS, true),
    AUTO_OFFSET_RESET_TYPE(InboundEndpointConstants.AUTO_OFFSET_RESET, INBOUND_ENDPOINT__AUTO_OFFSET_RESET, true),
    CONSUMER_TIMEOUT_MS_TYPE(InboundEndpointConstants.CONSUMER_TIMEOUT_MS, INBOUND_ENDPOINT__CONSUMER_TIMEOUT_MS, true),
    EXCLUDE_INTERNAL_TOPICS_TYPE(InboundEndpointConstants.EXCLUDE_INTERNAL_TOPICS,
            INBOUND_ENDPOINT__EXCLUDE_INTERNAL_TOPICS, true),
    PARTITION_ASSIGNMENT_STRATEGY_TYPE(InboundEndpointConstants.PARTITION_ASSIGNMENT_STRATEGY,
            INBOUND_ENDPOINT__PARTITION_ASSIGNMENT_STRATEGY,true),
    CLIENT_ID_TYPE(InboundEndpointConstants.CLIENT_ID, INBOUND_ENDPOINT__CLIENT_ID, true),
    ZOOKEEPER_SESSION_TIMEOUT_MS_TYPE(InboundEndpointConstants.ZOOKEEPER_SESSION_TIMEOUT_MS,
            INBOUND_ENDPOINT__ZOOKEEPER_SESSION_TIMEOUT_MS, true),
    ZOOKEEPER_CONNECTION_TIMEOUT_MS_TYPE(InboundEndpointConstants.ZOOKEEPER_CONNECTION_TIMEOUT_MS,
            INBOUND_ENDPOINT__ZOOKEEPER_CONNECTION_TIMEOUT_MS, true),
    ZOOKEEPER_SYNC_TIME_MS_TYPE(InboundEndpointConstants.ZOOKEEPER_SYNC_TIME_MS,
            INBOUND_ENDPOINT__ZOOKEEPER_SYNC_TIME_MS, true),
    OFFSETS_STORAGE_TYPE(InboundEndpointConstants.OFFSETS_STORAGE, INBOUND_ENDPOINT__OFFSETS_STORAGE, true),
    OFFSETS_CHANNEL_BACKOFF_MS_TYPE(InboundEndpointConstants.OFFSETS_CHANNEL_BACKOFF_MS,
            INBOUND_ENDPOINT__OFFSETS_CHANNEL_BACKOFF_MS, true),
    OFFSETS_CHANNEL_SOCKET_TIMEOUT_MS_TYPE(InboundEndpointConstants.OFFSETS_CHANNEL_SOCKET_TIMEOUT_MS,
            INBOUND_ENDPOINT__OFFSETS_CHANNEL_SOCKET_TIMEOUT_MS, true),
    OFFSETS_COMMIT_MAX_RETRIES_TYPE(InboundEndpointConstants.OFFSETS_COMMIT_MAX_RETRIES,
            INBOUND_ENDPOINT__OFFSETS_COMMIT_MAX_RETRIES, true),
    DUAL_COMMIT_ENABLED_TYPE(InboundEndpointConstants.DUAL_COMMIT_ENABLED, INBOUND_ENDPOINT__DUAL_COMMIT_ENABLED,
            true),
    RABBITMQ_CONNECTION_FACTORY_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_FACTORY,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_FACTORY, true),
    RABBITMQ_SERVER_HOST_NAME_TYPE(InboundEndpointConstants.RABBITMQ_SERVER_HOST_NAME,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_HOST_NAME,true),
    RABBITMQ_SERVER_PORT_TYPE(InboundEndpointConstants.RABBITMQ_SERVER_PORT,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_PORT, true),
    RABBITMQ_SERVER_USER_NAME_TYPE(InboundEndpointConstants.RABBITMQ_SERVER_USER_NAME,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_USER_NAME,true),
    RABBITMQ_SERVER_PASSWORD_TYPE(InboundEndpointConstants.RABBITMQ_SERVER_PASSWORD,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_PASSWORD, true),
    RABBITMQ_QUEUE_NAME_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_NAME,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_NAME, true),
    RABBITMQ_EXCHANGE_NAME_TYPE(InboundEndpointConstants.RABBITMQ_EXCHANGE_NAME,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_EXCHANGE_NAME, true),
    RABBITMQ_QUEUE_DURABLE_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_DURABLE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_DURABLE, true),
    RABBITMQ_QUEUE_EXCLUSIVE_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_EXCLUSIVE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_EXCLUSIVE,true),
    RABBITMQ_QUEUE_AUTO_DELETE_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_AUTO_DELETE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_AUTO_DELETE, true),
    RABBITMQ_QUEUE_AUTO_ACK_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_AUTO_ACK,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_AUTO_ACK,true),
    RABBITMQ_QUEUE_ROUTING_KEY_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_ROUTING_KEY,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_ROUTING_KEY, true),
    RABBITMQ_QUEUE_DELIVERY_MODE_TYPE(InboundEndpointConstants.RABBITMQ_QUEUE_DELIVERY_MODE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_QUEUE_DELIVERY_MODE, true),
    RABBITMQ_EXCHANGE_TYPE_TYPE(InboundEndpointConstants.RABBITMQ_EXCHANGE_TYPE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_EXCHANGE_TYPE, true),
    RABBITMQ_EXCHANGE_DURABLE_TYPE(InboundEndpointConstants.RABBITMQ_EXCHANGE_DURABLE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_EXCHANGE_DURABLE,true),
    RABBITMQ_EXCHANGE_AUTO_DELETE_TYPE(InboundEndpointConstants.RABBITMQ_EXCHANGE_AUTO_DELETE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_EXCHANGE_AUTO_DELETE, true),
    RABBITMQ_SERVER_VIRTUAL_HOST_TYPE(InboundEndpointConstants.RABBITMQ_SERVER_VIRTUAL_HOST,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_VIRTUAL_HOST, true),
    RABBITMQ_FACTORY_HEARTBEAT_TYPE(InboundEndpointConstants.RABBITMQ_FACTORY_HEARTBEAT,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_FACTORY_HEARTBEAT, true),
    RABBITMQ_CONNECTION_SSL_ENABLED_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_ENABLED,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_ENABLED, true),
    RABBITMQ_CONNECTION_SSL_KEYSTORE_LOCATION_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_KEYSTORE_LOCATION,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_KEYSTORE_LOCATION, true),
    RABBITMQ_CONNECTION_SSL_KEYSTORE_TYPE_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_KEYSTORE_TYPE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_KEYSTORE_TYPE, true),
    RABBITMQ_CONNECTION_SSL_KEYSTORE_PASSWORD_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_KEYSTORE_PASSWORD,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_KEYSTORE_PASSWORD, true),
    RABBITMQ_CONNECTION_SSL_TRUSTSTORE_LOCATION_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_TRUSTSTORE_LOCATION,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_TRUSTSTORE_LOCATION, true),
    RABBITMQ_CONNECTION_SSL_TRUSTSTORE_TYPE_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_TRUSTSTORE_TYPE,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_TRUSTSTORE_TYPE, true),
    RABBITMQ_CONNECTION_SSL_TRUSTSTORE_PASSWORD_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_TRUSTSTORE_PASSWORD,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_TRUSTSTORE_PASSWORD, true),
    RABBITMQ_CONNECTION_SSL_VERSION_TYPE(InboundEndpointConstants.RABBITMQ_CONNECTION_SSL_VERSION,
            INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_SSL_VERSION, true),
    RABBITMQ_MESSAGE_CONTENT_TYPE(InboundEndpointConstants.RABBITMQ_MESSAGE_CONTENT_TYPE,
    		INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_MESSAGE_CONTENT_TYPE, true),
    RABBITMQ_CONNECTION_RETRY_COUNT(InboundEndpointConstants.RABBITMQ_CONNECTION_RETRY_COUNT,
    		INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_RETRY_COUNT, true),
    RABBITMQ_CONNECTION_RETRY_INTERVAL(InboundEndpointConstants.RABBITMQ_CONNECTION_RETRY_INTERVAL,
    		INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_CONNECTION_RETRY_INTERVAL, true),
    RABBITMQ_SERVER_RETRY_INTERVAL(InboundEndpointConstants.RABBITMQ_SERVER_RETRY_INTERVAL,
    		INBOUND_ENDPOINT__TRANSPORT_RABBIT_MQ_SERVER_RETRY_INTERVAL, true),
    INBOUND_FEED_URL_TYPE(InboundEndpointConstants.INBOUND_FEED_URL, INBOUND_ENDPOINT__TRANSPORT_FEED_URL, true),
    INBOUND_CXF_RM_HOST_TYPE(InboundEndpointConstants.INBOUND_CXF_RM_HOST, INBOUND_ENDPOINT__INBOUND_CXF_RM_HOST, true),
    INBOUND_CXF_RM_PORT_TYPE(InboundEndpointConstants.INBOUND_CXF_RM_PORT, INBOUND_ENDPOINT__INBOUND_CXF_RM_PORT, true),
    INBOUND_CXF_RM_CONFIG_FILE_TYPE(InboundEndpointConstants.INBOUND_CXF_RM_CONFIG_FILE,
            INBOUND_ENDPOINT__INBOUND_CXF_RM_CONFIG_FILE, true),
    SEQUENTIAL_TYPE(InboundEndpointConstants.SEQUENTIAL, INBOUND_ENDPOINT__SEQUENTIAL, false),
    COORDINATION_TYPE(InboundEndpointConstants.COORDINATION, INBOUND_ENDPOINT__COORDINATION, false),
    INBOUND_BEHAVIOUR_TYPE(InboundEndpointConstants.INBOUND_BEHAVIOUR, INBOUND_ENDPOINT__INBOUND_ENDPOINT_BEHAVIOUR,
            false),
    VFS_LOCKING_TYPE(InboundEndpointConstants.VFS_LOCKING, INBOUND_ENDPOINT__TRANSPORT_VFS_LOCKING, false),
    VFS_ACTION_AFTER_PROCESS_TYPE(InboundEndpointConstants.VFS_ACTION_AFTER_PROCESS,
            INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_PROCESS,false),
    VFS_ACTION_AFTER_FAILURE_TYPE(InboundEndpointConstants.VFS_ACTION_AFTER_FAILURE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_ACTION_AFTER_FAILURE, false),
    VFS_AUTO_LOCK_RELEASE_TYPE(InboundEndpointConstants.VFS_AUTO_LOCK_RELEASE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_AUTO_LOCK_RELEASE, false),
    VFS_LOCK_RELEASE_SAME_NODE_TYPE(InboundEndpointConstants.VFS_LOCK_RELEASE_SAME_NODE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_LOCK_RELEASE_SAME_NODE, false),
    VFS_DISTRIBUTED_LOCK_TYPE(InboundEndpointConstants.VFS_DISTRIBUTED_LOCK,
            INBOUND_ENDPOINT__TRANSPORT_VFS_DISTRIBUTED_LOCK, false),
    VFS_FILESORT_ATTRIBUTE_TYPE(InboundEndpointConstants.VFS_FILESORT_ATTRIBUTE,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ATTRIBUTE, false),
    VFS_FILESORT_ASCENDING_TYPE(InboundEndpointConstants.VFS_FILESORT_ASCENDING,
            INBOUND_ENDPOINT__TRANSPORT_VFS_FILE_SORT_ASCENDING, false),
    VFS_CREATE_FOLDER_TYPE(InboundEndpointConstants.VFS_CREATE_FOLDER,
            INBOUND_ENDPOINT__TRANSPORT_VFS_CREATE_FOLDER, false),
    VFS_STREAMING_TYPE(InboundEndpointConstants.VFS_STREAMING, INBOUND_ENDPOINT__TRANSPORT_VFS_STREAMING, false),
    VFS_BUILD_TYPE(InboundEndpointConstants.VFS_BUILD, INBOUND_ENDPOINT__TRANSPORT_VFS_BUILD, false),
    JMS_CONNECTION_FACTORY_TYPE_TYPE(InboundEndpointConstants.JMS_CONNECTION_FACTORY_TYPE,
            INBOUND_ENDPOINT__TRANSPORT_JMS_CONNECTION_FACTORY_TYPE, false),
    JMS_SESSION_TRANSACTED_TYPE(InboundEndpointConstants.JMS_SESSION_TRANSACTED,
            INBOUND_ENDPOINT__TRANSPORT_JMS_SESSION_TRANSACTED, false),
    JMS_SESSION_ACKNOWLEDGEMENT_TYPE(InboundEndpointConstants.JMS_SESSION_ACKNOWLEDGEMENT,
            INBOUND_ENDPOINT__TRANSPORT_JMS_SESSION_ACKNOWLEDGEMENT, false),
    JMS_CACHE_LEVEL_TYPE(InboundEndpointConstants.JMS_CACHE_LEVEL, INBOUND_ENDPOINT__TRANSPORT_JMS_CACHE_LEVEL, false),
    JMS_SHARED_SUBSCRIPTION(InboundEndpointConstants.JMS_SHARED_SUBSCRIPTION,INBOUND_ENDPOINT__TRANSPORT_JMS_SHARED_SUBSCRIPTION,false),
    INBOUND_HL7_AUTOACK_TYPE(InboundEndpointConstants.INBOUND_HL7_AUTOACK, INBOUND_ENDPOINT__INBOUND_HL7_AUTO_ACK,
            false),
    INBOUND_HL7_VALIDATE_MESSAGE_TYPE(InboundEndpointConstants.INBOUND_HL7_VALIDATE_MESSAGE, 
            INBOUND_ENDPOINT__INBOUND_HL7_VALIDATE_MESSAGE,false),
    INBOUND_MQTT_SUBSCRIPTION_QOS_TYPE(InboundEndpointConstants.INBOUND_MQTT_SUBSCRIPTION_QOS,
            INBOUND_ENDPOINT__TRANSPORT_MQTT_SUBSCRIPTION_QOS, false),
    CONTENT_TYPE_TYPE(InboundEndpointConstants.CONTENT_TYPE, INBOUND_ENDPOINT__CONTENT_TYPE, false),
    CONSUMER_TYPE_TYPE(InboundEndpointConstants.CONSUMER_TYPE, INBOUND_ENDPOINT__CONSUMER_TYPE, false),
    TOPICS_TYPE(InboundEndpointConstants.TOPICS, INBOUND_ENDPOINT__TOPICS_NAME, false),
    TOPIC_FILTER_TYPE(InboundEndpointConstants.TOPIC_FILTER, INBOUND_ENDPOINT__TOPIC_FILTER_NAME, false),
    INBOUND_FEED_TYPE_TYPE(InboundEndpointConstants.INBOUND_FEED_TYPE, INBOUND_ENDPOINT__TRANSPORT_FEED_TYPE, false),
    ENABLE_SSL_TYPE(InboundEndpointConstants.ENABLE_SSL, INBOUND_ENDPOINT__ENABLE_SSL, false),
    FILTER_FROM_WHITELIST_TYPE(InboundEndpointConstants.FILTER_FROM_WHITELIST, INBOUND_ENDPOINT__TOPIC_FILTER_FROM,
            false),
    FILTER_FROM_BLACKLIST_TYPE(InboundEndpointConstants.FILTER_FROM_BLACKLIST, INBOUND_ENDPOINT__TOPIC_FILTER_FROM,
            false);

    private final String name;
    private final EAttribute eAttributeValue;
    private final boolean holdsKeyValue;

    InboundEndpointParameterType(String name, EAttribute eAttributeValue, boolean holdsKeyValue) {
        this.name = name;
        this.eAttributeValue = eAttributeValue;
        this.holdsKeyValue = holdsKeyValue;
    }

    public String getName() {
        return name;
    }

    public EAttribute getEAttributeValue() {
        return eAttributeValue;
    }

    public boolean canHoldKeyValue() {
        return holdsKeyValue;
    }

    public boolean isMatchedWithParameterName(String parameterName) {
        if (this.name.equals(parameterName)) {
            return true;
        } else {
            return false;
        }
    }
}
