package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.40w  reason: invalid class name and case insensitive filesystem */
public final class C678740w implements C16190sd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentFilter A01;
    public final /* synthetic */ AnonymousClass1jR A02;
    public final /* synthetic */ ConfirmationCodeEditText A03;

    public C678740w(IntentFilter intentFilter, AnonymousClass1jR r2, ConfirmationCodeEditText confirmationCodeEditText, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = confirmationCodeEditText;
        this.A01 = intentFilter;
    }

    public final ArrayList ApV() {
        return C18200wM.A0s(Collections.singletonList(this.A01));
    }

    public final void CEI(Context context, Intent intent, C16200se r6) {
        String stringExtra;
        if (C16100sU.A00().A01(context, intent, this) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null && C18220wO.A08(stringExtra) == this.A00) {
            this.A03.setText(stringExtra);
        }
    }
}
