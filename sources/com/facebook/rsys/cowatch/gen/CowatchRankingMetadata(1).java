package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.I17;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchRankingMetadata {
    public final String callType;
    public final ArrayList connectedPeerIds;
    public final String cowatchSessionId;
    public final String localCallId;
    public final String serverInfoData;
    public final String sharedCallId;

    public static native CowatchRankingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchRankingMetadata)) {
                return false;
            }
            CowatchRankingMetadata cowatchRankingMetadata = (CowatchRankingMetadata) obj;
            String str = this.localCallId;
            String str2 = cowatchRankingMetadata.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sharedCallId;
            String str4 = cowatchRankingMetadata.sharedCallId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.serverInfoData;
            String str6 = cowatchRankingMetadata.serverInfoData;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.callType.equals(cowatchRankingMetadata.callType)) {
                return false;
            }
            String str7 = this.cowatchSessionId;
            String str8 = cowatchRankingMetadata.cowatchSessionId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            return this.connectedPeerIds.equals(cowatchRankingMetadata.connectedPeerIds);
        }
    }

    public final int hashCode() {
        String str = this.callType;
        return C18220wO.A06(this.connectedPeerIds, (AnonymousClass0wJ.A07(str, (((C18210wN.A00(AnonymousClass0wJ.A06(this.localCallId)) + AnonymousClass0wJ.A06(this.sharedCallId)) * 31) + AnonymousClass0wJ.A06(this.serverInfoData)) * 31) + C18200wM.A09(this.cowatchSessionId)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchRankingMetadata{localCallId=");
        A0s.append(this.localCallId);
        A0s.append(",sharedCallId=");
        A0s.append(this.sharedCallId);
        A0s.append(I17.A00(31));
        A0s.append(this.serverInfoData);
        A0s.append(",callType=");
        A0s.append(this.callType);
        A0s.append(",cowatchSessionId=");
        A0s.append(this.cowatchSessionId);
        A0s.append(",connectedPeerIds=");
        A0s.append(this.connectedPeerIds);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchRankingMetadata(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        str4.getClass();
        arrayList.getClass();
        this.localCallId = str;
        this.sharedCallId = str2;
        this.serverInfoData = str3;
        this.callType = str4;
        this.cowatchSessionId = str5;
        this.connectedPeerIds = arrayList;
    }
}
