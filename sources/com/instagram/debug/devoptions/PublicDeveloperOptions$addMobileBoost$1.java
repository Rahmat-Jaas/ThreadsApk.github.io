package com.instagram.debug.devoptions;

import X.AnonymousClass0J4;
import X.AnonymousClass0wJ;
import X.AnonymousClass2CE;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C25828Dsm;
import X.C40082LJs;
import X.C41794MdI;
import X.LKA;
import X.M55;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.webrtc.PeerConnectionFactory;

public final class PublicDeveloperOptions$addMobileBoost$1 implements View.OnClickListener {
    public final /* synthetic */ Context $ctx;

    public PublicDeveloperOptions$addMobileBoost$1(Context context) {
        this.$ctx = context;
    }

    public final void onClick(View view) {
        HashSet hashSet;
        int A05 = C14030oh.A05(1473972533);
        C40082LJs A00 = C40082LJs.A00(this.$ctx);
        C25828Dsm A0W = C18190wL.A0W(this.$ctx);
        StringBuilder A0r = C18200wM.A0r();
        HashSet A0u = C18200wM.A0u();
        HashSet A0u2 = C18200wM.A0u();
        HashSet A0u3 = C18200wM.A0u();
        for (int A02 : A00.A03) {
            for (M55 m55 : C18200wM.A0s(A00.A02(A02).A07)) {
                C41794MdI mdI = m55.A00;
                if (mdI != null) {
                    hashSet = A0u3;
                    if (mdI.getClass() != LKA.class) {
                        hashSet = A0u;
                    }
                } else {
                    hashSet = A0u2;
                }
                hashSet.add(M55.A00(m55.A04));
            }
        }
        AnonymousClass2CE.A00(PeerConnectionFactory.TRIAL_ENABLED, A0r, A0u);
        AnonymousClass2CE.A00("No-Op", A0r, A0u3);
        AnonymousClass2CE.A00("Disabled", A0r, A0u2);
        A0r.append("\n\n");
        A0r.append("Enabled Interceptors:");
        ArrayList A0s = C18200wM.A0s(AnonymousClass0J4.A01);
        Collections.sort(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0r.append("\n");
            A0r.append("\t- ");
            A0r.append(A0k);
        }
        if (A0s.isEmpty()) {
            A0r.append("\n(None)");
        }
        A0W.A0p(A0r.toString().trim());
        A0W.A0N((DialogInterface.OnClickListener) null, 2131831976);
        AnonymousClass0wJ.A1K(A0W);
        C14030oh.A0C(1468163613, A05);
    }
}
