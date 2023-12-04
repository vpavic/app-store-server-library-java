// Copyright (c) 2023 Apple Inc. Licensed under MIT License.

package com.apple.itunes.storekit.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The App Store server notification history record, including the signed notification payload and the result of the server’s first send attempt.
 *
 * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/notificationhistoryresponseitem">notificationHistoryResponseItem</a>
 */
public class NotificationHistoryResponseItem {
    private static final String SERIALIZED_NAME_SIGNED_PAYLOAD = "signedPayload";
    private static final String SERIALIZED_NAME_SEND_ATTEMPTS = "sendAttempts";
    @JsonProperty(SERIALIZED_NAME_SIGNED_PAYLOAD)
    private String signedPayload;
    @JsonProperty(SERIALIZED_NAME_SEND_ATTEMPTS)
    private List<SendAttemptItem> sendAttempts;
    @JsonAnySetter
    private Map<String, Object> unknownFields;


    public NotificationHistoryResponseItem() {
    }

    public NotificationHistoryResponseItem signedPayload(String signedPayload) {
        this.signedPayload = signedPayload;
        return this;
    }

    /**
     * A cryptographically signed payload, in JSON Web Signature (JWS) format, containing the response body for a version 2 notification.
     *
     * @return signedPayload
     * @see <a href="https://developer.apple.com/documentation/appstoreservernotifications/signedpayload">signedPayload</a>
     **/
    public String getSignedPayload() {
        return signedPayload;
    }

    public void setSignedPayload(String signedPayload) {
        this.signedPayload = signedPayload;
    }

    public NotificationHistoryResponseItem sendAttempts(List<SendAttemptItem> sendAttempts) {
        this.sendAttempts = sendAttempts;
        return this;
    }

    /**
     * An array of information the App Store server records for its attempts to send a notification to your server. The maximum number of entries in the array is six.
     *
     * @return sendAttempts
     * @see <a href="https://developer.apple.com/documentation/appstoreserverapi/sendattemptitem">sendAttemptItem</a>
     **/
    public List<SendAttemptItem> getSendAttempts() {
        return sendAttempts;
    }

    public void setSendAttempts(List<SendAttemptItem> sendAttempts) {
        this.sendAttempts = sendAttempts;
    }


    public NotificationHistoryResponseItem unknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
        return this;
    }

    /**
     Fields that are not recognized for this object

     @return A map of JSON keys to objects
     */
    public Map<String, Object> getUnknownFields() {
        return unknownFields;
    }

    public void setUnknownFields(Map<String, Object> unknownFields) {
        this.unknownFields = unknownFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationHistoryResponseItem notificationHistoryResponseItem = (NotificationHistoryResponseItem) o;
        return Objects.equals(this.signedPayload, notificationHistoryResponseItem.signedPayload) &&
                Objects.equals(this.sendAttempts, notificationHistoryResponseItem.sendAttempts) &&
                Objects.equals(this.unknownFields, notificationHistoryResponseItem.unknownFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signedPayload, sendAttempts, unknownFields);
    }

    @Override
    public String toString() {
        return "NotificationHistoryResponseItem{" +
                "signedPayload='" + signedPayload + '\'' +
                ", sendAttempts=" + sendAttempts +
                ", unknownFields=" + unknownFields +
                '}';
    }
}

