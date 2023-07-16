package X;

import com.facebook.redex.IDxCListenerShape673S0100000_2_I2;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.common.Feature;
import java.util.List;

/* renamed from: X.7II  reason: invalid class name */
public final class AnonymousClass7II {
    public static final byte[] A02 = new byte[0];
    public final C104766cL A00;
    public final C148618rZ A01;

    public static final C114936uA A00(C143508gr r4, C145268kD r5, AnonymousClass7II r6, String str, boolean z) {
        C114936uA r3 = new C114936uA();
        Integer ASm = r5.ASm();
        int intValue = ASm.intValue();
        if (intValue == 1) {
            str = "DEVICE_SCOPE_KEY_0";
        } else if (intValue != 0) {
            throw AnonymousClass4VZ.A00();
        }
        A01(r6, ASm, str).A01(new C125647dh(r3, r4, r5, r6, str, z));
        return r3;
    }

    public static final C114936uA A01(AnonymousClass7II r7, Integer num, String str) {
        List A0n;
        C114936uA r5 = new C114936uA();
        int intValue = num.intValue();
        if (intValue == 1) {
            A0n = C18180wK.A0n(str);
        } else if (intValue == 0) {
            A0n = C06750aI.A17(str, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
        } else {
            throw AnonymousClass4VZ.A00();
        }
        C13320nQ.A02(A0n, "Keys cannot be set to null");
        RetrieveBytesRequest retrieveBytesRequest = new RetrieveBytesRequest(A0n, false);
        C93245lF r2 = (C93245lF) r7.A01;
        AnonymousClass783 r1 = new AnonymousClass783((C97766Cr) null);
        r1.A03 = new Feature[]{C103896au.A07};
        r1.A01 = new C129297le(retrieveBytesRequest, r2);
        r1.A02 = false;
        r1.A00 = 1668;
        C129167lR.A01(r2, r1.A00(), 0).A07(new C129677mJ(r5, r7, num, str));
        return r5;
    }

    public static final C114936uA A02(AnonymousClass7II r6, String str, byte[] bArr, boolean z) {
        C114936uA r5 = new C114936uA();
        if (bArr.length > 4096) {
            r5.A02(new COV(new AnonymousClass662()));
            return r5;
        }
        C114936uA r3 = new C114936uA();
        C93245lF r4 = (C93245lF) r6.A01;
        AnonymousClass783 r2 = new AnonymousClass783((C97766Cr) null);
        r2.A03 = new Feature[]{C103896au.A04};
        r2.A01 = new C129267lb(r4);
        r2.A02 = false;
        r2.A00 = 1651;
        C129167lR.A01(r4, r2.A00(), 0).A07(new IDxCListenerShape673S0100000_2_I2(r3, 2));
        r3.A01(new C125637dg(r5, r6, str, bArr, z));
        return r5;
    }

    public AnonymousClass7II(C104766cL r1, C148618rZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
