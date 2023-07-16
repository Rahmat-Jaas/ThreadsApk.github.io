package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.7qT  reason: invalid class name and case insensitive filesystem */
public final class C130667qT implements C83454rP {
    public boolean A00;
    public final SparseArray A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final C1197476t A04;
    public final C11630kW A05;
    public final C10300i6 A06;
    public final C145538kf A07;
    public final SparseArray A08;
    public final C12560m7 A09;
    public final C30938GbW A0A;

    public static C130667qT A00(SparseArray sparseArray, FragmentActivity fragmentActivity, C11630kW r9, C10300i6 r10) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        return new C130667qT(sparseArray, (Fragment) null, fragmentActivity2, fragmentActivity.getSupportFragmentManager(), (C82174pC) null, r9, r10, new H8Q(fragmentActivity2, AnonymousClass06E.A00(fragmentActivity)), (C30938GbW) null);
    }

    public static C130667qT A01(Fragment fragment, C11630kW r4, C10300i6 r5, C30938GbW gbW) {
        return new C130667qT((SparseArray) null, fragment, (C82174pC) null, r4, r5, gbW);
    }

    public static C130667qT A02(Fragment fragment, C10300i6 r5, C30938GbW gbW) {
        Fragment fragment2 = fragment;
        return new C130667qT((SparseArray) null, fragment2, (C82174pC) null, (C11630kW) fragment2, r5, gbW);
    }

    public static C130667qT A03(FragmentActivity fragmentActivity, C11630kW r2, C10300i6 r3) {
        return A00((SparseArray) null, fragmentActivity, r2, r3);
    }

    public final void A04(C21800C0z c0z) {
        Fragment fragment = this.A02;
        fragment.getClass();
        ((C83474rR) fragment).registerLifecycleListener(c0z);
    }

    public final void A05(C21800C0z c0z) {
        Fragment fragment = this.A02;
        fragment.getClass();
        ((C83474rR) fragment).unregisterLifecycleListener(c0z);
    }

    public final C1197476t ATb() {
        return this.A04;
    }

    public C130667qT(SparseArray sparseArray, Fragment fragment, FragmentActivity fragmentActivity, C12560m7 r12, C82174pC r13, C11630kW r14, C10300i6 r15, C145538kf r16, C30938GbW gbW) {
        IgK igK;
        this.A00 = false;
        this.A01 = new SparseArray(0);
        this.A06 = r15;
        this.A03 = fragmentActivity;
        this.A09 = r12;
        this.A0A = gbW;
        this.A02 = fragment;
        this.A07 = r16;
        this.A05 = r14;
        this.A08 = sparseArray;
        if (r15 instanceof UserSession) {
            igK = new IgK(fragmentActivity, r14, (UserSession) r15, 23607787);
        } else {
            igK = null;
        }
        C112856qJ r7 = new C112856qJ(fragmentActivity, AnonymousClass01V.A0p);
        AnonymousClass73X r6 = AnonymousClass73X.A00;
        C104686cC r2 = new C104686cC(C10770iu.A00());
        C1190573i.A00();
        this.A04 = new C1197476t(new AnonymousClass6GM(), r2, r13, new C109146jX(r15), igK, r6, r7);
    }

    public final SparseArray AFz() {
        SparseArray A0D = C86154wM.A0D();
        C10300i6 r6 = this.A06;
        C04220Ms.A0B(r6, 0);
        A0D.put(R.id.bk_context_key_data_modules, new C1376689m((C131997t9) C86134wK.A0f(r6, C131997t9.class, 5), this, (C131967t6) r6.A01(C131967t6.class, C86154wM.A14(r6, 49))));
        A0D.put(R.id.bloks_viewpoint_manager, this.A0A);
        A0D.put(R.id.bloks_ig_fragment, this.A02);
        A0D.put(R.id.bloks_ig_session, r6);
        A0D.put(R.id.bloks_ig_fragment_activity, this.A03);
        A0D.put(R.id.bloks_reel_tray_session_id, C18180wK.A0e());
        A0D.put(R.id.bloks_ig_analytics_module, this.A05);
        A0D.put(R.id.bloks_ig_precompile_async_actions, false);
        A0D.put(R.id.bk_context_key_bloks_config, this.A04);
        A0D.put(R.id.bloks_ig_scheduler, this.A07);
        A0D.put(R.id.bloks_ig_fragment_manager, this.A09);
        A0D.put(R.id.bloks_ig_object_store_deprecated, this.A01);
        A0D.put(R.id.bk_context_key_clip_children_bool, C63803iN.A05(AnonymousClass0TJ.A05, r6, 2342163215468730189L));
        A0D.put(R.id.bk_context_key_async_component_store_provider, new AnonymousClass7qV(this));
        A0D.put(R.id.bloks_ig_use_prelogin_json_parser, Boolean.valueOf(this.A00));
        SparseArray sparseArray = this.A08;
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (A0D.indexOfKey(sparseArray.keyAt(i)) < 0) {
                    C86134wK.A1A(sparseArray, A0D, i);
                }
            }
        }
        return A0D;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C130667qT(android.util.SparseArray r12, androidx.fragment.app.Fragment r13, X.C82174pC r14, X.C11630kW r15, X.C10300i6 r16, X.C30938GbW r17) {
        /*
            r11 = this;
            r3 = r13
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18298575020819704(0x410275000304f8, double:1.8923805680913475E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0029
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            X.0m7 r5 = r0.getSupportFragmentManager()
        L_0x001a:
            r9 = r3
            X.8kf r9 = (X.C145538kf) r9
            r1 = r11
            r2 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0029:
            X.0m7 r5 = r13.getParentFragmentManager()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130667qT.<init>(android.util.SparseArray, androidx.fragment.app.Fragment, X.4pC, X.0kW, X.0i6, X.GbW):void");
    }
}
