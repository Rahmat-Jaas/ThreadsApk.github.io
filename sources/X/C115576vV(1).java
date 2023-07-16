package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxEListenerShape166S0200000_2_I2;
import com.facebook.redex.IDxEListenerShape224S0100000_2_I2;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;

/* renamed from: X.6vV  reason: invalid class name and case insensitive filesystem */
public final class C115576vV {
    public Integer A00;
    public Integer A01;
    public String A02;
    public C82394pY A03;
    public final FragmentActivity A04;
    public final C1201378u A05;
    public final C34640IcN A06;
    public final C11630kW A07;
    public final UserSession A08;
    public final Context A09;
    public final Map A0A = C18220wO.A0y();

    public C115576vV(Context context, FragmentActivity fragmentActivity, C34640IcN icN, C11630kW r5, UserSession userSession) {
        C18190wL.A1S(r5, 4, context);
        this.A08 = userSession;
        this.A06 = icN;
        this.A04 = fragmentActivity;
        this.A07 = r5;
        this.A09 = context;
        this.A05 = new C1201378u(userSession);
    }

    public final void A01(AnonymousClass8iQ r4) {
        C04220Ms.A0B(r4, 0);
        IDxEListenerShape166S0200000_2_I2 iDxEListenerShape166S0200000_2_I2 = new IDxEListenerShape166S0200000_2_I2(0, this, r4);
        this.A0A.put(r4, iDxEListenerShape166S0200000_2_I2);
        AnonymousClass3LY.A00(this.A08).A01(iDxEListenerShape166S0200000_2_I2, C131347ro.class);
    }

    public final void A02(AnonymousClass8iQ r5) {
        C04220Ms.A0B(r5, 0);
        Map map = this.A0A;
        C82394pY r2 = (C82394pY) map.get(r5);
        if (r2 != null) {
            AnonymousClass3LY.A00(this.A08).A02(r2, C131347ro.class);
        }
        map.remove(r5);
    }

    public final void A03(AnonymousClass368 r4) {
        IDxEListenerShape224S0100000_2_I2 iDxEListenerShape224S0100000_2_I2 = new IDxEListenerShape224S0100000_2_I2(r4, 0);
        this.A03 = iDxEListenerShape224S0100000_2_I2;
        AnonymousClass3LY.A00(this.A08).A01(iDxEListenerShape224S0100000_2_I2, C131237rd.class);
    }

    public final boolean A06(Integer num, String str) {
        String A002;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A05.A03, 36318698721514179L)) {
            return false;
        }
        if (this.A02 == null) {
            C34640IcN icN = this.A06;
            C130667qT r3 = null;
            if (icN != null) {
                r3 = C130667qT.A01(icN, this.A07, this.A08, (C30938GbW) null);
            } else {
                FragmentActivity fragmentActivity = this.A04;
                if (fragmentActivity != null) {
                    r3 = C130667qT.A00((SparseArray) null, fragmentActivity, this.A07, this.A08);
                }
            }
            this.A02 = str;
            this.A00 = num;
            if (r3 != null) {
                UserSession userSession = this.A08;
                Pair A0p = C18180wK.A0p("flow_name", "flm_ar_effect");
                switch (num.intValue()) {
                    case 0:
                        A002 = C28174Ezk.A00(592);
                        break;
                    case 1:
                        A002 = "ig_camera_effect_tray";
                        break;
                    case 2:
                        A002 = "ig_rtc_effect_tray";
                        break;
                    case 3:
                        A002 = "ig_rtc_mini_gallery";
                        break;
                    default:
                        A002 = "ig_shopping_camera";
                        break;
                }
                AnonymousClass4A9 A003 = C63263h8.A00(userSession, C18170wI.A00(918), AnonymousClass4WJ.A0H(A0p, C18180wK.A0p("source", A002), C18180wK.A0p("surface", I17.A00(261)), C18180wK.A0p("experience_id", str)));
                A003.A00 = new AnonymousClass1eI(r3, "FlmConsentController");
                C31155GhB.A03(A003);
            }
        }
        return true;
    }

    public final void A00() {
        UserSession userSession = this.A08;
        Context context = this.A09;
        C121017Dr A002 = C121017Dr.A00();
        C04220Ms.A06(A002);
        synchronized (A002) {
            C18180wK.A0u(C08340dC.A01("ig_mq_asset_prefs").edit(), "prefs_asset_snapshot_key");
            A002.A00 = 0;
            A002.A01 = null;
            A002.A02 = null;
            A002.A04 = null;
            A002.A03 = null;
            A002.A07 = Collections.emptyList();
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape15S0201000_I2_1((Object) userSession, (Object) context, (C146958n9) null, 9), C73874Uq.A00, 3);
    }

    public final void A04(boolean z) {
        AnonymousClass22X r0;
        C1201378u r02 = this.A05;
        Boolean valueOf = Boolean.valueOf(z);
        C113896sL r1 = r02.A00;
        if (r1 == null) {
            C04220Ms.A0E("sparkARFLMConsentManager");
            throw null;
        }
        if (C18190wL.A1Z(valueOf, true)) {
            r0 = AnonymousClass22X.CONSENTED;
        } else if (valueOf == null) {
            r0 = AnonymousClass22X.DEFAULT_NOT_SEEN;
        } else if (valueOf.equals(C18180wK.A0X())) {
            r0 = AnonymousClass22X.WITHDRAWN;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        r1.A01(r0);
    }

    public final boolean A05() {
        C113896sL r0 = this.A05.A00;
        if (r0 == null) {
            C04220Ms.A0E("sparkARFLMConsentManager");
            throw null;
        }
        AnonymousClass22X r02 = r0.A04;
        if (r02 == null) {
            r02 = AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        int ordinal = r02.ordinal();
        boolean z = true;
        if (!(ordinal == 1 || ordinal == 3)) {
            if (ordinal == 2 || ordinal == 4) {
                return true;
            }
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return true;
    }
}
