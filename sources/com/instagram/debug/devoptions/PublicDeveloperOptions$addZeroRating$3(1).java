package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C08340dC;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18250wR;
import X.C34463IUv;
import X.C39815L1l;
import X.C41026Luf;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addZeroRating$3 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addZeroRating$3(Context context, UserSession userSession) {
        this.$context = context;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1423986430);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.$context), (ViewGroup) null, R.layout.dev_text_input_dialog);
        C04220Ms.A06(A0H);
        final IgEditText igEditText = (IgEditText) AnonymousClass0wJ.A0J(A0H, R.id.edit_text);
        igEditText.setText(C18250wR.A0W(C08340dC.A01("PrefZeroRatingDogfoodingFilename"), "Zero-Dogfood-Carrier-Id"));
        igEditText.setHint("Type the carrier id you want to dogfood");
        igEditText.requestFocus();
        Context context = this.$context;
        C04220Ms.A0A(context);
        C41026Luf luf = new C41026Luf(context);
        luf.A08("Dogfood Carrier Id");
        luf.A07(A0H);
        final UserSession userSession = this.$userSession;
        luf.A05(new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C04220Ms.A0B(dialogInterface, 0);
                C18180wK.A0v(C18220wO.A0C("PrefZeroRatingDogfoodingFilename"), "Zero-Dogfood-Carrier-Id", AnonymousClass0wJ.A0n(IgEditText.this));
                C39815L1l A00 = C34463IUv.A00(userSession);
                C04220Ms.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                C18190wL.A11(((C34463IUv) A00).A00);
                dialogInterface.dismiss();
            }
        }, "Confirm");
        luf.A04(new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C04220Ms.A0B(dialogInterface, 0);
                C18180wK.A0u(C18220wO.A0C("PrefZeroRatingDogfoodingFilename"), "Zero-Dogfood-Carrier-Id");
                C39815L1l A00 = C34463IUv.A00(UserSession.this);
                C04220Ms.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                C18190wL.A11(((C34463IUv) A00).A00);
                dialogInterface.dismiss();
            }
        }, "Stop Dogfooding");
        C18250wR.A0u(luf);
        C14030oh.A0C(-457291915, A05);
    }
}
