package X;

import com.android.billingclient.api.SkuDetails;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.8Mq  reason: invalid class name and case insensitive filesystem */
public final class C139098Mq extends C02220Ah implements AnonymousClass0YY {
    public static final C139098Mq A00 = new C139098Mq();

    public C139098Mq() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("productId", obj);
        A0y.put("type", "inapp");
        A0y.put(DialogModule.KEY_TITLE, "mock title");
        A0y.put(FXPFAccessLibraryDebugFragment.NAME, "mock title");
        A0y.put("price", "$0.99");
        A0y.put("price_amount_micros", "990000");
        return new SkuDetails(new JSONObject(A0y).toString());
    }
}
