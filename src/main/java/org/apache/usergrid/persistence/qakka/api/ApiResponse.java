/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.persistence.qakka.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.usergrid.persistence.qakka.core.Queue;
import org.apache.usergrid.persistence.qakka.core.QueueMessage;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;


@ApiModel(value="ApiResponse", description="Response returned by most Queue API calls.")
@XmlRootElement
public class ApiResponse {

    private String message;
    private Integer count;
    private Collection<Queue> queues;
    private Collection<QueueMessage> queueMessages;

    @ApiModelProperty(value = "Queues returned but the call, or empty if not applicable.")
    public Collection<Queue> getQueues() {
        return queues;
    }

    public void setQueues(Collection<Queue> queues) {
        this.queues = queues;
    }

    @ApiModelProperty(value = "Queues Messages returned by the call, or empty if not applicable.")
    public Collection<QueueMessage> getQueueMessages() {
        return queueMessages;
    }

    public void setQueueMessages(Collection<QueueMessage> queueMessages) {
        this.queueMessages = queueMessages;
    }

    @ApiModelProperty(value = "Count of Queues or QueueMessages returned by the call.")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @ApiModelProperty(value = "Informative message intended for client.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
