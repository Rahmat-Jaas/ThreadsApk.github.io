package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.AnonymousClass6VJ;
import X.BBF;
import X.C109326jp;
import X.C122047Jt;
import X.C127397h3;
import X.C14030oh;
import X.C19786BAh;
import X.C82394pY;
import X.C86124wJ;
import android.view.View;
import com.instagram.model.shopping.Product;
import com.instagram.service.session.UserSession;

public class IDxEListenerShape96S0300000_2_I2 implements C82394pY {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxEListenerShape96S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onEvent(Object obj) {
        if (this.A03 != 0) {
            int A032 = C14030oh.A03(-1371898882);
            int A033 = C14030oh.A03(-964963544);
            Integer num = ((BBF) obj).A01;
            Integer num2 = AnonymousClass006.A00;
            C127397h3 r4 = (C127397h3) this.A02;
            int i = 70;
            if (num == num2) {
                i = 71;
            }
            C109326jp A0L = r4.A0L(i);
            AnonymousClass3HX r2 = (AnonymousClass3HX) this.A01;
            if (A0L != null) {
                AnonymousClass3VO A0d = C86124wJ.A0d(r4);
                A0d.A03(r2, 1);
                C122047Jt.A07(r2, r4, A0d, A0L);
            }
            C14030oh.A0A(1260765466, A033);
            C14030oh.A0A(1546277798, A032);
            return;
        }
        Product product = (Product) this.A00;
        View view = (View) this.A01;
        UserSession userSession = (UserSession) this.A02;
        if (((C19786BAh) obj).A00.getId().equals(product.A00.A0j)) {
            view.setSelected(AnonymousClass6VJ.A00(userSession).A05(product));
        }
    }
}
