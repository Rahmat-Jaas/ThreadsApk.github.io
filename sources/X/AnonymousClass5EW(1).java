package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.barcelona.R;

/* renamed from: X.5EW  reason: invalid class name */
public final class AnonymousClass5EW extends AnonymousClass5EX {
    public ViewGroup A00;
    public boolean A01;

    public final Dialog A0C(Bundle bundle) {
        int i;
        if (this.A00 == 0) {
            A06();
            return new Dialog(requireActivity());
        }
        boolean z = requireArguments().getBoolean("is_payment_enabled", false);
        this.A0A = requireArguments().getBoolean("is_reconsent_enabled", false);
        this.A09 = requireArguments().getBoolean("is_consent_accepted", false);
        this.A01 = requireArguments().getBoolean("should_always_show_ads_disclosure", false);
        boolean z2 = this.A0A;
        LayoutInflater from = LayoutInflater.from(requireActivity());
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.layout_autofill_save_payment, (ViewGroup) null);
            this.A00 = viewGroup;
            TextView A0L = AnonymousClass0wJ.A0L(viewGroup, R.id.title_text_view);
            TextView A0L2 = AnonymousClass0wJ.A0L(this.A00, R.id.save_button);
            int i2 = this.A00;
            if (i2 == 1) {
                A0L.setText(2131835176);
                i = 2131835122;
            } else if (i2 == 2 || i2 == 3) {
                A0L.setText(2131837408);
                C86154wM.A1I(this.A00, R.id.subtitle_text_view_stub);
                i = 2131837406;
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid reason for opening save autofill bottom sheet: ", i2));
            }
            A0L2.setText(i);
            C89405Ej r1 = this.A03;
            r1.getClass();
            C111316n8 A012 = r1.A02("CLICKED_LEARN_MORE").A01();
            if (this.A01 || !this.A09) {
                AnonymousClass7B3.A00(requireActivity(), this.A00, (TextView) null, A012, 2131835127, R.id.autofill_ads_disclosure_stub, 2131829574, z);
                C86154wM.A1I(this.A00, R.id.manage_saved_info_caption_stub);
            } else {
                AnonymousClass7B3.A00(requireActivity(), this.A00, (TextView) null, A012, 2131830268, R.id.manage_saved_info_caption_stub, 2131829574, z);
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.layout_autofill_save, (ViewGroup) null);
            this.A00 = viewGroup2;
            ViewStub viewStub = (ViewStub) viewGroup2.requireViewById(R.id.save_autofill_header_stub);
            TextView A0L3 = AnonymousClass0wJ.A0L(this.A00, R.id.save_button);
            int i3 = this.A00;
            if (i3 == 1) {
                viewStub.setLayoutResource(R.layout.layout_autofill_save_new_header);
                A0L3.setText(2131835122);
                View inflate = viewStub.inflate();
                TextView A0L4 = AnonymousClass0wJ.A0L(inflate, R.id.title_text_view);
                TextView A0L5 = AnonymousClass0wJ.A0L(inflate, R.id.description_text_view);
                A0L4.setText(2131834558);
                A0L5.setText(2131834559);
            } else if (i3 == 2 || i3 == 3) {
                viewStub.setLayoutResource(R.layout.layout_autofill_save_update_header);
                A0L3.setText(2131837406);
                viewStub.inflate();
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid reason for opening save autofill bottom sheet: ", i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(getString(2131835360)).append(' ');
            C29431y3 r5 = new C29431y3(this, C18210wN.A01(this.A00.getContext()), z);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(getString(2131829574));
            spannableStringBuilder.append(' ').setSpan(r5, length, spannableStringBuilder.length(), 33);
            TextView A0L6 = AnonymousClass0wJ.A0L(this.A00, R.id.security_notice);
            A0L6.setText(spannableStringBuilder);
            C18180wK.A0z(A0L6);
            A0L6.setHighlightColor(0);
        }
        boolean z3 = this.A0A;
        View requireViewById = this.A00.requireViewById(R.id.autofill_contact_info_stub);
        ViewGroup A0J = C18220wO.A0J(this.A00, R.id.scrollable_content);
        AutofillData autofillData = this.A04;
        C19060yu A002 = AnonymousClass3QS.A00(requireActivity(), autofillData, z3);
        View requireViewById2 = A002.requireViewById(R.id.extra_btn);
        if (z) {
            requireViewById2.setVisibility(8);
        } else {
            C86104wH.A1D(A002.requireViewById(R.id.extra_btn), 2, this, autofillData);
        }
        A002.setTag(autofillData);
        C18190wL.A18(A002, R.id.radio_icon, 8);
        A0J.addView(A002, A0J.indexOfChild(requireViewById));
        A0J.removeView(requireViewById);
        C86104wH.A1C(this.A00.requireViewById(R.id.save_button), 6, this);
        C86104wH.A1C(this.A00.requireViewById(R.id.not_now_button), 7, this);
        return new AlertDialog.Builder(requireActivity()).setView(this.A00).create();
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1337546517);
        super.onResume();
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            C86164wN.A1A(viewGroup.requireViewById(R.id.bottom_sheet_drag_area), 2, this);
        }
        C14030oh.A09(-1662867360, A02);
    }
}
