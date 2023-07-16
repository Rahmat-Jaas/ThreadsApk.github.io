package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.redex.IDxCListenerShape268S0100000_2_I2;
import com.fbpay.w3c.CardDetails;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.5ET  reason: invalid class name */
public final class AnonymousClass5ET extends AnonymousClass5EU {
    public final Dialog A0C(Bundle bundle) {
        AnonymousClass24V r0;
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.layout_autofill_save_payment, (ViewGroup) null);
        long j = requireArguments().getLong("disable_autofill_dismiss_option", 0);
        if (j != 2) {
            C86164wN.A1A(inflate, 3, this);
        } else {
            C18200wM.A1D(inflate, R.id.bottom_sheet_drag_area);
        }
        AlertDialog create = new AlertDialog.Builder(getActivity()).setView(inflate).create();
        if (j != 0) {
            create.setCanceledOnTouchOutside(false);
        }
        C969467h r7 = (C969467h) requireArguments().get("contact_and_payment_scaling_option");
        if (r7 == null) {
            r7 = C969467h.ORIGINAL;
        }
        AnonymousClass7K3 r1 = this.A00;
        r1.getClass();
        C111316n8 A01 = AnonymousClass7K3.A01(r1, "CLICKED_LEARN_MORE").A01();
        inflate.requireViewById(R.id.icon_image_view).setVisibility(8);
        C18190wL.A18(inflate, R.id.title_text_view, 8);
        ImageView A0J = C18200wM.A0J(inflate, R.id.autofill_optimization_illustration_image_view);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.autofill_optimization_title_text_view);
        C18180wK.A0r(requireContext(), A0J, R.drawable.ig_illustrations_illo_payments_add);
        TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.autofill_optimization_value_prop);
        C18180wK.A0z(A0L2);
        AnonymousClass7B3.A00(requireActivity(), inflate, A0L2, A01, 2131832035, -1, 2131829066, true);
        if (!(!A0D() || r7 == C969467h.ORIGINAL || requireArguments().getParcelable("payment_info") == null)) {
            C18200wM.A15(requireContext(), A0L, 2131835176);
            inflate.requireViewById(R.id.autofill_optimization_illustration_image_view).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int A00 = C18250wR.A00(AnonymousClass0wJ.A0B(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (A00 != -1) {
                layoutParams.bottomMargin = A00;
            }
            inflate.requireViewById(R.id.autofill_optimization_title_text_view).setLayoutParams(layoutParams);
            int dimensionPixelSize = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize != -1) {
                layoutParams2.bottomMargin = dimensionPixelSize;
            }
            inflate.requireViewById(R.id.autofill_optimization_value_prop).setLayoutParams(layoutParams2);
        }
        A0L2.setVisibility(0);
        A0J.setVisibility(0);
        A0L.setVisibility(0);
        AutofillData autofillData = (AutofillData) requireArguments().getParcelable("contact_info");
        if (!(autofillData == null || r7 == C969467h.ORIGINAL)) {
            C19060yu A002 = AnonymousClass3QS.A00(getActivity(), autofillData, true);
            A002.requireViewById(R.id.extra_btn).setVisibility(8);
            C18190wL.A18(A002, R.id.radio_icon, 8);
            View requireViewById = inflate.requireViewById(R.id.autofill_contact_info_stub);
            ViewGroup A0J2 = C18220wO.A0J(inflate, R.id.scrollable_content);
            A0J2.addView(A002, A0J2.indexOfChild(requireViewById));
            A0J2.removeViewInLayout(requireViewById);
            if (requireArguments().getParcelable("payment_info") != null) {
                C18190wL.A18(inflate, R.id.autofill_contact_info_title, 0);
            }
        }
        CardDetails cardDetails = (CardDetails) requireArguments().getParcelable("payment_info");
        if (cardDetails != null) {
            C873051w r11 = new C873051w(inflate.getContext());
            r11.A00(cardDetails);
            C18200wM.A1C(r11);
            C18200wM.A1D(r11, R.id.radio_icon);
            View requireViewById2 = inflate.requireViewById(R.id.autofill_payment_info_stub);
            ViewGroup A0J3 = C18220wO.A0J(inflate, R.id.scrollable_content);
            A0J3.addView(r11, A0J3.indexOfChild(requireViewById2));
            A0J3.removeViewInLayout(requireViewById2);
            if (A0D() && r7 != C969467h.ORIGINAL) {
                View requireViewById3 = inflate.requireViewById(R.id.contact_and_payment_entry_divider);
                View requireViewById4 = inflate.requireViewById(R.id.autofill_payment_info_title);
                requireViewById3.setVisibility(0);
                requireViewById4.setVisibility(0);
                if (r7 == C969467h.CONTACT_AND_PAYMENT_WITH_SAVE_BILLING_OPTION_CIRCLE_CHECKBOX || r7 == C969467h.CONTACT_AND_PAYMENT_WITH_SAVE_BILLING_OPTION_TOGGLE) {
                    int dimensionPixelSize2 = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    r11.setPadding(dimensionPixelSize2, AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), dimensionPixelSize2, 0);
                    AutofillData autofillData2 = (AutofillData) requireArguments().getParcelable("contact_info");
                    if (autofillData2 != null && autofillData2.A02()) {
                        IgdsListCell igdsListCell = (IgdsListCell) inflate.requireViewById(R.id.autofill_save_shipping_as_billing_option);
                        if (r7.ordinal() != 2) {
                            r0 = AnonymousClass24V.TYPE_SWITCH;
                        } else {
                            r0 = AnonymousClass24V.TYPE_CHECKBOX;
                        }
                        igdsListCell.A0F(r0, true);
                        igdsListCell.A0C(new IDxCListenerShape268S0100000_2_I2(this, 0));
                        this.A01 = true;
                        igdsListCell.setVisibility(0);
                    }
                }
            }
        }
        boolean z = requireArguments().getBoolean("is_consent_accepted", false);
        boolean z2 = requireArguments().getBoolean("should_always_show_ads_disclosure", false);
        C969467h r3 = C969467h.ORIGINAL;
        if (r7 == r3 && (z2 || !z)) {
            TextView A0L3 = AnonymousClass0wJ.A0L(inflate, R.id.ads_and_saved_info_management_text);
            A0L3.setText(C18200wM.A0E(getString(2131835127)).append(" ").append(getString(2131821697)));
            A0L3.setVisibility(0);
        }
        inflate.requireViewById(R.id.divider_view).setVisibility(8);
        C86104wH.A1C(inflate.requireViewById(R.id.save_button), 8, this);
        C86104wH.A1C(inflate.requireViewById(R.id.not_now_button), 9, this);
        if (A0D() && r7 != r3 && requireArguments().getParcelable("payment_info") != null && (z2 || !z)) {
            ViewStub viewStub = (ViewStub) inflate.requireViewById(R.id.autofill_payment_bottom_disclaimer_stub);
            SpannableStringBuilder append = C18200wM.A0E(getString(2131835127)).append(" ").append(getString(2131821697));
            int dimensionPixelSize3 = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize3 != -1) {
                layoutParams3.leftMargin = dimensionPixelSize3;
                if (dimensionPixelSize3 != -1) {
                    layoutParams3.rightMargin = dimensionPixelSize3;
                }
            }
            inflate.requireViewById(R.id.autofill_payment_bottom_disclaimer_stub).setLayoutParams(layoutParams3);
            TextView textView = (TextView) viewStub.inflate();
            textView.setText(append);
            textView.setTextSize(0, AnonymousClass0wJ.A0B(this).getDimension(R.dimen.auth_edit_field_text_size));
            int dimensionPixelSize4 = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize4 != -1) {
                layoutParams4.leftMargin = dimensionPixelSize4;
                if (dimensionPixelSize4 != -1) {
                    layoutParams4.rightMargin = dimensionPixelSize4;
                }
            }
            inflate.requireViewById(R.id.not_now_button).setLayoutParams(layoutParams4);
        }
        return create;
    }
}
