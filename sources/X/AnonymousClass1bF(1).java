package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;

/* renamed from: X.1bF  reason: invalid class name */
public final class AnonymousClass1bF extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "NametagFragment";
    public RectF A00;
    public C31017GdY A01;
    public NametagController A02;
    public GVg A03;
    public C309923u A04;
    public C84464tB A05;
    public KIX A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C04530Oa A0C = C80644m9.A00(this);

    public final String getModuleName() {
        return "nametag";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0K(view2, R.id.nametag_container);
        KIX kix = new KIX();
        registerLifecycleListener(kix);
        Activity rootActivity = getRootActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.A0C);
        String str2 = this.A09;
        if (str2 == null) {
            str = C62443a0.A00(19, 8, 67);
        } else {
            String str3 = this.A07;
            String str4 = this.A08;
            if (str4 == null) {
                str = "userId";
            } else {
                RectF rectF = this.A00;
                boolean z = this.A0B;
                boolean A1Z = C18180wK.A1Z(this.A04, C309923u.DOGFOOD_ASSISTANT);
                GVg gVg = this.A03;
                if (gVg == null) {
                    str = "selfiePhotoManager";
                } else {
                    C84464tB r9 = this.A05;
                    if (r9 == null) {
                        str = "keyboardHeightChangeDetector";
                    } else {
                        this.A02 = new NametagController(rootActivity, rectF, viewGroup, gVg, this, this, r9, kix, A0X, str2, str3, str4, z, A1Z, this.A0A);
                        this.A06 = kix;
                        this.A0B = false;
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0C);
    }

    public final boolean onBackPressed() {
        NametagController nametagController = this.A02;
        if (nametagController == null || !nametagController.A03()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-864497071);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r3 = this.A0C;
        AnonymousClass2FY.A00(AnonymousClass0wJ.A0X(r3));
        String str2 = null;
        if (!requireArguments.containsKey("NametagFragment.ARGUMENT_USERNAME") || !requireArguments.containsKey("NametagFragment.ARGUMENT_FULLNAME") || !requireArguments.containsKey("NametagFragment.ARGUMENT_USER_ID")) {
            User A012 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r3));
            this.A09 = A012.BK7();
            this.A07 = A012.Ak1();
            this.A08 = A012.getId();
        } else {
            this.A09 = C18210wN.A0b(requireArguments, "NametagFragment.ARGUMENT_USERNAME", (String) null);
            this.A07 = requireArguments.getString("NametagFragment.ARGUMENT_FULLNAME");
            this.A08 = C18210wN.A0b(requireArguments, "NametagFragment.ARGUMENT_USER_ID", "0");
        }
        boolean z = false;
        this.A0A = requireArguments.getBoolean("NametagFragment.ARGUMENT_ENABLE_DOWNLOAD_QR", false);
        this.A00 = (RectF) requireArguments.getParcelable("NametagFragment.ARGUMENT_ENTRY_VIEW_BOUNDS");
        Serializable serializable = requireArguments.getSerializable("NametagFragment.ARGUMENT_ENTRY_POINT");
        if (serializable != null) {
            this.A04 = (C309923u) serializable;
            if (requireArguments.getBoolean("NametagFragment.ARGUMENT_SCAN_MODE", false) && C28161tl.A04(AnonymousClass0wJ.A0X(r3)).getBoolean("seen_nametag_nux_tutorial", false)) {
                z = true;
            }
            this.A0B = z;
            GVg gVg = new GVg(requireContext(), this, AnonymousClass0wJ.A0X(r3));
            this.A03 = gVg;
            if (gVg.A00 == null) {
                gVg.A02.schedule(new C28539FQr((FQ0) null, gVg));
            }
            UserSession A0X = AnonymousClass0wJ.A0X(r3);
            C309923u r0 = this.A04;
            if (r0 != null) {
                str2 = r0.A00;
            }
            this.A01 = new C31017GdY(A0X, "nametag", str2);
            AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r3))), "seen_nametag", true);
            C31017GdY gdY = this.A01;
            if (gdY != null) {
                boolean A1W = C18180wK.A1W(requireContext().checkSelfPermission(AnonymousClass000.A00(49)));
                boolean A032 = C121897Ir.A03(requireContext());
                if (this.A0B) {
                    str = "camera_scan";
                } else {
                    str = "self_card";
                }
                gdY.A05(str, A1W, A032);
            }
            this.A05 = C25711DqZ.A01(this, false, false);
            C28161tl A013 = AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r3));
            C18240wQ.A1D(A013.A02, C63803iN.A0C(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r3), 36881128986509545L));
            C14030oh.A09(-606948386, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1546048048, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-227650954);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nametag_fragment_layout, viewGroup, false);
        C14030oh.A09(-1119421440, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = C14030oh.A02(-383818236);
        super.onDestroy();
        NametagController nametagController = this.A02;
        boolean z = true;
        if (nametagController == null || !nametagController.A03) {
            z = false;
        }
        C31017GdY gdY = this.A01;
        if (gdY != null) {
            if (z) {
                str = "camera_scan";
            } else {
                str = "self_card";
            }
            gdY.A03(str);
        }
        AnonymousClass1o2.A01(C28174Ezk.A00(607)).A06();
        C14030oh.A09(-932101942, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(351735999);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        KIX kix = this.A06;
        if (kix != null) {
            kix.onDestroyView();
        }
        this.A06 = null;
        C14030oh.A09(-1101982293, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1019405916);
        super.onResume();
        getRootActivity();
        C14030oh.A09(2076737403, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-78296061);
        super.onStart();
        C84464tB r1 = this.A05;
        if (r1 == null) {
            C04220Ms.A0E("keyboardHeightChangeDetector");
            throw null;
        }
        r1.CLs(requireActivity());
        C14030oh.A09(1356407061, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(467056526);
        super.onStop();
        C84464tB r0 = this.A05;
        if (r0 == null) {
            C04220Ms.A0E("keyboardHeightChangeDetector");
            throw null;
        }
        r0.onStop();
        Window A0F = C18190wL.A0F(this);
        if (A0F != null) {
            C31164GhX.A06(A0F.getDecorView(), A0F, true);
            getRootActivity();
            C14030oh.A09(1790343534, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-1753015846, A022);
        throw A0b;
    }
}
