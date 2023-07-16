package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashSet;

/* renamed from: X.832  reason: invalid class name */
public final class AnonymousClass832 implements Runnable {
    public final /* synthetic */ C145858lE A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass832(C145858lE r1, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public final void run() {
        Activity currentActivity = this.A01.getCurrentActivity();
        currentActivity.getClass();
        Bundle A06 = C18180wK.A06();
        A06.putInt("STYLE_RES", 2131886670);
        Bundle A062 = C18180wK.A06();
        A062.putSerializable("viewmodel_class", C92845jx.class);
        HashSet A0u = C18200wM.A0u();
        C86154wM.A1E(A062, new FBPayLoggerData((String) null, (String) null, (String) null, (String) null, this.A03, (String) null, C86104wH.A13(A0u, A0u)));
        A062.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, this.A02);
        C92745jn r2 = new C92745jn();
        r2.setArguments(A062);
        AnonymousClass5qq r1 = new AnonymousClass5qq();
        r1.setArguments(A06);
        C12560m7 supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
        r1.A05 = r2;
        r1.A0A(supportFragmentManager, (String) null);
        r2.A00 = new C128977kj(r1, this);
    }
}
