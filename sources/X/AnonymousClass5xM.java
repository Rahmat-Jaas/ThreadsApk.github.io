package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2050000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2;
import com.facebook.redex.IDxConsumerShape377S0100000_2_I2;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;
import kotlin.jvm.internal.KtLambdaShape172S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67;

/* renamed from: X.5xM  reason: invalid class name */
public abstract class AnonymousClass5xM extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "ProductSettingsFragmentBase";
    public C133727wF A00;
    public CB4 A01;
    public boolean A02 = true;
    public final C04530Oa A03;
    public final C04530Oa A04 = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 11));
    public final C04530Oa A05 = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 12));
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08;
    public final C04530Oa A09;
    public final C04530Oa A0A = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 15));
    public final C04530Oa A0B = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 16));
    public final C04530Oa A0C = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 20));

    public static final void A03(UserMonetizationProductType userMonetizationProductType, OnboardingRepository onboardingRepository, AnonymousClass5xM r10, String str, String str2) {
        String str3;
        AnonymousClass5xM r2 = r10;
        FragmentActivity activity = r10.getActivity();
        if (activity != null) {
            r10.A02 = true;
            r10.A01();
            C25441Dlh dlh = C103286Yn.A00;
            UserSession A0X = AnonymousClass0wJ.A0X(r10.A0C);
            String moduleName = r10.getModuleName();
            C04220Ms.A06(moduleName);
            if (r10 instanceof AnonymousClass62L) {
                str3 = C117526yp.A01(r10).A01;
            } else {
                str3 = null;
            }
            dlh.A01(r2, activity, userMonetizationProductType, onboardingRepository, A0X, moduleName, str, str2, str3);
        }
    }

    public static final void A04(AnonymousClass5xM r10) {
        String str;
        r10.A02 = false;
        C132097tJ r2 = (C132097tJ) r10.A03.getValue();
        C35424Iut A002 = C25584DoK.A00(r10.A07());
        C35421Iuq A012 = C25584DoK.A01(r10.A07());
        C314627s r7 = C314627s.IMPRESSION;
        String moduleName = r10.getModuleName();
        C04220Ms.A06(moduleName);
        CB4 cb4 = r10.A01;
        if (cb4 != null) {
            String A032 = cb4.A03();
            CB4 cb42 = r10.A01;
            if (cb42 != null) {
                KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2 = (KtCSuperShape0S4110000_I2) cb42.A02.A08();
                if (ktCSuperShape0S4110000_I2 != null) {
                    str = ktCSuperShape0S4110000_I2.A01;
                } else {
                    str = null;
                }
                C18200wM.A1S(A002, A012);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00, "ig_creator_monetization_product_settings_flow"), 1154);
                C86134wK.A1E(A002, A012, A0I, moduleName);
                A0I.A0O(r7, "action");
                C35410Iuf iuf = null;
                if (A032 != null) {
                    try {
                        iuf = C35410Iuf.valueOf(A032);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                A0I.A0O(iuf, "origin");
                A0I.A0T(C18170wI.A00(147), str);
                A0I.Bb4();
                View view = r10.mView;
                if (view != null) {
                    r10.A02(view);
                }
                r10.A0B();
                r10.A0D(false);
                return;
            }
        }
        C04220Ms.A0E("productOnboardingViewModel");
        throw null;
    }

    public static final void A05(AnonymousClass5xM r8, AnonymousClass62M r9, String str) {
        String str2;
        AnonymousClass5xM r2 = r8;
        if (str == null) {
            A04(r8);
            return;
        }
        r8.A02 = true;
        r8.A01();
        if (str.equals("payouts_onboarding") || str.equals("deferred_onboarding_payouts")) {
            String moduleName = r8.getModuleName();
            C04220Ms.A06(moduleName);
            FragmentActivity requireActivity = r8.requireActivity();
            UserSession A0X = AnonymousClass0wJ.A0X(r8.A0C);
            CB4 cb4 = r8.A01;
            if (cb4 != null) {
                UserMonetizationProductType A022 = cb4.A02();
                CB4 cb42 = r8.A01;
                if (cb42 != null) {
                    String A032 = cb42.A03();
                    if (r2 instanceof AnonymousClass62L) {
                        str2 = C117526yp.A01(r2).A01;
                    } else {
                        str2 = null;
                    }
                    C102006Tl.A00(r2, requireActivity, A022, A0X, moduleName, A032, (String) null, (String) null, str2);
                    return;
                }
            }
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        r8.A06(r9);
    }

    public void A0A() {
        if (this instanceof AnonymousClass62K) {
            AnonymousClass62K r2 = (AnonymousClass62K) this;
            C86104wH.A1F(r2, ((C882457h) r2.A00.getValue()).A00, 297);
            return;
        }
        AnonymousClass061 r5 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) this, (Object) viewLifecycleOwner, (Object) r5, (C146958n9) null, 47), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        super.onActivityResult(i3, i2, intent2);
        if (i3 != 8888) {
            return;
        }
        if (intent == null || !intent2.getBooleanExtra(C18170wI.A00(70), false)) {
            onBackPressed();
            return;
        }
        D38 d38 = D38.FINISHED;
        AnonymousClass6BH r5 = AnonymousClass6BH.PAYOUTS_ONBOARDING;
        String moduleName = getModuleName();
        C04220Ms.A06(moduleName);
        C132097tJ r1 = (C132097tJ) this.A03.getValue();
        C35424Iut A002 = C25584DoK.A00(A07());
        C35421Iuq A012 = C25584DoK.A01(A07());
        CB4 cb4 = this.A01;
        if (cb4 == null) {
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        r1.A02(A002, A012, d38, r5, moduleName, cb4.A03(), (String) null);
        C101996Tk A082 = A08();
        if (A082 instanceof AnonymousClass62M) {
            A06((AnonymousClass62M) A082);
            return;
        }
        CB4 cb42 = this.A01;
        if (cb42 == null) {
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(this.A0C);
        CB4 cb43 = this.A01;
        if (cb43 == null) {
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        C04220Ms.A06(getString(cb43.A01()));
        String moduleName2 = getModuleName();
        C04220Ms.A06(moduleName2);
        cb42.A05(this, requireActivity, A0X, moduleName2, AnonymousClass000.A00(679));
        C37416Jrb.A09(requireContext());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18240wQ.A12((RecyclerView) view.findViewById(R.id.product_settings_recycle_view), this.A0B);
        CB4 cb4 = this.A01;
        if (cb4 == null) {
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7((Object) this, (Object) cb4, (C146958n9) null, 9), C18200wM.A0M(this), 3);
        C04530Oa r3 = this.A0C;
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(r3)).A01((C82394pY) this.A08.getValue(), C131287ri.class);
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(r3)).A01((C82394pY) this.A09.getValue(), C131297rj.class);
        A0A();
        if (!this.A02) {
            A02(view);
        }
    }

    private final void A01() {
        String str;
        C132097tJ r2 = (C132097tJ) this.A03.getValue();
        C35424Iut A002 = C25584DoK.A00(A07());
        C35421Iuq A012 = C25584DoK.A01(A07());
        D38 d38 = D38.START;
        AnonymousClass6BH r6 = AnonymousClass6BH.ONBOARDING_FLOW;
        String moduleName = getModuleName();
        C04220Ms.A06(moduleName);
        CB4 cb4 = this.A01;
        if (cb4 != null) {
            String A032 = cb4.A03();
            CB4 cb42 = this.A01;
            if (cb42 != null) {
                KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2 = (KtCSuperShape0S4110000_I2) cb42.A02.A08();
                if (ktCSuperShape0S4110000_I2 != null) {
                    str = ktCSuperShape0S4110000_I2.A01;
                } else {
                    str = null;
                }
                r2.A02(A002, A012, d38, r6, moduleName, A032, str);
                return;
            }
        }
        C04220Ms.A0E("productOnboardingViewModel");
        throw null;
    }

    private final void A02(View view) {
        String str;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0X(this.A0C), 36323981531291858L)) {
            C18240wQ.A12((RecyclerView) view.requireViewById(R.id.notification_banner), this.A06);
            C04530Oa r2 = this.A07;
            NotificationsViewModel notificationsViewModel = (NotificationsViewModel) r2.getValue();
            if (!(this instanceof AnonymousClass62L) || (str = C117526yp.A01(this).A01) == null) {
                str = C122037Js.A00();
            }
            notificationsViewModel.A03(C98316Fa.A00(C18180wK.A0p("logging_data", new LoggingData(str)), C18180wK.A0p("parent_view_name", "ig_product_settings_subpage"), C18180wK.A0p("payout_subtypes_to_filter", C18200wM.A0s(C18180wK.A0n(C37416Jrb.A03(A07()).A00)))));
            this.mLifecycleRegistry.A07((NotificationsViewModel) r2.getValue());
            C86104wH.A1F(this, ((NotificationsViewModel) r2.getValue()).A06, 289);
            C86104wH.A1F(this, ((NotificationsViewModel) r2.getValue()).A08, 290);
            ((NotificationsViewModel) r2.getValue()).A04(C880856r.A04((Object) null));
        }
    }

    public UserMonetizationProductType A07() {
        if (this instanceof AnonymousClass62K) {
            return UserMonetizationProductType.USER_PAY;
        }
        return UserMonetizationProductType.CONTENT_APPRECIATION;
    }

    public C101996Tk A08() {
        String str;
        if (this instanceof AnonymousClass62K) {
            str = "com.instagram.user_pay.badges.utils.onboarding.navigation_handler";
        } else if (!(this instanceof AnonymousClass62L)) {
            return AnonymousClass62N.A00;
        } else {
            str = "com.instagram.content_appreciation.navigation_handler";
        }
        return new AnonymousClass62M(str);
    }

    public final UserSession A09() {
        return AnonymousClass0wJ.A0X(this.A0C);
    }

    public void A0B() {
        if (this instanceof AnonymousClass62K) {
            C882457h r4 = (C882457h) ((AnonymousClass62K) this).A00.getValue();
            C37010Jil jil = r4.A02;
            MonetizationRepository monetizationRepository = r4.A03;
            H1T A0P = AnonymousClass0wJ.A0P(monetizationRepository.A09.A00);
            A0P.A0J("creators/user_pay/user_pay_summary/");
            jil.A02(new IDxConsumerShape377S0100000_2_I2(r4, 1), C29316FmG.A00(AnonymousClass0wJ.A0T(A0P, AnonymousClass5u2.class, C1186571t.class)));
            C37416Jrb.A0A(C35383Ito.A06, monetizationRepository, new KtLambdaShape172S0100000_I2_1(r4, 12));
            return;
        }
        ((AnonymousClass58H) ((AnonymousClass62L) this).A02.getValue()).A05();
    }

    public final void A0C() {
        CB4 cb4 = this.A01;
        if (cb4 != null) {
            Activity rootActivity = getRootActivity();
            CB4 cb42 = this.A01;
            if (cb42 != null) {
                String A0k = AnonymousClass0wJ.A0k(rootActivity, cb42.A01());
                C101996Tk A082 = A08();
                KtLambdaShape160S0100000_I2_15 ktLambdaShape160S0100000_I2_15 = new KtLambdaShape160S0100000_I2_15(this, 26);
                C04220Ms.A0B(A082, 1);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1301000_I2((Object) cb4, (Object) ktLambdaShape160S0100000_I2_15, (Object) A082, A0k, (C146958n9) null, 13), AnonymousClass3J5.A00(cb4), 3);
                return;
            }
        }
        C04220Ms.A0E("productOnboardingViewModel");
        throw null;
    }

    public void A0D(boolean z) {
        if (this instanceof AnonymousClass62K) {
            C880856r r1 = ((C882457h) ((AnonymousClass62K) this).A00.getValue()).A01;
            KtCSuperShape0S2050000_I2 ktCSuperShape0S2050000_I2 = (KtCSuperShape0S2050000_I2) r1.A08();
            if (ktCSuperShape0S2050000_I2 != null) {
                ktCSuperShape0S2050000_I2.A04 = z;
            }
            r1.A0G(r1.A08());
            return;
        }
        C86074wE.A01(((AnonymousClass58H) ((AnonymousClass62L) this).A02.getValue()).A0A, z);
    }

    public final boolean A0E() {
        if (this instanceof AnonymousClass62L) {
            AnonymousClass62L r2 = (AnonymousClass62L) this;
            if (!r2.requireArguments().getBoolean("arg_start_onboarding", false)) {
                if (!C63803iN.A0E(AnonymousClass0TJ.A05, ((AnonymousClass58H) r2.A02.getValue()).A04, 36321434616732449L)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.A0C);
    }

    public final boolean onBackPressed() {
        AnonymousClass2RM.A00(this, C18200wM.A0q(this.A05));
        return true;
    }

    public AnonymousClass5xM() {
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape87S0100000_I2_67(new KtLambdaShape87S0100000_I2_67(this, 17), 18));
        C02230Ai A0l = C18210wN.A0l(NotificationsViewModel.class);
        this.A07 = C18220wO.A0M(new KtLambdaShape87S0100000_I2_67(A012, 19), new KtLambdaShape31S0200000_I2_15(18, A012, this), new KtLambdaShape31S0200000_I2_15(17, (Object) null, A012), A0l);
        this.A06 = C62373Zc.A03(C138538Hw.A00);
        this.A03 = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 10));
        this.A08 = AnonymousClass0OY.A02(new KtLambdaShape87S0100000_I2_67(this, 13));
        this.A09 = AnonymousClass0OY.A02(new KtLambdaShape87S0100000_I2_67(this, 14));
    }

    private final void A06(AnonymousClass62M r5) {
        String str;
        String str2;
        LinkedHashMap A0y = C18220wO.A0y();
        CB4 cb4 = this.A01;
        if (cb4 != null) {
            A0y.put("entry_point", cb4.A03());
            CB4 cb42 = this.A01;
            if (cb42 != null) {
                KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2 = (KtCSuperShape0S4110000_I2) cb42.A02.A08();
                if (ktCSuperShape0S4110000_I2 == null || (str = ktCSuperShape0S4110000_I2.A04) == null) {
                    str = "";
                }
                A0y.put("program_type", str);
                if ((this instanceof AnonymousClass62L) && (str2 = C117526yp.A01(this).A01) != null) {
                    A0y.put(C61953Wm.A00(), str2);
                }
                AnonymousClass4A9 A002 = C63263h8.A00(AnonymousClass0wJ.A0X(this.A0C), r5.A00, A0y);
                A002.A00 = new IDxACallbackShape103S0100000_1_I2(this, 8, 42);
                C31155GhB.A03(A002);
                return;
            }
        }
        C04220Ms.A0E("productOnboardingViewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        C1195275r r0;
        int A022 = C14030oh.A02(-92013027);
        super.onCreate(bundle);
        ((CDB) this.A0B.getValue()).A00 = this;
        CB4 cb4 = (CB4) AnonymousClass7IU.A00(new C124357av(AnonymousClass0wJ.A0X(this.A0C)), requireActivity()).A01(CB4.class);
        this.A01 = cb4;
        if (cb4 == null) {
            C04220Ms.A0E("productOnboardingViewModel");
            throw null;
        }
        UserMonetizationProductType A072 = A07();
        String A0q = C18200wM.A0q(this.A05);
        String A0q2 = C18200wM.A0q(this.A04);
        String A0q3 = C18200wM.A0q(this.A0A);
        AnonymousClass0wJ.A1N(A072, A0q);
        cb4.A00 = A072;
        C102116Tw r2 = C1195275r.A02;
        UserSession userSession = cb4.A06;
        synchronized (r2) {
            r0 = new C1195275r(userSession);
        }
        cb4.A01 = r0;
        cb4.A02.A0H(new KtCSuperShape0S4110000_I2(A072, A0q, A0q2, A0q3));
        if (A0E()) {
            A0C();
        }
        C14030oh.A09(663603077, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1808352647);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        C14030oh.A09(-207034075, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-914213433);
        C04530Oa r3 = this.A0C;
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(r3)).A02((C82394pY) this.A08.getValue(), C131287ri.class);
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(r3)).A02((C82394pY) this.A09.getValue(), C131297rj.class);
        super.onDestroy();
        C14030oh.A09(-1538694829, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1532296315);
        super.onResume();
        if (!A0E()) {
            this.A02 = false;
            A0D(false);
        }
        if (!this.A02) {
            A0B();
        }
        C14030oh.A09(-928431541, A022);
    }
}
