package X;

import com.facebook.redex.IDxCListenerShape673S0100000_2_I2;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;

/* renamed from: X.7dg  reason: invalid class name and case insensitive filesystem */
public final class C125637dg implements C143268gR {
    public final /* synthetic */ C114936uA A00;
    public final /* synthetic */ AnonymousClass7II A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public C125637dg(C114936uA r1, AnonymousClass7II r2, String str, byte[] bArr, boolean z) {
        this.A03 = z;
        this.A04 = bArr;
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        boolean z = true;
        if (!C18190wL.A1Z(obj, true) || !this.A03) {
            z = false;
        }
        byte[] bArr = this.A04;
        String str = this.A02;
        C13320nQ.A05(str, "key cannot be null or empty");
        StoreBytesData storeBytesData = new StoreBytesData(str, bArr, z);
        C93245lF r5 = (C93245lF) this.A01.A01;
        AnonymousClass783 r4 = new AnonymousClass783((C97766Cr) null);
        r4.A03 = new Feature[]{C103896au.A03, C103896au.A05};
        r4.A01 = new C129287ld(storeBytesData, r5);
        r4.A00 = 1645;
        r4.A02 = false;
        C129167lR.A01(r5, r4.A00(), 1).A07(new IDxCListenerShape673S0100000_2_I2(this.A00, 1));
    }
}
