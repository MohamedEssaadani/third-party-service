package com.ess.thirdpartyservice.service;

import com.ess.thirdpartyservice.service.model.MessageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationMailServiceImpl implements INotificationService {
    private final JavaMailSender javaMailSender;

    @Override
    public boolean send(MessageDTO messageDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(messageDTO.getFrom());
        message.setTo(messageDTO.getTo());
        message.setSubject(messageDTO.getSubject());
        message.setText(messageDTO.getBody());

        try {
            log.info("Sending Email :" + messageDTO);

            javaMailSender.send(message);

            log.info("Email sent successfully :" + messageDTO);
        } catch (Exception exception) {
            log.error("Exception while sending email message :" + exception);
            return false;
        }

        return true;
    }

    @Override
    public boolean sendMany(List<MessageDTO> messages) {
        return false;
    }
}
