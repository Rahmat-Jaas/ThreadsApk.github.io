package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;

/* renamed from: X.1b3  reason: invalid class name */
public final class AnonymousClass1b3 extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "BroadcastChannelWaitlistJoinFragment";
    public IgButton A00;
    public IgEditText A01;
    public IgTextView A02;
    public final View.OnClickListener A03 = C18190wL.A0H(this, 362);
    public final C04530Oa A04;
    public final C04530Oa A05 = C80644m9.A00(this);
    public final C04530Oa A06;
    public final C82034oy A07 = C679641p.A00;

    public final String getModuleName() {
        return "direct_broadcast_channel_waitlist_join";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass2AA r0;
        String str;
        C04220Ms.A0B(view, 0);
        new E2V(C18190wL.A0H(this, 363), C18220wO.A0J(view, R.id.action_bar)).A0S(this.A07);
        C18180wK.A15(this);
        View requireViewById = view.requireViewById(R.id.radioButton1);
        View.OnClickListener onClickListener = this.A03;
        requireViewById.setOnClickListener(onClickListener);
        view.requireViewById(R.id.radioButton2).setOnClickListener(onClickListener);
        view.requireViewById(R.id.radioButton3).setOnClickListener(onClickListener);
        view.requireViewById(R.id.radioButton4).setOnClickListener(onClickListener);
        view.requireViewById(R.id.radioButton5).setOnClickListener(onClickListener);
        view.requireViewById(R.id.radioButton6).setOnClickListener(onClickListener);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.custom_input_header);
        this.A01 = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.custom_input);
        IgButton igButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.cta_button);
        this.A00 = igButton;
        if (igButton == null) {
            str = "submitButton";
        } else {
            AnonymousClass0wJ.A16(igButton, 364, this);
            IgEditText igEditText = this.A01;
            if (igEditText == null) {
                str = "customInputText";
            } else {
                C18230wP.A17(igEditText, this, 6);
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null) {
                    AnonymousClass49Y A0P = C18240wQ.A0P(this.A04);
                    Integer A002 = AnonymousClass2MR.A00(bundle2);
                    C04220Ms.A0B(A002, 0);
                    USLEBaseShape0S0000000 A003 = AnonymousClass49Y.A00(A0P);
                    if (AnonymousClass0wJ.A1U(A003)) {
                        AnonymousClass49Y.A03(A003, A0P);
                        AnonymousClass2A4.A00(AnonymousClass2AE.A0g, A003);
                        C18230wP.A1D(C40328Lci.A0J, A003);
                        if (A002.intValue() != 0) {
                            r0 = AnonymousClass2AA.A0I;
                        } else {
                            r0 = AnonymousClass2AA.A07;
                        }
                        AnonymousClass2AG.A01(r0, A003);
                    }
                }
                AnonymousClass3J3.A01(this, new KtSLambdaShape9S0200000_I2_4(this, (C146958n9) null, 43), ((C19500zy) this.A06.getValue()).A03);
                super.onViewCreated(view, bundle);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean onBackPressed() {
        AnonymousClass49Y A0P = C18240wQ.A0P(this.A04);
        USLEBaseShape0S0000000 A002 = AnonymousClass49Y.A00(A0P);
        if (!AnonymousClass0wJ.A1U(A002)) {
            return false;
        }
        AnonymousClass49Y.A03(A002, A0P);
        AnonymousClass2A4.A00(AnonymousClass2AE.A0A, A002);
        C18230wP.A1D(C40328Lci.A02, A002);
        AnonymousClass2AG.A01(AnonymousClass2AA.A0J, A002);
        return false;
    }

    public AnonymousClass1b3() {
        KtLambdaShape63S0100000_I2_43 A0e = C18250wR.A0e(this, 30);
        KtLambdaShape63S0100000_I2_43 A0e2 = C18250wR.A0e(this, 27);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A0x = C18200wM.A0x(num, A0e2, 28);
        this.A06 = C18220wO.A0M(C18250wR.A0e(A0x, 29), A0e, C18250wR.A0d(A0x, (Object) null, 10), C18210wN.A0l(C19500zy.class));
        this.A04 = C18200wM.A0x(num, this, 26);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-811898526);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_broadcast_channel_waitlist_join, false);
        C14030oh.A09(1464034902, A022);
        return A0D;
    }
}
