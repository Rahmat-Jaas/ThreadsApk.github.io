package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.10P  reason: invalid class name */
public final class AnonymousClass10P extends C62793ak {
    public final DogfoodingAssistantRepository A00;
    public final C86074wE A01;
    public final C86094wG A02;

    public /* synthetic */ AnonymousClass10P(UserSession userSession) {
        this.A00 = new DogfoodingAssistantRepository(userSession);
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape1S0200000_I2_1(1, (Object) null, (Object) null));
        this.A01 = A0z;
        this.A02 = A0z;
    }

    public static final List A00(List list) {
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) it.next();
            String str = ktCSuperShape0S2000000_I2.A01;
            if (str != null) {
                String str2 = ktCSuperShape0S2000000_I2.A00;
                if (str2 != null) {
                    A0w.add(new KtCSuperShape0S2000000_I2(str, str2, 32));
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        return A0w;
    }
}
