package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import com.google.gson.annotations.SerializedName;

public final class BaseMessage {
    @SerializedName("type")
    public final String messageType;
    @SerializedName("id")
    public final String msgId;

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public BaseMessage(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.msgId = str;
        this.messageType = str2;
    }
}
