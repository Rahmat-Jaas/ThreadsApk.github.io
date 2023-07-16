package com.facebook.redex;

import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C307722x;
import X.C50532t9;
import X.C63373hN;
import X.C63893iY;
import X.C63913ic;
import X.C83884s9;
import X.M6q;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxFListenerShape9S1400000_1_I2 implements C83884s9 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public IDxFListenerShape9S1400000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A03 = obj4;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = str;
    }

    public final void Bxr(AnonymousClass3XX r3) {
        AnonymousClass601 r1;
        Object obj;
        if (this.A05 != 0) {
            r1 = (AnonymousClass601) this.A00;
            obj = this.A01;
        } else {
            r1 = (AnonymousClass601) this.A01;
            obj = this.A02;
        }
        C63893iY.A0G(r1, (C109326jp) obj);
    }

    public final void CNG(User user) {
        User user2 = user;
        if (this.A05 != 0) {
            AnonymousClass601 r1 = (AnonymousClass601) this.A00;
            C04220Ms.A0B(r1, 0);
            FragmentActivity A052 = C63913ic.A05(r1);
            C307722x r7 = C307722x.COMMENT_REPORTING;
            C109326jp r2 = (C109326jp) this.A02;
            C109326jp r3 = (C109326jp) this.A01;
            String str = this.A04;
            C63373hN.A03(A052, r1, r2, r3, M6q.A06(r1), (UserSession) this.A03, user2, r7, str);
            return;
        }
        C04220Ms.A0B(user, 0);
        AnonymousClass601 r0 = (AnonymousClass601) this.A01;
        C04220Ms.A0B(r0, 0);
        FragmentActivity A053 = C63913ic.A05(r0);
        String str2 = this.A04;
        C63373hN.A04(A053, M6q.A06(r0), (UserSession) this.A03, user2, (C50532t9) this.A00, str2);
    }
}
