package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.instagram.barcelona.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.44n  reason: invalid class name and case insensitive filesystem */
public final class C685844n implements C82364pV {
    public LLF A00 = null;
    public C121247Ez A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final C18510xJ A04 = new C18510xJ(Looper.getMainLooper(), new C64463kW(this));
    public final C83454rP A05;
    public final C555933v A06;
    public final Map A07;
    public final Map A08;
    public final Set A09 = C18200wM.A0u();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C = false;

    public static void A00(C685844n r1, int i) {
        C81854oV r12 = (C81854oV) r1.A0B.get();
        if (r12 != null) {
            C41228M0s.A01(AnonymousClass00U.A0J("BloksSurface_notify_on_render_surface_", i));
            try {
                r12.CFx(i);
            } finally {
                C41228M0s.A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A01(C685844n r6, C24551ja r7, int i, int i2) {
        A00(r6, 10);
        AnonymousClass4QY r5 = new AnonymousClass4QY(r6, i2);
        C41228M0s.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = r6.A08;
            map.putAll(r7.A03);
            C58513Fy r2 = new C58513Fy(r6.A02, r7.A00, r6.A05);
            r2.A01 = map;
            r2.A02 = r6.A07;
            SparseArray clone = r6.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, r5);
            r2.A00 = clone;
            C121247Ez A002 = r2.A00();
            C41228M0s.A00();
            AnonymousClass145 r22 = new AnonymousClass145(A002, i);
            C18510xJ r1 = r6.A04;
            r1.A00(r1.obtainMessage(1, r22));
        } catch (Throwable th) {
            C41228M0s.A00();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r3 == 2) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGv(X.C555933v r7) {
        /*
            r6 = this;
            X.3SZ r0 = r7.A00
            int r3 = r0.A00
            r2 = 4
            if (r3 == r2) goto L_0x003d
            r0 = 5
            if (r3 == r0) goto L_0x003d
            r1 = 3
            r5 = 1
            r0 = 0
            if (r3 != r1) goto L_0x0011
            r0 = 1
            r2 = 5
        L_0x0011:
            A00(r6, r2)
            if (r0 != 0) goto L_0x003d
            r0 = 6
            A00(r6, r0)
            X.AnonymousClass794.A00()
            if (r3 == 0) goto L_0x0025
            if (r3 == r5) goto L_0x0025
            r0 = 2
            r1 = -1
            if (r3 != r0) goto L_0x0027
        L_0x0025:
            r1 = 9
        L_0x0027:
            boolean r0 = r7 instanceof X.C24551ja
            r4 = 7
            if (r0 == 0) goto L_0x003e
            X.1ja r7 = (X.C24551ja) r7
            boolean r0 = r6.A0C
            r3 = 13
            r2 = 12
            if (r0 == 0) goto L_0x0052
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
        L_0x003d:
            return
        L_0x003e:
            boolean r0 = r7 instanceof X.AnonymousClass1jZ
            if (r0 == 0) goto L_0x003d
            X.1jZ r7 = (X.AnonymousClass1jZ) r7
            X.3St r0 = r7.A00
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.util.Map r1 = r7.A01
            r0 = 11
            r6.A02(r2, r1, r0, r4)
            return
        L_0x0052:
            A01(r6, r7, r4, r1)
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
            r6.A0C = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C685844n.CGv(X.33v):void");
    }

    public C685844n(Context context, SparseArray sparseArray, C121997Jj r7, C83454rP r8, Map map, Map map2) {
        C24551ja r2 = null;
        this.A05 = r8;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A06 = r7 != null ? new C24551ja(r7, AnonymousClass3SZ.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }

    private void A02(List list, Map map, int i, int i2) {
        if (!list.isEmpty()) {
            A00(this, i);
            C18510xJ r2 = this.A04;
            r2.A00(r2.obtainMessage(2, new AnonymousClass146(list, map, i2)));
        }
    }
}
