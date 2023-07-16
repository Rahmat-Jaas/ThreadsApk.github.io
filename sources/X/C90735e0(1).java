package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager;

/* renamed from: X.5e0  reason: invalid class name and case insensitive filesystem */
public final class C90735e0 extends I2S {
    public final Callback A00;
    public final Callback A01;
    public final String A02;
    public final /* synthetic */ ImageStoreManager A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90735e0(Callback callback, Callback callback2, IPF ipf, ImageStoreManager imageStoreManager, String str) {
        super(ipf);
        this.A03 = imageStoreManager;
        this.A02 = str;
        this.A01 = callback;
        this.A00 = callback2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A00(java.lang.Object[] r5) {
        /*
            r4 = this;
            com.facebook.react.modules.camera.ImageStoreManager r3 = r4.A03     // Catch:{ FileNotFoundException -> 0x0039 }
            X.IPD r0 = r3.getReactApplicationContext()     // Catch:{ FileNotFoundException -> 0x0039 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0039 }
            java.lang.String r0 = r4.A02     // Catch:{ FileNotFoundException -> 0x0039 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x0039 }
            java.io.InputStream r2 = r1.openInputStream(r0)     // Catch:{ FileNotFoundException -> 0x0039 }
            com.facebook.react.bridge.Callback r1 = r4.A01     // Catch:{ IOException -> 0x0022 }
            java.lang.String r0 = r3.convertInputStreamToBase64OutputStream(r2)     // Catch:{ IOException -> 0x0022 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x0022 }
            r1.invoke(r0)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0030
        L_0x0022:
            r0 = move-exception
            com.facebook.react.bridge.Callback r1 = r4.A00     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0034 }
            r1.invoke(r0)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            r2.close()     // Catch:{ IOException -> 0x0047 }
            return
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ FileNotFoundException -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            com.facebook.react.bridge.Callback r1 = r4.A00
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.invoke(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90735e0.A00(java.lang.Object[]):void");
    }
}
