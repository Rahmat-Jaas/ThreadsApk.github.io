package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.AccessToken;
import java.util.Date;

/* renamed from: X.0xS  reason: invalid class name and case insensitive filesystem */
public final class C18600xS extends Handler {
    public AccessToken A00;
    public C64383kN A01;
    public String A02;

    public final void handleMessage(Message message) {
        String str = this.A02;
        AccessToken A002 = C62603aO.A00(str);
        if (A002 != null) {
            AccessToken accessToken = this.A00;
            if (A002.equals(accessToken) && message.getData().getString("access_token") != null) {
                Bundle data = message.getData();
                Integer num = accessToken.A00;
                AccessToken accessToken2 = null;
                if (num == AnonymousClass006.A01 || num == AnonymousClass006.A0C || num == AnonymousClass006.A0N) {
                    Date A003 = AccessToken.A00(data, new Date(0));
                    String string = data.getString("access_token");
                    if (!TextUtils.isEmpty(string)) {
                        accessToken2 = new AccessToken(num, string, accessToken.A01, accessToken.A03, accessToken.A07, accessToken.A06, A003, new Date());
                    }
                }
                C62603aO.A01(str).A02(accessToken2);
            }
        }
        try {
            Context context = C60943Re.A00;
            C64383kN r2 = this.A01;
            context.unbindService(r2);
            AnonymousClass148 r1 = r2.A03;
            if (r1.A01 == r2) {
                r1.A01 = null;
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public C18600xS(AccessToken accessToken, C64383kN r3, String str) {
        super(Looper.getMainLooper());
        this.A02 = str;
        this.A00 = accessToken;
        this.A01 = r3;
    }
}
