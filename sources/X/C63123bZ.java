package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Deque;
import java.util.List;

/* renamed from: X.3bZ  reason: invalid class name and case insensitive filesystem */
public final class C63123bZ {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3.equals("legacy_screen") != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C84864tz A01(android.content.Context r11, X.AnonymousClass099 r12, X.C84814tu r13, X.C121997Jj r14, X.C81364nf r15, java.lang.String r16) {
        /*
            r10 = r15
            r7 = r13
            java.lang.String r3 = r13.Ax4()
            java.lang.String r2 = "screen_query"
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.lang.String r0 = "Trying to create a CDS screen of an unknown type: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r3)
            X.C002801h.A05(r1, r0)
            X.1Xb r12 = (X.AnonymousClass1Xb) r12
            java.lang.String r0 = "legacy_screen"
            boolean r0 = r0.equals(r3)
            r5 = r11
            if (r0 == 0) goto L_0x006d
            r1 = r16
            boolean r4 = X.AnonymousClass0wJ.A1Z(r11, r1)
            r0 = 2
            X.C04220Ms.A0B(r12, r0)
            X.LLH r0 = new X.LLH
            r0.<init>(r11)
            X.3yE r3 = new X.3yE
            r3.<init>(r0, r1)
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r0 = 2131298255(0x7f0907cf, float:1.8214478E38)
            r6.put(r0, r3)
            r0 = r10
            X.18u r0 = (X.C210718u) r0
            X.0i6 r1 = r0.A00
            X.GbW r0 = r12.A07
            X.7qT r9 = X.C130667qT.A01(r12, r12, r1, r0)
            X.3yQ r7 = (X.C66843yQ) r7
            r8 = r14
            X.3bW r2 = X.C63113bW.A00(r5, r6, r7, r8, r9, r10)
            r2.A08(r11, r12)
            X.4tg r1 = r2.A00
            r1.getClass()
            java.lang.String r0 = "cds_bottomsheet"
            r1.Bev(r0, r4)
            r3.A00 = r2
            return r3
        L_0x006d:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0089
            r0 = 0
            X.AnonymousClass0wJ.A1M(r11, r0, r12)
            X.3yP r7 = (X.C66833yP) r7
            X.18u r10 = (X.C210718u) r10
            X.0i6 r1 = r10.A00
            X.GbW r0 = r12.A07
            X.7qT r0 = X.C130667qT.A01(r12, r12, r1, r0)
            X.3yF r3 = new X.3yF
            r3.<init>(r11, r7, r0)
            return r3
        L_0x0089:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63123bZ.A01(android.content.Context, X.099, X.4tu, X.7Jj, X.4nf, java.lang.String):X.4tz");
    }

    public static void A02(Context context, C84814tu r3, C121997Jj r4, C81364nf r5, C82374pW r6, Integer num, String str, int i) {
        Context context2 = context;
        AnonymousClass1Xb r1 = (AnonymousClass1Xb) AnonymousClass3ZR.A01(context);
        if (r1 != null) {
            AnonymousClass1Xb.A00(r1).A04(r1.requireContext(), A01(context2, r1, r3, r4, r5, str), r6, num, i);
            return;
        }
        throw C18180wK.A0a("Cannot push a new Screen without an existing bottom sheet.");
    }

    public static AnonymousClass099 A00(String str, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            Fragment fragment = (Fragment) list.get(size);
            if (!(fragment instanceof AnonymousClass1Xb) || !(fragment instanceof AnonymousClass099)) {
                AnonymousClass099 A00 = A00(str, fragment.getChildFragmentManager().A0T.A04());
                if (A00 != null) {
                    return A00;
                }
            } else {
                AnonymousClass099 r2 = (AnonymousClass099) fragment;
                for (AnonymousClass39N A002 : AnonymousClass1Xb.A00((AnonymousClass1Xb) r2).A0E) {
                    if (C84864tz.A00(A002, str)) {
                        return r2;
                    }
                }
                continue;
            }
        }
    }

    public static void A03(Context context, C82374pW r1) {
        AnonymousClass1Xb r0 = (AnonymousClass1Xb) AnonymousClass3ZR.A01(context);
        if (r0 != null) {
            AnonymousClass39N r02 = (AnonymousClass39N) AnonymousClass1Xb.A00(r0).A0E.peek();
            if (r02 != null) {
                r02.A00 = r1;
                return;
            }
            return;
        }
        throw C18180wK.A0a("Cannot update back button override without an existing bottom sheet.");
    }

    public static void A04(Context context, Integer num, String str) {
        String str2;
        String str3;
        AnonymousClass1Xb r0 = (AnonymousClass1Xb) AnonymousClass3ZR.A01(context);
        if (r0 != null) {
            if (str == null) {
                C62823ao A00 = AnonymousClass1Xb.A00(r0);
                Context requireContext = r0.requireContext();
                Deque deque = A00.A0E;
                str2 = "CDSBloksBottomSheetDelegate";
                if (!deque.isEmpty() && A00.A01 != null) {
                    if (deque.size() != 1) {
                        C62823ao.A02(requireContext, A00, num);
                        return;
                    }
                    str3 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
                    C30967GcS.A02(str2, str3);
                    return;
                }
            } else {
                C62823ao A002 = AnonymousClass1Xb.A00(r0);
                Context requireContext2 = r0.requireContext();
                Deque deque2 = A002.A0E;
                str2 = "CDSBloksBottomSheetDelegate";
                if (!deque2.isEmpty() && A002.A01 != null) {
                    if (deque2.size() != 1) {
                        A002.A06(requireContext2, (Integer) null, str);
                        return;
                    }
                    str3 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
                    C30967GcS.A02(str2, str3);
                    return;
                }
            }
            str3 = "Cannot pop from an empty bottom sheet.";
            C30967GcS.A02(str2, str3);
            return;
        }
        throw C18180wK.A0a("Cannot pop a without an existing bottom sheet.");
    }

    public static void A05(AnonymousClass099 r6, FragmentActivity fragmentActivity, C84814tu r8, C121997Jj r9, C81364nf r10, C82374pW r11, String str, int i) {
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        AnonymousClass01J r1 = new AnonymousClass01J(supportFragmentManager);
        r1.A0K((String) null);
        try {
            r6.A08 = false;
            r6.A09 = true;
            r1.A0E(r6, (String) null);
            r6.A0B = false;
            r6.A00 = r1.A0L(false);
        } catch (IllegalStateException e) {
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || supportFragmentManager.A0F) {
                C30967GcS.A01((AnonymousClass3HX) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e, 0);
            } else {
                try {
                    supportFragmentManager.A16();
                    AnonymousClass01J r0 = new AnonymousClass01J(supportFragmentManager);
                    r0.A0K((String) null);
                    r0.A0E(r6, (String) null);
                    r0.A01();
                } catch (Exception e2) {
                    C30967GcS.A01((AnonymousClass3HX) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2, 0);
                }
            }
        }
        AnonymousClass4TD r5 = new AnonymousClass4TD(r6, fragmentActivity, r8, r9, r10, r11, str, i);
        Handler A0F = AnonymousClass0wJ.A0F();
        A0F.post(new C32931HcN(A0F, r6, r5));
    }
}
