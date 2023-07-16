package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C09120et;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C18250wR;
import X.C40877Lpc;
import X.C41026Luf;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgEditText;

public final class PublicDeveloperOptions$addMainOptions$41 implements View.OnClickListener {
    public final /* synthetic */ Context $context;

    public PublicDeveloperOptions$addMainOptions$41(Context context) {
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-425075772);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.$context), (ViewGroup) null, R.layout.dev_text_input_dialog);
        C04220Ms.A06(A0H);
        final IgEditText igEditText = (IgEditText) AnonymousClass0wJ.A0J(A0H, R.id.edit_text);
        igEditText.setText(C18200wM.A0j(C18190wL.A0X().A0E));
        C41026Luf luf = new C41026Luf(this.$context);
        luf.A07(A0H);
        C40877Lpc lpc = luf.A01;
        lpc.A0C = lpc.A0L.getText(2131825083);
        luf.A03(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String A0n = AnonymousClass0wJ.A0n(IgEditText.this);
                C09120et A0X = C18190wL.A0X();
                C04220Ms.A0B(A0n, 0);
                C18240wQ.A1D(A0X.A0E, A0n);
            }
        }, 2131831976);
        C18250wR.A0u(luf);
        C14030oh.A0C(600702534, A05);
    }
}
