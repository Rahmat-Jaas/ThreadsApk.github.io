package com.facebook.rsys.videoeffectcommunication.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class VideoEffectCommunicationEffectMatchMessage {
    public final long activeCallLayoutEffectId;
    public final boolean readyToStartCallLayout;
    public final VideoEffectCommunicationSharedEffectInfo sharedEffectInfo;
    public final boolean shouldClearSharedEffectInfo;
    public final Map userIdToActiveEffectStatus;
    public final Map userIdToEffectId;

    public static native VideoEffectCommunicationEffectMatchMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationEffectMatchMessage)) {
                return false;
            }
            VideoEffectCommunicationEffectMatchMessage videoEffectCommunicationEffectMatchMessage = (VideoEffectCommunicationEffectMatchMessage) obj;
            Map map = this.userIdToEffectId;
            Map map2 = videoEffectCommunicationEffectMatchMessage.userIdToEffectId;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = this.sharedEffectInfo;
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo2 = videoEffectCommunicationEffectMatchMessage.sharedEffectInfo;
            if (videoEffectCommunicationSharedEffectInfo == null) {
                if (videoEffectCommunicationSharedEffectInfo2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationSharedEffectInfo.equals(videoEffectCommunicationSharedEffectInfo2)) {
                return false;
            }
            if (this.activeCallLayoutEffectId != videoEffectCommunicationEffectMatchMessage.activeCallLayoutEffectId || this.readyToStartCallLayout != videoEffectCommunicationEffectMatchMessage.readyToStartCallLayout || this.shouldClearSharedEffectInfo != videoEffectCommunicationEffectMatchMessage.shouldClearSharedEffectInfo) {
                return false;
            }
            Map map3 = this.userIdToActiveEffectStatus;
            Map map4 = videoEffectCommunicationEffectMatchMessage.userIdToActiveEffectStatus;
            if (map3 != null) {
                return map3.equals(map4);
            }
            if (map4 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int hashCode;
        Map map = this.userIdToEffectId;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int A00 = (((((((C18210wN.A00(hashCode) + AnonymousClass0wJ.A03(this.sharedEffectInfo)) * 31) + C18190wL.A02(this.activeCallLayoutEffectId)) * 31) + (this.readyToStartCallLayout ? 1 : 0)) * 31) + (this.shouldClearSharedEffectInfo ? 1 : 0)) * 31;
        Map map2 = this.userIdToActiveEffectStatus;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return A00 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VideoEffectCommunicationEffectMatchMessage{userIdToEffectId=");
        A0s.append(this.userIdToEffectId);
        A0s.append(",sharedEffectInfo=");
        A0s.append(this.sharedEffectInfo);
        A0s.append(",activeCallLayoutEffectId=");
        A0s.append(this.activeCallLayoutEffectId);
        A0s.append(",readyToStartCallLayout=");
        A0s.append(this.readyToStartCallLayout);
        A0s.append(",shouldClearSharedEffectInfo=");
        A0s.append(this.shouldClearSharedEffectInfo);
        A0s.append(",userIdToActiveEffectStatus=");
        A0s.append(this.userIdToActiveEffectStatus);
        return C18180wK.A0i("}", A0s);
    }

    public VideoEffectCommunicationEffectMatchMessage(Map map, VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, long j, boolean z, boolean z2, Map map2) {
        this.userIdToEffectId = map;
        this.sharedEffectInfo = videoEffectCommunicationSharedEffectInfo;
        this.activeCallLayoutEffectId = j;
        this.readyToStartCallLayout = z;
        this.shouldClearSharedEffectInfo = z2;
        this.userIdToActiveEffectStatus = map2;
    }
}
