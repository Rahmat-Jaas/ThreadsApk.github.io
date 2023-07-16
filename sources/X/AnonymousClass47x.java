package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.facebook.redex.IDxCListenerShape73S0300000_1_I2;
import java.util.Map;

/* renamed from: X.47x  reason: invalid class name */
public final class AnonymousClass47x implements C144608im {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ IDxCListenerShape73S0300000_1_I2 A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass47x(Activity activity, IDxCListenerShape73S0300000_1_I2 iDxCListenerShape73S0300000_1_I2, boolean z) {
        this.A01 = iDxCListenerShape73S0300000_1_I2;
        this.A02 = z;
        this.A00 = activity;
    }

    public final void CAi(Map map) {
        SharedPreferences.Editor editor;
        String str;
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        boolean A1Z = C18180wK.A1Z(obj, C971568d.GRANTED);
        IDxCListenerShape73S0300000_1_I2 iDxCListenerShape73S0300000_1_I2 = this.A01;
        int A04 = AnonymousClass0wJ.A04(iDxCListenerShape73S0300000_1_I2.A01);
        if (A04 == 0) {
            if (A1Z) {
                C62423Zt.A02(((AnonymousClass1wZ) iDxCListenerShape73S0300000_1_I2.A00).A00);
            }
            editor = C28161tl.A02((C28161tl) iDxCListenerShape73S0300000_1_I2.A02);
            str = "save_original_photos";
            AnonymousClass0wJ.A13(editor, str, A1Z);
        } else if (A04 != 1) {
            AnonymousClass1wZ.A0B((AnonymousClass1wZ) iDxCListenerShape73S0300000_1_I2.A00, A1Z);
        } else {
            editor = C28161tl.A02((C28161tl) iDxCListenerShape73S0300000_1_I2.A02);
            str = "save_posted_photos";
            AnonymousClass0wJ.A13(editor, str, A1Z);
        }
        if (!this.A02 && obj == C971568d.DENIED_DONT_ASK_AGAIN) {
            C62413Zr.A01(this.A00, 2131836144);
        }
    }
}
