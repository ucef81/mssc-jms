package org.mssc.jms.msscjms.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageEntity implements Serializable {

    static final long serialVersionId = -5815566940065181210L;
    private UUID id;
    private String message;
}
