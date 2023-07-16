package com.facebook.rsys.videoeffectcommunication.gen;

import X.C145818l8;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.redex.IDxTConverterShape87S0000000_2_I2;

public class VideoEffectCommunicationParticipant {
    public static C145818l8 CONVERTER = new IDxTConverterShape87S0000000_2_I2(1);
    public static long sMcfTypeId;
    public final boolean isActiveInCall;
    public final boolean isActiveInSameEffect;
    public final int loadStatus;
    public final String participantId;

    public static native VideoEffectCommunicationParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEffectCommunicationParticipant)) {
            return false;
        }
        VideoEffectCommunicationParticipant videoEffectCommunicationParticipant = (VideoEffectCommunicationParticipant) obj;
        return this.participantId.equals(videoEffectCommunicationParticipant.participantId) && this.isActiveInCall == videoEffectCommunicationParticipant.isActiveInCall && this.isActiveInSameEffect == videoEffectCommunicationParticipant.isActiveInSameEffect && this.loadStatus == videoEffectCommunicationParticipant.loadStatus;
    }

    public int hashCode() {
        return ((((C18210wN.A00(this.participantId.hashCode()) + (this.isActiveInCall ? 1 : 0)) * 31) + (this.isActiveInSameEffect ? 1 : 0)) * 31) + this.loadStatus;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("VideoEffectCommunicationParticipant{participantId=");
        A0s.append(this.participantId);
        A0s.append(",isActiveInCall=");
        A0s.append(this.isActiveInCall);
        A0s.append(",isActiveInSameEffect=");
        A0s.append(this.isActiveInSameEffect);
        A0s.append(",loadStatus=");
        A0s.append(this.loadStatus);
        return C18180wK.A0i("}", A0s);
    }

    public VideoEffectCommunicationParticipant(String str, boolean z, boolean z2, int i) {
        str.getClass();
        this.participantId = str;
        this.isActiveInCall = z;
        this.isActiveInSameEffect = z2;
        this.loadStatus = i;
    }
}
