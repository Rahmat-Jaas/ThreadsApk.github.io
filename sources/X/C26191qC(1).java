package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* renamed from: X.1qC  reason: invalid class name and case insensitive filesystem */
public final class C26191qC extends C23161cb {
    public static final String __redex_internal_original_name = "StepperPolicyReviewFragment";
    public AnonymousClass3HL A00;
    public C24651jm A01;

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(434443901);
        super.onCreate(bundle);
        this.A00 = AnonymousClass3VH.A00().A00.A05;
        C14030oh.A09(2025206310, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-737885762);
        View inflate = layoutInflater.inflate(R.layout.gdpr_stepper_policy_review_layout, viewGroup, false);
        getContext();
        View findViewById = inflate.findViewById(R.id.policy_review);
        C04220Ms.A0B(findViewById, 1);
        View requireViewById = findViewById.requireViewById(R.id.content_title);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        View requireViewById2 = findViewById.requireViewById(R.id.paragraphs_container);
        C04220Ms.A0C(requireViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
        findViewById.setTag(new AnonymousClass3AH((ViewGroup) requireViewById2, (TextView) requireViewById, C18200wM.A0K(findViewById, R.id.terms_of_use_link)));
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(R.id.agree_button);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.see_other_options_text);
        if (this.A00 != null) {
            Context context = getContext();
            C10300i6 r12 = this.A00;
            AnonymousClass3AH r10 = (AnonymousClass3AH) findViewById.getTag();
            AnonymousClass3HL r9 = this.A00;
            C04220Ms.A0B(context, 0);
            AnonymousClass0wJ.A1Q(r10, r9);
            TextView textView = r10.A01;
            AnonymousClass3Zk.A03(textView, context);
            textView.setText(r9.A01);
            ViewGroup viewGroup2 = r10.A00;
            List list = r9.A03;
            C04220Ms.A06(list);
            AnonymousClass2PC.A00(context, viewGroup2, list);
            r10.A02.setOnClickListener(new IDxCListenerShape15S0400000_1_I2(11, this, r12, context, this));
            if (AnonymousClass3VH.A00().A03 == AnonymousClass006.A01) {
                View requireViewById3 = findViewById.requireViewById(R.id.terms_of_use_link);
                TextView A0L2 = AnonymousClass0wJ.A0L(findViewById, R.id.terms_of_use_link_row);
                requireViewById3.setVisibility(8);
                A0L2.setVisibility(0);
                IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, getContext().getColor(R.color.blue_5), 26);
                IDxCSpanShape187S0100000_1_I2 A003 = C18730xl.A00(this, getContext().getColor(R.color.blue_5), 27);
                String string = getString(2131827734);
                String string2 = getString(2131824765);
                SpannableStringBuilder A0E = C18200wM.A0E(C18220wO.A0k(this, string, string2, 2131836651));
                AnonymousClass3Zw.A01(A0E, A002, string);
                AnonymousClass3Zw.A01(A0E, A003, string2);
                A0L2.setText(A0E);
                C18180wK.A0z(A0L2);
            }
            C24651jm r0 = new C24651jm(this, progressButton, AnonymousClass3VH.A00().A08);
            this.A01 = r0;
            registerLifecycleListener(r0);
            C18180wK.A0z(A0L);
            IDxCSpanShape63S0200000_1_I2 iDxCSpanShape63S0200000_1_I2 = new IDxCSpanShape63S0200000_1_I2(getContext().getColor(R.color.blue_8), 5, (Object) this, (Object) A0L);
            Context context2 = getContext();
            C04220Ms.A0B(context2, 0);
            String A0k = AnonymousClass0wJ.A0k(context2, 2131832083);
            String A0l = AnonymousClass0wJ.A0l(context2, A0k, 2131835398);
            C04220Ms.A06(A0l);
            SpannableStringBuilder A0E2 = C18200wM.A0E(A0l);
            AnonymousClass3Zw.A01(A0E2, iDxCSpanShape63S0200000_1_I2, A0k);
            A0L.setText(A0E2);
        }
        C63093bU.A03(this, this.A00, C63093bU.A00(), AnonymousClass006.A01, (Integer) null);
        C14030oh.A09(277949432, A02);
        return inflate;
    }

    public final void onDestroy() {
        int A02 = C14030oh.A02(-330656224);
        super.onDestroy();
        unregisterLifecycleListener(this.A01);
        C14030oh.A09(1448240605, A02);
    }
}
