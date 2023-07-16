package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.7qL  reason: invalid class name and case insensitive filesystem */
public final class C130597qL implements C147008nE {
    public ByteArrayOutputStream A00;
    public File A01;
    public final UserSession A02;
    public final Context A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4, 36311345737499173L) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C130597qL(com.instagram.service.session.UserSession r4, android.content.Context r5, boolean r6) {
        /*
            r3 = this;
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            r3.<init>()
            r3.A03 = r5
            r3.A02 = r4
            r3.A04 = r6
            java.io.File r0 = X.C25651DpX.A00(r5, r4)
            r3.A01 = r0
            X.0Kh r0 = X.C03690Kh.A01()
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x002b
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311345737499173(0x8100fa00000225, double:3.02677948622325E-306)
            boolean r1 = X.C63803iN.A0E(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r3.A06 = r0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318913471255363(0x8107dc00151343, double:3.0315653515234824E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130597qL.<init>(com.instagram.service.session.UserSession, android.content.Context, boolean):void");
    }

    public static final void A00(C130597qL r6, ByteArrayOutputStream byteArrayOutputStream) {
        int A012 = C63803iN.A01(AnonymousClass0TJ.A05, r6.A02, 36608871007064981L);
        if (A012 == 0) {
            AnonymousClass0gN.A00().AKp(new AnonymousClass61D(r6, byteArrayOutputStream));
        } else if (A012 == 1) {
            A01(r6, byteArrayOutputStream);
        } else if (A012 == 2) {
            C83484rS r4 = GQH.A03;
            C132997ur r42 = (C132997ur) r4;
            r42.A03.execute(new C1364982y(new C955461d(r6, byteArrayOutputStream), r42, r42.A01, true));
        }
    }

    public static final void A01(C130597qL r5, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream fileOutputStream;
        File parentFile;
        if (!r5.A01.exists()) {
            r5.A01 = C25651DpX.A00(r5.A03, r5.A02);
        }
        File A0Z = C86144wL.A0Z(AnonymousClass00U.A0L(r5.A01.getPath(), ".pending"));
        try {
            fileOutputStream = new FileOutputStream(A0Z);
        } catch (FileNotFoundException unused) {
            File parentFile2 = A0Z.getParentFile();
            if (!(parentFile2 == null || parentFile2.exists() || (parentFile = A0Z.getParentFile()) == null)) {
                parentFile.mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(A0Z);
            } catch (FileNotFoundException e) {
                AnonymousClass0LU.A0E("FirstPageOnlyDeferStrategy", "swallowing error on open after retying to create and open", e);
                return;
            }
        }
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e2) {
            if (r5.A06) {
                AnonymousClass0LU.A0E("FirstPageOnlyDeferStrategy", "Exception on writing cache file", e2);
            } else {
                throw e2;
            }
        }
        try {
            fileOutputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            AnonymousClass0LU.A0E("FirstPageOnlyDeferStrategy", "Exception on closing file output stream", e3);
        } catch (Throwable th) {
            A0Z.renameTo(r5.A01);
            throw th;
        }
        A0Z.renameTo(r5.A01);
    }

    public final InputStream DBG(AnonymousClass3Ud r3, InputStream inputStream) {
        String str;
        if (r3 == null || (str = r3.A01) == null) {
            str = "";
        }
        if (!this.A04 || (this.A05 && !C04220Ms.A0I(str, "cache"))) {
            return inputStream;
        }
        return new AnonymousClass66B(this, inputStream);
    }

    public final void onFinish() {
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        if (byteArrayOutputStream != null) {
            A00(this, byteArrayOutputStream);
        }
    }
}
