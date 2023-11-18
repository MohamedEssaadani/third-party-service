package com.ess.thirdpartyservice.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MessageDTO {
    private String to;
    private String from;
    private String subject;
    private String body;
}
