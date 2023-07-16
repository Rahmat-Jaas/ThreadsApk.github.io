package X;

import com.facebook.redex.IDxSCallbackShape308S0200000_2_I2;
import java.security.GeneralSecurityException;
import java.security.Signature;

/* renamed from: X.7k0  reason: invalid class name and case insensitive filesystem */
public final class C128657k0 implements C145348kM {
    public final /* synthetic */ IDxSCallbackShape308S0200000_2_I2 A00;
    public final /* synthetic */ C120967Dk A01;
    public final /* synthetic */ C112936qR A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.String] */
    public final void Blo(C108876j6 r4) {
        String e = 0;
        try {
            Signature signature = r4.A02;
            if (signature == null) {
                signature = AnonymousClass7HL.A01(((AnonymousClass583) this.A00.A00).A08, this.A01.A01);
            }
            e = C116996xx.A00(signature, this.A03);
        } catch (GeneralSecurityException e2) {
        } finally {
            this.A02.A00(e2, e2);
        }
    }

    public C128657k0(IDxSCallbackShape308S0200000_2_I2 iDxSCallbackShape308S0200000_2_I2, C120967Dk r2, C112936qR r3, byte[] bArr) {
        this.A00 = iDxSCallbackShape308S0200000_2_I2;
        this.A01 = r2;
        this.A03 = bArr;
        this.A02 = r3;
    }

    public final void Bln(Throwable th) {
        this.A02.A00((String) null, th);
    }
}
