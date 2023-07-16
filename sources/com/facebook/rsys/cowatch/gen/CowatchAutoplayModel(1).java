package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplayModel {
    public final String actorId;
    public final CowatchAutoplaySimpleModel autoplay;
    public final String autoplayActionId;
    public final CowatchMediaInfoModel contentInfo;
    public final boolean needsUpdatePeer;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplayModel)) {
                return false;
            }
            CowatchAutoplayModel cowatchAutoplayModel = (CowatchAutoplayModel) obj;
            String str = this.sourceMediaId;
            String str2 = cowatchAutoplayModel.sourceMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sourceMediaSource;
            String str4 = cowatchAutoplayModel.sourceMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.autoplayActionId;
            String str6 = cowatchAutoplayModel.autoplayActionId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.actorId;
            String str8 = cowatchAutoplayModel.actorId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = this.autoplay;
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel2 = cowatchAutoplayModel.autoplay;
            if (cowatchAutoplaySimpleModel == null) {
                if (cowatchAutoplaySimpleModel2 != null) {
                    return false;
                }
            } else if (!cowatchAutoplaySimpleModel.equals(cowatchAutoplaySimpleModel2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.contentInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchAutoplayModel.contentInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            return this.needsUpdatePeer == cowatchAutoplayModel.needsUpdatePeer;
        }
    }

    public final int hashCode() {
        return ((((((((((C18210wN.A00(AnonymousClass0wJ.A06(this.sourceMediaId)) + AnonymousClass0wJ.A06(this.sourceMediaSource)) * 31) + AnonymousClass0wJ.A06(this.autoplayActionId)) * 31) + AnonymousClass0wJ.A06(this.actorId)) * 31) + AnonymousClass0wJ.A03(this.autoplay)) * 31) + C18200wM.A07(this.contentInfo)) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchAutoplayModel{sourceMediaId=");
        A0s.append(this.sourceMediaId);
        A0s.append(",sourceMediaSource=");
        A0s.append(this.sourceMediaSource);
        A0s.append(",autoplayActionId=");
        A0s.append(this.autoplayActionId);
        A0s.append(",actorId=");
        A0s.append(this.actorId);
        A0s.append(",autoplay=");
        A0s.append(this.autoplay);
        A0s.append(",contentInfo=");
        A0s.append(this.contentInfo);
        A0s.append(",needsUpdatePeer=");
        A0s.append(this.needsUpdatePeer);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchAutoplayModel(String str, String str2, String str3, String str4, CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel, CowatchMediaInfoModel cowatchMediaInfoModel, boolean z) {
        this.sourceMediaId = str;
        this.sourceMediaSource = str2;
        this.autoplayActionId = str3;
        this.actorId = str4;
        this.autoplay = cowatchAutoplaySimpleModel;
        this.contentInfo = cowatchMediaInfoModel;
        this.needsUpdatePeer = z;
    }
}
