package com.ess.thirdpartyservice.service;

import com.ess.thirdpartyservice.service.model.MessageDTO;

import java.util.List;

/**
 * handle notifications (SMS, Email..)
 */
public interface INotificationService {
    boolean send(MessageDTO messageDTO);
    boolean sendMany(List<MessageDTO> messages);
}
