package com.marcincho.service_msg.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageDeliveryStatusUpdate {
    private UUID id;
    private String content;
    private MessageDeliveryStatusEnum messageDeliveryStatusEnum;
}
