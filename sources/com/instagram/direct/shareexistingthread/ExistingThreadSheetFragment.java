package com.instagram.direct.shareexistingthread;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C146958n9;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C21735BzM;
import X.C25237DiI;
import X.C27952Ew2;
import X.C32254HCp;
import X.C34640IcN;
import X.C80644m9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgProgressBar;
import java.util.List;

public final class ExistingThreadSheetFragment extends C34640IcN implements C21735BzM {
    public RecyclerView A00;
    public C32254HCp A01;
    public String A02;
    public List A03;
    public boolean A04;
    public View A05;
    public IgProgressBar A06;
    public final C04530Oa A07 = C80644m9.A00(this);

    public final String getModuleName() {
        return "existing_thread_sheet_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = view;
        IgProgressBar igProgressBar = (IgProgressBar) AnonymousClass0wJ.A0J(view, R.id.progressbar_loading);
        this.A06 = igProgressBar;
        if (igProgressBar == null) {
            C04220Ms.A0E("progressBar");
            throw null;
        }
        igProgressBar.animate();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 9), C18200wM.A0M(this), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r12) {
        /*
            r11 = this;
            r3 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2.A00(r3, r12)
            if (r0 == 0) goto L_0x009b
            r5 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r3) goto L_0x01d3
            java.lang.Object r4 = r5.A01
            com.instagram.direct.shareexistingthread.ExistingThreadSheetFragment r4 = (com.instagram.direct.shareexistingthread.ExistingThreadSheetFragment) r4
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            r8 = 0
            if (r0 == 0) goto L_0x019b
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.1SD r0 = (X.AnonymousClass1SD) r0
            java.util.List r0 = r0.A00
            r4.A03 = r0
            com.instagram.common.ui.base.IgProgressBar r1 = r4.A06
            if (r1 != 0) goto L_0x00a2
            java.lang.String r0 = "progressBar"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x0043:
            X.AnonymousClass0OU.A00(r1)
            X.0Oa r0 = r11.A07
            com.instagram.service.session.UserSession r7 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            r0.getUserId()
            r4 = 0
            X.C04220Ms.A0B(r7, r4)
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r7)
            java.lang.String r0 = "direct_v2/get_all_channels/"
            r2.A0J(r0)
            java.lang.Class<X.1SD> r1 = X.AnonymousClass1SD.class
            java.lang.Class<X.3MN> r0 = X.AnonymousClass3MN.class
            r2.A0B(r1, r0)
            java.lang.String r0 = r7.getUserId()
            X.C18250wR.A17(r2, r0)
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0085
            r0 = 29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = X.C18180wK.A0n(r0)
            java.lang.String r1 = X.C18200wM.A0o(r0)
            java.lang.String r0 = "thread_subtypes"
            r2.A0O(r0, r1)
        L_0x0085:
            X.H8c r2 = r2.A02()
            r1 = 14
            r5.A01 = r11
            r5.A00 = r3
            r0 = 422279554(0x192b7982, float:8.865031E-24)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r4, r1)
            if (r1 != r6) goto L_0x0099
            return r6
        L_0x0099:
            r4 = r11
            goto L_0x0028
        L_0x009b:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2
            r5.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x00a2:
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r4.A03
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "threads"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x00b1:
            boolean r2 = r0.isEmpty()
            java.lang.String r0 = "mainView"
            android.view.View r1 = r4.A05
            if (r2 == 0) goto L_0x00c1
            if (r1 != 0) goto L_0x01a4
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x00c1:
            if (r1 != 0) goto L_0x00c7
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x00c7:
            r0 = 2131300288(0x7f090fc0, float:1.8218601E38)
            android.view.View r6 = X.C18200wM.A0G(r1, r0)
            r0 = 2131300291(0x7f090fc3, float:1.8218607E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r6, r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131826961(0x7f111911, float:1.9286821E38)
            X.C18200wM.A15(r1, r2, r0)
            r5 = 0
            r2.setVisibility(r5)
            r0 = 2131299231(0x7f090b9f, float:1.8216458E38)
            android.view.View r7 = r6.requireViewById(r0)
            r1 = 189(0xbd, float:2.65E-43)
            com.facebook.redex.IDxCListenerShape207S0100000_5_I2 r0 = new com.facebook.redex.IDxCListenerShape207S0100000_5_I2
            r0.<init>((java.lang.Object) r4, (int) r1)
            r7.setOnClickListener(r0)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0150
            X.0Oa r10 = r4.A07
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r10)
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r0 = 36318286404653385(0x81074a00001149, double:3.031168792079397E-306)
            boolean r0 = X.C63803iN.A0E(r9, r2, r0)
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L_0x011e
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r10)
            r0 = 36318286404915533(0x81074a0004114d, double:3.0311687922451805E-306)
            boolean r0 = X.C63803iN.A0E(r9, r2, r0)
            if (r0 == 0) goto L_0x0150
        L_0x011e:
            r0 = 0
        L_0x011f:
            r7.setVisibility(r0)
            r0 = 2131300287(0x7f090fbf, float:1.82186E38)
            android.view.View r7 = X.AnonymousClass0wJ.A0J(r6, r0)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r7.setVisibility(r5)
            android.content.Context r1 = r7.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r0.A1w(r3)
            r7.setLayoutManager(r0)
            r7.setItemAnimator(r8)
            r7.A0U = r3
            X.AgL r3 = X.C150388wA.A00(r1)
            X.HCp r2 = r4.A01
            if (r2 != 0) goto L_0x0153
            java.lang.String r0 = "delegate"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x0150:
            r0 = 8
            goto L_0x011f
        L_0x0153:
            X.0Oa r0 = r4.A07
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.FQH r0 = new X.FQH
            r0.<init>(r4, r2, r1)
            X.8wA r6 = X.C18220wO.A0Z(r3, r0)
            X.3I1 r5 = new X.3I1
            r5.<init>()
            java.util.List r0 = r4.A03
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = "threads"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x0171:
            java.util.Iterator r3 = r0.iterator()
        L_0x0175:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0192
            java.lang.Object r2 = r3.next()
            X.FEw r2 = (X.C28362FEw) r2
            java.lang.String r1 = r2.A08
            java.lang.String r0 = r4.A02
            boolean r1 = X.C04220Ms.A0I(r1, r0)
            X.48J r0 = new X.48J
            r0.<init>(r2, r1)
            r5.A01(r0)
            goto L_0x0175
        L_0x0192:
            r6.A04(r5)
            r7.setAdapter(r6)
            r4.A00 = r7
            goto L_0x01af
        L_0x019b:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x01b3
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x01a4:
            r0 = 2131300289(0x7f090fc1, float:1.8218603E38)
            android.view.View r1 = X.C18200wM.A0G(r1, r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x01af:
            X.1jA r1 = X.C62903b6.A03()
        L_0x01b3:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x01cb
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x01ce
            android.content.Context r3 = r4.requireContext()
            java.lang.String r2 = "something_went_wrong"
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            r0 = 0
            X.C63813iO.A03(r3, r2, r1, r0)
            X.C18180wK.A14(r4)
        L_0x01cb:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x01ce:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x01d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.shareexistingthread.ExistingThreadSheetFragment.A00(X.8n9):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1645653790);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("SELECTED_CHAT_THREAD_ID_KEY");
        this.A04 = requireArguments.getBoolean("IS_CAMERA_DESTINATION_CLIPS_KEY");
        C14030oh.A09(549088041, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1763694486);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.existing_thread_sheet_fragment, false);
        C14030oh.A09(-747744557, A022);
        return A0D;
    }
}
