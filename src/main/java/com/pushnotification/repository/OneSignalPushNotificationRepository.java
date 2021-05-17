package com.pushnotification.repository;

import com.pushnotification.model.OneSignalPushNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Weslei Dias.
 */
public interface OneSignalPushNotificationRepository extends MongoRepository<OneSignalPushNotification, Long> {
}
