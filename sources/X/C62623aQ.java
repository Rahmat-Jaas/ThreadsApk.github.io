package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3aQ  reason: invalid class name and case insensitive filesystem */
public final class C62623aQ {
    public static AnonymousClass01V A00;
    public static String A01;
    public static boolean A02;
    public static boolean A03;
    public static final C62623aQ A04 = new C62623aQ();
    public static final C86004w7 A05;
    public static final ArrayList A06 = AnonymousClass0wJ.A0v();

    static {
        C85994w6 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) AnonymousClass0gE.A00().A00);
        C04220Ms.A06(listeningDecorator);
        A05 = listeningDecorator;
    }

    public static final String A00(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            int i = 0;
            while (i < length) {
                if (Character.isDigit(str.charAt(i))) {
                    i++;
                }
            }
            return str;
        }
        return "REDACTED_UID";
    }

    public static final List A01(C10300i6 r8, C311624m r9, AnonymousClass24G r10) {
        String str;
        Context context;
        C307822y r0;
        List A07;
        ListenableFuture r02;
        Context A08;
        C311624m r1;
        int ordinal = r9.ordinal();
        String A002 = C28174Ezk.A00(141);
        if (ordinal == 0) {
            boolean z = A02;
            String str2 = "ig_android_access_library_caa_aymh_fetch_fb_local_auth";
            String str3 = "ig_android_access_library_caa_aymh_fetch_fb_active_token";
            int ordinal2 = r10.ordinal();
            if (z) {
                if (ordinal2 == 0) {
                    Context A082 = C18230wP.A08();
                    String str4 = A01;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    r02 = C63693i8.A00(A082, r8, str3);
                    A07 = (List) r02.get();
                    C04220Ms.A09(A07);
                    return A07;
                } else if (ordinal2 == 2) {
                    A08 = C18230wP.A08();
                    String str5 = A01;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    if (C63693i8.A09(str2, (AnonymousClass4VE) null)) {
                        r1 = C311624m.FACEBOOK;
                    }
                    r02 = new AnonymousClass5ro(AnonymousClass0wJ.A0v());
                    A07 = (List) r02.get();
                    C04220Ms.A09(A07);
                    return A07;
                } else {
                    throw new Exception(A002);
                }
            } else if (ordinal2 == 0) {
                Context A083 = C18230wP.A08();
                String str6 = A01;
                if (str6 != null) {
                    str3 = str6;
                }
                A07 = C63693i8.A03(A083, r8, str3, (String) null);
                C04220Ms.A09(A07);
                return A07;
            } else if (ordinal2 == 2) {
                context = C18230wP.A08();
                String str7 = A01;
                if (str7 != null) {
                    str2 = str7;
                }
                r0 = C307822y.A01;
                A07 = C63693i8.A07(context, r8, str, r0);
                C04220Ms.A09(A07);
                return A07;
            } else {
                throw new Exception(A002);
            }
        } else if (ordinal == 5) {
            boolean z2 = A03;
            str = "ig_android_access_library_caa_aymh_fetch_msgr_local_auth";
            String str8 = "ig_android_access_library_caa_aymh_fetch_msgr_active_token";
            int ordinal3 = r10.ordinal();
            if (z2) {
                if (ordinal3 == 0) {
                    Context A084 = C18230wP.A08();
                    String str9 = A01;
                    if (str9 != null) {
                        str8 = str9;
                    }
                    r02 = C63693i8.A01(A084, r8, str8);
                    A07 = (List) r02.get();
                    C04220Ms.A09(A07);
                    return A07;
                } else if (ordinal3 == 2) {
                    A08 = C18230wP.A08();
                    String str10 = A01;
                    if (str10 != null) {
                        str = str10;
                    }
                    if (C63693i8.A09(str, (AnonymousClass4VE) null)) {
                        r1 = C311624m.MESSENGER;
                    }
                    r02 = new AnonymousClass5ro(AnonymousClass0wJ.A0v());
                    A07 = (List) r02.get();
                    C04220Ms.A09(A07);
                    return A07;
                } else {
                    throw new Exception(A002);
                }
            } else if (ordinal3 == 0) {
                Context A085 = C18230wP.A08();
                String str11 = A01;
                if (str11 != null) {
                    str8 = str11;
                }
                A07 = C63693i8.A04(A085, r8, str8, (String) null);
                C04220Ms.A09(A07);
                return A07;
            } else if (ordinal3 == 2) {
                context = C18230wP.A08();
                String str12 = A01;
                if (str12 != null) {
                    str = str12;
                }
                r0 = C307822y.A05;
                A07 = C63693i8.A07(context, r8, str, r0);
                C04220Ms.A09(A07);
                return A07;
            } else {
                throw new Exception(A002);
            }
        } else {
            throw new Exception(A002);
        }
        r02 = AnonymousClass2QQ.A00(A08, r8, r1, AnonymousClass24G.SAVED_ACCOUNTS);
        A07 = (List) r02.get();
        C04220Ms.A09(A07);
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (X.C04220Ms.A0I(r5, "fb") != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(androidx.fragment.app.FragmentActivity r7, X.AnonymousClass2GF r8, X.C10300i6 r9, java.lang.String r10) {
        /*
            r6 = this;
            X.AnonymousClass0wJ.A1N(r7, r9)
            A01 = r10
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18304386111378172(0x4107be000012fc, double:1.8946774162591966E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 != 0) goto L_0x00e1
            X.01V r0 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r0)
            A00 = r0
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r7, r9)
            java.lang.String r5 = r0.A02()
            java.lang.String r0 = ""
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "control"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x006f
            X.01V r2 = A00
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = "qplLogger"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0041:
            r1 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "caa_ig4a_fx_access_library_test_v3_group"
            r2.markerAnnotate((int) r1, (java.lang.String) r0, (java.lang.String) r5)
            java.lang.String r3 = "fb_msgr"
            boolean r0 = X.C04220Ms.A0I(r5, r3)
            r2 = 0
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "fb"
            boolean r1 = X.C04220Ms.A0I(r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            A02 = r0
            boolean r0 = X.C04220Ms.A0I(r5, r3)
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "msgr"
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            r2 = 1
        L_0x006d:
            A03 = r2
        L_0x006f:
            java.util.ArrayList r1 = A06
            X.4w7 r3 = A05
            X.4Qk r0 = new X.4Qk
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Ql r0 = new X.4Ql
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qm r0 = new X.4Qm
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qn r0 = new X.4Qn
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qo r0 = new X.4Qo
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qp r0 = new X.4Qp
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qq r0 = new X.4Qq
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            X.4Qr r0 = new X.4Qr
            r0.<init>(r9, r4)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.CwP(r0)
            r1.add(r0)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.lang.Iterable) r1)
            X.4Tt r1 = new X.4Tt
            r1.<init>(r8, r4)
            X.IYm r0 = new X.IYm
            r0.<init>(r2, r1, r3)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62623aQ.A02(androidx.fragment.app.FragmentActivity, X.2GF, X.0i6, java.lang.String):void");
    }
}
