package com.facebook.redex;

import X.C015106z;

public class IDxSProviderShape515S0100000_2_I2 implements C015106z {
    public Object A00;
    public final int A01;

    public IDxSProviderShape515S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r0 = (com.facebook.graphql.impls.FinancialEntityImpl) r0.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        r2.putParcelable("financial_entity", X.C121697Hn.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return X.C98316Fa.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle Cfz() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x0075;
                case 2: goto L_0x0059;
                case 3: goto L_0x004e;
                case 4: goto L_0x0036;
                case 5: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel r0 = (com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "filter_transaction_type"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
        L_0x0015:
            android.os.Bundle r2 = X.C98316Fa.A00(r0)
        L_0x0019:
            return r2
        L_0x001a:
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r0 = r5.A00
            X.585 r0 = (X.AnonymousClass585) r0
            X.56r r0 = r0.A08
            java.lang.Object r0 = r0.A08()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0019
            int r1 = r0.intValue()
            java.lang.String r0 = "tab_index"
            r2.putInt(r0, r1)
            return r2
        L_0x0036:
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r0 = r5.A00
            com.facebookpay.msc.filter.viewmodel.FilterViewModel r0 = (com.facebookpay.msc.filter.viewmodel.FilterViewModel) r0
            X.56r r0 = r0.A04
            java.lang.Object r1 = r0.A08()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "filter_transaction_type"
            r2.putString(r0, r1)
            return r2
        L_0x004e:
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r0 = r5.A00
            com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel r0 = (com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel) r0
            X.56q r0 = r0.A03
            goto L_0x0063
        L_0x0059:
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r0 = r5.A00
            com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel r0 = (com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel) r0
            X.56r r0 = r0.A05
        L_0x0063:
            java.lang.Object r0 = r0.A08()
            com.facebook.graphql.impls.FinancialEntityImpl r0 = (com.facebook.graphql.impls.FinancialEntityImpl) r0
            if (r0 == 0) goto L_0x0019
            java.lang.String r1 = "financial_entity"
            android.os.Parcelable r0 = X.C121697Hn.A00(r0)
            r2.putParcelable(r1, r0)
            return r2
        L_0x0075:
            java.lang.Object r3 = r5.A00
            X.7En r3 = (X.C121177En) r3
            java.util.Map r0 = r3.A04
            java.util.Map r0 = X.AnonymousClass4WJ.A0E(r0)
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x0083:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009f
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.Object r0 = r0.getValue()
            X.06z r0 = (X.C015106z) r0
            android.os.Bundle r0 = r0.Cfz()
            r3.A02(r1, r0)
            goto L_0x0083
        L_0x009f:
            java.util.Map r4 = r3.A03
            java.util.Set r1 = r4.keySet()
            int r0 = r1.size()
            java.util.ArrayList r3 = X.C18240wQ.A0k(r0)
            int r0 = r3.size()
            java.util.ArrayList r2 = X.C18240wQ.A0k(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r1.next()
            r3.add(r0)
            java.lang.Object r0 = r4.get(r0)
            r2.add(r0)
            goto L_0x00b9
        L_0x00ce:
            java.lang.String r0 = "keys"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r3)
            java.lang.String r0 = "values"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r2)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r1, r0}
            goto L_0x0015
        L_0x00e0:
            java.lang.Object r0 = r5.A00
            X.8lb r0 = (X.C146078lb) r0
            java.util.Map r0 = r0.CWd()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.util.Iterator r4 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00f0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0019
            java.util.Map$Entry r0 = X.C18180wK.A0o(r4)
            java.lang.String r3 = X.C18200wM.A0p(r0)
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x010e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L_0x010a:
            r2.putParcelableArrayList(r3, r1)
            goto L_0x00f0
        L_0x010e:
            java.util.ArrayList r1 = X.C18200wM.A0s(r1)
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSProviderShape515S0100000_2_I2.Cfz():android.os.Bundle");
    }
}
