package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Dz  reason: invalid class name and case insensitive filesystem */
public abstract class C58123Dz {
    public final List A00(CallerContext callerContext) {
        List<FxCalAccount> list;
        List list2;
        Object obj;
        String str;
        int i;
        C29691z7 r6 = ((C29681z6) this).A00;
        boolean A09 = r6.A09();
        AnonymousClass49V r3 = r6.A03;
        String str2 = callerContext.A02;
        C04220Ms.A06(str2);
        r3.A02("fx_company_identity_switcher_linking_cache", str2);
        boolean A0C = r6.A0C("fx_company_identity_switcher_linking_cache");
        if (!A09) {
            if (!A0C) {
                r3.A01("fx_company_identity_switcher_linking_cache", str2);
                list = AnonymousClass0ZV.A00;
            } else {
                r6.A04();
                r6.A05();
                r6.A06();
                boolean A0D = r6.A0D("fx_company_identity_switcher_linking_cache");
                List<FxCalAccount> list3 = r6.A00.A01;
                ArrayList A0x = AnonymousClass0wJ.A0x(list3, 10);
                for (FxCalAccount fxCalAccount : list3) {
                    String str3 = fxCalAccount.A01;
                    if (A0D) {
                        str3 = "";
                    }
                    String str4 = fxCalAccount.A03;
                    if (A0D || str4 == null) {
                        str4 = "";
                    }
                    A0x.add(new FxCalAccount(fxCalAccount.A00, str3, str4, fxCalAccount.A02, fxCalAccount.A04, fxCalAccount.A06, fxCalAccount.A07, fxCalAccount.A05));
                }
                list = A0x;
            }
            ArrayList A0x2 = AnonymousClass0wJ.A0x(list, 10);
            for (FxCalAccount fxCalAccount2 : list) {
                A0x2.add(new FxCalAccountWithSwitcherInfo(fxCalAccount2.A00, fxCalAccount2.A01, fxCalAccount2.A03, fxCalAccount2.A02, fxCalAccount2.A04, fxCalAccount2.A06, fxCalAccount2.A07, fxCalAccount2.A05));
            }
            list2 = A0x2;
        } else if (!A0C) {
            r3.A01("fx_company_identity_switcher_linking_cache", str2);
            list2 = AnonymousClass0ZV.A00;
        } else {
            r6.A04();
            r6.A05();
            r6.A06();
            boolean A0D2 = r6.A0D("fx_company_identity_switcher_linking_cache");
            List<FxCalAccount> list4 = r6.A00.A01;
            ArrayList A0x3 = AnonymousClass0wJ.A0x(list4, 10);
            for (FxCalAccount fxCalAccount3 : list4) {
                Iterator it = r6.A01.A01.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    obj = it.next();
                } while (!C04220Ms.A0I(((FxCalAccountWithSwitcherInfo) obj).A01, fxCalAccount3.A01));
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) obj;
                String str5 = fxCalAccount3.A01;
                if (A0D2) {
                    str5 = "";
                }
                if (fxCalAccountWithSwitcherInfo == null || (str = fxCalAccountWithSwitcherInfo.A03) == null) {
                    str = "";
                }
                if (A0D2 || str == null) {
                    str = "";
                }
                String str6 = fxCalAccount3.A02;
                String str7 = fxCalAccount3.A04;
                String str8 = fxCalAccount3.A06;
                String str9 = fxCalAccount3.A07;
                String str10 = fxCalAccount3.A05;
                if (fxCalAccountWithSwitcherInfo != null) {
                    i = fxCalAccountWithSwitcherInfo.A00;
                } else {
                    i = 0;
                }
                A0x3.add(new FxCalAccountWithSwitcherInfo(i, str5, str, str6, str7, str8, str9, str10));
            }
            list2 = A0x3;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list2) {
            if (((FxCalAccountWithSwitcherInfo) next).A02.equalsIgnoreCase("FACEBOOK")) {
                A0v.add(next);
            }
        }
        return A0v;
    }
}
