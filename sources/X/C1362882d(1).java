package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.shopping.Product;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment;
import java.util.List;

/* renamed from: X.82d  reason: invalid class name and case insensitive filesystem */
public final class C1362882d implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C1362882d(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = this.A00;
        Activity currentActivity = igReactPurchaseExperienceBridgeModule.getCurrentActivity();
        currentActivity.getClass();
        List list = igReactPurchaseExperienceBridgeModule.mProducts;
        if (list == null) {
            String str = this.A02;
            if (!str.isEmpty()) {
                String str2 = this.A01;
                if (!str2.isEmpty()) {
                    UserSession A0V = C18180wK.A0V(C18190wL.A0C(currentActivity));
                    igReactPurchaseExperienceBridgeModule.mUserSession = A0V;
                    C134257xK r6 = new C134257xK(currentActivity, A0V, str, str2);
                    Activity activity = r6.A00;
                    new BXa(activity, AnonymousClass06E.A00((ComponentActivity) activity), r6.A02, r6, (String) null).A01(true, false);
                    return;
                }
            }
        }
        if (igReactPurchaseExperienceBridgeModule.mUserSession != null && list != null && igReactPurchaseExperienceBridgeModule.getCurrentActivity() != null) {
            C002801h.A05(!list.isEmpty(), (String) null);
            if (igReactPurchaseExperienceBridgeModule.mProducts.size() == 1) {
                int A08 = C09860go.A08(igReactPurchaseExperienceBridgeModule.getReactApplicationContext());
                int A07 = C09860go.A07(igReactPurchaseExperienceBridgeModule.getReactApplicationContext());
                float f = (float) A07;
                float f2 = (float) A08;
                RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2, f);
                RectF rectF2 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2, (float) (A07 << 1));
                C18416Af4 af4 = new C18416Af4(igReactPurchaseExperienceBridgeModule.getCurrentActivity(), (Product) C18240wQ.A0b(igReactPurchaseExperienceBridgeModule.mProducts), igReactPurchaseExperienceBridgeModule.mUserSession);
                af4.A01 = rectF;
                af4.A02 = rectF2;
                af4.A00();
                return;
            }
            C37032Jj9 jj9 = new C37032Jj9(igReactPurchaseExperienceBridgeModule.mUserSession);
            jj9.A0O = igReactPurchaseExperienceBridgeModule.getReactApplicationContext().getString(2131832866);
            C37383Jqm A002 = jj9.A00();
            Activity currentActivity2 = igReactPurchaseExperienceBridgeModule.getCurrentActivity();
            C19513Axa.A00.A0P();
            List list2 = igReactPurchaseExperienceBridgeModule.mProducts;
            ProductSharePickerFragment productSharePickerFragment = new ProductSharePickerFragment();
            Bundle A06 = C18180wK.A06();
            A06.putParcelableArrayList("post_purchase_products", C18200wM.A0s(list2));
            productSharePickerFragment.setArguments(A06);
            C37383Jqm.A00(currentActivity2, productSharePickerFragment, A002);
        }
    }
}
