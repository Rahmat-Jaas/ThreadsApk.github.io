package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1z9  reason: invalid class name and case insensitive filesystem */
public class C29701z9 extends File implements C83994sM {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (X.AnonymousClass1QP) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADh() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass1QP
            if (r0 == 0) goto L_0x001f
            r3 = r4
            X.1QP r3 = (X.AnonymousClass1QP) r3
            android.content.Context r2 = r3.A00
            if (r2 == 0) goto L_0x001f
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            android.content.Intent r1 = X.C18250wR.A05(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r3)
            r1.setData(r0)
            r2.sendBroadcast(r1)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29701z9.ADh():void");
    }

    public final OutputStream BMO() {
        if (this instanceof AnonymousClass1QP) {
            return new FileOutputStream(this);
        }
        return new FileOutputStream(this, false);
    }

    public C29701z9(File file) {
        super(file.getPath());
    }

    public final void DBQ(InputStream inputStream) {
        OutputStream BMO = BMO();
        try {
            AnonymousClass2CX.A00(inputStream, BMO);
            BMO.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public C29701z9(File file, String str) {
        super(file, str);
    }

    public C29701z9(String str) {
        super(str);
    }
}
