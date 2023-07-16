package X;

import android.view.ViewStub;
import com.facebook.redex.IDxIListenerShape289S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3Fq  reason: invalid class name and case insensitive filesystem */
public final class C58443Fq {
    public IgTextView A00;
    public IgTextView A01;
    public final C19577Ayd A02;
    public final Set A03 = new LinkedHashSet();
    public final AnonymousClass0ZU A04;

    public C58443Fq(ViewStub viewStub, AnonymousClass0ZU r5) {
        C04220Ms.A0B(viewStub, 1);
        viewStub.setLayoutResource(R.layout.metadata_shopping_product_tagging);
        C19577Ayd ayd = new C19577Ayd(viewStub);
        this.A02 = ayd;
        ayd.A02 = new IDxIListenerShape289S0100000_1_I2(this, 0);
        this.A04 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r8, com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r9, com.instagram.service.session.UserSession r10) {
        /*
            r7 = this;
            r3 = 0
            r2 = 1
            X.C04220Ms.A0B(r10, r2)
            r1 = 8
            java.lang.String r6 = "secondaryText"
            if (r9 == 0) goto L_0x0085
            java.util.List r0 = r9.A01()
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 == 0) goto L_0x0071
            java.util.List r0 = r9.A01()
            int r5 = r0.size()
            com.instagram.common.ui.base.IgTextView r4 = r7.A01
            if (r4 == 0) goto L_0x008d
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131689671(0x7f0f00c7, float:1.9008364E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r5, r0)
        L_0x002c:
            r4.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r7.A01
            if (r0 == 0) goto L_0x008d
            r0.setVisibility(r3)
        L_0x0036:
            X.3i9 r0 = X.C63703i9.A00
            android.content.SharedPreferences r1 = X.C63703i9.A00(r0, r10)
            java.lang.String r0 = "has_shown_igtv_shopping_creation_tooltip"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0070
            r0 = 2131828912(0x7f1120b0, float:1.9290778E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r8, r0)
            X.Dnn r1 = X.AnonymousClass4DS.A01(r8, r0)
            com.instagram.common.ui.base.IgTextView r0 = r7.A00
            java.lang.String r6 = "primaryText"
            if (r0 == 0) goto L_0x008d
            X.C18250wR.A0r(r0, r1)
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.A00 = r0
            r1.A0D = r2
            X.DvM r0 = r1.A00()
            com.instagram.common.ui.base.IgTextView r3 = r7.A00
            if (r3 == 0) goto L_0x008d
            X.4SK r2 = new X.4SK
            r2.<init>(r8, r0, r10)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x0070:
            return
        L_0x0071:
            java.lang.String r0 = r9.A01
            if (r0 == 0) goto L_0x0085
            com.instagram.common.ui.base.IgTextView r4 = r7.A01
            if (r4 == 0) goto L_0x008d
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131689669(0x7f0f00c5, float:1.900836E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r2, r0)
            goto L_0x002c
        L_0x0085:
            com.instagram.common.ui.base.IgTextView r0 = r7.A01
            if (r0 == 0) goto L_0x008d
            r0.setVisibility(r1)
            goto L_0x0036
        L_0x008d:
            X.C04220Ms.A0E(r6)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58443Fq.A00(android.app.Activity, com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, com.instagram.service.session.UserSession):void");
    }
}
