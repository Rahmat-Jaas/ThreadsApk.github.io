package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape17S0201000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;

/* renamed from: X.1bE  reason: invalid class name */
public final class AnonymousClass1bE extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "BroadcastChannelWaitlistVideoIntroFragment";
    public C23836Cz8 A00;
    public RoundedCornerMediaFrameLayout A01;
    public final C04530Oa A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;

    public final String getModuleName() {
        return "direct_broadcast_channel_waitlist_video_intro";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) AnonymousClass0wJ.A0J(view, R.id.media_container);
        this.A01 = roundedCornerMediaFrameLayout;
        if (roundedCornerMediaFrameLayout == null) {
            C04220Ms.A0E("videoView");
            throw null;
        }
        roundedCornerMediaFrameLayout.A00 = -1.0f;
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.cta_button);
        Integer A002 = AnonymousClass3M9.A00(requireArguments());
        int i = 2131825724;
        if (A002.intValue() != 0) {
            i = 2131822657;
        }
        A0L.setText(i);
        AnonymousClass0wJ.A18(A0L, 73, this, A002);
        C19390zn r4 = (C19390zn) this.A04.getValue();
        H1T A0P = AnonymousClass0wJ.A0P(r4.A00);
        A0P.A0J("direct_v2/fetch_creator_broadcast_channel_waitlist_intro_video/");
        AnonymousClass3J5.A01(r4, new KtSLambdaShape17S0201000_I2_3((C146958n9) null, (AnonymousClass0YP) new KtSLambdaShape9S0200000_I2_4(r4, (C146958n9) null, 44), 49), C04220Ms.A0B(AnonymousClass0wJ.A0T(A0P, AnonymousClass1S9.class, AnonymousClass3MC.class), 0), 34);
        AnonymousClass061 r42 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r42, (Object) this, (C146958n9) null, 24), AnonymousClass067.A00(viewLifecycleOwner), 3);
        C18240wQ.A0P(this.A02).A08(AnonymousClass3M9.A00(requireArguments()));
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final boolean onBackPressed() {
        AnonymousClass49Y A0P = C18240wQ.A0P(this.A02);
        USLEBaseShape0S0000000 A002 = AnonymousClass49Y.A00(A0P);
        if (!AnonymousClass0wJ.A1U(A002)) {
            return false;
        }
        AnonymousClass49Y.A03(A002, A0P);
        AnonymousClass2A4.A00(AnonymousClass2AE.A09, A002);
        C18230wP.A1D(C40328Lci.A02, A002);
        AnonymousClass2AG.A01(AnonymousClass2AA.A0I, A002);
        return false;
    }

    public AnonymousClass1bE() {
        KtLambdaShape63S0100000_I2_43 A0e = C18250wR.A0e(this, 36);
        KtLambdaShape63S0100000_I2_43 A0e2 = C18250wR.A0e(this, 33);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A0x = C18200wM.A0x(num, A0e2, 34);
        this.A04 = C18220wO.A0M(C18250wR.A0e(A0x, 35), A0e, C18250wR.A0d(A0x, (Object) null, 11), C18210wN.A0l(C19390zn.class));
        this.A02 = C18200wM.A0x(num, this, 32);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-102159938);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_broadcast_channel_waitlist_video_intro, false);
        C14030oh.A09(312358907, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1784310357);
        super.onDestroy();
        C23836Cz8 cz8 = this.A00;
        if (cz8 != null) {
            C38363KXt kXt = cz8.A00;
            if (kXt != null) {
                kXt.A06("onDestroy");
            }
            cz8.A00 = null;
        }
        C14030oh.A09(-1090722052, A022);
    }

    public final void onStop() {
        C38363KXt kXt;
        int A022 = C14030oh.A02(1711632670);
        super.onStop();
        C23836Cz8 cz8 = this.A00;
        if (!(cz8 == null || (kXt = cz8.A00) == null)) {
            kXt.A08("onStop", true);
        }
        C14030oh.A09(-151140821, A022);
    }
}
