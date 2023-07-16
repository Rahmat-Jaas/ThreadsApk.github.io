package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* renamed from: X.5vV  reason: invalid class name */
public final class AnonymousClass5vV extends C132127tN {
    public static AnonymousClass5vV A00(UserSession userSession) {
        Class<AnonymousClass5vV> cls = AnonymousClass5vV.class;
        AnonymousClass5vV r1 = (AnonymousClass5vV) userSession.A00(cls);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass5vV r12 = new AnonymousClass5vV(new C130147on(), userSession);
        userSession.A04(cls, r12);
        return r12;
    }

    public final void A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher A01 = AnonymousClass73Y.A01(str);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            while (A01.find()) {
                String group = A01.group(1);
                group.getClass();
                A0v.add(group.substring(1, group.length()));
            }
            SharedPreferences.Editor edit = this.A00.edit();
            for (Object next : A0v) {
                try {
                    String str2 = (String) next;
                    edit.putString(str2, str2);
                    C132127tN.A01(this, next);
                } catch (IOException unused) {
                }
            }
            edit.apply();
        }
    }

    public AnonymousClass5vV(AnonymousClass8iR r1, UserSession userSession) {
        super(r1, userSession);
    }
}
