package X;

import java.io.InputStream;

/* renamed from: X.0am  reason: invalid class name and case insensitive filesystem */
public final class C07030am extends C14920qP {
    public int A00;
    public final /* synthetic */ C07820cF A01;

    public C07030am(C07820cF r1) {
        this.A01 = r1;
    }

    public final C14940qR A00() {
        C07820cF r3 = this.A01;
        r3.A03();
        C05740Vo[] r2 = r3.A00;
        int i = this.A00;
        this.A00 = i + 1;
        C05740Vo r22 = r2[i];
        InputStream inputStream = r3.A01.getInputStream(r22.A01);
        try {
            return new C12780mT(r22, inputStream);
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean A01() {
        C07820cF r0 = this.A01;
        r0.A03();
        if (this.A00 < r0.A00.length) {
            return true;
        }
        return false;
    }
}
