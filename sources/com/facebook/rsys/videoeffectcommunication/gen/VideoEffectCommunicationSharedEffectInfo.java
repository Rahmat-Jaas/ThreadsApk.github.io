package com.facebook.rsys.videoeffectcommunication.gen;

import X.AnonymousClass0wJ;
import X.C145818l8;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.I17;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.redex.IDxTConverterShape87S0000000_2_I2;

public class VideoEffectCommunicationSharedEffectInfo {
    public static C145818l8 CONVERTER = new IDxTConverterShape87S0000000_2_I2(2);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationAdditionalEffectInfo additionalInfo;
    public final boolean applyOnJoin;
    public final String cryptoHash;
    public final long effectId;
    public final String effectName;
    public final String effectThumbnailUri;
    public final int effectType;
    public final String initiatorId;
    public final String initiatorName;
    public final boolean synchronizedStart;
    public final boolean synchronizedStop;

    public static native VideoEffectCommunicationSharedEffectInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationSharedEffectInfo)) {
                return false;
            }
            VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo = (VideoEffectCommunicationSharedEffectInfo) obj;
            if (this.effectId != videoEffectCommunicationSharedEffectInfo.effectId) {
                return false;
            }
            String str = this.effectName;
            String str2 = videoEffectCommunicationSharedEffectInfo.effectName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.effectThumbnailUri;
            String str4 = videoEffectCommunicationSharedEffectInfo.effectThumbnailUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.initiatorId;
            String str6 = videoEffectCommunicationSharedEffectInfo.initiatorId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.initiatorName;
            String str8 = videoEffectCommunicationSharedEffectInfo.initiatorName;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.cryptoHash;
            String str10 = videoEffectCommunicationSharedEffectInfo.cryptoHash;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.synchronizedStart != videoEffectCommunicationSharedEffectInfo.synchronizedStart || this.synchronizedStop != videoEffectCommunicationSharedEffectInfo.synchronizedStop || this.applyOnJoin != videoEffectCommunicationSharedEffectInfo.applyOnJoin || this.effectType != videoEffectCommunicationSharedEffectInfo.effectType) {
                return false;
            }
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo = this.additionalInfo;
            VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo2 = videoEffectCommunicationSharedEffectInfo.additionalInfo;
            if (videoEffectCommunicationAdditionalEffectInfo != null) {
                return videoEffectCommunicationAdditionalEffectInfo.equals(videoEffectCommunicationAdditionalEffectInfo2);
            }
            if (videoEffectCommunicationAdditionalEffectInfo2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((((((C18210wN.A00(C18190wL.A02(this.effectId)) + AnonymousClass0wJ.A06(this.effectName)) * 31) + AnonymousClass0wJ.A06(this.effectThumbnailUri)) * 31) + AnonymousClass0wJ.A06(this.initiatorId)) * 31) + AnonymousClass0wJ.A06(this.initiatorName)) * 31) + AnonymousClass0wJ.A06(this.cryptoHash)) * 31) + (this.synchronizedStart ? 1 : 0)) * 31) + (this.synchronizedStop ? 1 : 0)) * 31) + (this.applyOnJoin ? 1 : 0)) * 31) + this.effectType) * 31) + C18200wM.A07(this.additionalInfo);
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("VideoEffectCommunicationSharedEffectInfo{effectId=");
        A0s.append(this.effectId);
        A0s.append(",effectName=");
        A0s.append(this.effectName);
        A0s.append(",effectThumbnailUri=");
        A0s.append(this.effectThumbnailUri);
        A0s.append(I17.A00(144));
        A0s.append(this.initiatorId);
        A0s.append(",initiatorName=");
        A0s.append(this.initiatorName);
        A0s.append(",cryptoHash=");
        A0s.append(this.cryptoHash);
        A0s.append(",synchronizedStart=");
        A0s.append(this.synchronizedStart);
        A0s.append(",synchronizedStop=");
        A0s.append(this.synchronizedStop);
        A0s.append(",applyOnJoin=");
        A0s.append(this.applyOnJoin);
        A0s.append(",effectType=");
        A0s.append(this.effectType);
        A0s.append(",additionalInfo=");
        A0s.append(this.additionalInfo);
        return C18180wK.A0i("}", A0s);
    }

    public VideoEffectCommunicationSharedEffectInfo(long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, int i, VideoEffectCommunicationAdditionalEffectInfo videoEffectCommunicationAdditionalEffectInfo) {
        this.effectId = j;
        this.effectName = str;
        this.effectThumbnailUri = str2;
        this.initiatorId = str3;
        this.initiatorName = str4;
        this.cryptoHash = str5;
        this.synchronizedStart = z;
        this.synchronizedStop = z2;
        this.applyOnJoin = z3;
        this.effectType = i;
        this.additionalInfo = videoEffectCommunicationAdditionalEffectInfo;
    }
}
