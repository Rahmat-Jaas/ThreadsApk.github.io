package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.0y4  reason: invalid class name and case insensitive filesystem */
public final class C18890y4 extends BaseAdapter implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    public User A00;
    public final C11630kW A01;
    public final C23361de A02;
    public final C84694ti A03;
    public final UserSession A04;
    public final List A05;
    public final Map A06 = AnonymousClass0wJ.A0y();
    public final boolean A07;
    public final boolean A08;
    public final Integer A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getViewTypeCount() {
        return 5;
    }

    public final int getCount() {
        return this.A05.size() + this.A0A.size() + this.A0B.size() + this.A0C.size() + (C18240wQ.A1Y(this.A09, AnonymousClass006.A00) ? 1 : 0);
    }

    public final int getItemViewType(int i) {
        int size = this.A05.size();
        int size2 = this.A0A.size();
        int size3 = this.A0B.size();
        int size4 = this.A0C.size();
        if (i < size) {
            return 0;
        }
        int i2 = size + size2;
        if (i < i2) {
            return 1;
        }
        int i3 = i2 + size3;
        if (i < i3) {
            return 2;
        }
        if (i < i3 + size4) {
            return 3;
        }
        if (1 - this.A09.intValue() == 0) {
            return 4;
        }
        throw new UnsupportedOperationException("The add account button is hidden.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r1 != 4) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            if (r16 != 0) goto L_0x0016
            int r1 = r14.getItemViewType(r15)
            r2 = r17
            if (r1 == 0) goto L_0x02a2
            r0 = 1
            if (r1 == r0) goto L_0x02a2
            r0 = 2
            if (r1 == r0) goto L_0x02a2
            r0 = 3
            if (r1 == r0) goto L_0x029c
            r0 = 4
            if (r1 == r0) goto L_0x02a2
        L_0x0016:
            int r1 = r14.getItemViewType(r15)
            if (r1 == 0) goto L_0x00cb
            r0 = 1
            if (r1 == r0) goto L_0x02be
            r0 = 2
            if (r1 == r0) goto L_0x02e7
            r0 = 3
            if (r1 == r0) goto L_0x0071
            r0 = 4
            if (r1 != r0) goto L_0x0070
            java.lang.Object r6 = X.C18210wN.A0X(r16)
            X.3DG r6 = (X.AnonymousClass3DG) r6
            android.view.View r4 = r6.A02
            android.content.Context r5 = r4.getContext()
            android.widget.TextView r1 = r6.A06
            r0 = 2131821017(0x7f1101d9, float:1.9274765E38)
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = r6.A07
            r0 = 2131233542(0x7f080b06, float:1.8083224E38)
            X.C18180wK.A0r(r5, r3, r0)
            r2 = 0
            r3.setStrokeAlpha(r2)
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            X.C63393hP.A04(r5, r3, r0)
            r0 = 2130970542(0x7f0407ae, float:1.7549797E38)
            int r0 = X.C121907Is.A02(r5, r0)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r3.setBackground(r0)
            android.widget.ImageView r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
            r3.setVisibility(r2)
        L_0x0066:
            r0 = 16843534(0x101030e, float:2.369575E-38)
            int r0 = X.C121907Is.A02(r5, r0)
            r4.setBackgroundResource(r0)
        L_0x0070:
            return r16
        L_0x0071:
            java.lang.Object r4 = r14.getItem(r15)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r4
            java.lang.Object r7 = r16.getTag()
            X.3DG r7 = (X.AnonymousClass3DG) r7
            X.1de r3 = r14.A02
            X.0kW r5 = r14.A01
            if (r4 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0070
            java.lang.String r2 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            android.widget.TextView r0 = r7.A06
            r0.setText(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r7.A07
            r0 = 51
            r2.setStrokeAlpha(r0)
            if (r1 == 0) goto L_0x00c0
            r2.setUrl(r1, r5)
        L_0x009c:
            r8 = 0
            r2.setVisibility(r8)
            android.widget.TextView r0 = r7.A04
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.A05
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r7.A03
            r0.setVisibility(r1)
            com.instagram.igds.components.button.IgdsButton r1 = r7.A08
            X.AnonymousClass0SJ.A00(r1)
            r1.setVisibility(r8)
            r0 = 137(0x89, float:1.92E-43)
            X.AnonymousClass0wJ.A18(r1, r0, r3, r4)
            goto L_0x0286
        L_0x00c0:
            android.content.Context r1 = r2.getContext()
            r0 = 2131233606(0x7f080b46, float:1.8083354E38)
            X.C18180wK.A0r(r1, r2, r0)
            goto L_0x009c
        L_0x00cb:
            java.lang.Object r3 = r14.getItem(r15)
            r3.getClass()
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x0198
            java.util.Map r1 = r14.A06
            java.lang.String r0 = r3.getId()
            java.lang.Object r10 = r1.get(r0)
            X.17J r10 = (X.AnonymousClass17J) r10
        L_0x00e2:
            com.instagram.service.session.UserSession r5 = r14.A04
            X.0kW r6 = r14.A01
            java.lang.Object r7 = X.C18210wN.A0X(r16)
            X.3DG r7 = (X.AnonymousClass3DG) r7
            boolean r12 = r14.A07
            boolean r9 = r14.A08
            X.4ti r11 = r14.A03
            android.widget.TextView r1 = r7.A06
            android.content.Context r2 = r1.getContext()
            java.lang.String r0 = r3.BK7()
            com.instagram.common.typedurl.ImageUrl r4 = r3.B4M()
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r7.A07
            r0 = 51
            r1.setStrokeAlpha(r0)
            r1.setUrl(r4, r6)
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r0 = r7.A04
            r6 = 8
            r0.setVisibility(r6)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r5)
            boolean r8 = r3.equals(r0)
            r5 = 0
            if (r12 == 0) goto L_0x017b
            android.widget.ImageView r0 = r7.A03
            r0.setVisibility(r6)
        L_0x0128:
            java.lang.String r4 = ""
            if (r12 != 0) goto L_0x0255
            if (r8 != 0) goto L_0x0255
            if (r9 == 0) goto L_0x0257
            android.content.res.Resources r3 = r2.getResources()
            X.4EB r11 = (X.AnonymousClass4EB) r11
            X.C04220Ms.A0B(r3, r5)
            r9 = r4
            if (r10 == 0) goto L_0x0278
            java.util.List r1 = r10.A04
            if (r1 == 0) goto L_0x0278
            r0 = 10
            int r0 = X.C02260Al.A0z(r1, r0)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r10 = X.C18190wL.A0v(r0)
            java.util.Iterator r13 = r1.iterator()
        L_0x0152:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r12 = r13.next()
            X.17J r12 = (X.AnonymousClass17J) r12
            X.4rl r1 = r12.A03
            boolean r0 = r1 instanceof X.AnonymousClass4EA
            if (r0 == 0) goto L_0x016c
            X.4EA r1 = (X.AnonymousClass4EA) r1
            if (r1 == 0) goto L_0x016c
            X.2AP r2 = r1.A01
            if (r2 != 0) goto L_0x016e
        L_0x016c:
            X.2AP r2 = X.AnonymousClass2AP.A0P
        L_0x016e:
            int r1 = r12.A01
            int r0 = r12.A00
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r10.put(r2, r0)
            goto L_0x0152
        L_0x017b:
            if (r8 == 0) goto L_0x0193
            android.view.View r4 = r7.A02
            r1 = 1
            androidx.core.view.IDxDCompatShape5S0000000_2_I2 r0 = new androidx.core.view.IDxDCompatShape5S0000000_2_I2
            r0.<init>(r1)
            X.C006702y.A0C(r4, r0)
            android.widget.ImageView r1 = r7.A03
            android.graphics.drawable.Drawable r0 = r7.A00
        L_0x018c:
            r1.setImageDrawable(r0)
            r1.setVisibility(r5)
            goto L_0x0128
        L_0x0193:
            android.widget.ImageView r1 = r7.A03
            android.graphics.drawable.Drawable r0 = r7.A01
            goto L_0x018c
        L_0x0198:
            r10 = 0
            goto L_0x00e2
        L_0x019b:
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            java.util.Iterator r12 = X.C18190wL.A0u(r10)
        L_0x01a3:
            boolean r0 = r12.hasNext()
            r13 = 1
            if (r0 == 0) goto L_0x01c8
            java.util.Map$Entry r1 = X.C18180wK.A0o(r12)
            java.util.Map r10 = r11.A02
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r0 <= 0) goto L_0x01a3
            X.C18210wN.A1Q(r2, r1)
            goto L_0x01a3
        L_0x01c8:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0278
            java.util.List r0 = r11.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x01d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r12 = r1.next()
            boolean r0 = r2.containsKey(r12)
            if (r0 == 0) goto L_0x01d4
            if (r12 == 0) goto L_0x0278
            java.lang.Object r10 = r2.get(r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0278
            int r1 = r10.intValue()
            java.util.Map r0 = r11.A02
            java.lang.Object r0 = r0.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0278
            int r9 = r0.intValue()
            java.util.Collection r0 = r2.values()
            int r2 = -r1
            java.util.Iterator r12 = r0.iterator()
        L_0x0209:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r12.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r2 = r2 + r0
            goto L_0x0209
        L_0x0219:
            java.lang.String r9 = X.C18230wP.A0j(r3, r10, r9, r1)
            X.C04220Ms.A06(r9)
            if (r2 <= 0) goto L_0x0278
            java.lang.Integer r0 = r11.A00
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0247
            r0 = 2131689685(0x7f0f00d5, float:1.9008392E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0m(r3, r2, r0)
            X.C04220Ms.A06(r2)
            r1 = 2131821332(0x7f110314, float:1.9275404E38)
            java.lang.Object[] r0 = X.C18220wO.A1X()
            r0[r5] = r9
        L_0x023d:
            r0[r13] = r2
            java.lang.String r9 = r3.getString(r1, r0)
            X.C04220Ms.A06(r9)
            goto L_0x0278
        L_0x0247:
            r1 = 2131821331(0x7f110313, float:1.9275402E38)
            java.lang.Object[] r0 = X.C18220wO.A1X()
            r0[r5] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x023d
        L_0x0255:
            r9 = r4
            goto L_0x0278
        L_0x0257:
            int r0 = r3.A01()
            r9 = r4
            if (r0 <= 0) goto L_0x0278
            com.google.common.collect.ImmutableMap r1 = r3.A07()
            if (r1 == 0) goto L_0x0278
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0278
            int r0 = r3.A01()
            java.lang.CharSequence r0 = X.AnonymousClass3RW.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x0278
            java.lang.String r9 = r0.toString()
        L_0x0278:
            boolean r1 = X.AnonymousClass0hA.A08(r9)
            android.widget.TextView r0 = r7.A05
            if (r1 == 0) goto L_0x028f
            r0.setText(r4)
            r0.setVisibility(r6)
        L_0x0286:
            android.view.View r4 = r7.A02
            if (r8 == 0) goto L_0x0296
            r0 = 0
            r4.setBackground(r0)
            return r16
        L_0x028f:
            r0.setText(r9)
            r0.setVisibility(r5)
            goto L_0x0286
        L_0x0296:
            android.content.Context r5 = r4.getContext()
            goto L_0x0066
        L_0x029c:
            android.view.View r16 = X.AnonymousClass2RO.A00(r2)
            goto L_0x0016
        L_0x02a2:
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            android.view.View r16 = X.AnonymousClass2RO.A00(r2)
            java.lang.Object r1 = r16.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.multipleaccounts.adapter.UserAccountsRowViewHolder"
            X.C04220Ms.A0C(r1, r0)
            X.3DG r1 = (X.AnonymousClass3DG) r1
            com.instagram.igds.components.button.IgdsButton r1 = r1.A08
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0016
        L_0x02be:
            java.lang.Object r2 = r14.getItem(r15)
            r2.getClass()
            X.3H7 r2 = (X.AnonymousClass3H7) r2
            java.lang.Object r3 = X.C18210wN.A0X(r16)
            X.3DG r3 = (X.AnonymousClass3DG) r3
            X.0kW r6 = r14.A01
            boolean r5 = r14.A07
            android.widget.TextView r1 = r3.A06
            java.lang.String r0 = r2.A01()
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r3.A07
            r0 = 51
            r4.setStrokeAlpha(r0)
            X.37A r0 = r2.A00
            com.instagram.user.model.MicroUserDict r0 = r0.A01
            r2 = 0
            goto L_0x0314
        L_0x02e7:
            java.lang.Object r7 = r14.getItem(r15)
            r7.getClass()
            X.3FU r7 = (X.AnonymousClass3FU) r7
            java.lang.Object r3 = X.C18210wN.A0X(r16)
            X.3DG r3 = (X.AnonymousClass3DG) r3
            X.0kW r6 = r14.A01
            boolean r5 = r14.A07
            android.widget.TextView r1 = r3.A06
            com.instagram.user.model.MicroUserDict r0 = r7.A00
            r2 = 0
            X.C04220Ms.A0B(r0, r2)
            java.lang.String r0 = r0.A0F
            if (r0 != 0) goto L_0x0308
            java.lang.String r0 = ""
        L_0x0308:
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r3.A07
            r0 = 51
            r4.setStrokeAlpha(r0)
            com.instagram.user.model.MicroUserDict r0 = r7.A00
        L_0x0314:
            X.C04220Ms.A0B(r0, r2)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            if (r0 == 0) goto L_0x032b
            r4.setUrl(r0, r6)
        L_0x031e:
            r4.setVisibility(r2)
            if (r5 == 0) goto L_0x0336
            android.widget.ImageView r1 = r3.A03
            r0 = 8
            r1.setVisibility(r0)
            return r16
        L_0x032b:
            android.content.Context r1 = r4.getContext()
            r0 = 2131233606(0x7f080b46, float:1.8083354E38)
            X.C18180wK.A0r(r1, r4, r0)
            goto L_0x031e
        L_0x0336:
            android.widget.TextView r1 = r3.A04
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r3.A03
            r1.setVisibility(r2)
            android.graphics.drawable.Drawable r0 = r3.A01
            r1.setImageDrawable(r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18890y4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onItemClick(android.widget.AdapterView r22, android.view.View r23, int r24, long r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r24
            int r2 = r1.getItemViewType(r0)
            if (r2 == 0) goto L_0x016f
            r15 = 1
            if (r2 == r15) goto L_0x00fc
            r3 = 2
            if (r2 == r3) goto L_0x00b9
            r0 = 3
            if (r2 == r0) goto L_0x002f
            r0 = 4
            if (r2 == r0) goto L_0x0030
            com.instagram.service.session.UserSession r3 = r1.A04
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Class<X.3SC> r2 = X.AnonymousClass3SC.class
            r1 = 29
            kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67 r0 = new kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.3SC r0 = (X.AnonymousClass3SC) r0
            X.4nK r0 = r0.A00
        L_0x002d:
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x002f:
            return
        L_0x0030:
            X.1de r3 = r1.A02
            androidx.fragment.app.FragmentActivity r5 = r3.getActivity()
            if (r5 == 0) goto L_0x0080
            com.instagram.service.session.UserSession r4 = r3.A03
            X.0BO r2 = r4.multipleAccountHelper
            r7 = 0
            java.lang.String r0 = r3.A04
            X.0R6 r6 = r2.A0C(r5, r4, r0, r7)
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x008f
            com.instagram.service.session.UserSession r0 = r3.A03
            boolean r0 = X.AnonymousClass3WW.A02(r0)
            if (r0 == 0) goto L_0x0085
            X.DrH r4 = X.C18220wO.A0b(r5)
            if (r4 == 0) goto L_0x0080
            com.instagram.service.session.UserSession r0 = r3.A03
            X.0nS r2 = X.C13330nS.A02(r0)
            java.lang.String r0 = "account_switch_add_account_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 3
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r3.A04
            X.C18210wN.A1B(r2, r0)
            r2.Bb4()
        L_0x0074:
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r3)
            com.instagram.ui.bottomsheet.intf.IDxCListenerShape36S0300000_1_I2 r0 = new com.instagram.ui.bottomsheet.intf.IDxCListenerShape36S0300000_1_I2
            r0.<init>(r15, r5, r2, r3)
            r4.A0A(r0)
        L_0x0080:
            X.C23361de.A01(r3)
            goto L_0x018a
        L_0x0085:
            X.3YR r4 = X.AnonymousClass3YR.A00
            com.instagram.service.session.UserSession r2 = r3.A03
            android.os.Bundle r0 = r6.A00
            r4.A03(r5, r0, r2, r7)
            goto L_0x0080
        L_0x008f:
            com.instagram.service.session.UserSession r0 = r3.A03
            boolean r0 = X.AnonymousClass2RP.A00(r0)
            if (r0 != 0) goto L_0x0080
            com.instagram.service.session.UserSession r0 = r3.A03
            X.0nS r2 = X.C13330nS.A02(r0)
            java.lang.String r0 = "account_switcher_max_limit_reached"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 7
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r3.A04
            X.C18210wN.A1B(r2, r0)
            java.lang.String r0 = "account_switch_fragment"
            X.C18210wN.A1C(r2, r0)
            goto L_0x0080
        L_0x00b9:
            java.lang.Object r2 = r1.getItem(r0)
            X.3FU r2 = (X.AnonymousClass3FU) r2
            if (r2 == 0) goto L_0x002f
            X.1de r6 = r1.A02
            X.C23361de.A01(r6)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r9 = r0.A05(r6)
            android.app.Activity r0 = r6.getRootActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.4Dh r8 = new X.4Dh
            r8.<init>(r0)
            X.265 r10 = X.AnonymousClass265.A0Z
            com.instagram.user.model.MicroUserDict r1 = r2.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.String r0 = r1.A0F
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = ""
        L_0x00e5:
            java.lang.String r14 = r2.A00()
            com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2 r5 = new com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2
            r7 = r6
            r11 = r2
            r12 = r6
            r13 = r0
            r15 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.content.Context r4 = r6.A00
            java.lang.String r3 = r2.A01
            java.lang.String r1 = r2.A00()
            goto L_0x0164
        L_0x00fc:
            java.lang.Object r11 = r1.getItem(r0)
            X.3H7 r11 = (X.AnonymousClass3H7) r11
            if (r11 == 0) goto L_0x002f
            X.1de r6 = r1.A02
            java.lang.String r1 = r11.A01()
            r0 = 0
            X.C23361de.A02(r6, r1, r15, r0)
            X.C23361de.A01(r6)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r9 = r0.A05(r6)
            android.app.Activity r0 = r6.getRootActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.4Dh r8 = new X.4Dh
            r8.<init>(r0)
            X.265 r10 = X.AnonymousClass265.A0Z
            java.lang.String r13 = r11.A01()
            java.lang.String r14 = r11.A00()
            com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2 r5 = new com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2
            r7 = r6
            r12 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.instagram.service.session.UserSession r0 = r6.A03
            java.lang.String r4 = "account_switch_fragment"
            java.lang.String r3 = r11.A00()
            X.0nS r1 = X.C13330nS.A02(r0)
            java.lang.String r0 = "ig_one_login_deferred_login_initiated"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1391(0x56f, float:1.949E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "containermodule"
            r2.A0T(r0, r4)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r3)
            java.lang.String r0 = "account_id"
            r2.A0S(r0, r1)
            r2.Bb4()
            android.content.Context r4 = r6.A00
            java.lang.String r3 = r11.A02
            java.lang.String r1 = r11.A00()
        L_0x0164:
            r0 = 0
            X.H8c r0 = X.C63883iV.A04(r4, r9, r3, r1, r0)
            r0.A00 = r5
            X.C31155GhB.A03(r0)
            return
        L_0x016f:
            java.lang.Object r4 = r1.getItem(r0)
            r4.getClass()
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.user.model.User r0 = r1.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01a5
            X.1de r3 = r1.A02
            java.lang.String r2 = r4.BK7()
            r0 = 1
            X.C23361de.A02(r3, r2, r0, r0)
        L_0x018a:
            com.instagram.service.session.UserSession r3 = r1.A04
        L_0x018c:
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Class<X.3SC> r2 = X.AnonymousClass3SC.class
            r1 = 29
            kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67 r0 = new kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.3SC r0 = (X.AnonymousClass3SC) r0
            X.4nK r0 = r0.A00
            monitor-enter(r0)
            monitor-exit(r0)
            goto L_0x002d
        L_0x01a5:
            com.instagram.service.session.UserSession r3 = r1.A04
            X.44a r8 = X.AnonymousClass3NS.A00(r3)
            X.2AP r2 = X.AnonymousClass2AP.A04
            int r0 = r4.A01()
            X.17J r11 = new X.17J
            r11.<init>(r2, r0)
            X.25R r10 = X.AnonymousClass25R.A02
            X.25P r9 = X.AnonymousClass25P.A04
            java.lang.String r2 = r4.getId()
            java.lang.String r0 = "badge_user_id"
            java.util.Map r14 = java.util.Collections.singletonMap(r0, r2)
            X.AnonymousClass0wJ.A1O(r10, r9)
            java.lang.String r13 = "click"
            r12 = 0
            X.C684944a.A00(r8, r9, r10, r11, r12, r13, r14)
            X.1de r8 = r1.A02
            java.lang.String r2 = r4.BK7()
            r0 = 0
            r7 = 1
            X.C23361de.A02(r8, r2, r0, r7)
            com.instagram.service.session.UserSession r6 = r8.A03
            X.C04220Ms.A0B(r6, r0)
            X.44a r0 = X.AnonymousClass3NS.A00(r6)
            X.4sh r0 = r0.A00
            r0.AD8()
            int r5 = r4.A01()
            X.2AP r2 = X.AnonymousClass2AP.A03
            X.17J r0 = new X.17J
            r0.<init>(r2, r12, r5, r5)
            X.44a r14 = X.AnonymousClass3NS.A00(r6)
            X.25R r16 = X.AnonymousClass25R.A05
            java.lang.Integer r18 = X.AnonymousClass006.A0C
            r15 = r9
            r19 = r13
            r20 = r12
            r17 = r0
            X.C684944a.A00(r14, r15, r16, r17, r18, r19, r20)
            com.instagram.service.session.UserSession r2 = r8.A03
            X.0BO r9 = r2.multipleAccountHelper
            android.content.Context r0 = r8.A00
            if (r0 == 0) goto L_0x018c
            boolean r0 = r9.A0N(r0, r2, r4)
            if (r0 == 0) goto L_0x018c
            android.content.Context r6 = r8.A00
            com.instagram.service.session.UserSession r5 = r8.A03
            java.lang.String r2 = r8.A04
            android.content.Intent r0 = r8.A01
            r10 = r6
            r11 = r0
            r12 = r5
            r13 = r4
            r14 = r2
            r9.A0H(r10, r11, r12, r13, r14)
            r1.A00 = r4
            X.C04220Ms.A0B(r3, r7)
            com.instagram.api.schemas.XFBFXIGPCEntryPoint r1 = com.instagram.api.schemas.XFBFXIGPCEntryPoint.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2     // Catch:{ Exception -> 0x0236 }
            r0.<init>((com.instagram.api.schemas.XFBFXIGPCEntryPoint) r1)     // Catch:{ Exception -> 0x0236 }
            X.H8c r0 = X.AnonymousClass2D0.A00(r0, r3)     // Catch:{ Exception -> 0x0236 }
            X.C31155GhB.A03(r0)     // Catch:{ Exception -> 0x0236 }
            goto L_0x018c
        L_0x0236:
            r0 = move-exception
            X.C63003bJ.A01(r3, r1, r0)
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18890y4.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public C18890y4(C11630kW r3, C23361de r4, UserSession userSession, Integer num, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3) {
        Integer num2;
        this.A04 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = list;
        this.A09 = num;
        this.A0A = list2;
        this.A0B = list3;
        this.A0C = list4;
        this.A00 = AnonymousClass0wJ.A0Y(userSession);
        this.A07 = z;
        this.A08 = z2;
        if (z3) {
            num2 = AnonymousClass006.A01;
        } else {
            num2 = AnonymousClass006.A00;
        }
        this.A03 = new AnonymousClass4EB(num2);
    }

    public final Object getItem(int i) {
        List list;
        int i2;
        int i3;
        List list2;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    list = this.A0B;
                    i3 = this.A05.size();
                    list2 = this.A0A;
                } else if (itemViewType != 3) {
                    return null;
                } else {
                    list = this.A0C;
                    i3 = this.A05.size() + this.A0A.size();
                    list2 = this.A0B;
                }
                i2 = i3 + list2.size();
            } else {
                list = this.A0A;
                i2 = this.A05.size();
            }
            i -= i2;
        } else {
            list = this.A05;
        }
        return list.get(i);
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        Bitmap createBitmap;
        Icon createWithResource;
        if (getItem(i) == null) {
            return false;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C23361de r5 = this.A02;
            User user = (User) getItem(i);
            View requireViewById = view.requireViewById(R.id.row_user_imageview);
            requireViewById.setDrawingCacheEnabled(true);
            if (requireViewById.getDrawingCache() == null) {
                createBitmap = null;
            } else {
                Bitmap drawingCache = requireViewById.getDrawingCache();
                C13760oG.A00(drawingCache);
                createBitmap = Bitmap.createBitmap(drawingCache);
            }
            requireViewById.setDrawingCacheEnabled(false);
            Context context = r5.A00;
            String id = user.getId();
            String BK7 = user.BK7();
            C04220Ms.A0B(context, 0);
            AnonymousClass0wJ.A1M(id, 1, BK7);
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, AnonymousClass00U.A0M("'pinned_account_shortcut_", id, '\''));
                if (createBitmap != null) {
                    createWithResource = Icon.createWithAdaptiveBitmap(createBitmap);
                } else {
                    createWithResource = Icon.createWithResource(context, R.drawable.profile_anonymous_user);
                }
                ShortcutInfo.Builder icon = builder.setIcon(createWithResource);
                Intent A052 = C18250wR.A05("android.intent.action.VIEW");
                A052.setData(C18220wO.A0F(C18220wO.A0D().authority("mainfeed").appendQueryParameter("app_shortcut", "true").appendQueryParameter("user_id", id), C61943Wl.A00(), BK7));
                ShortcutInfo build = icon.setIntent(A052).setShortLabel(BK7).setLongLabel(BK7).build();
                C04220Ms.A06(build);
                try {
                    shortcutManager.requestPinShortcut(build, (IntentSender) null);
                } catch (IllegalStateException unused) {
                    C10450iM.A04("DedicatedPinnedShortcut", "IllegalStateException when requestPinShortcut", 1);
                }
            }
            C08350dD A002 = C08360dF.A00();
            AnonymousClass0wJ.A12(C18220wO.A0B(A002), "long_press_account_switcher_row_to_create_shortcut_last_timestamp", System.currentTimeMillis());
            return true;
        } else if (itemViewType != 1 && itemViewType != 2) {
            return false;
        } else {
            C23361de r0 = this.A02;
            C63813iO.A01(r0.A00, AnonymousClass0wJ.A0B(r0).getText(2131824574));
            return true;
        }
    }
}
