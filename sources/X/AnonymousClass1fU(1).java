package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.1fU  reason: invalid class name */
public final class AnonymousClass1fU extends C34727Idy {
    public boolean A00 = false;
    public boolean A01 = true;
    public final Handler A02 = C18250wR.A08();
    public final AnonymousClass1cN A03;
    public final Runnable A04 = new C72794Pt(this);
    public final List A05 = AnonymousClass0wJ.A0v();
    public final List A06 = AnonymousClass0wJ.A0v();
    public final Map A07 = AnonymousClass0wJ.A0y();
    public final Map A08 = AnonymousClass0wJ.A0y();
    public final AnonymousClass3UR A09 = new AnonymousClass3UR(1);
    public final AnonymousClass1gJ A0A;
    public final C24021gl A0B;
    public final String A0C;

    public AnonymousClass1fU(Context context, C11630kW r5, AnonymousClass1cN r6) {
        this.A03 = r6;
        this.A0C = context.getResources().getString(2131831836);
        AnonymousClass1gJ r1 = new AnonymousClass1gJ(r5, this);
        this.A0A = r1;
        C24021gl r0 = new C24021gl(context);
        this.A0B = r0;
        init(r1, r0);
    }

    public static void A00(AnonymousClass1fU r6) {
        boolean contains;
        List list;
        boolean contains2;
        r6.clear();
        if (r6.A00 || !r6.A06.isEmpty() || !r6.A05.isEmpty()) {
            int i = 0;
            if (!r6.A01) {
                while (true) {
                    List list2 = r6.A06;
                    if (i >= list2.size()) {
                        break;
                    }
                    User user = (User) list2.get(i);
                    if (user != null) {
                        Map map = r6.A08;
                        C57313Ao r2 = (C57313Ao) map.get(user);
                        if (r2 == null) {
                            r2 = new C57313Ao(user);
                            map.put(user, r2);
                        }
                        Map map2 = r6.A07;
                        if (map2.containsKey(user)) {
                            contains = AnonymousClass0wJ.A1X(map2.get(user));
                        } else {
                            contains = r6.A05.contains(user);
                        }
                        r2.A01 = contains;
                        r2.A00 = i;
                        r6.addModel(r2, r6.A0A);
                    }
                    i++;
                }
            } else {
                int i2 = 0;
                while (true) {
                    list = r6.A05;
                    if (i2 >= list.size()) {
                        break;
                    }
                    User user2 = (User) list.get(i2);
                    if (user2 != null) {
                        Map map3 = r6.A08;
                        C57313Ao r1 = (C57313Ao) map3.get(user2);
                        if (r1 == null) {
                            r1 = new C57313Ao(user2);
                            map3.put(user2, r1);
                        }
                        r1.A01 = true;
                        r1.A00 = i2;
                        r6.addModel(r1, r6.A0A);
                    }
                    i2++;
                }
                while (true) {
                    List list3 = r6.A06;
                    if (i >= list3.size()) {
                        break;
                    }
                    User user3 = (User) list3.get(i);
                    if (user3 != null && !list.contains(user3)) {
                        Map map4 = r6.A08;
                        C57313Ao r22 = (C57313Ao) map4.get(user3);
                        if (r22 == null) {
                            r22 = new C57313Ao(user3);
                            map4.put(user3, r22);
                        }
                        Map map5 = r6.A07;
                        if (map5.containsKey(user3)) {
                            contains2 = AnonymousClass0wJ.A1X(map5.get(user3));
                        } else {
                            contains2 = list.contains(user3);
                        }
                        r22.A01 = contains2;
                        r22.A00 = i;
                        r6.addModel(r22, r6.A0A);
                    }
                    i++;
                }
            }
        } else {
            r6.addModel(r6.A0C, r6.A0B);
        }
        r6.notifyDataSetChanged();
    }

    public final long getItemId(int i) {
        long A002;
        int i2;
        int A032 = C14030oh.A03(-1323814876);
        Object item = getItem(i);
        if (this.A0C.equals(item)) {
            A002 = 0;
            i2 = 1284517121;
        } else if (item instanceof C57313Ao) {
            A002 = this.A09.A00(((C57313Ao) item).A02.getId());
            i2 = 1423887594;
        } else {
            IllegalStateException A0a = C18180wK.A0a("unexpected model type");
            C14030oh.A0A(458595055, A032);
            throw A0a;
        }
        C14030oh.A0A(i2, A032);
        return A002;
    }
}
