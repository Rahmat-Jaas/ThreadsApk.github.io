package X;

import java.util.Set;
import kotlin.Pair;

/* renamed from: X.7Ea  reason: invalid class name and case insensitive filesystem */
public final class C121077Ea {
    public static C10300i6 A0D;
    public static boolean A0E;
    public static boolean A0F;
    public static boolean A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static boolean A0J;
    public static boolean A0K;
    public static final C121077Ea A0L = new C121077Ea();
    public long A00 = 100;
    public Set A01 = C86134wK.A0u();
    public Set A02 = C86134wK.A0u();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C;

    public final Pair A01(C10300i6 r6, String str, boolean z) {
        Boolean A0X;
        String str2;
        Integer num;
        boolean z2;
        A0D = r6;
        A02();
        if (str == null) {
            try {
                str = AnonymousClass4WE.A00().A00;
            } catch (NoClassDefFoundError unused) {
                str = "instrumentation_tests";
            }
            C04220Ms.A09(str);
        }
        Pair A0p = C18180wK.A0p(str, Boolean.valueOf(z));
        if (A0p.equals(C18180wK.A0p("feed_timeline", true))) {
            z2 = A0F;
        } else {
            if (A0p.equals(C18180wK.A0p(AnonymousClass000.A00(349), true))) {
                A0X = Boolean.valueOf(A0I);
                num = AnonymousClass006.A0Y;
            } else {
                A0X = C18180wK.A0X();
                if (A0p.equals(C18180wK.A0p("feed_timeline", A0X))) {
                    z2 = A0J;
                } else if (A0p.equals(C18180wK.A0p(I17.A00(230), true))) {
                    A0X = Boolean.valueOf(A0G);
                    num = AnonymousClass006.A0j;
                } else {
                    str2 = "";
                    return C18180wK.A0p(A0X, str2);
                }
            }
            str2 = A9S.A00(num);
            return C18180wK.A0p(A0X, str2);
        }
        A0X = Boolean.valueOf(z2);
        num = AnonymousClass006.A00;
        str2 = A9S.A00(num);
        return C18180wK.A0p(A0X, str2);
    }

    public static final C10300i6 A00() {
        C10300i6 r0 = A0D;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("session");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x012d, code lost:
        if (r1 != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r5 = this;
            X.0i6 r2 = A00()
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36320167600396040(0x81090000011708, double:3.032358467842019E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A0C = r0
            X.0i6 r2 = A00()
            r0 = 36320167600330503(0x81090000001707, double:3.0323584678005734E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A03 = r0
            X.0i6 r2 = A00()
            r0 = 36320167600461577(0x81090000021709, double:3.032358467883465E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A04 = r0
            X.0i6 r2 = A00()
            r0 = 36320167600527114(0x8109000003170a, double:3.032358467924911E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A09 = r0
            X.0i6 r2 = A00()
            r0 = 36601642577366760(0x82090000050ee8, double:3.210364376687061E-306)
            long r0 = X.C63803iN.A03(r3, r2, r0)
            r5.A00 = r0
            X.0i6 r2 = A00()
            r0 = 2342163176814417675(0x208109000006170b, double:4.065727991433928E-152)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A06 = r0
            X.0i6 r2 = A00()
            r0 = 36320167600789260(0x8109000007170c, double:3.032358468090693E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A0A = r0
            X.0i6 r2 = A00()
            r0 = 36320167600854797(0x8109000008170d, double:3.032358468132139E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A08 = r0
            X.0i6 r2 = A00()
            r0 = 36320167601116945(0x810900000c1711, double:3.0323584682979225E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A05 = r0
            X.0i6 r2 = A00()
            r0 = 2342163176815073045(0x2081090000101715, double:4.0657279919896265E-152)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A0B = r0
            X.0i6 r2 = A00()
            r0 = 2342163176815138582(0x2081090000111716, double:4.065727992045196E-152)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            r5.A07 = r0
            X.0i6 r2 = A00()
            r0 = 36320167600985871(0x810900000a170f, double:3.032358468215031E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0J = r0
            X.0i6 r2 = A00()
            r0 = 36320167600920334(0x8109000009170e, double:3.032358468173585E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0E = r0
            X.0i6 r2 = A00()
            r0 = 36320167601575704(0x81090000131718, double:3.0323584685880435E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0H = r0
            X.0i6 r2 = A00()
            r0 = 36320167601051408(0x810900000b1710, double:3.0323584682564766E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0I = r0
            X.0i6 r2 = A00()
            r0 = 36320167601182482(0x810900000d1712, double:3.0323584683393684E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0F = r0
            X.0i6 r2 = A00()
            r0 = 36320167601313556(0x810900000f1714, double:3.03235846842226E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            A0G = r0
            X.0i6 r2 = A00()
            r0 = 36320167601510167(0x81090000121717, double:3.0323584685465977E-306)
            boolean r1 = X.C63803iN.A0E(r3, r2, r0)
            A0K = r1
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0E
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0H
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0J
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0I
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0F
            if (r0 != 0) goto L_0x012f
            boolean r0 = A0G
            if (r0 != 0) goto L_0x012f
            r0 = 0
            if (r1 == 0) goto L_0x0130
        L_0x012f:
            r0 = 1
        L_0x0130:
            r5.A0C = r0
            java.util.Set r4 = r5.A01
            java.lang.String r0 = "Debug_Control"
            r4.add(r0)
            java.lang.String r0 = "activity_and_camera_shared_views_main_container"
            r4.add(r0)
            java.lang.String r0 = "overlay_layout_container"
            r4.add(r0)
            java.lang.String r0 = "layout_container_right"
            r4.add(r0)
            X.0i6 r2 = A00()
            r0 = 36883117554008379(0x8309000004013b, double:3.388370285323978E-306)
            java.lang.String r3 = X.C63803iN.A0C(r3, r2, r0)
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 44
            r0 = 0
            r2[r0] = r1
            java.util.List r0 = X.AnonymousClass8bP.A0e(r3, r2, r0)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0169:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0169
            r3.add(r1)
            goto L_0x0169
        L_0x0180:
            r4.addAll(r3)
            boolean r0 = A0J
            if (r0 != 0) goto L_0x018f
            boolean r0 = A0I
            if (r0 != 0) goto L_0x018f
            boolean r0 = A0F
            if (r0 == 0) goto L_0x0196
        L_0x018f:
            java.util.Set r1 = r5.A02
            java.lang.String r0 = "feed_timeline"
            r1.add(r0)
        L_0x0196:
            boolean r0 = A0G
            if (r0 == 0) goto L_0x01a5
            java.util.Set r1 = r5.A02
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r1.add(r0)
        L_0x01a5:
            boolean r0 = A0E
            if (r0 == 0) goto L_0x01b4
            java.util.Set r1 = r5.A02
            r0 = 629(0x275, float:8.81E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r1.add(r0)
        L_0x01b4:
            boolean r0 = A0H
            if (r0 == 0) goto L_0x01c3
            java.util.Set r1 = r5.A02
            r0 = 309(0x135, float:4.33E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r1.add(r0)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121077Ea.A02():void");
    }
}
