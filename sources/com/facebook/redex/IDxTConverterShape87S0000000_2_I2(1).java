package com.facebook.redex;

import X.C145818l8;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;

public class IDxTConverterShape87S0000000_2_I2 implements C145818l8 {
    public final int A00;

    public IDxTConverterShape87S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AEU(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return VideoEffectCommunicationApi.CProxy.createFromMcfType(mcfReference);
            case 1:
                return VideoEffectCommunicationParticipant.createFromMcfType(mcfReference);
            default:
                return VideoEffectCommunicationSharedEffectInfo.createFromMcfType(mcfReference);
        }
    }

    public final Class AwA() {
        switch (this.A00) {
            case 0:
                return VideoEffectCommunicationApi.class;
            case 1:
                return VideoEffectCommunicationParticipant.class;
            default:
                return VideoEffectCommunicationSharedEffectInfo.class;
        }
    }

    public final long BJ5() {
        switch (this.A00) {
            case 0:
                long j = VideoEffectCommunicationApi.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = VideoEffectCommunicationApi.CProxy.nativeGetMcfTypeId();
                VideoEffectCommunicationApi.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = VideoEffectCommunicationParticipant.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = VideoEffectCommunicationParticipant.nativeGetMcfTypeId();
                VideoEffectCommunicationParticipant.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            default:
                long j3 = VideoEffectCommunicationSharedEffectInfo.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = VideoEffectCommunicationSharedEffectInfo.nativeGetMcfTypeId();
                VideoEffectCommunicationSharedEffectInfo.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
        }
    }
}
