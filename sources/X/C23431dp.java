package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.fanclub.api.FanClubInsightsResponseImpl;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.1dp  reason: invalid class name and case insensitive filesystem */
public final class C23431dp extends AnonymousClass9NU implements C82034oy {
    public static final String __redex_internal_original_name = "UserPayFanclubEarningsFragment";
    public SpinnerImageView A00;
    public final C04530Oa A01 = C62373Zc.A01(this, 11);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A07(r3, 2131837607);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A05 = R.drawable.instagram_info_pano_outline_24;
        A0K.A04 = 2131827099;
        AnonymousClass4u2.A01(C18190wL.A0H(this, HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE), A0K, r3);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass0wJ.A0J(view2, R.id.loading_spinner);
        this.A00 = spinnerImageView;
        if (spinnerImageView == null) {
            C04220Ms.A0E("spinner");
            throw null;
        }
        spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
        C04530Oa r0 = this.A01;
        UserSession A0X = AnonymousClass0wJ.A0X(r0);
        C04220Ms.A0B(A0X, 1);
        C84624tY A0I = C18250wR.A0R(AnonymousClass0wJ.A0X(r0)).A0I();
        if (A0I == null || (str = A0I.AhE()) == null) {
            str = "";
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(C18200wM.A0c());
        C04220Ms.A06(format);
        IDxFCallbackShape313S0100000_1_I2 iDxFCallbackShape313S0100000_1_I2 = new IDxFCallbackShape313S0100000_1_I2(this, 7);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        A002.A05("fan_club_id", str);
        A002.A05(DatePickerDialogModule.ARG_DATE, format);
        A002.A04("count", 50);
        AnonymousClass7Ko.A0B(true);
        AnonymousClass7Ko.A0B(true);
        AnonymousClass3WK.A01(A0X).AMA(new PandoGraphQLRequest(C63233h2.A04(true), "FanClubInsights", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), FanClubInsightsResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "node"), iDxFCallbackShape313S0100000_1_I2);
    }

    public final Collection getDefinitions() {
        UserSession A0X = AnonymousClass0wJ.A0X(this.A01);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return C06750aI.A17(new C24871kl(activity, A0X), new C40200LXz());
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139838Pm.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }
}
