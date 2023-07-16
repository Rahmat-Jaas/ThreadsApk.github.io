package X;

import java.io.FileInputStream;

/* renamed from: X.0Ro  reason: invalid class name */
public final class AnonymousClass0Ro extends C14920qP {
    public int A00;
    public final /* synthetic */ C05240Sd A01;

    public AnonymousClass0Ro(C05240Sd r1) {
        this.A01 = r1;
    }

    public final C14940qR A00() {
        AnonymousClass0T2[] r2 = this.A01.A00;
        int i = this.A00;
        this.A00 = i + 1;
        AnonymousClass0T2 r22 = r2[i];
        FileInputStream fileInputStream = new FileInputStream(r22.A00);
        try {
            return new C12780mT(r22, fileInputStream);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public final boolean A01() {
        if (this.A00 < this.A01.A00.length) {
            return true;
        }
        return false;
    }
}
