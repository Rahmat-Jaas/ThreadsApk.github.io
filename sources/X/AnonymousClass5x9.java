package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.payout.api.PayoutApi;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape92S0100000_I2_72;

/* renamed from: X.5x9  reason: invalid class name */
public final class AnonymousClass5x9 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PayoutInformationFragment";
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public View A03;
    public I6I A04;
    public String A05;
    public String A06;
    public final C04530Oa A07 = C62373Zc.A03(C138558Hy.A00);
    public final C04530Oa A08;
    public final C04530Oa A09;
    public final C04530Oa A0A = C18220wO.A0M(new KtLambdaShape92S0100000_I2_72(this, 22), new KtLambdaShape92S0100000_I2_72(this, 20), new KtLambdaShape32S0200000_I2_16(8, (Object) null, this), C18210wN.A0l(AnonymousClass57V.class));
    public final C04530Oa A0B = C62373Zc.A03(new KtLambdaShape92S0100000_I2_72(this, 21));
    public final C04530Oa A0C = C62373Zc.A03(new KtLambdaShape92S0100000_I2_72(this, 26));

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        String str = this.A05;
        if (str == null) {
            str = AnonymousClass0wJ.A0k(requireContext(), 2131832358);
        }
        r3.setTitle(str);
        r3.CtT(true);
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(107);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AnonymousClass7Kz.A0U()) {
            C18240wQ.A12((RecyclerView) view.requireViewById(R.id.notifications_view), this.A08);
            C04530Oa r3 = this.A09;
            NotificationsViewModel notificationsViewModel = (NotificationsViewModel) r3.getValue();
            I6I i6i = this.A04;
            if (i6i == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            String str = i6i.A04;
            if (str == null) {
                str = "";
            }
            notificationsViewModel.A03(C98316Fa.A00(C18180wK.A0p("logging_data", new LoggingData(str)), C18180wK.A0p("parent_view_name", "settings")));
            this.mLifecycleRegistry.A07((NotificationsViewModel) r3.getValue());
            C86104wH.A1F(this, ((NotificationsViewModel) r3.getValue()).A06, 292);
            C86104wH.A1F(this, ((NotificationsViewModel) r3.getValue()).A08, 293);
        }
        I6I i6i2 = this.A04;
        if (i6i2 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        i6i2.A08.A0C(this, C86164wN.A0O(this, view, 38));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0101000_I2_10(this, (C146958n9) null, 5), C18200wM.A0M(this), 3);
    }

    public static final UserSession A01(AnonymousClass5x9 r0) {
        return AnonymousClass0wJ.A0X(r0.A0C);
    }

    public static final void A04(View view, String str, int i) {
        if (str == null || str.length() == 0) {
            view.findViewById(i).setVisibility(8);
            view.findViewById(R.id.edit_bottom).setVisibility(8);
            return;
        }
        C18180wK.A0G(view, i).setText(str);
    }

    public static final boolean A06(AnonymousClass5x9 r3) {
        UserSession A0X = AnonymousClass0wJ.A0X(r3.A0C);
        AnonymousClass0TJ r32 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r32, A0X, 36310890471489829L)) {
            Object obj = AnonymousClass7Kz.A06().A04.get();
            C04220Ms.A06(obj);
            if (C63803iN.A0E(r32, ((AnonymousClass750) obj).A00, 36320803255490814L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.A0C);
    }

    public AnonymousClass5x9() {
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape92S0100000_I2_72(new KtLambdaShape92S0100000_I2_72(this, 23), 24));
        C02230Ai A0l = C18210wN.A0l(NotificationsViewModel.class);
        this.A09 = C18220wO.A0M(new KtLambdaShape92S0100000_I2_72(A012, 25), new KtLambdaShape32S0200000_I2_16(10, A012, this), new KtLambdaShape32S0200000_I2_16(9, (Object) null, A012), A0l);
        this.A08 = C62373Zc.A03(C138568Hz.A00);
    }

    public static C25786Drz A00(M5J m5j, AnonymousClass5x9 r1, Object obj) {
        m5j.A0H(obj);
        C25786Drz drz = new C25786Drz(r1.getActivity(), A01(r1));
        DDJ.A00();
        return drz;
    }

    public static final String A02(C148548rG r4, AnonymousClass5x9 r5) {
        if (C37416Jrb.A0B(r4)) {
            return C18180wK.A0g(r5, 2131832317);
        }
        String ASy = r4.ASy();
        if (ASy != null) {
            String ASs = r4.ASs();
            if (ASs != null) {
                return C37416Jrb.A04(r5.requireContext(), ASy, ASs, 10);
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final void A03(View view) {
        AnonymousClass7FY.A02(view.findViewById(R.id.edit), AnonymousClass006.A01);
    }

    public static final void A05(View view, String str, String str2, int i, boolean z) {
        View findViewById = view.findViewById(R.id.title_caret);
        float f = 180.0f;
        if (z) {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        findViewById.setRotation(f);
        View findViewById2 = view.findViewById(i);
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        View findViewById3 = view.findViewById(R.id.title);
        if (!z) {
            str = str2;
        }
        findViewById3.setContentDescription(str);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int A022 = C14030oh.A02(340086596);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C04530Oa r0 = this.A0C;
        this.A04 = (I6I) AnonymousClass7IU.A00(new C124497bH(C102146Tz.A00(new PayoutApi(AnonymousClass0wJ.A0X(r0)), AnonymousClass0wJ.A0X(r0)), AnonymousClass0wJ.A0X(r0)), requireActivity).A01(I6I.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("MONETIZATION_PRODUCT_TYPE");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("FINANCIAL_ENTITY_ID");
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("PAYOUT_HUB_ORIGIN");
        } else {
            str3 = null;
        }
        I6I i6i = this.A04;
        if (i6i == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        i6i.A03 = str2;
        if (str != null) {
            UserMonetizationProductType A002 = AnonymousClass2FJ.A00(str);
            i6i.A00 = A002;
            i6i.A02 = C37416Jrb.A03(A002);
        }
        if (str3 != null) {
            I6I i6i2 = this.A04;
            if (i6i2 == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            i6i2.A01 = AnonymousClass2SD.A00(str3);
        }
        I6I i6i3 = this.A04;
        if (i6i3 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str4 = bundle5.getString("UPL_SESSION_ID");
        } else {
            str4 = null;
        }
        i6i3.A04 = str4;
        KK5 kk5 = (KK5) this.A0B.getValue();
        I6I i6i4 = this.A04;
        if (i6i4 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        KK5.A04(kk5, i6i4.A01, i6i4.A02, AnonymousClass006.A00, (Integer) null, (String) null, i6i4.A04, 56);
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            z = bundle6.getBoolean("SHOULD_REFETCH_PAYOUT_INFORMATION");
        } else {
            z = false;
        }
        if (z) {
            I6I i6i5 = this.A04;
            if (i6i5 != null) {
                i6i5.A0F(false);
            }
            C04220Ms.A0E("viewModel");
            throw null;
        }
        AnonymousClass57V r4 = (AnonymousClass57V) this.A0A.getValue();
        I6I i6i6 = this.A04;
        if (i6i6 != null) {
            Object A082 = r4.A03.A08();
            if (A082 != null) {
                i6i6.A09((C148568rI) ((KtCSuperShape0S0210000_I2) ((List) A082).get(r4.A00)).A00, true);
                I6I i6i7 = this.A04;
                if (i6i7 != null) {
                    i6i7.A07();
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C04220Ms.A0E("viewModel");
        throw null;
        C14030oh.A09(375569431, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1215344640);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_payout_info, viewGroup, false);
        C14030oh.A09(362448290, A022);
        return inflate;
    }
}
