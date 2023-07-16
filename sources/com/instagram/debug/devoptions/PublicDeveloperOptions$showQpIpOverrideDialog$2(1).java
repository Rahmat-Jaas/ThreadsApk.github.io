package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C09120et;
import X.C18240wQ;
import X.C63813iO;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Patterns;
import com.instagram.common.ui.base.IgEditText;

public final class PublicDeveloperOptions$showQpIpOverrideDialog$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C09120et $devPref;
    public final /* synthetic */ IgEditText $editText;

    public PublicDeveloperOptions$showQpIpOverrideDialog$2(IgEditText igEditText, C09120et r2, Context context) {
        this.$editText = igEditText;
        this.$devPref = r2;
        this.$context = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        String str;
        int i2;
        String A0n = AnonymousClass0wJ.A0n(this.$editText);
        if (TextUtils.isEmpty(A0n)) {
            C18240wQ.A1D(this.$devPref.A1w, (Object) null);
            return;
        }
        if (C18240wQ.A1V(A0n, Patterns.IP_ADDRESS)) {
            C18240wQ.A1D(this.$devPref.A1w, A0n);
            context = this.$context;
            str = null;
            i2 = 2131825389;
        } else {
            context = this.$context;
            str = null;
            i2 = 2131825388;
        }
        C63813iO.A03(context, str, i2, 1);
    }
}
