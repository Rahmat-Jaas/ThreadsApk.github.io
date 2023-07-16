package com.instagram.common.fragment.lifecyclelistener;

import X.AnonymousClass3HX;
import X.AnonymousClass3TR;
import X.C109326jp;
import X.C11630kW;
import X.C122047Jt;
import X.C127397h3;
import X.C130667qT;
import X.C19819BBt;
import X.C63893iY;
import X.C63913ic;
import X.C83474rR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;

public class IDxLListenerShape20S0300000_1_I2 extends C19819BBt {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLListenerShape20S0300000_1_I2(Fragment fragment, C11630kW r2, C83474rR r3, int i) {
        this.A03 = i;
        if (5 - i != 0) {
            this.A01 = r3;
            this.A02 = fragment;
        } else {
            this.A02 = r3;
            this.A01 = fragment;
        }
        this.A00 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        X.C63913ic.A0K(r3, r1, r0);
        X.C63913ic.A0R(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r1 = (X.C109326jp) r1;
        r0 = new java.lang.Object[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        ((X.C83474rR) r0).unregisterLifecycleListener(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0027;
                case 3: goto L_0x0005;
                case 4: goto L_0x0068;
                case 5: goto L_0x0081;
                case 6: goto L_0x00ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onActivityResult(r6, r7, r8)
        L_0x0008:
            return
        L_0x0009:
            r0 = 1
            if (r6 != r0) goto L_0x0008
            r0 = -1
            r2 = 0
            if (r7 != r0) goto L_0x005d
            if (r8 == 0) goto L_0x005d
            java.lang.String r0 = "status"
            java.lang.String r1 = r8.getStringExtra(r0)
            java.lang.String r0 = "success"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.Object r3 = r5.A00
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r1 = r5.A02
            goto L_0x0063
        L_0x0027:
            r0 = 1
            if (r6 != r0) goto L_0x0008
            r0 = -1
            r2 = 0
            if (r7 != r0) goto L_0x005d
            if (r8 == 0) goto L_0x005d
            java.lang.String r0 = "status"
            java.lang.String r1 = r8.getStringExtra(r0)
            java.lang.String r0 = "success"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "code"
            java.lang.String r2 = r8.getStringExtra(r0)
            java.lang.String r0 = "state"
            java.lang.String r0 = r8.getStringExtra(r0)
            java.lang.Object r3 = r5.A00
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r1 = r5.A02
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
        L_0x0056:
            X.C63913ic.A0K(r3, r1, r0)
            X.C63913ic.A0R(r3, r5)
            return
        L_0x005d:
            java.lang.Object r3 = r5.A00
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r1 = r5.A01
        L_0x0063:
            X.6jp r1 = (X.C109326jp) r1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            goto L_0x0056
        L_0x0068:
            r0 = 2884(0xb44, float:4.041E-42)
            if (r6 != r0) goto L_0x0008
            java.lang.Object r1 = r5.A02
            X.601 r1 = (X.AnonymousClass601) r1
            java.lang.Object r0 = r5.A01
            X.6jp r0 = (X.C109326jp) r0
            X.C59423Kt.A01(r8, r1, r0, r7)
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            r0.A0F(r5)
            return
        L_0x0081:
            r0 = 17
            if (r6 != r0) goto L_0x00ab
            r0 = 1797(0x705, float:2.518E-42)
            if (r7 != r0) goto L_0x00ab
            if (r8 == 0) goto L_0x00ab
            java.lang.String r0 = "media_image_url"
            android.os.Parcelable r4 = r8.getParcelableExtra(r0)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r1 = r5.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r0 = r5.A00
            X.0kW r0 = (X.C11630kW) r0
            android.os.Handler r3 = X.C18250wR.A08()
            X.4SD r2 = new X.4SD
            r2.<init>(r1, r0, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x00ab:
            java.lang.Object r0 = r5.A02
            goto L_0x00da
        L_0x00ae:
            r0 = 17
            if (r6 != r0) goto L_0x00d8
            r0 = 1797(0x705, float:2.518E-42)
            if (r7 != r0) goto L_0x00d8
            if (r8 == 0) goto L_0x00e0
            java.lang.String r0 = "media_image_url"
            android.os.Parcelable r4 = r8.getParcelableExtra(r0)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x00e0
            android.os.Handler r3 = X.C18250wR.A08()
            java.lang.Object r1 = r5.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r0 = r5.A00
            X.0kW r0 = (X.C11630kW) r0
            X.4SE r2 = new X.4SE
            r2.<init>(r1, r0, r4)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x00d8:
            java.lang.Object r0 = r5.A01
        L_0x00da:
            X.4rR r0 = (X.C83474rR) r0
            r0.unregisterLifecycleListener(r5)
            return
        L_0x00e0:
            java.lang.String r0 = "result data could not be null when payment guidance enabled"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroy() {
        Object obj;
        switch (this.A03) {
            case 0:
                C63893iY r1 = C63893iY.A01;
                AnonymousClass3HX r0 = (AnonymousClass3HX) this.A00;
                C122047Jt.A03(r0, (C127397h3) this.A01, r1, (C109326jp) this.A02);
                C63913ic.A0P(r0, this);
                return;
            case 4:
                ((BaseFragmentActivity) ((FragmentActivity) this.A00)).A0F(this);
                return;
            case 5:
                obj = this.A02;
                break;
            case 6:
                obj = this.A01;
                break;
            default:
                super.onDestroy();
                return;
        }
        ((C83474rR) obj).unregisterLifecycleListener(this);
    }

    public final void onDestroyView() {
        if (3 - this.A03 != 0) {
            super.onDestroyView();
            return;
        }
        ((BaseFragmentActivity) this.A01).BCa().A06((AnonymousClass3TR) this.A00);
        ((C130667qT) this.A02).A05(this);
    }

    public IDxLListenerShape20S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A00 = obj;
    }
}
