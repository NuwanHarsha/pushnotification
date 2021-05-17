package com.pushnotification.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * Created by Weslei Dias.
 */
@Document(collection = "PushNotification")
public class OneSignalPushNotification {

    @Id
    private Long id;

    private String userName;

    private String idOneSignal;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdOneSignal() {
        return idOneSignal;
    }

    public void setIdOneSignal(String idOneSignal) {
        this.idOneSignal = idOneSignal;
    }
}
