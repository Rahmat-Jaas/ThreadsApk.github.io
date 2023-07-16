package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.5fd  reason: invalid class name and case insensitive filesystem */
public final class C91125fd extends C30884GaO {
    public final Context A00;

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer A01() {
        /*
            r9 = this;
            android.content.Context r0 = r9.A00     // Catch:{ IOException -> 0x0037 }
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = "strings/default.frsc"
            android.content.res.AssetFileDescriptor r2 = r1.openFd(r0)     // Catch:{ IOException -> 0x0037 }
            java.io.FileInputStream r1 = r2.createInputStream()     // Catch:{ all -> 0x0030 }
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch:{ all -> 0x0029 }
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0029 }
            long r5 = r2.getStartOffset()     // Catch:{ all -> 0x0029 }
            long r7 = r2.getLength()     // Catch:{ all -> 0x0029 }
            java.nio.MappedByteBuffer r0 = r3.map(r4, r5, r7)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x0030 }
            r2.close()     // Catch:{ IOException -> 0x0037 }
            return r0
        L_0x0029:
            r0 = move-exception
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "Error loading default.frsc"
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91125fd.A01():java.nio.ByteBuffer");
    }

    public C91125fd(Context context, C30999Gd7 gd7, Locale locale) {
        super(context, gd7, locale);
        this.A00 = context;
    }
}
