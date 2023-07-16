package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.81x  reason: invalid class name and case insensitive filesystem */
public final class C1362281x implements Runnable {
    public final /* synthetic */ ReadableMap A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;

    public C1362281x(ReadableMap readableMap, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A00 = readableMap;
    }

    public final void run() {
        String string = this.A00.getString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        Bundle A06 = C18180wK.A06();
        if (!TextUtils.isEmpty(string)) {
            A06.putString("PAYMENT_TYPE", string);
        }
        AnonymousClass7Kz.A07().A03(A06);
    }
}
