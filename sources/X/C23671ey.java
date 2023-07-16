package X;

import android.content.Context;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;

/* renamed from: X.1ey  reason: invalid class name and case insensitive filesystem */
public final class C23671ey extends AnonymousClass1ig {
    public final /* synthetic */ FBPageListWithPreviewFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23671ey(Context context, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C84654td r13, FBPageListWithPreviewFragment fBPageListWithPreviewFragment, AnonymousClass3IK r15, C10300i6 r16, String str, String str2, String str3) {
        super(context, businessFlowAnalyticsLogger, r13, r15, r16, str, "page_selection", str2, str3);
        this.A00 = fBPageListWithPreviewFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2.isEmpty() != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C24481is r11) {
        /*
            r10 = this;
            r0 = 488889012(0x1d23dab4, float:2.1685937E-21)
            int r3 = X.C14030oh.A03(r0)
            super.A01(r11)
            if (r11 == 0) goto L_0x00b7
            X.34f r0 = r11.A00
            if (r0 == 0) goto L_0x00b7
            X.34e r0 = r0.A00
            if (r0 == 0) goto L_0x00b7
            com.instagram.business.fragment.FBPageListWithPreviewFragment r4 = r10.A00
            java.util.List r2 = r0.A00
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.mLoadingSpinner
            r0 = 8
            r1.setVisibility(r0)
            r8 = 0
            if (r2 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = 0
            X.4td r0 = r4.A02
            if (r1 != 0) goto L_0x0071
            if (r0 == 0) goto L_0x00ac
            com.instagram.model.business.BusinessInfo r0 = r4.A08
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L_0x003a
            r5 = r0
        L_0x003a:
            X.1fW r6 = r4.A00
            com.google.common.collect.ImmutableList r0 = X.AnonymousClass2KB.A00(r2)
            java.util.List r7 = r6.A05
            r7.clear()
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x004d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r2.next()
            X.3IK r1 = (X.AnonymousClass3IK) r1
            com.instagram.service.session.UserSession r0 = r6.A04
            if (r0 != 0) goto L_0x006c
            r0 = 0
        L_0x005e:
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0068
            r7.add(r1)
            goto L_0x004d
        L_0x0068:
            r9.add(r1)
            goto L_0x004d
        L_0x006c:
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            goto L_0x005e
        L_0x0071:
            if (r0 == 0) goto L_0x00ac
            X.1ju r0 = r4.mBusinessNavBarHelper
            r0.A02(r8)
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x003a
        L_0x007d:
            r7.addAll(r9)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0108
            r2 = 0
            java.lang.Object r1 = r7.get(r8)
            X.3IK r1 = (X.AnonymousClass3IK) r1
            if (r5 == 0) goto L_0x00ce
        L_0x008f:
            int r0 = r7.size()
            if (r2 >= r0) goto L_0x00ce
            java.lang.Object r0 = r7.get(r2)
            X.3IK r0 = (X.AnonymousClass3IK) r0
            java.lang.String r0 = r0.A08
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r1 = r7.get(r2)
            X.3IK r1 = (X.AnonymousClass3IK) r1
        L_0x00a9:
            int r2 = r2 + 1
            goto L_0x008f
        L_0x00ac:
            android.os.Handler r1 = r4.A0H
            X.4OX r0 = new X.4OX
            r0.<init>(r4)
            r1.post(r0)
            goto L_0x0126
        L_0x00b7:
            com.instagram.business.fragment.FBPageListWithPreviewFragment r2 = r10.A00
            android.content.Context r1 = r2.getContext()
            r0 = 2131826864(0x7f1118b0, float:1.9286624E38)
            java.lang.String r0 = r2.getString(r0)
            X.C63813iO.A01(r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.mLoadingSpinner
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0126
        L_0x00ce:
            com.instagram.business.fragment.FBPageListWithPreviewFragment r7 = r6.A01
            X.3IK r0 = r7.A05
            r7.A06 = r0
            java.lang.String r8 = r7.A09
            if (r8 == 0) goto L_0x012f
            X.1fW r5 = r7.A00
            java.util.List r0 = r5.A05
            if (r0 == 0) goto L_0x012d
            java.util.Iterator r2 = r0.iterator()
        L_0x00e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r1 = r2.next()
            X.3IK r1 = (X.AnonymousClass3IK) r1
            java.lang.String r0 = r1.A08
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e2
            r5.A01(r1)
        L_0x00f9:
            r7.A05 = r1
            r0 = 0
            r7.A09 = r0
        L_0x00fe:
            X.42s r2 = r7.A04
            X.3IK r1 = r7.A05
            X.3IK r0 = r7.A06
            r2.A04 = r1
            r2.A05 = r0
        L_0x0108:
            r6.A00()
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r4.getContext()
            X.C18190wL.A1D(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.mRecyclerView
            X.1fW r0 = r4.A00
            r1.setAdapter(r0)
            X.1fW r0 = r4.A00
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L_0x0126
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r0.A0m(r1)
        L_0x0126:
            r0 = -592722243(0xffffffffdcabc6bd, float:-3.86805889E17)
            X.C14030oh.A0A(r0, r3)
            return
        L_0x012d:
            r1 = 0
            goto L_0x00f9
        L_0x012f:
            if (r0 == 0) goto L_0x0132
            r1 = r0
        L_0x0132:
            X.1fW r0 = r7.A00
            r0.A01(r1)
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23671ey.A01(X.1is):void");
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A03 = C14030oh.A03(810531177);
        super.onFail(r5);
        FBPageListWithPreviewFragment fBPageListWithPreviewFragment = this.A00;
        C63813iO.A01(fBPageListWithPreviewFragment.getContext(), C63483hZ.A03(r5, fBPageListWithPreviewFragment.getString(2131826864)));
        C14030oh.A0A(1507176880, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1796715135);
        this.A00.mLoadingSpinner.setVisibility(8);
        C14030oh.A0A(1144894901, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1714092199);
        this.A00.mLoadingSpinner.setVisibility(0);
        C14030oh.A0A(465295986, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1816877375);
        A01((C24481is) obj);
        C14030oh.A0A(-2101972064, A03);
    }
}
