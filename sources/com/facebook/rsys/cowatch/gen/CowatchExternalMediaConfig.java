package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchExternalMediaConfig {
    public final String appSwitchOauthUrl;
    public final String deeplinkUrl;
    public final long hostAppId;

    public static native CowatchExternalMediaConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchExternalMediaConfig)) {
            return false;
        }
        CowatchExternalMediaConfig cowatchExternalMediaConfig = (CowatchExternalMediaConfig) obj;
        return this.hostAppId == cowatchExternalMediaConfig.hostAppId && this.appSwitchOauthUrl.equals(cowatchExternalMediaConfig.appSwitchOauthUrl) && this.deeplinkUrl.equals(cowatchExternalMediaConfig.deeplinkUrl);
    }

    public final int hashCode() {
        return C18210wN.A05(this.deeplinkUrl, AnonymousClass0wJ.A07(this.appSwitchOauthUrl, C18210wN.A00(C18190wL.A02(this.hostAppId))));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchExternalMediaConfig{hostAppId=");
        A0s.append(this.hostAppId);
        A0s.append(",appSwitchOauthUrl=");
        A0s.append(this.appSwitchOauthUrl);
        A0s.append(",deeplinkUrl=");
        A0s.append(this.deeplinkUrl);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchExternalMediaConfig(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.hostAppId = j;
        this.appSwitchOauthUrl = str;
        this.deeplinkUrl = str2;
    }
}
