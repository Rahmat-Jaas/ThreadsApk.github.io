package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape48S0300000_1_I2;
import com.facebook.redex.IDxEListenerShape165S0200000_1_I2;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Arrays;

/* renamed from: X.1cb  reason: invalid class name and case insensitive filesystem */
public abstract class C23161cb extends C34640IcN implements C82424pb, C82824qK, C82034oy, C82594px {
    public static final String __redex_internal_original_name = "BaseConsentFragment";
    public C10300i6 A00;
    public RegFlowExtras A01;
    public boolean A02;
    public final C82394pY A03 = C18220wO.A0P(this, 34);
    public final C82394pY A04 = C18220wO.A0P(this, 35);

    public abstract String getModuleName();

    public static C26211qE A00(Bundle bundle, C10300i6 r3, Integer num, String str, boolean z) {
        bundle.putString("GDPR.Fragment.EntryPoint", str);
        bundle.putString("GDPR.Fragment.UserState", AnonymousClass2PB.A00(num));
        bundle.putBoolean("GDPR.Fragment.Entrance.Enabled", z);
        C05050Qq.A00(bundle, r3);
        C26211qE r0 = new C26211qE();
        r0.setArguments(bundle);
        return r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.1qD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1qE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.1qC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.1qE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.1qE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.1qE} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C26191qC
            if (r0 == 0) goto L_0x004a
            r1 = r9
            X.1qC r1 = (X.C26191qC) r1
            X.3bU r0 = X.C63093bU.A00()
            X.0i6 r2 = r1.A00
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            java.lang.Integer r5 = r1.AkY()
            r6 = 0
            r4 = r3
            r0.A04(r1, r2, r3, r4, r5, r6)
            X.1jm r0 = r1.A01
            r0.A00()
            android.content.Context r2 = r1.getContext()
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r7 = r0.A04
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r6 = r0.A02
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.String r8 = r0.A07
            X.0i6 r5 = r1.A00
            X.H1T r3 = new X.H1T
            r3.<init>(r5)
            X.3HL r0 = r1.A00
            A01(r3, r0)
            X.1jm r0 = r1.A01
        L_0x0041:
            X.1i9 r4 = new X.1i9
            r4.<init>(r1, r0)
            X.C59733Mc.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x004a:
            boolean r0 = r9 instanceof X.C26201qD
            if (r0 == 0) goto L_0x007b
            r1 = r9
            X.1qD r1 = (X.C26201qD) r1
            X.1jm r0 = r1.A01
            r0.A00()
            android.content.Context r2 = r1.getContext()
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r7 = r0.A04
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r6 = r0.A02
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.String r8 = r0.A07
            X.0i6 r5 = r1.A00
            X.H1T r3 = new X.H1T
            r3.<init>(r5)
            X.3HL r0 = r1.A00
            A01(r3, r0)
            X.1jm r0 = r1.A01
            goto L_0x0041
        L_0x007b:
            r1 = r9
            X.1qE r1 = (X.C26211qE) r1
            X.3bU r0 = X.C63093bU.A00()
            X.0i6 r2 = r1.A00
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            java.lang.Integer r5 = r1.AkY()
            r6 = 0
            r4 = r3
            r0.A04(r1, r2, r3, r4, r5, r6)
            X.1jm r0 = r1.A04
            r0.A00()
            android.content.Context r2 = r1.getContext()
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r7 = r0.A04
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r6 = r0.A02
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.String r8 = r0.A07
            X.0i6 r5 = r1.A00
            X.H1T r3 = new X.H1T
            r3.<init>(r5)
            X.3VH r0 = X.AnonymousClass3VH.A00()
            X.3DK r0 = r0.A00
            X.3HL r0 = r0.A02
            A01(r3, r0)
            X.1jm r0 = r1.A04
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23161cb.A02():void");
    }

    public final void A03() {
        C697449w A002;
        synchronized (C18250wR.A0C(this.A00)) {
        }
        synchronized (AnonymousClass3VH.class) {
            AnonymousClass3VH.A00().A01(new AnonymousClass3DK(), AnonymousClass006.A1C, "", "");
            AnonymousClass3VH.A00().A02(AnonymousClass265.A0z, "", "");
        }
        C10300i6 r4 = this.A00;
        String str = AnonymousClass3VH.A00().A06;
        boolean A1Z = AnonymousClass0wJ.A1Z(r4, str);
        if (("blocking".equals(str) || "direct_blocking".equals(str)) && (A002 = AnonymousClass3GW.A00.A00(r4)) != null) {
            synchronized (A002) {
                A002.A05 = false;
            }
        }
        if (this.A02) {
            C12560m7 r1 = this.mFragmentManager;
            if (r1 != null) {
                r1.A11("GDPR.Fragment.Entrance", A1Z ? 1 : 0);
                r1.A0b();
                return;
            }
            return;
        }
        C18190wL.A1A(this);
    }

    public final void A04() {
        if (isResumed()) {
            C63093bU A002 = C63093bU.A00();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A00), "instagram_gdpr_consent_flow_finished"), 1829);
            if (AnonymousClass0wJ.A1U(A0I)) {
                String str = A002.A02;
                str.getClass();
                A0I.A0T(C63833iQ.A03(), str);
                Integer num = A002.A00;
                num.getClass();
                C18250wR.A0y(A0I, C63093bU.A02(A0I, this, "user_state", AnonymousClass2PB.A00(num)));
                A0I.Bb4();
            }
            if (AnonymousClass3VH.A00().A04 != AnonymousClass006.A00) {
                Context context = getContext();
                String string = getString(2131836846);
                Drawable drawable = getContext().getDrawable(R.drawable.circle_checked);
                View inflate = LayoutInflater.from(context).inflate(R.layout.image_toast, (ViewGroup) null, false);
                TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.text_view);
                ImageView A0J = C18200wM.A0J(inflate, R.id.image_view);
                A0L.setText(string);
                A0J.setVisibility(0);
                A0J.setImageDrawable(drawable);
                C19080z7 r1 = new C19080z7(context);
                r1.setDuration(1);
                r1.setGravity(17, 0, 0);
                r1.setView(inflate);
                r1.show();
                C38040KHr.A01.A02(new AnonymousClass45C());
                A03();
            } else if (this.A01 != null) {
                AnonymousClass3VH.A00();
                C07530bf A003 = C05030Qo.A00(this.A00);
                String str2 = AnonymousClass3VH.A00().A0A;
                RegFlowExtras regFlowExtras = this.A01;
                regFlowExtras.A0C = AnonymousClass3VH.A00().A07;
                C67283zI.A02(C18250wR.A08(), this, this, (C82804qI) null, this, regFlowExtras, (C24721jv) null, A003, AnonymousClass3VH.A00().A01, str2, AnonymousClass3VH.A00().A09, false);
            } else {
                C10450iM.A03("GDPR consent flow", "No reg extra found");
            }
        }
    }

    public final boolean A05() {
        C25786Drz drz;
        Fragment fragment;
        if (isResumed()) {
            Integer num = AnonymousClass3VH.A00().A04;
            Integer num2 = AnonymousClass006.A00;
            if (num == num2 && AnonymousClass3VH.A00().A02 == AnonymousClass006.A15) {
                Context context = getContext();
                C10300i6 r13 = this.A00;
                C12560m7 r14 = this.mFragmentManager;
                RegFlowExtras regFlowExtras = this.A01;
                FragmentActivity activity = getActivity();
                C04220Ms.A0B(context, 0);
                int A022 = C18200wM.A02(1, r13, r14);
                AnonymousClass3VH A002 = AnonymousClass3VH.A00();
                synchronized (A002) {
                    Integer num3 = A002.A05;
                    if (num3 == num2) {
                        A002.A05 = AnonymousClass006.A01;
                    } else if (num3 == AnonymousClass006.A01) {
                        A002.A05 = AnonymousClass006.A0C;
                    }
                }
                Integer num4 = AnonymousClass3VH.A00().A05;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    if (intValue == 1) {
                        C25828Dsm A0W = C18190wL.A0W(context);
                        A0W.A02 = context.getString(2131822376);
                        C18220wO.A14(context, A0W, 2131822375);
                        A0W.A0P(new IDxCListenerShape20S0400000_1_I2(6, (Object) activity, (Object) r13, (Object) r14, (Object) this), 2131831976);
                        A0W.A0q(false);
                        AnonymousClass0wJ.A1K(A0W);
                        C63093bU.A03(this, r13, C63093bU.A00(), AnonymousClass006.A1L, (Integer) null);
                        return true;
                    } else if (intValue == A022) {
                        Bundle A06 = C18180wK.A06();
                        if (regFlowExtras != null) {
                            A06.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        }
                        C05050Qq.A00(A06, r13);
                        drz = C63463hW.A00(activity, r13);
                        C18180wK.A0w(A06, r13);
                        fragment = new AnonymousClass1bG();
                        fragment.setArguments(A06);
                    }
                }
                return true;
            } else if (AnonymousClass3VH.A00().A04 != num2 || AnonymousClass3VH.A00().A02 != AnonymousClass006.A0N) {
                Integer num5 = AnonymousClass3VH.A00().A02;
                Bundle bundle = this.mArguments;
                if (num5 != null) {
                    int intValue2 = num5.intValue();
                    if (intValue2 == 0) {
                        GU8.A01.A00();
                        C04220Ms.A0B(bundle, 0);
                        fragment = new C26211qE();
                    } else if (intValue2 == 1) {
                        GU8.A01.A00();
                        C04220Ms.A0B(bundle, 0);
                        fragment = new C26191qC();
                    } else if (intValue2 == 4) {
                        GU8.A01.A00();
                        C04220Ms.A0B(bundle, 0);
                        fragment = new C26201qD();
                    }
                    fragment.setArguments(bundle);
                    drz = C18180wK.A0Q(getActivity(), this.A00);
                }
            } else if (this.A01 != null) {
                AnonymousClass3VH.A00();
                C07530bf A003 = C05030Qo.A00(this.A00);
                String str = AnonymousClass3VH.A00().A0A;
                RegFlowExtras regFlowExtras2 = this.A01;
                regFlowExtras2.A0C = AnonymousClass3VH.A00().A07;
                Handler A08 = C18250wR.A08();
                String str2 = AnonymousClass3VH.A00().A09;
                C67283zI.A02(A08, this, this, (C82804qI) null, (C82824qK) null, regFlowExtras2, (C24721jv) null, A003, AnonymousClass3VH.A00().A01, str, str2, true);
                return true;
            } else {
                C10450iM.A03("GDPR consent flow", "No reg extra found");
                return true;
            }
            drz.A03 = fragment;
            drz.A05();
            return true;
        }
        return false;
    }

    public final Integer AkY() {
        if (this instanceof C26191qC) {
            return AnonymousClass006.A01;
        }
        if (this instanceof C26211qE) {
            return AnonymousClass006.A00;
        }
        return AnonymousClass006.A09;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (this instanceof C26201qD) {
            r3.Crs(AnonymousClass0wJ.A0B(this).getString(2131834957));
        } else if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00 || "blocking".equals(AnonymousClass3VH.A00().A06) || "direct_blocking".equals(AnonymousClass3VH.A00().A06)) {
            r3.CtO(false);
        } else {
            r3.Cqb(2131834957);
            C25764Drc A0K = C18190wL.A0K();
            A0K.A0C = C18190wL.A0H(this, 449);
            A0K.A04 = 2131823055;
            AnonymousClass4u2.A03(A0K, r3);
        }
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        if ("blocking".equals(AnonymousClass3VH.A00().A06)) {
            return true;
        }
        AnonymousClass3Zk.A01(getContext(), C18220wO.A0O(this, 68), new IDxCListenerShape48S0300000_1_I2(28, (Object) this, (Object) this, (Object) this));
        return true;
    }

    public static void A01(H1T h1t, AnonymousClass3HL r3) {
        AnonymousClass2P9.A00(h1t, Arrays.asList(new AnonymousClass3HL[]{r3}), Arrays.asList(new AnonymousClass23D[]{AnonymousClass23D.CONSENT}));
    }

    public final void Cth(String str, Integer num) {
        C25828Dsm A0W = C18190wL.A0W(getActivity());
        A0W.A0p(str);
        C18180wK.A1N(A0W, this, 69, 2131834544);
        AnonymousClass0wJ.A1K(A0W);
    }

    public void onCreate(Bundle bundle) {
        C24631jj r1;
        int A022 = C14030oh.A02(1108862559);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass7Ko.A07(bundle2, "Fragment arguments cannot be null in GDPR flow!");
        this.A00 = C18190wL.A0S(bundle2);
        this.A01 = (RegFlowExtras) bundle2.getParcelable("RegFlowExtras.EXTRA_KEY");
        this.A02 = requireArguments().getBoolean("GDPR.Fragment.Entrance.Enabled");
        C24731jw.A00(this);
        FragmentActivity activity = getActivity();
        IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 36);
        if (activity == null) {
            r1 = null;
        } else {
            r1 = new C24631jj(new IDxEListenerShape165S0200000_1_I2(2, activity.getSupportFragmentManager(), A0P));
        }
        registerLifecycleListener(r1);
        C38040KHr kHr = C38040KHr.A01;
        kHr.A03(this.A03, AnonymousClass45P.class);
        kHr.A03(this.A04, AnonymousClass45L.class);
        C14030oh.A09(-1407679633, A022);
    }

    public void onDestroy() {
        int A022 = C14030oh.A02(700874526);
        super.onDestroy();
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A03, AnonymousClass45P.class);
        kHr.A04(this.A04, AnonymousClass45L.class);
        C14030oh.A09(754691089, A022);
    }
}
