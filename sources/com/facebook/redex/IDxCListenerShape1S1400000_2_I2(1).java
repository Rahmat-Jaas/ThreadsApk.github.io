package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass5xd;
import X.AnonymousClass7JF;
import X.BKU;
import X.C11630kW;
import X.C134387xb;
import X.C14030oh;
import X.C19513Axa;
import X.C37006Jih;
import X.C50432sz;
import X.L1Q;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public class IDxCListenerShape1S1400000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public IDxCListenerShape1S1400000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A04 = str;
        this.A03 = obj3;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        int A052;
        String str;
        int i;
        Integer num;
        String str2;
        switch (this.A05) {
            case 0:
                A052 = C14030oh.A05(-1842911824);
                AnonymousClass7JF r3 = (AnonymousClass7JF) this.A01;
                User user = (User) this.A02;
                boolean BRq = user.BRq();
                String id = user.getId();
                String str3 = this.A04;
                AnonymousClass0wJ.A1O(id, str3);
                Integer num2 = AnonymousClass006.A0N;
                if (BRq) {
                    num = AnonymousClass006.A02;
                } else {
                    num = AnonymousClass006.A1L;
                }
                AnonymousClass7JF.A03(AnonymousClass7JF.A00(r3, (Boolean) null, (Boolean) null, num2, num, (Long) null, str3, id, (List) null, 156), r3);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
                C37006Jih.A00.A00(fragmentActivity, fragmentActivity, AnonymousClass0wJ.A0X(((AnonymousClass5xd) this.A03).A07), user, (L1Q) null, "appreciation_gift_feed", user.BK7());
                i = -1657677780;
                break;
            case 1:
                A052 = C14030oh.A05(-1694272176);
                AnonymousClass7JF r32 = (AnonymousClass7JF) this.A01;
                User user2 = (User) this.A02;
                String id2 = user2.getId();
                String str4 = this.A04;
                AnonymousClass0wJ.A1N(id2, str4);
                AnonymousClass7JF.A03(AnonymousClass7JF.A00(r32, (Boolean) null, (Boolean) null, AnonymousClass006.A0N, AnonymousClass006.A03, (Long) null, str4, id2, (List) null, 156), r32);
                AnonymousClass5xd r9 = (AnonymousClass5xd) this.A03;
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A00;
                C50432sz.A00(fragmentActivity2, fragmentActivity2, r9, r9, AnonymousClass0wJ.A0X(r9.A07), new C134387xb(fragmentActivity2), user2);
                i = -1454836701;
                break;
            case 2:
                A052 = C14030oh.A05(-380913669);
                C19513Axa axa = C19513Axa.A00;
                FragmentActivity fragmentActivity3 = (FragmentActivity) this.A00;
                UserSession userSession = (UserSession) this.A03;
                String str5 = this.A04;
                String moduleName = ((C11630kW) this.A01).getModuleName();
                BKU bku = (BKU) this.A02;
                if (bku != null) {
                    str = bku.A0f.A4Y;
                } else {
                    str = null;
                }
                axa.A19(fragmentActivity3, userSession, str5, moduleName, (String) null, str);
                i = -2091580364;
                break;
            default:
                A052 = C14030oh.A05(1220448089);
                C19513Axa axa2 = C19513Axa.A00;
                FragmentActivity fragmentActivity4 = (FragmentActivity) this.A00;
                UserSession userSession2 = (UserSession) this.A03;
                String str6 = this.A04;
                String moduleName2 = ((C11630kW) this.A01).getModuleName();
                BKU bku2 = (BKU) this.A02;
                if (bku2 != null) {
                    str2 = bku2.A0f.A4Y;
                } else {
                    str2 = null;
                }
                axa2.A19(fragmentActivity4, userSession2, str6, moduleName2, (String) null, str2);
                i = 1013012044;
                break;
        }
        C14030oh.A0C(i, A052);
    }
}
