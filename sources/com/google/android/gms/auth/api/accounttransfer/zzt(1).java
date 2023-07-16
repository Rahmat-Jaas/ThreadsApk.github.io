package com.google.android.gms.auth.api.accounttransfer;

import X.AnonymousClass0wJ;
import X.C001000m;
import X.C122167Ky;
import X.C86114wI;
import X.C86124wJ;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzcc;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.Set;

public class zzt extends zzcc {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(62);
    public int A00;
    public String A01;
    public byte[] A02;
    public PendingIntent A03;
    public DeviceMetaData A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A07 = A0y;
        A0y.put("accountType", new FastJsonResponse$Field((Class) null, "accountType", 7, 7, 2, false, false));
        A0y.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, new FastJsonResponse$Field((Class) null, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 0, 0, 3, false, false));
        A0y.put("transferBytes", new FastJsonResponse$Field((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public zzt(PendingIntent pendingIntent, DeviceMetaData deviceMetaData, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A02 = bArr;
        this.A03 = pendingIntent;
        this.A04 = deviceMetaData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        Set set = this.A06;
        if (C86114wI.A1Z(set, 1)) {
            C122167Ky.A08(parcel, 1, this.A05);
        }
        if (C86114wI.A1Z(set, 2)) {
            C122167Ky.A0H(parcel, this.A01, 2, true);
        }
        if (C86114wI.A1Z(set, 3)) {
            C122167Ky.A08(parcel, 3, this.A00);
        }
        if (C86114wI.A1Z(set, 4)) {
            C122167Ky.A0L(parcel, this.A02, 4, true);
        }
        if (C86114wI.A1Z(set, 5)) {
            C122167Ky.A0D(parcel, this.A03, 5, i, true);
        }
        if (C86114wI.A1Z(set, 6)) {
            C122167Ky.A0D(parcel, this.A04, 6, i, true);
        }
        C122167Ky.A05(parcel, A002);
    }

    public zzt() {
        this.A06 = new C001000m(3);
        this.A05 = 1;
    }
}
