package X;

import android.util.Pair;
import com.instagram.base.activity.IgFragmentActivity;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4WE  reason: invalid class name */
public final class AnonymousClass4WE extends LinkedList<Pair<String, String>> {
    public static AnonymousClass4WE A02 = new AnonymousClass4WE();
    public String A00 = "not_initialized";
    public final MIS A01 = C18987Aon.A00;

    public static synchronized AnonymousClass4WE A00() {
        AnonymousClass4WE r0;
        synchronized (AnonymousClass4WE.class) {
            r0 = A02;
        }
        return r0;
    }

    public final void A02(C11630kW r3, String str, String str2) {
        super.addFirst(new Pair(str, str2));
        while (size() > 10) {
            super.removeLast();
        }
        this.A00 = r3.getModuleName();
    }

    public final String A01() {
        StringWriter A0d = C18230wP.A0d();
        try {
            MMp A04 = this.A01.A04(A0d);
            A04.A0I();
            Iterator it = iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                A04.A0J();
                A04.A0U(IgFragmentActivity.MODULE_KEY);
                A04.A0Y((String) pair.first);
                A04.A0U("click_point");
                A04.A0Y((String) pair.second);
                A04.A0G();
            }
            A04.A0F();
            A04.close();
        } catch (IOException unused) {
            AnonymousClass0LU.A02(AnonymousClass4WE.class, "Unable to serialize NavigationQueue");
        }
        return A0d.toString();
    }
}
