package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteButtonActionType;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape43S0100000_I2_23;

/* renamed from: X.1bq  reason: invalid class name and case insensitive filesystem */
public final class C23051bq extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "PromotePromotionInformationFragment";
    public AnonymousClass4u2 A00;
    public C37062Jjm A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public String A05;
    public final C04530Oa A06;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        this.A00 = r3;
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, HttpStatus.SC_ACCEPTED);
    }

    public final String getModuleName() {
        return "promote_promotion_information_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0K(view, R.id.display_title);
        IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0K(view, R.id.display_body);
        BusinessNavBar businessNavBar = (BusinessNavBar) AnonymousClass0wJ.A0K(view, R.id.bottom_bar);
        businessNavBar.A01.setVisibility(8);
        businessNavBar.A03.setVisibility(8);
        businessNavBar.A00();
        ((C19490zx) this.A06.getValue()).A00.A0C(getViewLifecycleOwner(), new C65893wc(this, businessNavBar, igTextView, igTextView2, (RoundedCornerImageView) AnonymousClass0wJ.A0K(view, R.id.thumbnail_image), (SpinnerImageView) AnonymousClass0wJ.A0K(view, R.id.loading_spinner)));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final boolean onBackPressed() {
        C37062Jjm jjm = this.A01;
        if (jjm == null) {
            C04220Ms.A0E("adsManagerLogger");
            throw null;
        }
        jjm.A01(C35394Iu2.A12.toString());
        return false;
    }

    public C23051bq() {
        KtLambdaShape43S0100000_I2_23 ktLambdaShape43S0100000_I2_23 = new KtLambdaShape43S0100000_I2_23(this, 25);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape43S0100000_I2_23(new KtLambdaShape43S0100000_I2_23(this, 22), 23));
        this.A06 = C18220wO.A0M(new KtLambdaShape43S0100000_I2_23(A012, 24), ktLambdaShape43S0100000_I2_23, new KtLambdaShape21S0200000_I2_5(25, A012, (Object) null), C18210wN.A0l(C19490zx.class));
    }

    public static final void A00(C23051bq r3, PromoteButtonActionType promoteButtonActionType, String str) {
        int ordinal = promoteButtonActionType.ordinal();
        if (ordinal == 0) {
            FragmentActivity requireActivity = r3.requireActivity();
            UserSession userSession = r3.A02;
            if (userSession != null) {
                C37350Jpy A0Y = C18230wP.A0Y(requireActivity, userSession, C171209wF.A20, str);
                A0Y.A07("promote_promotion_information_fragment");
                A0Y.A04();
                return;
            }
        } else if (ordinal == 1) {
            AnonymousClass3RZ.A00();
            r3.getContext();
            AnonymousClass3RZ.A00();
            if (r3.A02 != null) {
                return;
            }
        } else {
            return;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (AnonymousClass006.A00(1)[i].intValue() == 0) {
            C18190wL.A19(this);
            UserSession userSession = this.A02;
            if (userSession == null) {
                C18210wN.A0m();
                throw null;
            } else {
                C37397Jr6.A06(userSession);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String string;
        String string2;
        String str;
        int A022 = C14030oh.A02(-1758730481);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("media_id")) == null) {
            illegalArgumentException = C18190wL.A0a("PromotePromotionInformationViewModel requires a non-null MEDIA_ID");
            i = -2078845827;
        } else {
            this.A05 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string2 = bundle3.getString("access_token")) == null) {
                illegalArgumentException = C18190wL.A0a("PromotePromotionInformationViewModel requires a non-null ACCESS_TOKEN");
                i = -904396863;
            } else {
                this.A03 = string2;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (str = bundle4.getString("ad_account_id")) == null) {
                    str = "";
                }
                this.A04 = str;
                UserSession userSession = this.A02;
                if (userSession == null) {
                    C18210wN.A0m();
                    throw null;
                }
                this.A01 = C34462Jq.A00(userSession);
                C14030oh.A09(305352961, A022);
                return;
            }
        }
        C14030oh.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(7888720);
        C04220Ms.A0B(layoutInflater, 0);
        C37062Jjm jjm = this.A01;
        if (jjm == null) {
            str = "adsManagerLogger";
        } else {
            String obj = C35394Iu2.A12.toString();
            String str2 = this.A05;
            if (str2 == null) {
                str = "mediaId";
            } else {
                jjm.A03(obj, str2);
                View inflate = layoutInflater.inflate(R.layout.promote_promotion_information_fragment, viewGroup, false);
                C14030oh.A09(153266945, A022);
                return inflate;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
