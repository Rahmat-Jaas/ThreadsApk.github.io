package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape8S1200000_1_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1du  reason: invalid class name and case insensitive filesystem */
public final class C23471du extends AnonymousClass9NU implements C82034oy, C84094sX {
    public static final String __redex_internal_original_name = "FanClubMemberListCategoryFragment";
    public int A00;
    public FanClubCategoryType A01;
    public AnonymousClass2OH A02;
    public SpinnerImageView A03;
    public String A04;
    public String A05;
    public List A06;
    public IgdsBottomButtonLayout A07;
    public final C04530Oa A08 = C62373Zc.A01(this, 37);
    public final C04530Oa A09;
    public final C04530Oa A0A = C62373Zc.A01(this, 41);
    public final C04530Oa A0B;

    public final /* synthetic */ void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C34342Je.A00(fragmentActivity, userSession, user, str);
        throw null;
    }

    public final void CAd(User user) {
        C04220Ms.A0B(user, 0);
        String BK7 = user.BK7();
        C58963Iu r3 = new C58963Iu(AnonymousClass0wJ.A0U(this.A0A));
        r3.A06(BK7);
        r3.A08(getString(2131837631), new IDxCListenerShape8S1200000_1_I2((Object) user, (Object) this, BK7, 10));
        C62763ag.A00(this, r3);
    }

    public final /* synthetic */ void CAe(User user) {
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        String str = this.A05;
        if (str == null) {
            C04220Ms.A0E("categoryName");
            throw null;
        } else {
            AnonymousClass4u2.A08(r2, str);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        if (C63803iN.A0E(C18250wR.A0D(A0U, 0), A0U, 36317723764002759L)) {
            this.A07 = C18230wP.A0W(view, R.id.create_group_chat_button);
            A00(this);
        }
        C04530Oa r3 = this.A0B;
        C18190wL.A1C(getViewLifecycleOwner(), ((C25961pj) r3.getValue()).A00, this, 24);
        AnonymousClass3J3.A01(this, new KtSLambdaShape10S0200000_I2_5(this, (C146958n9) null, 17), ((C25961pj) r3.getValue()).A05);
    }

    public static final void A00(C23471du r3) {
        boolean isEmpty = r3.A06.isEmpty();
        IgdsBottomButtonLayout igdsBottomButtonLayout = r3.A07;
        if (!isEmpty) {
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setVisibility(0);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = r3.A07;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryAction(AnonymousClass0wJ.A0B(r3).getString(2131824621), C18190wL.A0H(r3, HttpStatus.SC_UNPROCESSABLE_ENTITY));
            }
        } else if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setVisibility(8);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = r3.A07;
        if (igdsBottomButtonLayout3 != null) {
            C31014GdU.A00(r3.requireContext(), igdsBottomButtonLayout3, r3.A00);
        }
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass1l1(this, this, this, AnonymousClass0wJ.A0X(this.A0A)), new AnonymousClass1kI());
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139848Pn.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public C23471du() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 42);
        KtLambdaShape69S0100000_I2_49 A0f2 = C18250wR.A0f(this, 38);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A012 = AnonymousClass0OY.A01(num, C18250wR.A0f(A0f2, 39));
        this.A0B = C18220wO.A0M(C18250wR.A0f(A012, 40), A0f, C18250wR.A0d(A012, (Object) null, 45), C18210wN.A0l(C25961pj.class));
        this.A09 = AnonymousClass0OY.A01(num, new AnonymousClass4YB(this));
        this.A04 = "";
        this.A06 = AnonymousClass0wJ.A0v();
        this.A02 = C25951pi.A00;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(535619461);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("fan_club_category_type");
        if (parcelable != null) {
            this.A01 = (FanClubCategoryType) parcelable;
            String string = requireArguments().getString("fan_club_category_name");
            if (string != null) {
                this.A05 = string;
                C14030oh.A09(692076064, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1169797554;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 672478617;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final void onResume() {
        String str;
        int A022 = C14030oh.A02(-1295608868);
        super.onResume();
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
            C62793ak A0N = C18200wM.A0N(this.A0B);
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                str = "categoryType";
            } else {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0211000_I2(A0N, fanClubCategoryType, (C146958n9) null, 11, true), AnonymousClass3J5.A00(A0N), 3);
                C14030oh.A09(1417339688, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
