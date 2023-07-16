package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.redex.IDxCListenerShape3S0301000_2_I2;
import com.facebook.redex.IDxPredicateShape352S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7B3  reason: invalid class name */
public final class AnonymousClass7B3 {
    public static void A02(AnonymousClass099 r10, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, IgRadioGroup igRadioGroup, List list, Set set, boolean z) {
        LVO lvo;
        List list2 = list;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                AutofillData autofillData = (AutofillData) list.get(i);
                if (set != null) {
                    Map A0l = C86164wN.A0l(autofillData);
                    IDxPredicateShape352S0100000_2_I2 iDxPredicateShape352S0100000_2_I2 = new IDxPredicateShape352S0100000_2_I2(set, 2);
                    if (A0l instanceof C40158LVa) {
                        C40158LVa lVa = (C40158LVa) A0l;
                        lvo = new LVO(C32582Ck.A00(lVa.A00, iDxPredicateShape352S0100000_2_I2), lVa.A01);
                    } else {
                        A0l.getClass();
                        lvo = new LVO(iDxPredicateShape352S0100000_2_I2, A0l);
                    }
                    autofillData = new AutofillData((Map) lvo);
                }
                Context requireContext = r10.requireContext();
                autofillData.getClass();
                C19060yu A00 = AnonymousClass3QS.A00(requireContext, autofillData, z);
                View requireViewById = A00.requireViewById(R.id.extra_btn);
                if (z) {
                    requireViewById.setVisibility(8);
                    AnonymousClass0wJ.A0L(A00, R.id.title).setTextSize(0, (float) AnonymousClass0wJ.A0B(r10).getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
                } else {
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall2 = requestAutofillJSBridgeCall;
                    if (requestAutofillJSBridgeCall != null) {
                        requireViewById.setOnClickListener(new IDxCListenerShape3S0301000_2_I2(i, 0, list2, requestAutofillJSBridgeCall2, r10));
                    }
                }
                A00.setTag(autofillData);
                igRadioGroup.addView(A00);
            }
            C19060yu r2 = (C19060yu) igRadioGroup.getChildAt(0);
            r2.setChecked(true);
            if (list.size() == 1) {
                C18200wM.A1D(r2, R.id.radio_icon);
            }
        }
    }

    public static void A00(Activity activity, View view, TextView textView, C111316n8 r7, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AnonymousClass65K r2 = new AnonymousClass65K(activity, r7, C18210wN.A01(view.getContext()), z);
        String string = activity.getString(i3);
        String obj = spannableStringBuilder.append(activity.getString(i)).append(' ').append(string).append(' ').toString();
        if (textView == null) {
            textView = (TextView) C18200wM.A0G(view, i2);
        }
        AnonymousClass3Zw.A03(r2, textView, string, obj);
    }

    public static void A01(View view, boolean z, boolean z2) {
        if (z) {
            IgdsBanner igdsBanner = (IgdsBanner) view.requireViewById(R.id.fbpay_disclosure);
            Resources resources = view.getResources();
            int i = 2131827286;
            if (z2) {
                i = 2131830513;
            }
            igdsBanner.setBody(Html.fromHtml(resources.getString(i)), false);
            igdsBanner.setVisibility(0);
        }
    }
}
