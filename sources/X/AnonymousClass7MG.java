package X;

import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: X.7MG  reason: invalid class name */
public final class AnonymousClass7MG implements Handler.Callback {
    public ByteBuffer A00;
    public final /* synthetic */ AnonymousClass7A4 A01;

    public AnonymousClass7MG(AnonymousClass7A4 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (X.AnonymousClass7A4.A00(r2, r4, false) != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r19) {
        /*
            r18 = this;
            r3 = r19
            int r2 = r3.what
            r1 = 1
            r4 = r18
            if (r2 == r1) goto L_0x0127
            r0 = 2
            if (r2 == r0) goto L_0x008d
            r0 = 3
            if (r2 != r0) goto L_0x008c
            X.7A4 r4 = r4.A01
            java.lang.Object r3 = r3.obj
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00c4
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x00c4
            java.io.File r2 = X.C86144wL.A0Z(r3)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r2.canRead()
            if (r0 == 0) goto L_0x00c4
            r0 = 720(0x2d0, float:1.009E-42)
            android.graphics.Bitmap r7 = X.C25085DfV.A00(r3, r0)
            if (r7 == 0) goto L_0x00c4
            X.7Gh r5 = r4.A07
            X.6jH r6 = new X.6jH
            r6.<init>()
            int r3 = r7.getWidth()
            int r2 = r7.getHeight()
            r6.A00 = r7
            X.6gr r0 = r6.A02
            r0.A00 = r3
            r0.A01 = r2
            X.79P r2 = X.C121477Gh.A00(r6, r5)
            if (r2 != 0) goto L_0x0085
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
            int r2 = r2 * r0
            int[] r8 = new int[r2]
            int r10 = r7.getWidth()
            int r13 = r7.getWidth()
            int r14 = r7.getHeight()
            r9 = 0
            r11 = r9
            r12 = r9
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)
            int r3 = r7.getWidth()
            int r2 = r7.getHeight()
            X.5sX r0 = new X.5sX
            r0.<init>(r3, r8, r2)
            X.79P r2 = X.C121477Gh.A01(r0, r5)
            if (r2 != 0) goto L_0x0085
            r2 = 0
        L_0x0085:
            r0 = 0
            boolean r0 = X.AnonymousClass7A4.A00(r2, r4, r0)
            if (r0 == 0) goto L_0x00c4
        L_0x008c:
            return r1
        L_0x008d:
            android.os.Bundle r0 = r3.getData()
            if (r0 == 0) goto L_0x008c
            X.7A4 r7 = r4.A01
            com.instagram.arlink.fragment.YUVImageData r9 = new com.instagram.arlink.fragment.YUVImageData
            r9.<init>((android.os.Bundle) r0)
            X.7Gh r6 = r7.A07
            r10 = 0
            int r12 = r9.A01
            int r11 = r9.A02
            if (r12 == r11) goto L_0x00ca
            int r0 = r9.A00
            int r11 = r11 - r12
            int r0 = r0 * r12
            int r8 = r0 * 3
            byte[] r13 = new byte[r8]
            byte[] r5 = r9.A06
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x00b0:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x00e5
            if (r3 >= r8) goto L_0x00e5
            byte r0 = r5[r4]
            r13[r3] = r0
            int r2 = r2 + 1
            if (r2 != r12) goto L_0x00bf
            int r4 = r4 + r11
            r2 = 0
        L_0x00bf:
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x00b0
        L_0x00c4:
            X.8mF r0 = r4.A08
            r0.C28()
            return r1
        L_0x00ca:
            byte[] r8 = r9.A06
            int r5 = r8.length
            byte[] r4 = r9.A04
            int r0 = r4.length
            int r2 = r5 + r0
            byte[] r3 = r9.A05
            int r0 = r3.length
            int r2 = r2 + r0
            byte[] r13 = new byte[r2]
            java.lang.System.arraycopy(r8, r10, r13, r10, r5)
            int r2 = r8.length
            int r0 = r4.length
            java.lang.System.arraycopy(r4, r10, r13, r2, r0)
            int r2 = r2 + r0
            int r0 = r3.length
            java.lang.System.arraycopy(r3, r10, r13, r2, r0)
        L_0x00e5:
            X.6jH r8 = new X.6jH
            r8.<init>()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r13)
            int r4 = r9.A01
            int r3 = r9.A00
            if (r5 == 0) goto L_0x0120
            int r2 = r5.capacity()
            int r0 = r4 * r3
            if (r2 < r0) goto L_0x0119
            r8.A01 = r5
            X.6gr r0 = r8.A02
            r0.A00 = r4
            r0.A01 = r3
            X.79P r0 = X.C121477Gh.A00(r8, r6)
            if (r0 != 0) goto L_0x018e
            int r14 = r9.A01
            int r15 = r9.A00
            X.5sW r8 = new X.5sW
            r12 = r8
            r16 = r14
            r17 = r15
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x0187
        L_0x0119:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0120:
            java.lang.String r0 = "Null image data supplied."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0127:
            java.lang.Object r3 = r3.obj
            r3.getClass()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.nio.ByteBuffer r0 = r4.A00
            if (r0 == 0) goto L_0x013c
            int r2 = r0.capacity()
            int r0 = r3.capacity()
            if (r2 >= r0) goto L_0x0146
        L_0x013c:
            int r0 = r3.capacity()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r4.A00 = r0
        L_0x0146:
            r3.rewind()
            java.nio.ByteBuffer r0 = r4.A00
            r0.put(r3)
            java.nio.ByteBuffer r0 = r4.A00
            r0.flip()
            X.7A4 r7 = r4.A01
            java.nio.ByteBuffer r4 = r4.A00
            X.7Gh r6 = r7.A07
            int r10 = r7.A01
            int r11 = r7.A00
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.6jH r3 = new X.6jH
            r3.<init>()
            int r2 = r4.capacity()
            int r0 = r10 * r11
            if (r2 < r0) goto L_0x0192
            r3.A01 = r4
            X.6gr r0 = r3.A02
            r0.A00 = r10
            r0.A01 = r11
            X.79P r0 = X.C121477Gh.A00(r3, r6)
            if (r0 != 0) goto L_0x018e
            byte[] r9 = r4.array()
            X.5sW r8 = new X.5sW
            r12 = r10
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0187:
            X.79P r0 = X.C121477Gh.A01(r8, r6)
            if (r0 != 0) goto L_0x018e
            r0 = 0
        L_0x018e:
            X.AnonymousClass7A4.A00(r0, r7, r1)
            return r1
        L_0x0192:
            java.lang.String r0 = "Invalid image data size."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7MG.handleMessage(android.os.Message):boolean");
    }
}
