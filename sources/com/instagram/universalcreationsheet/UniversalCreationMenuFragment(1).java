package com.instagram.universalcreationsheet;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass2MS;
import X.AnonymousClass3I1;
import X.C04220Ms;
import X.C04620Ok;
import X.C06810aP;
import X.C10300i6;
import X.C14030oh;
import X.C150388wA;
import X.C169839tz;
import X.C18180wK;
import X.C18210wN;
import X.C18240wQ;
import X.C21735BzM;
import X.C25823Dsg;
import X.C25971pk;
import X.C31014GdU;
import X.C34640IcN;
import X.C35072Lz;
import X.C41030Luu;
import X.C548530j;
import X.C63803iN;
import X.C66083wz;
import X.C83134qq;
import X.M6x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

public class UniversalCreationMenuFragment extends C34640IcN implements C21735BzM {
    public C25971pk A00;
    public UserSession A01;
    public C83134qq A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public C150388wA mRecyclerAdapter;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "universal_creation_menu";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public static void A00(UniversalCreationMenuFragment universalCreationMenuFragment) {
        Integer num;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        UniversalCreationMenuFragment universalCreationMenuFragment2 = universalCreationMenuFragment;
        if (!universalCreationMenuFragment.A05) {
            C18210wN.A1L(AnonymousClass006.A0N, A0v);
        }
        C18210wN.A1L(AnonymousClass006.A00, A0v);
        if (!universalCreationMenuFragment.A06) {
            C18210wN.A1L(AnonymousClass006.A01, A0v);
        }
        boolean z = false;
        if (!universalCreationMenuFragment.A09) {
            UserSession userSession = universalCreationMenuFragment.A01;
            AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
            if (!C63803iN.A05(r3, userSession, 36327189871929244L).booleanValue()) {
                C18210wN.A1L(AnonymousClass006.A0C, A0v);
            }
            C18210wN.A1L(AnonymousClass006.A0Y, A0v);
            if (C63803iN.A05(r3, universalCreationMenuFragment.A01, 36310478154170444L).booleanValue()) {
                C18210wN.A1L(AnonymousClass006.A0j, A0v);
            }
            UserSession userSession2 = universalCreationMenuFragment.A01;
            C04620Ok r5 = C06810aP.A01;
            if (r5.A01(userSession2).A2i() && C63803iN.A05(r3, universalCreationMenuFragment.A01, 36313471746311693L).booleanValue()) {
                C18210wN.A1L(AnonymousClass006.A0u, A0v);
            }
            if (Boolean.TRUE.equals(C18240wQ.A0W(universalCreationMenuFragment.A01, r5).BRG()) && C63803iN.A05(r3, universalCreationMenuFragment.A01, 36315915582704524L).booleanValue()) {
                C18210wN.A1L(AnonymousClass006.A15, A0v);
                C25823Dsg.A0A(universalCreationMenuFragment2, universalCreationMenuFragment.A01, "create_fundraiser_cell", "PROFILE_COMPOSER", (String) null, (Map) null);
            }
            if (C63803iN.A0E(r3, universalCreationMenuFragment2.A01, 36318230570602758L)) {
                C18210wN.A1L(AnonymousClass006.A1C, A0v);
                z = true;
            }
            if (universalCreationMenuFragment2.A07) {
                num = AnonymousClass006.A02;
            } else if (universalCreationMenuFragment2.A03) {
                num = AnonymousClass006.A03;
            }
            C18210wN.A1L(num, A0v);
        }
        if (universalCreationMenuFragment2.A08) {
            UserSession userSession3 = universalCreationMenuFragment2.A01;
            AnonymousClass0TJ r32 = AnonymousClass0TJ.A05;
            if (C63803iN.A05(r32, userSession3, 36318230570668295L).booleanValue()) {
                C18210wN.A1L(AnonymousClass006.A1L, A0v);
                if (!z && C63803iN.A0E(r32, universalCreationMenuFragment2.A01, 36318230570602758L)) {
                    C18210wN.A1L(AnonymousClass006.A1C, A0v);
                }
            }
        }
        if (C63803iN.A05(AnonymousClass0TJ.A05, universalCreationMenuFragment2.A01, 36327469044738079L).booleanValue()) {
            C18210wN.A1L(AnonymousClass006.A04, A0v);
        }
        AnonymousClass3I1 r1 = new AnonymousClass3I1();
        r1.A02(A0v);
        universalCreationMenuFragment2.mRecyclerAdapter.A04(r1);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int A022 = C14030oh.A02(-64119302);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C18180wK.A0V(requireArguments);
        this.A09 = requireArguments.getBoolean("show_only_main_options");
        this.A08 = requireArguments.getBoolean("is_group_profile");
        this.A06 = requireArguments.getBoolean("hide_stories");
        this.A05 = requireArguments.getBoolean("hide_reels");
        boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, this.A01, 36320025867064978L).booleanValue();
        this.A04 = booleanValue;
        if (booleanValue) {
            UserSession userSession = this.A01;
            C31014GdU gdU = C548530j.A00;
            C04220Ms.A0B(userSession, 0);
            if (AnonymousClass0wJ.A0Y(userSession).A0e() != C169839tz.PrivacyStatusPublic || (!AnonymousClass2MS.A00(userSession) && !gdU.A05(userSession))) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean A002 = C35072Lz.A00(userSession);
            if (z2 || A002) {
                z = true;
                this.A07 = z;
                this.A00 = (C25971pk) new C66083wz(this.A01).create(C25971pk.class);
                C14030oh.A09(-30621228, A022);
            }
        }
        z = false;
        this.A07 = z;
        this.A00 = (C25971pk) new C66083wz(this.A01).create(C25971pk.class);
        C14030oh.A09(-30621228, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1001939059);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, (ViewGroup) null, R.layout.layout_universal_creation_menu);
        C14030oh.A09(1172142976, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-466282741);
        super.onDestroyView();
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter((C41030Luu) null);
            this.mRecyclerView.setLayoutManager((M6x) null);
        }
        UniversalCreationMenuFragmentLifecycleUtil.cleanupReferences(this);
        C14030oh.A09(-1300651016, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e0, code lost:
        if (X.C63803iN.A0E(X.C18180wK.A0J(r3), r3, 36321499040390013L) != false) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            X.4qq r0 = r5.A02
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0015
            X.0m7 r0 = r0.getSupportFragmentManager()
            r0.A0d()
            return
        L_0x0015:
            android.content.Context r0 = r5.getContext()
            X.AgL r3 = X.C150388wA.A00(r0)
            X.4qq r2 = r5.A02
            com.instagram.service.session.UserSession r1 = r5.A01
            X.FQJ r0 = new X.FQJ
            r0.<init>(r1, r2)
            X.8wA r0 = X.C18220wO.A0Z(r3, r0)
            r5.mRecyclerAdapter = r0
            A00(r5)
            androidx.recyclerview.widget.RecyclerView r0 = X.C18230wP.A0L(r6)
            r5.mRecyclerView = r0
            r5.getContext()
            X.C18190wL.A1D(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            X.8wA r0 = r5.mRecyclerAdapter
            r1.setAdapter(r0)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x010e
            com.instagram.service.session.UserSession r3 = r5.A01
            X.GdU r2 = X.C548530j.A00
            r4 = 0
            X.C04220Ms.A0B(r3, r4)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            X.9tz r1 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r1 != r0) goto L_0x010b
            boolean r0 = X.AnonymousClass2MS.A00(r3)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r2.A05(r3)
            if (r0 == 0) goto L_0x010b
        L_0x0066:
            r1 = 1
        L_0x0067:
            boolean r0 = X.C35072Lz.A00(r3)
            if (r1 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x010e
            com.instagram.service.session.UserSession r0 = r5.A01
            X.49Y r3 = X.AnonymousClass3Zh.A01(r0)
            com.instagram.service.session.UserSession r1 = r5.A01
            X.C04220Ms.A0B(r1, r4)
            r0 = 0
            int r0 = X.AnonymousClass2M1.A00(r1, r0)
            X.24S r2 = X.AnonymousClass24S.PROFILE
            r3.A05(r2, r0)
            com.instagram.service.session.UserSession r0 = r5.A01
            X.49W r1 = X.AnonymousClass2MQ.A00(r0)
            X.0nS r0 = r1.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = X.C18180wK.A0e()
            r1.A00 = r0
            X.AnonymousClass49W.A03(r3, r1)
            X.2AB r0 = X.AnonymousClass2AB.A03
            X.C18220wO.A1D(r0, r3)
            X.2A3 r0 = X.AnonymousClass2A3.VIEW
            X.C18220wO.A1E(r0, r3)
            X.Lcg r0 = X.C40326Lcg.A0H
            X.C18230wP.A1D(r0, r3)
            X.29r r0 = X.AnonymousClass49W.A00(r2, r4)
            X.AnonymousClass2AH.A01(r0, r3)
            java.lang.String r4 = r1.A00
            r2 = 21
            r1 = 10
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = X.AnonymousClass3QD.A00(r2, r1, r0)
            r3.A0T(r0, r4)
        L_0x00c4:
            r3.Bb4()
        L_0x00c7:
            com.instagram.service.session.UserSession r1 = r5.A01
            X.GdU r0 = X.C548530j.A00
            boolean r0 = r0.A05(r1)
            if (r0 != 0) goto L_0x00e2
            com.instagram.service.session.UserSession r3 = r5.A01
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36321499040390013(0x810a3600031b7d, double:3.0332004758554863E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x00fd
        L_0x00e2:
            X.1pk r4 = r5.A00
            X.8sG r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x00ec
            r0.AC7(r3)
        L_0x00ec:
            X.4qz r2 = X.AnonymousClass3J5.A00(r4)
            r0 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7 r1 = X.C18240wQ.A0n(r4, r3, r0)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r3, r3, r1, r2, r0)
            r4.A00 = r0
        L_0x00fd:
            X.1pk r0 = r5.A00
            X.M5J r2 = r0.A02
            X.066 r1 = r5.getViewLifecycleOwner()
            r0 = 46
            X.C18190wL.A1C(r1, r2, r5, r0)
            return
        L_0x010b:
            r1 = 0
            goto L_0x0067
        L_0x010e:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0148
            com.instagram.service.session.UserSession r4 = r5.A01
            X.GdU r2 = X.C548530j.A00
            r3 = 0
            X.C04220Ms.A0B(r4, r3)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r4)
            X.9tz r1 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r1 != r0) goto L_0x0148
            boolean r0 = X.AnonymousClass2MS.A00(r4)
            if (r0 != 0) goto L_0x0132
            boolean r0 = r2.A05(r4)
            if (r0 == 0) goto L_0x0148
        L_0x0132:
            com.instagram.service.session.UserSession r0 = r5.A01
            X.49Y r2 = X.AnonymousClass3Zh.A01(r0)
            com.instagram.service.session.UserSession r1 = r5.A01
            X.C04220Ms.A0B(r1, r3)
            r0 = 0
            int r1 = X.AnonymousClass2M1.A00(r1, r0)
            X.24S r0 = X.AnonymousClass24S.PROFILE
            r2.A05(r0, r1)
            goto L_0x00c7
        L_0x0148:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x00c7
            com.instagram.service.session.UserSession r1 = r5.A01
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            boolean r0 = X.C35072Lz.A00(r1)
            if (r0 == 0) goto L_0x00c7
            com.instagram.service.session.UserSession r0 = r5.A01
            X.49W r1 = X.AnonymousClass2MQ.A00(r0)
            X.0nS r0 = r1.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x00c7
            com.instagram.service.session.UserSession r0 = r1.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r3.A0S(r0, r1)
            X.2AB r0 = X.AnonymousClass2AB.A06
            X.C18220wO.A1D(r0, r3)
            X.2A3 r0 = X.AnonymousClass2A3.VIEW
            X.C18220wO.A1E(r0, r3)
            X.Lcg r0 = X.C40326Lcg.A0H
            X.C18230wP.A1D(r0, r3)
            X.29r r0 = X.C319729r.PROFILE
            X.AnonymousClass2AH.A01(r0, r3)
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.universalcreationsheet.UniversalCreationMenuFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
