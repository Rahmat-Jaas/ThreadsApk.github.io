package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

/* renamed from: X.3Sh  reason: invalid class name and case insensitive filesystem */
public final class C61203Sh {
    public final Context A00;
    public final AnonymousClass266 A01;
    public final C49142qu A02;

    public static final C62153Xk A00(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, C24471ir r5, C61203Sh r6, String str, int i, boolean z) {
        String str2;
        C62153Xk r3 = new C62153Xk((View.OnClickListener) new IDxCListenerShape14S1100000_1_I2(str, (Object) r5, 22), i);
        r3.A07 = !z;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = r6.A00.getString(directMessageInteropReachabilityOptions.A00);
        } else {
            str2 = "";
        }
        r3.A04 = str2;
        r3.A00 = TypedValue.applyDimension(1, 5.0f, C18230wP.A0E(r6.A00));
        return r3;
    }

    public C61203Sh(Context context, C49142qu r2, AnonymousClass266 r3) {
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r2;
    }
}
