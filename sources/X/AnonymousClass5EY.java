package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5EY  reason: invalid class name */
public final class AnonymousClass5EY extends AnonymousClass55x {
    public View A00;
    public AutofillSharedJSBridgeProxy A01;
    public C89405Ej A02;
    public RequestAutofillJSBridgeCall A03;
    public String A04;
    public String A05;
    public List A06 = Collections.emptyList();
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A;

    public static boolean A01(AnonymousClass5EY r1, AnonymousClass78Q r2) {
        r2.A05 = AnonymousClass7KI.A01(Collections.unmodifiableMap(((AutofillData) r1.A06.get(0)).A00).keySet());
        return false;
    }

    public final Dialog A0C(Bundle bundle) {
        IgRadioGroup igRadioGroup;
        boolean z = requireArguments().getBoolean("is_payment_enabled", false);
        this.A09 = requireArguments().getBoolean("is_reconsent_enabled", false);
        this.A07 = requireArguments().getBoolean("is_consent_accepted", false);
        this.A0A = requireArguments().getBoolean("should_always_show_ads_disclosure", false);
        this.A08 = requireArguments().getBoolean("should_show_fbpay_disclosure", false);
        boolean z2 = this.A09;
        LayoutInflater from = LayoutInflater.from(requireActivity());
        if (z2) {
            View inflate = from.inflate(R.layout.layout_autofill_payment, (ViewGroup) null);
            this.A00 = inflate;
            ViewStub viewStub = (ViewStub) inflate.requireViewById(R.id.autofill_contact_info_stub);
            C111316n8 A012 = this.A02.A02("CLICKED_LEARN_MORE").A01();
            if (this.A0A || !this.A07) {
                AnonymousClass7B3.A00(requireActivity(), this.A00, (TextView) null, A012, 2131835127, R.id.autofill_ads_disclosure_stub, 2131829574, z);
                C86154wM.A1I(this.A00, R.id.manage_saved_info_caption_stub);
            } else {
                AnonymousClass7B3.A00(requireActivity(), this.A00, (TextView) null, A012, 2131830268, R.id.manage_saved_info_caption_stub, 2131829574, z);
            }
            igRadioGroup = (IgRadioGroup) viewStub.inflate();
            C86104wH.A1C(this.A00.requireViewById(R.id.not_now_button), 4, this);
        } else {
            View inflate2 = from.inflate(R.layout.layout_autofill, (ViewGroup) null);
            this.A00 = inflate2;
            igRadioGroup = (IgRadioGroup) inflate2.requireViewById(R.id.autofill_radio_group);
        }
        AnonymousClass7B3.A01(this.A00, this.A08, requireArguments().getBoolean("show_meta_pay_brand", false));
        AnonymousClass7B3.A02(this, this.A03, igRadioGroup, this.A06, (Set) null, this.A09);
        C86104wH.A1D(this.A00.requireViewById(R.id.done_button), 1, this, igRadioGroup);
        return new AlertDialog.Builder(requireActivity()).setView(this.A00).create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r8) {
        /*
            r7 = this;
            X.5Ej r1 = r7.A02
            java.lang.String r0 = "DECLINED_AUTOFILL"
            X.78Q r2 = r1.A02(r0)
            java.lang.String r0 = r7.A05
            r2.A08 = r0
            boolean r6 = A01(r7, r2)
            java.util.List r0 = r7.A06
            int r0 = r0.size()
            r2.A00 = r0
            java.lang.String r0 = r7.A04
            r2.A06 = r0
            boolean r0 = r7.A09
            boolean r1 = r7.A07
            if (r0 == 0) goto L_0x0025
            r0 = 1
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2.A0L = r0
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r7.A03
            if (r0 == 0) goto L_0x002f
            A00(r7, r2, r0)
        L_0x002f:
            X.AnonymousClass78Q.A00(r2)
            X.5Ej r5 = r7.A02
            r4 = 0
            X.Kys r3 = r5.A03
            r0 = r3
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r2 = r0.A0e
            java.util.Map r1 = r5.A0d
            r0 = 0
            if (r3 == 0) goto L_0x0042
            r0 = r2
        L_0x0042:
            java.lang.String r0 = X.AnonymousClass7K0.A00(r0)
            X.C86154wM.A1U(r0, r1, r6)
            java.util.Map r0 = r5.A0g
            r0.put(r2, r4)
            r5.A0W = r6
            r5.A0E = r4
            r5.A0D = r4
            super.onCancel(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5EY.onCancel(android.content.DialogInterface):void");
    }

    public static void A00(AnonymousClass5EY r1, AnonymousClass78Q r2, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall) {
        r2.A0E = requestAutofillJSBridgeCall.A02();
        r2.A04 = AnonymousClass7KI.A01(r1.A03.A03());
        r2.A0D = AnonymousClass7KI.A01(r1.A03.A04());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1966419884);
        if (bundle != null) {
            A06();
        }
        super.onCreate(bundle);
        C14030oh.A09(-330495018, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1767150041);
        super.onResume();
        C86164wN.A1A(this.A00.requireViewById(R.id.bottom_sheet_drag_area), 0, this);
        C14030oh.A09(83805028, A022);
    }
}
