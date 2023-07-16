package X;

import android.app.Activity;
import android.text.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1uP  reason: invalid class name and case insensitive filesystem */
public final class C28471uP extends AnonymousClass1hH {
    public final /* synthetic */ C11630kW A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28471uP(FragmentActivity fragmentActivity, C12560m7 r2, C11630kW r3, BKU bku, UserSession userSession, String str) {
        super(fragmentActivity, r2);
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = r3;
        this.A01 = bku;
    }

    public final void onFail(AnonymousClass3XX r9) {
        int A002 = AnonymousClass0wJ.A00(-1803710805, r9);
        super.onFail(r9);
        C63673i6.A09(this.A00, this.A02, this.A03, "igtv_long_press_menu", "copy_link", r9.A01);
        C14030oh.A0A(1606798908, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1498473537);
        C21761Sb r11 = (C21761Sb) obj;
        int A033 = C14030oh.A03(173117566);
        C04220Ms.A0B(r11, 0);
        int A034 = C14030oh.A03(1143412954);
        Activity activity = this.A00;
        ((ClipboardManager) activity.getSystemService("clipboard")).setText(r11.A00);
        C63813iO.A03(activity, (String) null, 2131829646, 0);
        C14030oh.A0A(1057081563, A034);
        C63673i6.A0B(this.A00, this.A02, this.A03, "igtv_long_press_menu", "copy_link", r11.A00, this.A01.A0f.A4h);
        C14030oh.A0A(-949137156, A033);
        C14030oh.A0A(2118073028, A032);
    }
}
