package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

/* renamed from: X.5xa  reason: invalid class name */
public final class AnonymousClass5xa extends AnonymousClass9NU {
    public static final String __redex_internal_original_name = "AppreciationGiftingBottomSheetFragment";
    public Space A00;
    public AnonymousClass9RY A01;
    public IgdsBottomButtonLayout A02;
    public C37383Jqm A03;
    public SpinnerImageView A04;
    public final List A05;
    public final C04530Oa A06 = AnonymousClass3W9.A00(this);
    public final C04530Oa A07;
    public final C105366dJ A08;

    public final String getModuleName() {
        return "appreciation_gifting_bottom_sheet";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        getParentFragmentManager().A0u(new IDxLCallbacksShape42S0100000_2_I2(this, 1), true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading);
        this.A02 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.send_button);
        C37383Jqm jqm = this.A03;
        if (jqm != null) {
            jqm.A0F(AnonymousClass0wJ.A0B(this).getString(2131821414));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout == null) {
            str = "sendButton";
        } else {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
            Space space = (Space) AnonymousClass0wJ.A0J(view, R.id.space_terms);
            this.A00 = space;
            if (space == null) {
                str = "termsPlaceHolder";
            } else {
                space.getLayoutParams().height = (int) (C09860go.A02(requireContext(), 12.0f) * 1.12f * 2.0f);
                AnonymousClass061 r2 = AnonymousClass061.STARTED;
                AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0301000_I2_1(r2, viewLifecycleOwner, this, (C146958n9) null, 3), AnonymousClass067.A00(viewLifecycleOwner), 3);
                C883457r r3 = (C883457r) this.A07.getValue();
                String string = requireArguments().getString("arg_media_id");
                if (string == null) {
                    throw AnonymousClass0wJ.A0b();
                } else if (C04220Ms.A0I(r3.A05.getValue(), C130117ok.A00)) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(r3, string, (C146958n9) null, 3), AnonymousClass3J5.A00(r3), 3);
                    return;
                } else {
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A01(AnonymousClass5xa r5) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = r5.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = r5.A02;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryActionText(AnonymousClass0wJ.A0B(r5).getString(2131835477));
                IgdsBottomButtonLayout igdsBottomButtonLayout3 = r5.A02;
                if (igdsBottomButtonLayout3 != null) {
                    igdsBottomButtonLayout3.setPrimaryActionOnClickListener((View.OnClickListener) null);
                    return;
                }
            }
        }
        C04220Ms.A0E("sendButton");
        throw null;
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass60T(this.A08, this, AnonymousClass0wJ.A0X(this.A06)), new AnonymousClass608());
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C86164wN.A0s(this, 31));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public AnonymousClass5xa() {
        KtLambdaShape28S0100000_I2_8 ktLambdaShape28S0100000_I2_8 = new KtLambdaShape28S0100000_I2_8(this, 23);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape28S0100000_I2_8(new KtLambdaShape28S0100000_I2_8(this, 20), 21));
        this.A07 = C18220wO.A0M(new KtLambdaShape28S0100000_I2_8(A012, 22), ktLambdaShape28S0100000_I2_8, C86154wM.A11((Object) null, A012, 49), C18210wN.A0l(C883457r.class));
        ArrayList A0k = C18240wQ.A0k(6);
        int i = 0;
        do {
            A0k.add(new C131747sk());
            i++;
        } while (i < 6);
        this.A05 = A0k;
        this.A08 = new C105366dJ(this);
    }

    public static final void A00(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2, AnonymousClass5xa r4, List list, int i) {
        C31079GfD A002 = C29573FqZ.A00(r4.requireContext());
        r4.A06.getValue();
        A002.A04(new C133217vL(ktCSuperShape0S0310000_I2, r4, list, i), ((ImageUrl) ktCSuperShape0S0310000_I2.A00).getUrl());
    }
}
