package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50;

/* renamed from: X.1ds  reason: invalid class name and case insensitive filesystem */
public final class C23451ds extends AnonymousClass9NU implements C82034oy, C84094sX {
    public static final String __redex_internal_original_name = "FanClubRemovedMemberListFragment";
    public SpinnerImageView A00;
    public final C04530Oa A01 = C62373Zc.A03(C18250wR.A0g(this, 2));
    public final C04530Oa A02;

    public final /* synthetic */ void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C34342Je.A00(fragmentActivity, userSession, user, str);
        throw null;
    }

    public final void CAd(User user) {
        Context A0A = C18240wQ.A0A(this, user, 0);
        C58963Iu r3 = new C58963Iu(AnonymousClass0wJ.A0U(this.A01));
        r3.A06(user.BK7());
        r3.A03(new IDxCListenerShape41S0300000_1_I2(38, (Object) A0A, (Object) user, (Object) this), 2131837605);
        C62763ag.A00(this, r3);
    }

    public final /* synthetic */ void CAe(User user) {
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837634);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        C18200wM.A1D(view, R.id.search_box);
        C18190wL.A1E(getRecyclerView(), this, 3);
        C62793ak A0N = C18200wM.A0N(this.A02);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 33), AnonymousClass3J5.A00(A0N), 3);
        AnonymousClass061 r6 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r6, (Object) this, (C146958n9) null, 49), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final Collection getDefinitions() {
        return C18180wK.A0n(new AnonymousClass1l1(this, this, this, AnonymousClass0wJ.A0X(this.A01)));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139878Pq.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public C23451ds() {
        KtLambdaShape70S0100000_I2_50 A0g = C18250wR.A0g(this, 3);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0g(C18250wR.A0f(this, 49), 0));
        this.A02 = C18220wO.A0M(C18250wR.A0g(A012, 1), A0g, C18250wR.A0d(A012, (Object) null, 47), C18210wN.A0l(AnonymousClass10B.class));
    }
}
