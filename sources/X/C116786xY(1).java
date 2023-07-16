package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.6xY  reason: invalid class name and case insensitive filesystem */
public final class C116786xY {
    public static I03 A00(String str, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i);
        if (str != null) {
            writableNativeMap.putString(DialogModule.KEY_MESSAGE, str);
        }
        writableNativeMap.putInt("PERMISSION_DENIED", 1);
        writableNativeMap.putInt("POSITION_UNAVAILABLE", 2);
        writableNativeMap.putInt("TIMEOUT", 3);
        return writableNativeMap;
    }
}
