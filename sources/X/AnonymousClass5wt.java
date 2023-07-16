package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape170S0100000_I2_3;

/* renamed from: X.5wt  reason: invalid class name */
public final class AnonymousClass5wt extends C34640IcN {
    public static final String __redex_internal_original_name = "EmpathyNudgeFragment";
    public C110516lo A00;
    public final C145068jm A01;
    public final C04530Oa A02 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "media_owner_empathy_nudge_v1";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C110516lo r1 = this.A00;
        if (r1 != null) {
            BKU bku = r1.A01;
            boolean z = r1.A03;
            C13330nS r2 = r1.A00;
            Map A0I = AnonymousClass4WJ.A0I(C18180wK.A0p("is_launched_from_bottomsheet", String.valueOf(z)));
            USLEBaseShape0S0000000 A0L = USLEBaseShape0S0000000.A0L(r2);
            A0L.A0T("source_of_action", "heated_thread_empathy");
            A0L.A1h(A0I);
            A0L.A0T("media_id", bku.A0f.A4Y);
            C18190wL.A1I(A0L, "impression");
            A0L.Bb4();
        }
    }

    public static final void A00(AnonymousClass5wt r3) {
        C105826e3 r0;
        C25745DrH A012 = C25745DrH.A00.A01(r3.getActivity());
        C110516lo r02 = r3.A00;
        if (r02 != null && r02.A03) {
            C37383Jqm A022 = C37383Jqm.A02(A012);
            if (A022 != null) {
                A022.A0K();
            }
        } else if (A012 != null) {
            A012.A0C();
        }
        C110516lo r03 = r3.A00;
        if (r03 != null && (r0 = r03.A02.A00) != null) {
            r0.A00.A0N();
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public AnonymousClass5wt() {
        float f = (float) 32;
        this.A01 = new AnonymousClass7V9(f, (float) 0, f, (float) 16);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1032262258);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape170S0100000_I2_3(this, 9), -2064724807);
        C14030oh.A09(-1575260093, A022);
        return A0L;
    }
}
