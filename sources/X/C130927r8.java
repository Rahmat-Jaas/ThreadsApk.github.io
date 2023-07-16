package X;

import android.graphics.Bitmap;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.views.image.IgReactImageLoaderModule;

/* renamed from: X.7r8  reason: invalid class name and case insensitive filesystem */
public final class C130927r8 implements C39769Kzd {
    public final /* synthetic */ C145858lE A00;
    public final /* synthetic */ IgReactImageLoaderModule A01;

    public final void C25(L5E l5e, int i) {
    }

    public C130927r8(C145858lE r1, IgReactImageLoaderModule igReactImageLoaderModule) {
        this.A01 = igReactImageLoaderModule;
        this.A00 = r1;
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        writableNativeMap.putInt(IgReactMediaPickerNativeModule.WIDTH, bitmap.getWidth());
        writableNativeMap.putInt(IgReactMediaPickerNativeModule.HEIGHT, bitmap.getHeight());
        this.A00.resolve(writableNativeMap);
    }

    public final void C1y(L5E l5e, KHQ khq) {
        this.A00.reject(new Throwable());
    }
}
