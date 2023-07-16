package com.facebook.redex;

import X.AnonymousClass00M;
import X.C12560m7;

public class IDxRCallbackShape718S0100000_I2 implements AnonymousClass00M {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape718S0100000_I2(C12560m7 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        r1 = new java.lang.StringBuilder(r0);
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r2.onActivityResult(r3, r7.A00, r7.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r1 = new java.lang.StringBuilder(r0);
        r1.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        android.util.Log.w(r5, r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void BjZ(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0029;
                case 1: goto L_0x006e;
                default: goto L_0x0005;
            }
        L_0x0005:
            androidx.activity.result.ActivityResult r7 = (androidx.activity.result.ActivityResult) r7
            java.lang.Object r1 = r6.A00
            X.0m7 r1 = (X.C12560m7) r1
            java.util.ArrayDeque r0 = r1.A0C
            java.lang.Object r0 = r0.pollFirst()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = (androidx.fragment.app.FragmentManager$LaunchedFragmentInfo) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "No IntentSenders were started for "
        L_0x0019:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
        L_0x0021:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
        L_0x0028:
            return
        L_0x0029:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r1 = r7.keySet()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.toArray(r0)
            java.util.Collection r0 = r7.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r2.size()
            r1 = 0
        L_0x0042:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x004e
            r2.get(r1)
            int r1 = r1 + 1
            goto L_0x0042
        L_0x004e:
            java.lang.Object r1 = r6.A00
            X.0m7 r1 = (X.C12560m7) r1
            java.util.ArrayDeque r0 = r1.A0C
            java.lang.Object r0 = r0.pollFirst()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = (androidx.fragment.app.FragmentManager$LaunchedFragmentInfo) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "No permissions were requested for "
            goto L_0x0019
        L_0x0061:
            java.lang.String r4 = r0.A01
            X.05I r0 = r1.A0T
            androidx.fragment.app.Fragment r0 = r0.A00(r4)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            goto L_0x00a0
        L_0x006e:
            androidx.activity.result.ActivityResult r7 = (androidx.activity.result.ActivityResult) r7
            java.lang.Object r1 = r6.A00
            X.0m7 r1 = (X.C12560m7) r1
            java.util.ArrayDeque r0 = r1.A0C
            java.lang.Object r0 = r0.pollFirst()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = (androidx.fragment.app.FragmentManager$LaunchedFragmentInfo) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "No Activities were started for result for "
            goto L_0x0019
        L_0x0083:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.05I r0 = r1.A0T
            androidx.fragment.app.Fragment r2 = r0.A00(r4)
            if (r2 != 0) goto L_0x00aa
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            goto L_0x00a0
        L_0x0092:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.05I r0 = r1.A0T
            androidx.fragment.app.Fragment r2 = r0.A00(r4)
            if (r2 != 0) goto L_0x00aa
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
        L_0x00a0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            goto L_0x0021
        L_0x00aa:
            int r1 = r7.A00
            android.content.Intent r0 = r7.A01
            r2.onActivityResult(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxRCallbackShape718S0100000_I2.BjZ(java.lang.Object):void");
    }
}
