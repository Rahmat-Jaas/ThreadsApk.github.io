package X;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: X.83S  reason: invalid class name */
public final class AnonymousClass83S implements Runnable, C145728kz, Choreographer.FrameCallback, AnonymousClass8cl {
    public static long A0A;
    public boolean A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final View A04;
    public final AnonymousClass84X A05 = AnonymousClass84X.A01(new C123087Vg[16]);
    public final Choreographer A06 = Choreographer.getInstance();
    public final C113626rp A07;
    public final C111656o6 A08;
    public final C1195976a A09;

    public AnonymousClass83S(View view, C113626rp r7, C111656o6 r8, C1195976a r9) {
        C04220Ms.A0B(view, 4);
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r7;
        this.A04 = view;
        if (A0A == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            A0A = (long) (((float) 1000000000) / f);
        }
    }

    public final void Biz() {
    }

    public final void Bzv() {
        this.A03 = false;
        this.A08.A00.CrC((Object) null);
        this.A04.removeCallbacks(this);
        this.A06.removeFrameCallback(this);
    }

    public final void CFR() {
        this.A08.A00.CrC(this);
        this.A03 = true;
    }

    public final void doFrame(long j) {
        if (this.A03) {
            this.A04.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = X.C18190wL.A0a("Failed requirement.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c7, code lost:
        if (r19 != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c9, code lost:
        r9.A06.postFrameCallback(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r9 = r20
            X.84X r10 = r9.A05
            int r0 = r10.A00
            boolean r0 = X.C18180wK.A1W(r0)
            r8 = 0
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x01cf
            android.view.View r1 = r9.A04
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L_0x01cf
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.getDrawingTime()
            long r17 = r2.toNanos(r0)
            long r0 = A0A
            long r17 = r17 + r0
            r19 = 0
        L_0x002d:
            int r0 = r10.A00
            if (r0 == 0) goto L_0x01c7
            if (r19 != 0) goto L_0x01c9
            java.lang.Object[] r0 = r10.A01
            r13 = r0[r8]
            X.7Vg r13 = (X.C123087Vg) r13
            X.6rp r7 = r9.A07
            X.0ZU r0 = r7.A01
            java.lang.Object r5 = r0.invoke()
            X.8p8 r5 = (X.C147308p8) r5
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x0199
            int r0 = r5.getItemCount()
            int r6 = r13.A02
            if (r6 < 0) goto L_0x0199
            if (r6 >= r0) goto L_0x0199
            X.8d0 r0 = r13.A00
            if (r0 != 0) goto L_0x00fc
            r1 = 187468576(0xb2c8b20, float:3.323066E-32)
            java.lang.String r0 = "compose:lazylist:prefetch:compose"
            X.C13790oJ.A01(r0, r1)
            long r14 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01a5 }
            long r3 = r9.A01     // Catch:{ all -> 0x01a5 }
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            goto L_0x00d2
        L_0x0068:
            java.lang.Object r5 = r5.Aql(r6)     // Catch:{ all -> 0x01a5 }
            X.0YP r6 = r7.A01(r5, r6)     // Catch:{ all -> 0x01a5 }
            X.76a r0 = r9.A09     // Catch:{ all -> 0x01a5 }
            r11 = 1
            X.7H8 r4 = r0.A00     // Catch:{ all -> 0x01a5 }
            if (r4 == 0) goto L_0x019e
            r4.A03()     // Catch:{ all -> 0x01a5 }
            java.util.Map r0 = r4.A09     // Catch:{ all -> 0x01a5 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x00b3
            java.util.Map r3 = r4.A08     // Catch:{ all -> 0x01a5 }
            java.lang.Object r7 = r3.get(r5)     // Catch:{ all -> 0x01a5 }
            if (r7 != 0) goto L_0x00ae
            X.7Y3 r7 = X.AnonymousClass7H8.A00(r4, r5)     // Catch:{ all -> 0x01a5 }
            if (r7 == 0) goto L_0x00df
            X.7Y3 r0 = r4.A06     // Catch:{ all -> 0x01a5 }
            X.6fg r0 = r0.A0Z     // Catch:{ all -> 0x01a5 }
            X.84X r2 = r0.A00     // Catch:{ all -> 0x01a5 }
            java.util.List r0 = r2.A04()     // Catch:{ all -> 0x01a5 }
            int r1 = r0.indexOf(r7)     // Catch:{ all -> 0x01a5 }
            int r0 = X.AnonymousClass84X.A00(r2)     // Catch:{ all -> 0x01a5 }
            X.AnonymousClass7H8.A01(r4, r1, r0)     // Catch:{ all -> 0x01a5 }
        L_0x00a5:
            int r0 = r4.A01     // Catch:{ all -> 0x01a5 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x01a5 }
            r3.put(r5, r7)     // Catch:{ all -> 0x01a5 }
        L_0x00ae:
            X.7Y3 r7 = (X.AnonymousClass7Y3) r7     // Catch:{ all -> 0x01a5 }
            X.AnonymousClass7H8.A02(r4, r7, r5, r6)     // Catch:{ all -> 0x01a5 }
        L_0x00b3:
            X.7Y6 r0 = new X.7Y6     // Catch:{ all -> 0x01a5 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x01a5 }
            r13.A00 = r0     // Catch:{ all -> 0x01a5 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01a5 }
            long r6 = r6 - r14
            long r4 = r9.A01     // Catch:{ all -> 0x01a5 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cf
            r0 = 4
            long r2 = (long) r0     // Catch:{ all -> 0x01a5 }
            long r4 = r4 / r2
            r0 = 3
            long r0 = (long) r0     // Catch:{ all -> 0x01a5 }
            long r4 = r4 * r0
            long r6 = r6 / r2
            long r6 = r6 + r4
        L_0x00cf:
            r9.A01 = r6     // Catch:{ all -> 0x01a5 }
            goto L_0x00da
        L_0x00d2:
            long r1 = r14 + r3
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            r19 = 1
        L_0x00da:
            r0 = -2005562980(0xffffffff8875899c, float:-7.3888765E-34)
            goto L_0x0194
        L_0x00df:
            X.7Y3 r2 = r4.A06     // Catch:{ all -> 0x01a5 }
            X.6fg r0 = r2.A0Z     // Catch:{ all -> 0x01a5 }
            X.84X r0 = r0.A00     // Catch:{ all -> 0x01a5 }
            int r1 = X.AnonymousClass84X.A00(r0)     // Catch:{ all -> 0x01a5 }
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass55K.A01     // Catch:{ all -> 0x01a5 }
            int r0 = r0.addAndGet(r11)     // Catch:{ all -> 0x01a5 }
            X.7Y3 r7 = new X.7Y3     // Catch:{ all -> 0x01a5 }
            r7.<init>(r11, r0)     // Catch:{ all -> 0x01a5 }
            r2.A0L = r11     // Catch:{ all -> 0x01a5 }
            r2.A0L(r7, r1)     // Catch:{ all -> 0x01a5 }
            r2.A0L = r8     // Catch:{ all -> 0x01a5 }
            goto L_0x00a5
        L_0x00fc:
            r1 = -422964995(0xffffffffe6ca10fd, float:-4.771157E23)
            java.lang.String r0 = "compose:lazylist:prefetch:measure"
            X.C13790oJ.A01(r0, r1)
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01bf }
            long r3 = r9.A02     // Catch:{ all -> 0x01bf }
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x010f
            goto L_0x0189
        L_0x010f:
            X.8d0 r0 = r13.A00     // Catch:{ all -> 0x01bf }
            X.C04220Ms.A0A(r0)     // Catch:{ all -> 0x01bf }
            X.7Y6 r0 = (X.AnonymousClass7Y6) r0     // Catch:{ all -> 0x01bf }
            X.7H8 r12 = r0.A00     // Catch:{ all -> 0x01bf }
            java.util.Map r11 = r12.A08     // Catch:{ all -> 0x01bf }
            java.lang.Object r7 = r0.A01     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r11.get(r7)     // Catch:{ all -> 0x01bf }
            X.7Y3 r0 = (X.AnonymousClass7Y3) r0     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x016e
            X.84X r0 = r0.A08()     // Catch:{ all -> 0x01bf }
            int r6 = X.AnonymousClass84X.A00(r0)     // Catch:{ all -> 0x01bf }
            r5 = 0
        L_0x012d:
            if (r5 >= r6) goto L_0x016e
            long r1 = r13.A03     // Catch:{ all -> 0x01bf }
            java.lang.Object r14 = r11.get(r7)     // Catch:{ all -> 0x01bf }
            X.7Y3 r14 = (X.AnonymousClass7Y3) r14     // Catch:{ all -> 0x01bf }
            if (r14 == 0) goto L_0x016b
            X.8nO r0 = r14.A0A     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x016b
            X.84X r0 = r14.A08()     // Catch:{ all -> 0x01bf }
            int r3 = X.AnonymousClass84X.A00(r0)     // Catch:{ all -> 0x01bf }
            if (r5 < 0) goto L_0x01b1
            if (r5 >= r3) goto L_0x01b1
            boolean r0 = r14.A0N     // Catch:{ all -> 0x01bf }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01aa
            X.7Y3 r4 = r12.A06     // Catch:{ all -> 0x01bf }
            r0 = 1
            r4.A0L = r0     // Catch:{ all -> 0x01bf }
            X.8nO r3 = X.AnonymousClass6F0.A00(r14)     // Catch:{ all -> 0x01bf }
            X.84X r0 = r14.A08()     // Catch:{ all -> 0x01bf }
            java.util.List r0 = r0.A04()     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x01bf }
            X.7Y3 r0 = (X.AnonymousClass7Y3) r0     // Catch:{ all -> 0x01bf }
            r3.Bg6(r0, r1)     // Catch:{ all -> 0x01bf }
            r4.A0L = r8     // Catch:{ all -> 0x01bf }
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x012d
        L_0x016e:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01bf }
            long r6 = r6 - r15
            long r4 = r9.A02     // Catch:{ all -> 0x01bf }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0183
            r0 = 4
            long r2 = (long) r0     // Catch:{ all -> 0x01bf }
            long r4 = r4 / r2
            r0 = 3
            long r0 = (long) r0     // Catch:{ all -> 0x01bf }
            long r4 = r4 * r0
            long r6 = r6 / r2
            long r6 = r6 + r4
        L_0x0183:
            r9.A02 = r6     // Catch:{ all -> 0x01bf }
            r10.A03(r8)     // Catch:{ all -> 0x01bf }
            goto L_0x0191
        L_0x0189:
            long r1 = r15 + r3
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x010f
            r19 = 1
        L_0x0191:
            r0 = 2103200297(0x7d5c4a29, float:1.8300951E37)
        L_0x0194:
            X.C13790oJ.A00(r0)
            goto L_0x002d
        L_0x0199:
            r10.A03(r8)
            goto L_0x002d
        L_0x019e:
            java.lang.String r0 = "SubcomposeLayoutState is not attached to SubcomposeLayout"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x01a5 }
            throw r0     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r1 = move-exception
            r0 = -1324544042(0xffffffffb10d0fd6, float:-2.0527202E-9)
            goto L_0x01c3
        L_0x01aa:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01be
        L_0x01b1:
            java.lang.String r1 = "Index ("
            java.lang.String r0 = ") is out of bound of [0, "
            java.lang.String r1 = X.C86134wK.A0l(r5, r3, r1, r0)     // Catch:{ all -> 0x01bf }
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x01bf }
            r0.<init>(r1)     // Catch:{ all -> 0x01bf }
        L_0x01be:
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r1 = move-exception
            r0 = 927444081(0x3747ac71, float:1.1901474E-5)
        L_0x01c3:
            X.C13790oJ.A00(r0)
            throw r1
        L_0x01c7:
            if (r19 == 0) goto L_0x01cf
        L_0x01c9:
            android.view.Choreographer r0 = r9.A06
            r0.postFrameCallback(r9)
            return
        L_0x01cf:
            r9.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83S.run():void");
    }
}
