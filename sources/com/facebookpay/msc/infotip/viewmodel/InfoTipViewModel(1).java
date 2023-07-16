package com.facebookpay.msc.infotip.viewmodel;

import X.AnonymousClass0wJ;
import X.AnonymousClass5iC;
import X.AnonymousClass5iL;
import X.AnonymousClass5iR;
import X.AnonymousClass69Q;
import X.C121697Hn;
import X.C121777Ib;
import X.C128077iJ;
import X.C128087ir;
import X.C128107it;
import X.C146928n6;
import X.C18210wN;
import X.C86134wK;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C880856r;
import X.C92375iF;
import X.C92395iH;
import X.C92445iV;
import X.C92465iX;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.graphql.impls.BalanceInfoFragmentImpl;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.redex.IDxCListenerShape508S0100000_2_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class InfoTipViewModel extends ListSectionViewModel {
    public BalanceInfoFragmentImpl A00;
    public final C880856r A01 = C880856r.A03();

    public final void A07(Bundle bundle) {
        Parcelable parcelable;
        Object A012;
        String str;
        ImmutableList treeList;
        super.A07(bundle);
        if (bundle == null || (parcelable = bundle.getParcelable("EARNINGS_BALANCE_INFO")) == null || (A012 = C121697Hn.A01(parcelable)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        this.A00 = (BalanceInfoFragmentImpl) A012;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(20);
        C92375iF A003 = C92375iF.A00();
        BalanceInfoFragmentImpl balanceInfoFragmentImpl = this.A00;
        if (balanceInfoFragmentImpl != null) {
            str = balanceInfoFragmentImpl.getStringValue("balance_text");
        } else {
            str = null;
        }
        C121777Ib.A02(C128107it.A01(str), A003, AnonymousClass69Q.A19);
        A002.A05 = new AnonymousClass5iL(A003);
        A002.A02 = 1;
        AnonymousClass5iC r4 = new AnonymousClass5iC();
        Integer A0X = C86154wM.A0X();
        r4.A01 = new C128077iJ(A0X, 4, A0X, 0);
        r4.A00 = C86134wK.A0P(this, 29);
        A002.A06 = new C92395iH(r4);
        A002.A00 = R.id.bottom_sheet_header;
        C92465iX.A01(A002, A0Q);
        C92445iV.A00(A0Q);
        BalanceInfoFragmentImpl balanceInfoFragmentImpl2 = this.A00;
        if (!(balanceInfoFragmentImpl2 == null || (treeList = balanceInfoFragmentImpl2.getTreeList("balance_tooltip", BalanceInfoFragmentImpl.BalanceTooltip.class)) == null)) {
            ArrayList A0x = AnonymousClass0wJ.A0x(treeList, 10);
            Iterator it = treeList.iterator();
            while (it.hasNext()) {
                A0x.add(C18210wN.A0G(it).reinterpret(PAYTextWithLinksFragmentImpl.class));
            }
            ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
            Iterator it2 = A0x.iterator();
            while (it2.hasNext()) {
                A0x2.add(new C128087ir((PAYTextWithLinksFragmentImpl) it2.next(), new IDxCListenerShape508S0100000_2_I2(this, 3)));
            }
            Iterator it3 = A0x2.iterator();
            while (it3.hasNext()) {
                AnonymousClass5iR A004 = AnonymousClass5iR.A00(1);
                C92375iF A005 = C92375iF.A00();
                C121777Ib.A02((C146928n6) it3.next(), A005, AnonymousClass69Q.A0l);
                A0Q.add((Object) AnonymousClass5iL.A00(A004, A005));
            }
        }
        C86144wL.A1E(this.A01, A0Q);
    }
}
