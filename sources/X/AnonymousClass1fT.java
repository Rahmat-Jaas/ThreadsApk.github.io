package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1fT  reason: invalid class name */
public final class AnonymousClass1fT extends C34727Idy {
    public C23961gf A00;
    public List A01;
    public C24091gs A02;
    public C23921gb A03;
    public final Context A04;
    public final KNQ A05 = new KNQ();
    public final UserSession A06;

    public AnonymousClass1fT(Context context, C554633h r10, C11630kW r11, UserSession userSession, String str, String str2) {
        this.A04 = context;
        this.A06 = userSession;
        C24091gs r1 = new C24091gs(context, str, str2);
        this.A02 = r1;
        C554633h r4 = r10;
        C11630kW r5 = r11;
        C23921gb r2 = new C23921gb(context, r4, r5, new AnonymousClass34Q(), userSession);
        this.A03 = r2;
        C23961gf r0 = new C23961gf(context);
        this.A00 = r0;
        init(r1, r2, r0);
    }

    public final void A00() {
        clear();
        addModel((Object) null, (Object) null, this.A02);
        for (int i = 0; i < this.A01.size(); i++) {
            C37170Jlr jlr = ((AnonymousClass38H) this.A01.get(i)).A00;
            User user = ((AnonymousClass38H) this.A01.get(i)).A01;
            if (!(jlr == null || user == null)) {
                AnonymousClass34S A002 = C35552Nw.A00(jlr);
                AnonymousClass38I r3 = new AnonymousClass38I(A002, user);
                KNQ knq = this.A05;
                String valueOf = String.valueOf(A002.A00.hashCode());
                Map map = knq.A00;
                C24970Dd5 dd5 = (C24970Dd5) map.get(valueOf);
                if (dd5 == null) {
                    dd5 = new C24970Dd5();
                    map.put(valueOf, dd5);
                }
                boolean z = true;
                if (!(i == this.A01.size() - 1 || i == 9)) {
                    z = false;
                }
                dd5.A00(i, z);
                addModel(r3, dd5, this.A03);
            }
        }
        addModel((Object) null, (Object) null, this.A00);
        notifyDataSetChanged();
    }
}
