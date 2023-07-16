package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.5dz  reason: invalid class name and case insensitive filesystem */
public final class C90725dz extends I2S {
    public final Context A00;
    public final Uri A01;
    public final C145858lE A02;

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119 A[SYNTHETIC, Splitter:B:64:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A00(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.String r3 = "Could not close output channel"
            java.lang.String r5 = "Could not close input channel"
            java.lang.String r2 = "ReactNative"
            android.net.Uri r6 = r12.A01
            java.lang.String r0 = r6.getPath()
            java.io.File r4 = X.C86144wL.A0Z(r0)
            r7 = 0
            java.lang.String r1 = r6.getScheme()     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            if (r0 != 0) goto L_0x002f
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            goto L_0x0040
        L_0x002f:
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            java.io.InputStream r0 = r0.openStream()     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
            java.nio.channels.ReadableByteChannel r8 = java.nio.channels.Channels.newChannel(r0)     // Catch:{ IOException -> 0x00f5, all -> 0x014d }
        L_0x0040:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.io.File r11 = X.C14620pq.A00(r0)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r11.mkdirs()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            boolean r0 = r11.isDirectory()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            if (r0 != 0) goto L_0x0064
            X.8lE r4 = r12.A02     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.lang.String r1 = "E_UNABLE_TO_LOAD"
            java.lang.String r0 = "External media storage directory not available"
            r4.reject(r1, r0)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            if (r8 == 0) goto L_0x0127
            boolean r0 = r8.isOpen()
            if (r0 == 0) goto L_0x0127
            r8.close()     // Catch:{ IOException -> 0x0123 }
            return
        L_0x0064:
            java.lang.String r0 = r4.getName()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.io.File r9 = X.C86154wM.A0U(r11, r0)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.lang.String r10 = r4.getName()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r4 = 46
            int r1 = r10.indexOf(r4)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r0 = 0
            if (r1 < 0) goto L_0x0087
            int r1 = r10.lastIndexOf(r4)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.lang.String r0 = r10.substring(r0, r1)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.lang.String r6 = r10.substring(r1)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r10 = r0
            goto L_0x0089
        L_0x0087:
            java.lang.String r6 = ""
        L_0x0089:
            r4 = 0
        L_0x008a:
            boolean r0 = r9.createNewFile()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "_"
            int r1 = r4 + 1
            java.lang.String r0 = X.AnonymousClass00U.A04(r4, r10, r0, r6)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.io.File r9 = X.C86154wM.A0U(r11, r0)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r4 = r1
            goto L_0x008a
        L_0x009e:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r0.<init>(r9)     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            java.nio.channels.FileChannel r4 = r0.getChannel()     // Catch:{ IOException -> 0x00ef, all -> 0x00ec }
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
        L_0x00ad:
            int r0 = r8.read(r1)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            if (r0 <= 0) goto L_0x00bd
            r1.flip()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            r4.write(r1)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            r1.compact()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            goto L_0x00ad
        L_0x00bd:
            r1.flip()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
        L_0x00c0:
            boolean r0 = r1.hasRemaining()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            if (r0 == 0) goto L_0x00ca
            r4.write(r1)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            goto L_0x00c0
        L_0x00ca:
            r8.close()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            r4.close()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            android.content.Context r6 = r12.A00     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            X.7MD r0 = new X.7MD     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            r0.<init>(r12)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            android.media.MediaScannerConnection.scanFile(r6, r1, r7, r0)     // Catch:{ IOException -> 0x00f2, all -> 0x012a }
            boolean r0 = r8.isOpen()
            if (r0 == 0) goto L_0x0113
            r8.close()     // Catch:{ IOException -> 0x010f }
            goto L_0x0113
        L_0x00ec:
            r1 = move-exception
            r4 = r7
            goto L_0x012b
        L_0x00ef:
            r1 = move-exception
            r4 = r7
            goto L_0x00f3
        L_0x00f2:
            r1 = move-exception
        L_0x00f3:
            r7 = r8
            goto L_0x00f7
        L_0x00f5:
            r1 = move-exception
            r4 = r7
        L_0x00f7:
            X.8lE r0 = r12.A02     // Catch:{ all -> 0x0128 }
            r0.reject(r1)     // Catch:{ all -> 0x0128 }
            if (r7 == 0) goto L_0x010c
            boolean r0 = r7.isOpen()
            if (r0 == 0) goto L_0x010c
            r7.close()     // Catch:{ IOException -> 0x0108 }
            goto L_0x010c
        L_0x0108:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r5, r0)
        L_0x010c:
            if (r4 == 0) goto L_0x0127
            goto L_0x0113
        L_0x010f:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r5, r0)
        L_0x0113:
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x0127
            r4.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0122
        L_0x011d:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r3, r0)
            return
        L_0x0122:
            return
        L_0x0123:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r5, r0)
        L_0x0127:
            return
        L_0x0128:
            r1 = move-exception
            goto L_0x012c
        L_0x012a:
            r1 = move-exception
        L_0x012b:
            r7 = r8
        L_0x012c:
            if (r7 == 0) goto L_0x013c
            boolean r0 = r7.isOpen()
            if (r0 == 0) goto L_0x013c
            r7.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r5, r0)
        L_0x013c:
            if (r4 == 0) goto L_0x014e
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L_0x014e
            r4.close()     // Catch:{ IOException -> 0x0148 }
            throw r1
        L_0x0148:
            r0 = move-exception
            X.AnonymousClass0JV.A03(r2, r3, r0)
            throw r1
        L_0x014d:
            r1 = move-exception
        L_0x014e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90725dz.A00(java.lang.Object[]):void");
    }

    public C90725dz(Uri uri, C145858lE r2, IPF ipf) {
        super(ipf);
        this.A00 = ipf;
        this.A01 = uri;
        this.A02 = r2;
    }
}
