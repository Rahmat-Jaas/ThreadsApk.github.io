package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.836  reason: invalid class name */
public final class AnonymousClass836 implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ ReadableMap A02;
    public final /* synthetic */ AnonymousClass4u1 A03;
    public final /* synthetic */ IgReactNavigatorModule A04;

    public AnonymousClass836(FragmentActivity fragmentActivity, ReadableMap readableMap, AnonymousClass4u1 r3, IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A04 = igReactNavigatorModule;
        this.A01 = fragmentActivity;
        this.A02 = readableMap;
        this.A00 = d;
        this.A03 = r3;
    }

    public final void run() {
        String str;
        FragmentActivity fragmentActivity = this.A01;
        C25745DrH A0b = C18220wO.A0b(fragmentActivity);
        if (A0b == null || !((C35189Ipf) A0b).A0M) {
            C25786Drz CxN = this.A03.CxN(fragmentActivity);
            CxN.A07 = Integer.toString((int) this.A00);
            CxN.A05();
            return;
        }
        C37383Jqm jqm = ((BottomSheetFragment) A0b.A08()).A02;
        C37032Jj9 jj9 = new C37032Jj9(this.A04.mSession);
        ReadableMap readableMap = this.A02;
        if (readableMap == null || !readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = null;
        } else {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        }
        jj9.A0O = str;
        jj9.A00 = 0.66f;
        jj9.A0M = C18180wK.A0Y();
        jj9.A0Q = Integer.toString((int) this.A00);
        C63343hJ.getInstance().getFragmentFactory();
        Bundle ABD = this.A03.ABD();
        C34611Ibh ibh = new C34611Ibh();
        ibh.setArguments(ABD);
        jqm.A09(ibh, jj9);
    }
}
