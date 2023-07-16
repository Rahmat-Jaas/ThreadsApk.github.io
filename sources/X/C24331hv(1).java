package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.1hv  reason: invalid class name and case insensitive filesystem */
public class C24331hv extends C63873iU {
    public final Context A00;
    public final FragmentActivity A01;
    public final C12560m7 A02;
    public final C07530bf A03;
    public final boolean A04;
    public final Handler A05;
    public final User A06;

    public C24331hv(Context context, Handler handler, FragmentActivity fragmentActivity, C12560m7 r4, C07530bf r5, User user, boolean z) {
        this.A00 = context;
        this.A03 = r5;
        this.A05 = handler;
        this.A02 = r4;
        this.A01 = fragmentActivity;
        this.A04 = z;
        this.A06 = user;
    }

    public void A00(AnonymousClass1TW r4) {
        int i;
        int A032 = C14030oh.A03(-821750565);
        User user = this.A06;
        if (user == null || user.getId().equals(r4.A00.getId())) {
            this.A05.post(new AnonymousClass4RV(r4, this));
            i = -1324858611;
        } else {
            this.A05.post(new AnonymousClass4P9(this));
            i = -322409886;
        }
        C14030oh.A0A(i, A032);
    }

    public void onFail(AnonymousClass3XX r5) {
        int i;
        int A032 = C14030oh.A03(-978900155);
        Object obj = r5.A00;
        if (obj != null) {
            AnonymousClass1TW r2 = (AnonymousClass1TW) obj;
            int i2 = r2.mStatusCode;
            if (i2 == 403 || i2 == 404) {
                this.A05.post(new AnonymousClass4RU(r2, this));
            }
            i = 2025276345;
        } else {
            C63813iO.A04(2131834837);
            i = 1400511545;
        }
        C14030oh.A0A(i, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-245207603);
        A00((AnonymousClass1TW) obj);
        C14030oh.A0A(1859124384, A032);
    }
}
