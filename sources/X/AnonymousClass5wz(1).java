package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.5wz  reason: invalid class name */
public final class AnonymousClass5wz extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "NewReleaseNotificationFragment";
    public final C04530Oa A00 = AnonymousClass3W9.A00(this);
    public final C04530Oa A01;

    public final String getModuleName() {
        return "new_release_notification_screen";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C04530Oa r6 = this.A01;
        ((C882657j) r6.getValue()).A00();
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.new_release_notification_recycler_view);
        C107746hF r2 = new C107746hF(recyclerView, this);
        C18489AgL A002 = C150388wA.A00(requireContext());
        A002.A01(new AnonymousClass60Q(r2));
        C150388wA A003 = A002.A00();
        getContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(A003);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2((Object) A003, (C146958n9) null, 40, 42), ((C882657j) r6.getValue()).A09);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.new_release_notification_refresh_spinner);
        C86104wH.A1C(A0K, 87, this);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2((Object) A0K, (C146958n9) null, 41, 42), ((C882657j) r6.getValue()).A08);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 42), ((C882657j) r6.getValue()).A05);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131834074);
            C25764Drc drc = new C25764Drc();
            drc.A00 = R.drawable.instagram_arrow_left_pano_outline_24;
            drc.A0C = C86134wK.A0P(this, 86);
            AnonymousClass4u2.A03(drc, r3);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass5wz() {
        KtLambdaShape29S0100000_I2_9 ktLambdaShape29S0100000_I2_9 = new KtLambdaShape29S0100000_I2_9(this, 23);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape29S0100000_I2_9(new KtLambdaShape29S0100000_I2_9(this, 20), 21));
        this.A01 = C18220wO.A0M(new KtLambdaShape29S0100000_I2_9(A012, 22), ktLambdaShape29S0100000_I2_9, new KtLambdaShape18S0200000_I2_2(12, (Object) null, A012), C18210wN.A0l(C882657j.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(569593240);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.new_release_notification_fragment, viewGroup, false);
        C14030oh.A09(-590499186, A02);
        return inflate;
    }
}
