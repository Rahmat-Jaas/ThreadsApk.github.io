package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxCallbackShape11S0200000_2_I2;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.5AD  reason: invalid class name */
public abstract class AnonymousClass5AD extends C41030Luu {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03;
    public final C105846e5 A04;

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public void A00(C108796ix r8) {
        M6x m6x;
        int i = this.A00;
        int i2 = r8.A00;
        boolean z = true;
        boolean z2 = false;
        boolean A1T = C86114wI.A1T(i, i2);
        int i3 = this.A01;
        int i4 = r8.A01;
        boolean A1T2 = C86114wI.A1T(i3, i4);
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (m6x = recyclerView.A0H) == null)) {
            if ((!m6x.A1b() || !A1T) && (!this.A02.A0H.A1c() || !A1T2)) {
                z = false;
            }
            z2 = z;
        }
        this.A01 = i4;
        this.A00 = i2;
        List list = this.A03;
        this.A03 = r8.A02;
        if (z2) {
            notifyDataSetChanged();
        } else {
            C41069Lvu.A00(new IDxCallbackShape11S0200000_2_I2(0, this, list)).A02(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r4 != null) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.M5O r14, int r15) {
        /*
            r13 = this;
            X.5Aw r14 = (X.C88835Aw) r14
            X.6e5 r2 = r13.A04
            if (r2 == 0) goto L_0x0095
            int r0 = r13.A01
            r1 = -1
            if (r0 == r1) goto L_0x0095
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.6hm r0 = (X.C108076hm) r0
            X.7h3 r9 = r0.A01
            int r5 = r13.A01
            int r6 = r13.A00
            int r8 = r2.A00
            r0 = -2
            r7 = 1
            r2 = 0
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r8 != r7) goto L_0x0048
            r4.<init>(r1, r0)
        L_0x0025:
            r3 = 132(0x84, float:1.85E-43)
            X.7h3 r0 = r9.A0K(r3)
            if (r0 == 0) goto L_0x00a0
            X.7h3 r0 = r9.A0K(r3)
            int r1 = r0.A03
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00a0
            X.7h3 r12 = r9.A0K(r3)
            java.lang.String r9 = X.C127397h3.A0D(r12)
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r8 != 0) goto L_0x0071
            if (r9 == 0) goto L_0x0071
            goto L_0x004c
        L_0x0048:
            r4.<init>(r0, r1)
            goto L_0x0025
        L_0x004c:
            X.77p r1 = X.AnonymousClass7Kk.A0C(r9)     // Catch:{ 1zB -> 0x0068 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 1zB -> 0x0068 }
            int r0 = r0.intValue()     // Catch:{ 1zB -> 0x0068 }
            if (r0 == r2) goto L_0x0062
            if (r0 != r7) goto L_0x0071
            float r1 = r1.A00     // Catch:{ 1zB -> 0x0068 }
            float r0 = (float) r5     // Catch:{ 1zB -> 0x0068 }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 1zB -> 0x0068 }
            double r0 = r0 / r10
            int r5 = (int) r0     // Catch:{ 1zB -> 0x0068 }
            goto L_0x0065
        L_0x0062:
            float r0 = r1.A00     // Catch:{ 1zB -> 0x0068 }
            int r5 = (int) r0     // Catch:{ 1zB -> 0x0068 }
        L_0x0065:
            r4.width = r5     // Catch:{ 1zB -> 0x0068 }
            goto L_0x0071
        L_0x0068:
            java.lang.String r0 = "Error parsing style width: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r9)
            X.C30967GcS.A02(r3, r0)
        L_0x0071:
            java.lang.String r5 = X.C18220wO.A0o(r12)
            if (r8 != r7) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            X.77p r1 = X.AnonymousClass7Kk.A0C(r5)     // Catch:{ 1zB -> 0x0097 }
            java.lang.Integer r0 = r1.A01     // Catch:{ 1zB -> 0x0097 }
            int r0 = r0.intValue()     // Catch:{ 1zB -> 0x0097 }
            if (r0 == r2) goto L_0x008f
            if (r0 != r7) goto L_0x00a0
            float r1 = r1.A00     // Catch:{ 1zB -> 0x0097 }
            float r0 = (float) r6     // Catch:{ 1zB -> 0x0097 }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 1zB -> 0x0097 }
            double r0 = r0 / r10
            int r2 = (int) r0     // Catch:{ 1zB -> 0x0097 }
            goto L_0x0092
        L_0x008f:
            float r0 = r1.A00     // Catch:{ 1zB -> 0x0097 }
            int r2 = (int) r0     // Catch:{ 1zB -> 0x0097 }
        L_0x0092:
            r4.height = r2     // Catch:{ 1zB -> 0x0097 }
            goto L_0x00a0
        L_0x0095:
            r4 = 0
            goto L_0x00a5
        L_0x0097:
            java.lang.String r0 = "Error parsing style height: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r5)
            X.C30967GcS.A02(r3, r0)
        L_0x00a0:
            android.view.View r0 = r14.itemView
            r0.setLayoutParams(r4)
        L_0x00a5:
            boolean r0 = r14.A01
            if (r0 == 0) goto L_0x00dd
            if (r4 != 0) goto L_0x00df
            android.view.View r1 = r14.itemView
            androidx.recyclerview.widget.RecyclerView r0 = r13.A02
            X.M6x r0 = r0.A0H
            X.L70 r0 = r0.A0u()
            r1.setLayoutParams(r0)
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            r14.A01 = r0
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            X.6hm r0 = (X.C108076hm) r0
            X.5fU r0 = r0.A00
            android.view.View r1 = r14.itemView
            X.8rT r1 = (X.AnonymousClass8rT) r1
            java.lang.Object r0 = r0.A00()
            X.7J7 r0 = (X.AnonymousClass7J7) r0
            X.7Di r0 = r0.A02
            r1.setRenderTree(r0)
            java.util.List r0 = r13.A03
            java.lang.Object r0 = r0.get(r15)
            r14.A00 = r0
            return
        L_0x00dd:
            if (r4 == 0) goto L_0x00b8
        L_0x00df:
            r0 = 1
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AD.onBindViewHolder(X.M5O, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(M5O m5o) {
        C88835Aw r3 = (C88835Aw) m5o;
        ((AnonymousClass8rT) r3.itemView).setRenderTree((AnonymousClass7Di) null);
        r3.A00 = null;
    }

    public AnonymousClass5AD(C105846e5 r2) {
        this.A03 = AnonymousClass0wJ.A0v();
        this.A04 = r2;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(-1617054002);
        int size = this.A03.size();
        C14030oh.A0A(1509134364, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = C14030oh.A03(-718755108);
        long j = (long) ((C108076hm) this.A03.get(i)).A01.A02;
        C14030oh.A0A(-1269378423, A032);
        return j;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        LLH llh;
        Context context = viewGroup.getContext();
        if (!(this instanceof C91085fZ)) {
            llh = new LLH(context);
            llh.setLayoutParams(new L70(-1, -2));
        }
        return new C88835Aw(llh);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public AnonymousClass5AD() {
        this((C105846e5) null);
    }
}
