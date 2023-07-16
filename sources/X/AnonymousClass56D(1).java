package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebookpay.form.view.FormLayout;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;

/* renamed from: X.56D  reason: invalid class name */
public final class AnonymousClass56D extends Fragment implements C143618h2, C143678h8 {
    public Dialog A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public FormLayout A05;
    public C883057n A06;
    public FormParams A07;
    public C883857v A08;
    public C105006cj A09;
    public AnonymousClass7IJ A0A;
    public final View.OnClickListener A0B = C86134wK.A0P(this, 59);
    public final View.OnClickListener A0C = C86134wK.A0P(this, 58);
    public final C143628h3 A0D = new C128727kA(this);

    public final C113986sV BH4() {
        boolean z = true;
        FormParams formParams = this.A08.A01;
        String str = formParams.A0A;
        if (str == null) {
            str = getString(formParams.A06);
        }
        if (this.A08.A05.A08() == null || !AnonymousClass0wJ.A1X(this.A08.A05.A08())) {
            z = false;
        }
        boolean z2 = this.A08.A01.A0B;
        return new C113986sV((Drawable) null, this.A0C, getString(2131827303), str, 0, 1, z, z2, true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 0 && intent != null) {
            if (this.A09 == null) {
                this.A09 = new C105006cj();
            }
            AnonymousClass7Kz.A0R();
            throw C97396Be.A00("add ig implementation");
        }
    }

    public final boolean onBackPressed() {
        FormLogEvents formLogEvents;
        C883857v r2 = this.A08;
        FormParams formParams = r2.A01;
        if (formParams.A02 == null || (formLogEvents = formParams.A01) == null) {
            return false;
        }
        C86124wJ.A1P(r2, formLogEvents.A00);
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FormLogEvents formLogEvents;
        this.mArguments.getClass();
        AnonymousClass7IJ r0 = new AnonymousClass7IJ(this, false);
        this.A0A = r0;
        r0.A08.add(this.A0D);
        this.A07 = (FormParams) C18240wQ.A0D(this.mArguments, "form_params");
        this.A08 = (C883857v) C121817Ig.A00(this).A01(C883857v.class);
        C883057n r4 = (C883057n) new AnonymousClass7IU(this).A01(C883057n.class);
        this.A06 = r4;
        C883857v r3 = this.A08;
        FormParams formParams = this.A07;
        r3.A01 = formParams;
        r3.A00 = r4;
        ImmutableList immutableList = formParams.A07;
        C04220Ms.A0B(immutableList, 0);
        C114026sZ r02 = null;
        r4.A02((C1198277d) null, immutableList);
        FormDialogParams formDialogParams = r3.A01.A00;
        if (formDialogParams != null) {
            C111306n7 r1 = new C111306n7();
            r1.A0I = formDialogParams.A05;
            r1.A07 = formDialogParams.A03;
            r1.A0F = formDialogParams.A04;
            r1.A00 = formDialogParams.A00;
            r1.A06 = formDialogParams.A02;
            r1.A02 = formDialogParams.A01;
            r1.A0B = C86154wM.A0N(r3, 30);
            r1.A09 = C86154wM.A0N(r3, 29);
            r02 = new C114026sZ(r1);
        }
        r3.A02 = r02;
        C880756q r12 = r3.A00.A03;
        C880756q r42 = r3.A05;
        r42.A0J(r12);
        C880856r.A05(r12, r42, r3, 235);
        C880756q r13 = r3.A04;
        r42.A0J(r13);
        C880856r.A05(r13, r42, r3, 236);
        C121817Ig.A01().markerEnd(110173292, 2);
        C121817Ig.A01().markerEnd(110175975, 2);
        FormParams formParams2 = r3.A01;
        if (!(formParams2.A02 == null || (formLogEvents = formParams2.A01) == null)) {
            C86124wJ.A1P(r3, formLogEvents.A03);
        }
        if (this.A09 == null) {
            this.A09 = new C105006cj();
        }
        FormLayout formLayout = (FormLayout) view.requireViewById(R.id.form_container);
        this.A05 = formLayout;
        C883057n r03 = this.A06;
        formLayout.A01 = r03;
        if (r03 != null) {
            r03.A04.A0E(formLayout.A04);
        }
        if (this.A08.A01.A05 != 0) {
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.remove_button);
            this.A04 = A0L;
            A0L.setVisibility(0);
            this.A04.setOnClickListener(this.A0B);
            this.A04.setText(this.A08.A01.A05);
        }
        this.A02 = view.requireViewById(R.id.content_view);
        this.A03 = view.requireViewById(R.id.progress_bar);
        this.A01 = view.requireViewById(R.id.container);
        C86104wH.A1F(this, this.A06.A02, 227);
        C86104wH.A1F(this, this.A08.A05, 228);
        C86104wH.A1F(this, this.A08.A03, 229);
        C86104wH.A1F(this, this.A08.A07, 230);
        C86104wH.A1F(this, this.A08.A04, 231);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-494316168);
        Context context = getContext();
        AnonymousClass7Kz.A0K();
        View A0H = AnonymousClass0wJ.A0H(C86154wM.A0E(context, layoutInflater, R.style.Ig4aFbPay), viewGroup, R.layout.fragment_base_form);
        C14030oh.A09(-567236217, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-140598966);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C14030oh.A09(-951795388, A022);
    }
}
