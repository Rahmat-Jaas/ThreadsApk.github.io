package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Xd  reason: invalid class name and case insensitive filesystem */
public final class C62103Xd {
    public Set A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073 A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080 A[Catch:{ Exception -> 0x0084 }, LOOP:0: B:34:0x007a->B:36:0x0080, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e A[Catch:{ Exception -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass3EQ r8, X.C62103Xd r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, float r13, long r14) {
        /*
            monitor-enter(r9)
            r5 = 0
            X.3B5 r1 = new X.3B5     // Catch:{ all -> 0x00cf }
            r1.<init>(r10, r13, r14)     // Catch:{ all -> 0x00cf }
            boolean r0 = r9.A04     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0014
            java.util.List r0 = X.C18180wK.A0n(r1)     // Catch:{ all -> 0x00cf }
            r9.A01(r8, r11, r12, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00cd
        L_0x0014:
            r7 = 0
            r3 = 0
            java.lang.String r2 = "SecondChannelMerlinManager"
            r6 = 0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00a6
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            java.util.Map r4 = r9.A02     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x00cf }
            X.3EQ r0 = (X.AnonymousClass3EQ) r0     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x002e
            r0 = r8
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r4.put(r11, r0)     // Catch:{ all -> 0x00cf }
        L_0x0033:
            int r0 = r10.intValue()     // Catch:{ all -> 0x00cf }
            if (r0 == r5) goto L_0x0052
            java.util.Map r4 = r9.A03     // Catch:{ all -> 0x00cf }
            boolean r0 = r4.containsKey(r11)     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "Signal detected with no ENTER_VISIBILITY signal!"
            X.AnonymousClass0LU.A0B(r2, r0)     // Catch:{ all -> 0x00cf }
        L_0x0046:
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x00cf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x006f
        L_0x004e:
            r0.add(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x006f
        L_0x0052:
            java.util.Map r4 = r9.A03     // Catch:{ all -> 0x00cf }
            boolean r0 = r4.containsKey(r11)     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x0066
            X.3B5[] r0 = new X.AnonymousClass3B5[]{r1}     // Catch:{ all -> 0x00cf }
            java.util.List r0 = X.C06750aI.A18(r0)     // Catch:{ all -> 0x00cf }
            r4.put(r11, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x0074
        L_0x0066:
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x00cf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x006f
            goto L_0x004e
        L_0x006f:
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0074
            r7 = 1
        L_0x0074:
            java.util.Set r0 = r9.A00     // Catch:{ Exception -> 0x0084 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x0084 }
        L_0x007a:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0084 }
            if (r0 == 0) goto L_0x008c
            r1.next()     // Catch:{ Exception -> 0x0084 }
            goto L_0x007a
        L_0x0084:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00cf }
            X.AnonymousClass0LU.A0B(r2, r0)     // Catch:{ all -> 0x00cf }
        L_0x008c:
            if (r7 == 0) goto L_0x00cd
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x00cf }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00a2
            java.util.List r1 = X.AnonymousClass00J.A0N(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.meta.analytics.dsp.merlin.secondchannel.SecondChannelMerlinOutputEntry>"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x00cf }
            r9.A01(r3, r11, r12, r1)     // Catch:{ all -> 0x00cf }
        L_0x00a2:
            r4.remove(r11)     // Catch:{ all -> 0x00cf }
            goto L_0x00cd
        L_0x00a6:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "Invalid percentage from raw signal: "
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            int r0 = r10.intValue()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "EXIT_VISIBILITY"
        L_0x00b7:
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r13)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cf }
            X.AnonymousClass0LU.A0B(r2, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00cd
        L_0x00ca:
            java.lang.String r0 = "ENTER_VISIBILITY"
            goto L_0x00b7
        L_0x00cd:
            monitor-exit(r9)
            return
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62103Xd.A00(X.3EQ, X.3Xd, java.lang.Integer, java.lang.String, java.lang.String, float, long):void");
    }

    public /* synthetic */ C62103Xd(String str, List list, int i, boolean z) {
        list = (i & 2) != 0 ? AnonymousClass0ZV.A00 : list;
        boolean A1R = C18240wQ.A1R(i & 8, z);
        AnonymousClass0wJ.A1O(str, list);
        this.A04 = A1R;
        this.A00 = AnonymousClass00J.A0b(list);
        this.A01 = str;
        this.A03 = AnonymousClass0wJ.A0y();
        this.A02 = AnonymousClass0wJ.A0y();
    }

    private final void A01(AnonymousClass3EQ r13, String str, String str2, List list) {
        C317428u r1;
        String str3 = this.A01;
        if (r13 == null) {
            r13 = (AnonymousClass3EQ) this.A02.remove(str);
        }
        ArrayList<AnonymousClass3B5> A0s = C18200wM.A0s(list);
        try {
            for (ASO aso : this.A00) {
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) aso.A00, "merlin_second_channel"), 2407);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    for (AnonymousClass3B5 r8 : A0s) {
                        AnonymousClass14N r5 = new AnonymousClass14N();
                        C04220Ms.A0C(r5, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.structs.MerlinSecondChannelElementVisibilityPercentTsVisibilityTsImpl");
                        r5.A08("visibility", Double.valueOf((double) r8.A00));
                        r5.A09("ts", Long.valueOf(r8.A01));
                        if (r8.A02.intValue() != 0) {
                            r1 = C317428u.EXIT_VISIBILITY;
                        } else {
                            r1 = C317428u.ENTER_VISIBILITY;
                        }
                        r5.A04(r1, "type");
                        A0v.add(r5);
                    }
                    AnonymousClass14M r52 = new AnonymousClass14M();
                    r52.A0B("visibility_ts", A0v);
                    A0I.A0T("origin", str2);
                    A0I.A0T("entity_id", str);
                    A0I.A0O(C317328t.UNKNOWN, "purpose");
                    A0I.A0P(r52, "element_visibility_percent_ts");
                    A0I.A0T("visibility_detection_framework", str3);
                    if (r13 != null) {
                        A0I.A0T("tracking", r13.A00);
                        A0I.A0V(I17.A00(893), (Map) null);
                    }
                    A0I.Bb4();
                }
            }
        } catch (Exception e) {
            AnonymousClass0LU.A0B("SecondChannelMerlinManager", e.getMessage());
        }
    }
}
