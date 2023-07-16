package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1Yr  reason: invalid class name and case insensitive filesystem */
public final class C22591Yr extends C34640IcN {
    public static final String __redex_internal_original_name = "FxISUpsellFragment";
    public ViewStub A00;
    public AnonymousClass2A6 A01;
    public C10300i6 A02;
    public AnonymousClass10C A03;

    public final String getModuleName() {
        return "IS Upsell";
    }

    public static void A00(C22591Yr r13) {
        UserSession userSession = (UserSession) r13.A02;
        AnonymousClass2A6 r2 = r13.A01;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r2);
        C63243h6.A01(AnonymousClass2A7.A07, r2, userSession, (Map) null);
        r13.A03.A0C = A1Z;
        C35682Ok.A00().A00(r13.getContext(), C18180wK.A0F(r13), false, false, false);
        C10300i6 r5 = r13.A02;
        ImmutableList immutableList = r13.A03.A00;
        immutableList.getClass();
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r13, 104);
        C04220Ms.A0B(r5, 0);
        C67463zb A002 = C67463zb.A00();
        String A0e = C18180wK.A0e();
        A002.A05("client_mutation_id", A0e);
        boolean A1W = AnonymousClass0wJ.A1W(A0e);
        A002.A06("accounts_to_sync", immutableList);
        AnonymousClass7Ko.A0B(A1W);
        AnonymousClass7Ko.A0B(A1Z);
        C31155GhB.A03(C67473zc.A01(A002, A06, r5, AnonymousClass151.class, "IGFxImSyncResourcesMutation"));
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public static void A01(C22591Yr r2, int i) {
        C82844qM r1;
        C35682Ok.A00().A01(C18180wK.A0F(r2));
        FragmentActivity requireActivity = r2.requireActivity();
        if ((requireActivity instanceof C82844qM) && (r1 = (C82844qM) requireActivity) != null) {
            r1.Ben(i);
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass2A6 r0;
        int A022 = C14030oh.A02(-1325526787);
        super.onCreate(bundle);
        this.A03 = (AnonymousClass10C) new AnonymousClass7IU(requireActivity()).A01(AnonymousClass10C.class);
        Bundle A07 = C18250wR.A07(this);
        String string = A07.getString("ONBOARDING_STEP");
        if (string == null || string.equals(String.valueOf(AnonymousClass2A6.A03))) {
            r0 = AnonymousClass2A6.A03;
        } else {
            r0 = AnonymousClass2A6.A04;
        }
        this.A01 = r0;
        this.A02 = C18190wL.A0S(A07);
        C14030oh.A09(-751664230, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(24880269);
        C35682Ok.A00().A00(getContext(), C18180wK.A0F(this), false, false, false);
        View inflate = layoutInflater.inflate(R.layout.fx_is_upsell_screen_layout, viewGroup, false);
        this.A00 = (ViewStub) inflate.requireViewById(R.id.fx_is_upsell_screen_stub);
        C10300i6 r4 = this.A02;
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 103);
        C04220Ms.A0B(r4, 0);
        C31155GhB.A03(C67473zc.A01(C67463zb.A00(), A06, r4, C206315m.class, "IGFXIMNUXConfigQuery"));
        C14030oh.A09(-1828692707, A022);
        return inflate;
    }
}
