package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchImpressionEvent {
    public final long duration;
    public final boolean isSearch;
    public final int itemPosition;
    public final String mediaId;
    public final String rankingRequestId;
    public final String sectionId;
    public final int sectionPosition;
    public final String tabId;
    public final String targetId;

    public static native CowatchImpressionEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchImpressionEvent)) {
                return false;
            }
            CowatchImpressionEvent cowatchImpressionEvent = (CowatchImpressionEvent) obj;
            String str = this.mediaId;
            String str2 = cowatchImpressionEvent.mediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.targetId;
            String str4 = cowatchImpressionEvent.targetId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.duration == cowatchImpressionEvent.duration && this.itemPosition == cowatchImpressionEvent.itemPosition && this.sectionId.equals(cowatchImpressionEvent.sectionId) && this.sectionPosition == cowatchImpressionEvent.sectionPosition && this.tabId.equals(cowatchImpressionEvent.tabId) && this.isSearch == cowatchImpressionEvent.isSearch && this.rankingRequestId.equals(cowatchImpressionEvent.rankingRequestId))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.sectionId;
        String str2 = this.tabId;
        return C18210wN.A05(this.rankingRequestId, (AnonymousClass0wJ.A07(str2, (AnonymousClass0wJ.A07(str, (((((C18210wN.A00(AnonymousClass0wJ.A06(this.mediaId)) + C18200wM.A09(this.targetId)) * 31) + C18190wL.A02(this.duration)) * 31) + this.itemPosition) * 31) + this.sectionPosition) * 31) + (this.isSearch ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchImpressionEvent{mediaId=");
        A0s.append(this.mediaId);
        A0s.append(",targetId=");
        A0s.append(this.targetId);
        A0s.append(",duration=");
        A0s.append(this.duration);
        A0s.append(",itemPosition=");
        A0s.append(this.itemPosition);
        A0s.append(",sectionId=");
        A0s.append(this.sectionId);
        A0s.append(",sectionPosition=");
        A0s.append(this.sectionPosition);
        A0s.append(",tabId=");
        A0s.append(this.tabId);
        A0s.append(",isSearch=");
        A0s.append(this.isSearch);
        A0s.append(",rankingRequestId=");
        A0s.append(this.rankingRequestId);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchImpressionEvent(String str, String str2, long j, int i, String str3, int i2, String str4, boolean z, String str5) {
        C18240wQ.A1L(str3, str4, str5);
        this.mediaId = str;
        this.targetId = str2;
        this.duration = j;
        this.itemPosition = i;
        this.sectionId = str3;
        this.sectionPosition = i2;
        this.tabId = str4;
        this.isSearch = z;
        this.rankingRequestId = str5;
    }
}
