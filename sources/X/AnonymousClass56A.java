package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxFunctionShape0S2100000_2_I2;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.view.MSCPivotBar;
import com.instagram.barcelona.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;

/* renamed from: X.56A  reason: invalid class name */
public final class AnonymousClass56A extends Fragment implements C143618h2, C143558gw {
    public View A00;
    public FrameLayout A01;
    public AnonymousClass5A5 A02;
    public MSCPivotBar A03;
    public List A04;
    public final C880756q A05 = C880756q.A01();
    public final C143158gC A06 = C86114wI.A0Q(this, HttpStatus.SC_SWITCHING_PROTOCOLS);
    public final C143158gC A07 = C86114wI.A0Q(this, 106);
    public final HashMap A08 = AnonymousClass0wJ.A0y();
    public final C04530Oa A09;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        View A0I = AnonymousClass0wJ.A0I(view, R.id.content_container);
        AnonymousClass7Kz.A0Q();
        C86114wI.A0z(requireContext(), A0I, R.color.direct_widget_primary_background);
        this.A01 = (FrameLayout) AnonymousClass0wJ.A0I(view, R.id.tab_fragment);
        this.A00 = AnonymousClass0wJ.A0I(view, R.id.progress_bar_container);
        this.A03 = (MSCPivotBar) AnonymousClass0wJ.A0I(view, R.id.pivot_bar);
        C04530Oa r3 = this.A09;
        AnonymousClass5A5 r1 = new AnonymousClass5A5(new IDxRImplShape189S0000000_2_I2(r3.getValue(), 6), new C114976uE[0]);
        this.A02 = r1;
        MSCPivotBar mSCPivotBar = this.A03;
        if (mSCPivotBar == null) {
            C04220Ms.A0E("pivotBar");
            throw null;
        }
        mSCPivotBar.setAdapter(r1);
        Drawable indeterminateDrawable = ((ProgressBar) view.findViewById(R.id.progress_bar)).getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            AnonymousClass7Kz.A0Q();
            indeterminateDrawable.setColorFilter(Le4.A00(AnonymousClass006.A05, requireContext().getColor(R.color.default_cta_dominate_color)));
        }
        C86114wI.A1A(getViewLifecycleOwner(), ((AnonymousClass585) r3.getValue()).A06, this, HttpStatus.SC_PROCESSING);
        ((AnonymousClass585) r3.getValue()).A08.A0C(getViewLifecycleOwner(), this.A06);
        C86114wI.A1A(getViewLifecycleOwner(), ((AnonymousClass585) r3.getValue()).A0C, C86114wI.A0Q(this, 103), 275);
        C86114wI.A1A(this, ((AnonymousClass585) r3.getValue()).A0B, C86114wI.A0Q(this, 104), 275);
        C86104wH.A1F(this, ((AnonymousClass585) r3.getValue()).A07, 105);
        this.A05.A0K(((AnonymousClass585) r3.getValue()).A0A, this.A07);
    }

    public final /* bridge */ /* synthetic */ M5J BH5() {
        return this.A05;
    }

    public AnonymousClass56A() {
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape25S0100000_I2_5(new KtLambdaShape25S0100000_I2_5(this, 36), 37));
        C02230Ai A0l = C18210wN.A0l(AnonymousClass585.class);
        this.A09 = C18220wO.A0M(new KtLambdaShape25S0100000_I2_5(A012, 38), C86154wM.A11(A012, this, 27), C86154wM.A11((Object) null, A012, 26), A0l);
    }

    public final boolean onBackPressed() {
        C143618h2 r1;
        Fragment A0L = getChildFragmentManager().A0L(R.id.tab_fragment);
        if ((A0L instanceof C143618h2) && (r1 = (C143618h2) A0L) != null) {
            r1.onBackPressed();
        }
        this.A09.getValue();
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A00(667756867, 0, 615);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        LoggingData loggingData;
        int A022 = C14030oh.A02(-1067589751);
        super.onCreate(bundle);
        AnonymousClass585 r7 = (AnonymousClass585) this.A09.getValue();
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("page_id");
        }
        r7.A02 = str;
        if (bundle2 == null || (loggingData = (LoggingData) bundle2.getParcelable("logging_data")) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        r7.A00 = loggingData;
        LinkedHashMap A0y = C18220wO.A0y();
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01("fetch_init", A0y, 667756867, 0, 2);
        C143688h9 A082 = AnonymousClass7Kz.A08();
        LoggingData loggingData2 = r7.A00;
        if (loggingData2 != null) {
            HashMap A002 = AnonymousClass6IH.A00(loggingData2);
            A002.put("view_name", "overview");
            A002.put("endpoint", "BSC_PAYOUT_HUB_FETCH_FINANCIAL_ENTITIES");
            A082.Bb8("client_fetch_payouthub_init", A002);
            Object value = r7.A0F.getValue();
            String str2 = r7.A02;
            LoggingData loggingData3 = r7.A00;
            if (loggingData3 != null) {
                String str3 = loggingData3.A00;
                M5J A003 = AnonymousClass5k7.A00(new IDxFunctionShape0S2100000_2_I2(value, str2, str3, 2), AnonymousClass7Kz.A0C());
                C04220Ms.A06(A003);
                C121277Fh.A01((AnonymousClass066) null, A003, r7.A0D);
                C14030oh.A09(1869837826, A022);
                return;
            }
        }
        C04220Ms.A0E("loggingData");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1683350388);
        C04220Ms.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0Q();
        View inflate = C86154wM.A0E(activity, layoutInflater, R.style.BSCIGTheme).inflate(R.layout.fragment_payout_activity, viewGroup, false);
        C14030oh.A09(388329241, A022);
        return inflate;
    }
}
