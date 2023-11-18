package com.ess.thirdpartyservice.service;

import com.ess.thirdpartyservice.service.model.MessageDTO;

import java.util.List;

public class NotificationSMSServiceImpl implements INotificationService {
    @Override
    public boolean send(MessageDTO messageDTO) {
        return false;
    }

    @Override
    public boolean sendMany(List<MessageDTO> messages) {
        return false;
    }
}
