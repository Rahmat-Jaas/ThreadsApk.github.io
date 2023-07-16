package com.facebook.rsys.media.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import com.facebook.djinni.msys.infra.McfReference;

public class UserStreamInfo {
    public final StreamInfo streamInfo;
    public final String userId;

    public static native UserStreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStreamInfo)) {
            return false;
        }
        UserStreamInfo userStreamInfo = (UserStreamInfo) obj;
        return this.userId.equals(userStreamInfo.userId) && this.streamInfo.equals(userStreamInfo.streamInfo);
    }

    public final int hashCode() {
        return C18220wO.A06(this.streamInfo, C18210wN.A00(this.userId.hashCode()));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("UserStreamInfo{userId=");
        A0s.append(this.userId);
        A0s.append(",streamInfo=");
        A0s.append(this.streamInfo);
        return C18180wK.A0i("}", A0s);
    }

    public UserStreamInfo(String str, StreamInfo streamInfo2) {
        str.getClass();
        streamInfo2.getClass();
        this.userId = str;
        this.streamInfo = streamInfo2;
    }
}
