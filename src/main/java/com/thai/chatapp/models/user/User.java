package com.thai.chatapp.models.user;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;

}
