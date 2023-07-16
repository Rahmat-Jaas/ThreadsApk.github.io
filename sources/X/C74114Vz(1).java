package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import java.util.HashMap;

/* renamed from: X.4Vz  reason: invalid class name and case insensitive filesystem */
public final class C74114Vz extends HashMap {
    public final /* synthetic */ IDxCListenerShape202S0100000_1_I2_1 A00;

    public C74114Vz(IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1) {
        this.A00 = iDxCListenerShape202S0100000_1_I2_1;
        put(DialogModule.KEY_TITLE, ((AnonymousClass394) iDxCListenerShape202S0100000_1_I2_1.A00).A00.getString(2131826745));
        put(TraceFieldType.ContentType, "email_and_sms");
    }
}
