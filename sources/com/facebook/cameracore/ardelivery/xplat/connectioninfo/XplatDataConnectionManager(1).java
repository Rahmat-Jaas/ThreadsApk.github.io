package com.facebook.cameracore.ardelivery.xplat.connectioninfo;

import X.AnonymousClass006;
import X.AnonymousClass0fS;
import X.C04220Ms;
import X.C81184nI;
import android.net.NetworkInfo;
import java.util.Locale;

public final class XplatDataConnectionManager {
    public final C81184nI assetManagerDataConnectionManager;

    public XplatDataConnectionManager(C81184nI r2) {
        C04220Ms.A0B(r2, 1);
        this.assetManagerDataConnectionManager = r2;
    }

    public final String getBandwidthConnectionQuality() {
        Integer num;
        NetworkInfo A00 = AnonymousClass0fS.A00();
        if (A00 == null || !A00.isConnected()) {
            return "UNKNOWN";
        }
        int type = A00.getType();
        int subtype = A00.getSubtype();
        if (type != 1 && type == 0 && (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11)) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A0N;
        }
        switch (num.intValue()) {
            case 1:
                return "POOR";
            case 2:
                return "MODERATE";
            default:
                return "GOOD";
        }
    }

    public final String getConnectionName() {
        String str;
        NetworkInfo A00 = AnonymousClass0fS.A00();
        if (A00 == null || !A00.isConnected()) {
            str = "UNKNOWN";
        } else if (A00.getType() == 1) {
            str = A00.getTypeName().toUpperCase(Locale.US);
        } else {
            str = A00.getSubtypeName();
        }
        C04220Ms.A06(str);
        return str;
    }
}
