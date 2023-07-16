package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.81w  reason: invalid class name and case insensitive filesystem */
public final class C1362181w implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;

    public C1362181w(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A01 = str;
    }

    public final void run() {
        Activity currentActivity = this.A00.getCurrentActivity();
        currentActivity.getClass();
        C34640IcN A002 = C1186671u.A00(currentActivity);
        A002.getClass();
        String str = this.A01;
        Intent intent = new Intent(currentActivity, IGShopPayCustomTabsActivity.class);
        intent.putExtra("extra_url", str);
        C10650ih.A0E(intent, A002, 1);
    }
}
