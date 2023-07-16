package X;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.gson.Gson;
import com.instagram.nux.aymh.accountprovider.AccountDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FR  reason: invalid class name */
public final class AnonymousClass3FR {
    public final C10300i6 A00;
    public final boolean A01;
    public final ComponentActivity A02;

    public AnonymousClass3FR(ComponentActivity componentActivity, C10300i6 r3, boolean z) {
        C04220Ms.A0B(r3, 2);
        this.A02 = componentActivity;
        this.A00 = r3;
        this.A01 = z;
        if (componentActivity.getApplication() != null) {
            Application application = componentActivity.getApplication();
            C04220Ms.A06(application);
            AnonymousClass3R8.A00(application);
        }
    }

    public final List A00(Bundle bundle) {
        ArrayList<String> arrayList;
        if (bundle == null || (arrayList = bundle.getStringArrayList("ig_sso_accounts_array")) == null) {
            arrayList = AnonymousClass0wJ.A0v();
        }
        M4h m4h = new M4h();
        Class<C209216q> cls = C209216q.class;
        m4h.A05(new AccountDeserializer());
        Gson A03 = m4h.A03();
        ArrayList A0w = AnonymousClass0wJ.A0w(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            A0w.add(A03.A07(C18180wK.A0k(it), cls));
        }
        return A0w;
    }
}
