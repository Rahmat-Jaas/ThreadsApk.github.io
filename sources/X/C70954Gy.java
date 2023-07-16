package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.4Gy  reason: invalid class name and case insensitive filesystem */
public final class C70954Gy implements C82924qU {
    public final Fragment A00;

    public C70954Gy(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        C311924p r0;
        C34502Ju.A00();
        C62883b4.A01();
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        C04220Ms.A0B(context, 0);
        Intent A04 = C18250wR.A04(context, BusinessConversionActivity.class);
        Bundle requireArguments = fragment.requireArguments();
        String queryParameter = uri.getQueryParameter("from");
        if (queryParameter == null) {
            queryParameter = "megaphone";
        }
        C18210wN.A0x(requireArguments, queryParameter);
        String queryParameter2 = uri.getQueryParameter("account_type");
        if ("business".equals(queryParameter2)) {
            r0 = C311924p.CONVERSION_FLOW;
        } else if ("creator".equals(queryParameter2)) {
            r0 = C311924p.CREATOR_CONVERSION_FLOW;
        } else {
            r0 = C311924p.INTEREST_ACCOUNT_CONVERSION;
        }
        requireArguments.putInt("business_account_flow", r0.A00);
        requireArguments.putInt("intro_entry_position", 0);
        A04.putExtras(requireArguments);
        C10650ih.A0E(A04, fragment, 11);
    }
}
