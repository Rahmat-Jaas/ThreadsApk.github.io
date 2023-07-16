package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.7hM  reason: invalid class name and case insensitive filesystem */
public final class C127567hM implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        M6x m6x;
        RecyclerView recyclerView = (RecyclerView) obj;
        C104746cJ r3 = ((C90975fO) obj2).A0C;
        if (r3 instanceof C91055fW) {
            C91055fW r32 = (C91055fW) r3;
            m6x = new StaggeredGridLayoutManager(r32.A00, r32.A00);
        } else if (r3 instanceof C91045fV) {
            C91045fV r33 = (C91045fV) r3;
            C04220Ms.A0B(context, 0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(r33.A00, false);
            linearLayoutManager.A1z(r33.A00);
            m6x = linearLayoutManager;
        } else {
            C91065fX r34 = (C91065fX) r3;
            C04220Ms.A0B(context, 0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(r34.A00, r34.A00);
            gridLayoutManager.A02 = r34.A01;
            m6x = gridLayoutManager;
        }
        recyclerView.setLayoutManager(m6x);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r2 != r1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean CtJ(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.5fO r5 = (X.C90975fO) r5
            X.5fO r6 = (X.C90975fO) r6
            X.6cJ r2 = r5.A0C
            X.6cJ r3 = r6.A0C
            boolean r0 = r2 instanceof X.C91055fW
            if (r0 == 0) goto L_0x0029
            X.5fW r2 = (X.C91055fW) r2
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C91055fW
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.5fW r3 = (X.C91055fW) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            int r2 = r2.A00
            int r1 = r3.A00
        L_0x0022:
            r0 = 1
            if (r2 == r1) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r0 = r0 ^ 1
            return r0
        L_0x0029:
            boolean r0 = r2 instanceof X.C91045fV
            if (r0 == 0) goto L_0x0044
            X.5fV r2 = (X.C91045fV) r2
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C91045fV
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.5fV r3 = (X.C91045fV) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            boolean r2 = r2.A00
            boolean r1 = r3.A00
            goto L_0x0022
        L_0x0044:
            X.5fX r2 = (X.C91065fX) r2
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = r3 instanceof X.C91065fX
            if (r0 == 0) goto L_0x0025
            int r1 = r2.A00
            X.5fX r3 = (X.C91065fX) r3
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            int r2 = r2.A00
            int r1 = r3.A00
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127567hM.CtJ(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).setLayoutManager((M6x) null);
    }
}
