package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100100_I2;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.ui.text.IDxCSpanShape183S0100000_1_I2;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape42S0100000_I2_22;

/* renamed from: X.1aj  reason: invalid class name */
public final class AnonymousClass1aj extends C34640IcN implements C82034oy, C82254pK {
    public static final String __redex_internal_original_name = "PromoteConnectPageFragment";
    public C58923Id A00;
    public AnonymousClass3C5 A01;
    public final C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape42S0100000_I2_22(this, 41));
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape42S0100000_I2_22(this, 42));
    public final C04530Oa A04 = AnonymousClass0OY.A02(new KtLambdaShape42S0100000_I2_22(this, 43));
    public final C04530Oa A05 = AnonymousClass0OY.A02(new KtLambdaShape42S0100000_I2_22(this, 40));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Cqb(2131833214);
        AnonymousClass4u2.A06(r2);
    }

    public final String getModuleName() {
        return "promote_connect_page";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A0l;
        C04220Ms.A0B(view, 0);
        C18200wM.A1F(this);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.connect_page_subtitle_text);
        textView.setText(2131833213);
        AnonymousClass3Zw.A03(new IDxCSpanShape183S0100000_1_I2(this, requireContext().getColor(C121907Is.A02(requireContext(), R.attr.textColorRegularLink)), 6), textView, getString(2131833212), getString(2131833213));
        C58923Id r0 = new C58923Id(view, C35394Iu2.A0N);
        this.A00 = r0;
        r0.A00();
        C58923Id r2 = this.A00;
        if (r2 != null) {
            r2.A04(false);
            r2.A02(this);
            r2.A01(2131833210);
            C58923Id r02 = this.A00;
            if (r02 != null) {
                r02.A03(true);
                AnonymousClass3C5 r22 = new AnonymousClass3C5(view, requireActivity(), (PromoteData) C18190wL.A0f(this.A02), this);
                this.A01 = r22;
                IgRadioGroup igRadioGroup = r22.A04;
                igRadioGroup.removeAllViews();
                PromoteData promoteData = r22.A02;
                List<KtCSuperShape0S3100100_I2> list = promoteData.A1R;
                if (list != null) {
                    for (KtCSuperShape0S3100100_I2 ktCSuperShape0S3100100_I2 : list) {
                        if (r22.A00 == null) {
                            r22.A00 = String.valueOf(ktCSuperShape0S3100100_I2.A00);
                        }
                        C04220Ms.A04(ktCSuperShape0S3100100_I2);
                        FragmentActivity fragmentActivity = r22.A01;
                        I50 i50 = new I50(fragmentActivity);
                        i50.setTag(Long.valueOf(ktCSuperShape0S3100100_I2.A00));
                        String str = ktCSuperShape0S3100100_I2.A03;
                        if (str != null) {
                            i50.setPrimaryText((CharSequence) str);
                            Number number = (Number) ktCSuperShape0S3100100_I2.A01;
                            if (number != null) {
                                int intValue = number.intValue();
                                String str2 = ktCSuperShape0S3100100_I2.A02;
                                if (intValue < 1000) {
                                    A0l = AnonymousClass0wJ.A0m(fragmentActivity.getResources(), intValue, R.plurals.connect_page_num_like);
                                } else {
                                    A0l = AnonymousClass0wJ.A0l(fragmentActivity, Integer.valueOf(intValue / 1000), 2131833215);
                                }
                                String A0V = AnonymousClass00U.A0V(str2, " ", A0l);
                                C04220Ms.A06(A0V);
                                i50.setSecondaryText(A0V);
                                i50.A04(true);
                                i50.setImageView(C18250wR.A0K(ktCSuperShape0S3100100_I2.A04), r22.A03);
                                AnonymousClass0wJ.A0I(i50, R.id.promote_row_image).setVisibility(0);
                                igRadioGroup.addView(i50);
                            } else {
                                throw AnonymousClass0wJ.A0b();
                            }
                        } else {
                            throw AnonymousClass0wJ.A0b();
                        }
                    }
                }
                igRadioGroup.A02 = new AnonymousClass4MI(r22);
                if (igRadioGroup.A00 == -1) {
                    igRadioGroup.A02(igRadioGroup.findViewWithTag(r22.A00).getId());
                    promoteData.A1N = r22.A00;
                    r22.A00 = null;
                }
                super.onViewCreated(view, bundle);
                return;
            }
        }
        C04220Ms.A0E("connectButtonHolder");
        throw null;
    }

    public final void BjA() {
        ((C37741K2b) this.A03.getValue()).A0I(C35394Iu2.A0N, "connect_button");
        C04530Oa r1 = this.A02;
        String str = ((PromoteData) C18190wL.A0f(r1)).A1N;
        if (str != null) {
            String str2 = ((PromoteData) C18190wL.A0f(r1)).A0x;
            FragmentActivity requireActivity = requireActivity();
            IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 26);
            H1T A0N = AnonymousClass0wJ.A0N((C10300i6) C18190wL.A0f(this.A04));
            A0N.A0J("business/account/switch_business_page/");
            A0N.A0O("fb_auth_token", str2);
            A0N.A0O("page_id", str);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C21641Rp.class, AnonymousClass3L4.class);
            A0T.A00 = A06;
            new H8Q(requireActivity, AnonymousClass06E.A00(requireActivity)).schedule(A0T);
        }
    }

    public final C10300i6 getSession() {
        return (C10300i6) C18190wL.A0f(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-355210448);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_connect_page_main_view, viewGroup, false);
        C14030oh.A09(914001109, A022);
        return inflate;
    }
}
