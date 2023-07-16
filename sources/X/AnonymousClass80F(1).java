package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.80F  reason: invalid class name */
public final class AnonymousClass80F implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;

    public AnonymousClass80F(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
    }

    public final void run() {
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = this.A00;
        C25745DrH A0b = C18220wO.A0b(igReactPurchaseExperienceBridgeModule.getCurrentActivity());
        if (A0b == null || !((C35189Ipf) A0b).A0M) {
            Activity currentActivity = igReactPurchaseExperienceBridgeModule.getCurrentActivity();
            if ((currentActivity instanceof FragmentActivity) && currentActivity != null) {
                currentActivity.finish();
                return;
            }
            return;
        }
        ((BottomSheetFragment) A0b.A08()).A02.A07();
    }
}
