package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7tN  reason: invalid class name and case insensitive filesystem */
public class C132127tN implements AnonymousClass0i4 {
    public SharedPreferences A00;
    public final AnonymousClass8iR A01;
    public final Map A02;

    public static void A01(C132127tN r2, Object obj) {
        char lowerCase = Character.toLowerCase(((String) obj).charAt(0));
        Map map = r2.A02;
        Character valueOf = Character.valueOf(lowerCase);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, C18200wM.A0u());
        }
        if (map.get(valueOf) != null) {
            ((Set) map.get(valueOf)).add(obj);
        }
    }

    public final void onSessionWillEnd() {
    }

    public final void A03() {
        this.A02.clear();
        AnonymousClass0gN.A00().AKp(new C954960y(this));
    }

    public C132127tN(AnonymousClass8iR r4, UserSession userSession) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        SharedPreferences A012 = AnonymousClass3Zs.A03(userSession).A01(r4.B2f());
        this.A01 = r4;
        this.A02 = A0y;
        this.A00 = A012;
    }

    public final List A02(CharSequence charSequence) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (charSequence != null && charSequence.length() > 0) {
            Character valueOf = Character.valueOf(Character.toLowerCase(charSequence.charAt(0)));
            Map map = this.A02;
            if (map.containsKey(valueOf)) {
                for (Object next : (Set) map.get(valueOf)) {
                    if (((String) next).toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault()))) {
                        A0v.add(next);
                        if (A0v.size() == Integer.MAX_VALUE) {
                            break;
                        }
                    }
                }
            }
        }
        return A0v;
    }
}
