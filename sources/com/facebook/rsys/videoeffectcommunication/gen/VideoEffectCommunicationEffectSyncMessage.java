package com.facebook.rsys.videoeffectcommunication.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoEffectCommunicationEffectSyncMessage {
    public final int action;
    public final VideoEffectCommunicationSharedEffectInfo effectInfo;
    public final String senderId;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectSyncMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectSyncMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectSyncMessage videoEffectCommunicationEffectSyncMessage = (VideoEffectCommunicationEffectSyncMessage) obj;
            if (!this.effectInfo.equals(videoEffectCommunicationEffectSyncMessage.effectInfo) || this.action != videoEffectCommunicationEffectSyncMessage.action) {
                return false;
            }
            Map map = this.userIdToEffectId;
            Map map2 = videoEffectCommunicationEffectSyncMessage.userIdToEffectId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            String str = this.senderId;
            String str2 = videoEffectCommunicationEffectSyncMessage.senderId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        int A00 = (C18210wN.A00(this.effectInfo.hashCode()) + this.action) * 31;
        Map map = this.userIdToEffectId;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return ((A00 + hashCode) * 31) + C18200wM.A09(this.senderId);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VideoEffectCommunicationEffectSyncMessage{effectInfo=");
        A0s.append(this.effectInfo);
        A0s.append(",action=");
        A0s.append(this.action);
        A0s.append(",userIdToEffectId=");
        A0s.append(this.userIdToEffectId);
        A0s.append(",senderId=");
        A0s.append(this.senderId);
        return C18180wK.A0i("}", A0s);
    }

    public VideoEffectCommunicationEffectSyncMessage(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, int i, Map map, String str) {
        videoEffectCommunicationSharedEffectInfo.getClass();
        this.effectInfo = videoEffectCommunicationSharedEffectInfo;
        this.action = i;
        this.userIdToEffectId = map;
        this.senderId = str;
    }
}
