package X;

import android.os.Bundle;
import com.instagram.model.reels.Reel;
import com.instagram.reels.fragment.ReelViewerFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7wf  reason: invalid class name and case insensitive filesystem */
public final class C133907wf implements C27906EvH {
    public final /* synthetic */ CSP A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ HashSet A02;

    public final void CDE(float f) {
    }

    public final void onCancel() {
    }

    public C133907wf(CSP csp, Reel reel, HashSet hashSet) {
        this.A00 = csp;
        this.A01 = reel;
        this.A02 = hashSet;
    }

    public final void CHU(String str) {
        CSP csp = this.A00;
        if (csp.isAdded()) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            Reel reel = this.A01;
            A0y.put(String.valueOf(reel.getId()), this.A02);
            C19554AyF.A02();
            C19554AyF.A02();
            C25539DnV dnV = new C25539DnV();
            List singletonList = Collections.singletonList(reel);
            String valueOf = String.valueOf(reel.getId());
            C04530Oa r3 = csp.A07;
            dnV.A02(AnonymousClass0wJ.A0X(r3), valueOf, singletonList);
            dnV.A05 = C171229wH.A0J;
            dnV.A0Q = A0y;
            dnV.A0M = C18180wK.A0e();
            Bundle A012 = dnV.A01();
            ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
            reelViewerFragment.setArguments(A012);
            C25786Drz A0Q = C18180wK.A0Q(csp.requireActivity(), AnonymousClass0wJ.A0U(r3));
            A0Q.A03 = reelViewerFragment;
            A0Q.A07 = I17.A00(22);
            A0Q.A05();
        }
    }
}
