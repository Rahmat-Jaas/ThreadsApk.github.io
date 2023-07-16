package com.instagram.request;

import X.AnonymousClass0wJ;
import X.AnonymousClass366;
import X.AnonymousClass3EZ;
import X.AnonymousClass3XX;
import X.AnonymousClass9UH;
import X.C12560m7;
import X.C14030oh;
import X.C29251xd;
import X.C29261xe;
import X.C63293hC;
import java.util.ArrayList;

public class IDxDCallbackShape59S0200000_1_I2 extends AnonymousClass9UH {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape59S0200000_1_I2(C12560m7 r1, Object obj, Object obj2, int i) {
        super(r1);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A03;
        int i;
        if (this.A02 != 0) {
            A03 = C14030oh.A03(-819348962);
            C29261xe r2 = ((AnonymousClass3EZ) this.A01).A00;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C63293hC.A00(r2, A0v, 2131834837);
            r2.setItems(A0v);
            ((C29261xe) this.A00).A03.A03(false);
            i = -995576631;
        } else {
            A03 = C14030oh.A03(-736381650);
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            C29251xd r1 = ((AnonymousClass366) this.A01).A00;
            C63293hC.A00(r1, A0v2, 2131834837);
            r1.setItems(A0v2);
            r1.A01.A03(false);
            i = 2134033072;
        }
        C14030oh.A0A(i, A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: X.3hC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v139, resolved type: X.4MA} */
    /* JADX WARNING: type inference failed for: r11v8, types: [X.3aM] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f3, code lost:
        r3.add(r11);
        r15.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0373, code lost:
        r3.add(r11);
        r3.add(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r31) {
        /*
            r30 = this;
            r7 = r30
            r6 = r31
            int r0 = r7.A02
            if (r0 == 0) goto L_0x0105
            r0 = 1222473816(0x48dd7858, float:453570.75)
            int r5 = X.C14030oh.A03(r0)
            X.1Tx r6 = (X.C22231Tx) r6
            r0 = 286772993(0x1117cf01, float:1.1975588E-28)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r7.A00
            X.1xe r3 = (X.C29261xe) r3
            java.lang.Object r8 = r7.A01
            X.3EZ r8 = (X.AnonymousClass3EZ) r8
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "supervision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            r0 = 2131836426(0x7f113e0a, float:1.9306018E38)
            X.3hC r1 = new X.3hC
            r1.<init>((int) r0)
            r0 = 2131887416(0x7f120538, float:1.9409438E38)
            r1.A00 = r0
            r0 = 2131165201(0x7f070011, float:1.7944612E38)
            r1.A02 = r0
            r7.add(r1)
        L_0x0043:
            android.content.Context r13 = r3.getContext()
            java.util.List r0 = r6.A01
            java.util.Iterator r12 = r0.iterator()
        L_0x004d:
            boolean r0 = r12.hasNext()
            r4 = 1
            r11 = 0
            if (r0 == 0) goto L_0x039d
            java.lang.Object r10 = r12.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r10
            java.lang.Object r6 = r10.A00
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x004d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x006e
            X.C63273h9.A02(r7)
        L_0x006e:
            r9 = 0
            java.lang.Object r0 = r6.get(r11)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "toggle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "radio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r9 = r10.A06
            java.lang.String r0 = r10.A05
            X.3hu r1 = new X.3hu
            r1.<init>(r9, r0)
            r1.A0F = r11
            r1.A0H = r4
            r1.A0G = r11
            android.content.res.Resources r0 = X.AnonymousClass0wJ.A0B(r3)
            int r0 = X.C18250wR.A00(r0)
            r1.A03 = r0
            r7.add(r1)
            if (r13 == 0) goto L_0x00df
            boolean r0 = X.C09650fs.A02(r13)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r10.A02
            X.C29261xe.A0E(r0, r7)
            java.lang.String r9 = X.C29261xe.A0B(r8, r3, r6, r7)
        L_0x00b4:
            java.lang.String r6 = r10.A04
            if (r6 == 0) goto L_0x00cb
            java.lang.String r4 = r10.A03
            if (r4 == 0) goto L_0x00cb
            r0 = 16
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r1.<init>((java.lang.String) r4, (java.lang.Object) r3, (int) r0)
            X.3Xg r0 = new X.3Xg
            r0.<init>((java.lang.CharSequence) r6, (android.view.View.OnClickListener) r1)
            r7.add(r0)
        L_0x00cb:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "video_call"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004d
            int r0 = r7.size()
            r3.A00 = r0
            goto L_0x004d
        L_0x00df:
            java.lang.String r9 = X.C29261xe.A0B(r8, r3, r6, r7)
            java.lang.String r0 = r10.A02
            X.C29261xe.A0E(r0, r7)
            goto L_0x00b4
        L_0x00e9:
            if (r13 == 0) goto L_0x00fb
            boolean r0 = X.C09650fs.A02(r13)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r10.A02
            X.C29261xe.A0E(r0, r7)
            java.lang.String r9 = X.C29261xe.A0C(r8, r3, r6, r7)
            goto L_0x00cb
        L_0x00fb:
            java.lang.String r9 = X.C29261xe.A0C(r8, r3, r6, r7)
            java.lang.String r0 = r10.A02
            X.C29261xe.A0E(r0, r7)
            goto L_0x00cb
        L_0x0105:
            r0 = 259966524(0xf7ec63c, float:1.25613454E-29)
            int r5 = X.C14030oh.A03(r0)
            X.1Tx r6 = (X.C22231Tx) r6
            r0 = 1998853310(0x772414be, float:3.3279585E33)
            int r18 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r7.A00
            X.3Hd r4 = (X.C58773Hd) r4
            java.util.List r3 = r4.A07
            r3.clear()
            java.util.Set r15 = r4.A08
            r15.clear()
            android.content.Context r2 = r4.A02
            boolean r0 = X.C09660ft.A01(r2)
            if (r0 != 0) goto L_0x0175
            com.instagram.service.session.UserSession r9 = r4.A05
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36321279996861070(0x810a0300001a8e, double:3.033061951845765E-306)
            boolean r0 = X.C63803iN.A0E(r8, r9, r0)
            if (r0 == 0) goto L_0x0175
            X.3VR r0 = r4.A06
            X.0nS r1 = X.AnonymousClass3VR.A00(r0)
            java.lang.String r0 = "ig_push_notification_settings_banner"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1402(0x57a, float:1.965E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r8)
            if (r0 == 0) goto L_0x015c
            java.lang.String r1 = "impression"
            java.lang.String r0 = "event_type"
            r8.A0T(r0, r1)
            r8.Bb4()
        L_0x015c:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r8 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2
            r8.<init>()
            r0 = 2131836529(0x7f113e71, float:1.9306227E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02 = r0
            r1 = 0
            com.facebook.redex.IDxCallbackShape695S0100000_1_I2 r0 = new com.facebook.redex.IDxCallbackShape695S0100000_1_I2
            r0.<init>(r4, r1)
            r8.A03 = r0
            r3.add(r8)
        L_0x0175:
            java.util.List r0 = r6.A01
            java.util.Iterator r17 = r0.iterator()
            r29 = 0
        L_0x017d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.Object r8 = r17.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S6100000_I2) r8
            java.lang.String r1 = r8.A01
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "push_notifications"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a0
            java.lang.String r0 = "text_post_app_push_notifications"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a0
            goto L_0x017d
        L_0x01a0:
            java.lang.String r0 = "other_notification_types"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b8
            com.instagram.service.session.UserSession r10 = r4.A05
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r0 = 36313823933630153(0x81033b000006c9, double:3.0283467074353766E-306)
            boolean r0 = X.C63803iN.A0E(r9, r10, r0)
            if (r0 != 0) goto L_0x01b8
            goto L_0x017d
        L_0x01b8:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01c1
            X.C63273h9.A03(r3)
        L_0x01c1:
            boolean r0 = X.C09650fs.A02(r2)
            r9 = 1
            if (r0 == 0) goto L_0x01d0
            java.util.List r0 = r6.A01
            int r0 = r0.size()
            if (r0 <= r9) goto L_0x01d9
        L_0x01d0:
            java.lang.String r0 = r8.A06
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = ""
        L_0x01d6:
            X.C63613hu.A02(r0, r3)
        L_0x01d9:
            java.lang.Object r0 = r8.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r16 = r0.iterator()
        L_0x01e1:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r12 = r16.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r12
            java.lang.String r1 = r12.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case -868304044: goto L_0x02aa;
                case 1134485835: goto L_0x022b;
                case 1862666772: goto L_0x01f7;
                default: goto L_0x01f6;
            }
        L_0x01f6:
            goto L_0x01e1
        L_0x01f7:
            java.lang.String r0 = "navigation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e1
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "email_and_sms"
            boolean r0 = r1.equals(r0)
            java.lang.String r10 = r12.A04
            if (r0 == 0) goto L_0x021c
            r0 = 181(0xb5, float:2.54E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r11 = X.C18210wN.A0H(r4, r0)
            r8 = 0
            r1 = 0
            X.3aM r0 = new X.3aM
            r0.<init>((android.view.View.OnClickListener) r11, (java.lang.CharSequence) r10, (java.lang.String) r1, (boolean) r8)
            r3.add(r0)
            goto L_0x01e1
        L_0x021c:
            r0 = 193(0xc1, float:2.7E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r8 = X.C18200wM.A0R(r12, r4, r0)
            r1 = 0
            r0 = 0
            X.3aM r11 = new X.3aM
            r11.<init>((android.view.View.OnClickListener) r8, (java.lang.CharSequence) r10, (java.lang.String) r0, (boolean) r1)
            goto L_0x02f3
        L_0x022b:
            java.lang.String r0 = "time_range"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e1
            com.instagram.service.session.UserSession r0 = r4.A05
            r20 = r0
            androidx.fragment.app.Fragment r0 = r4.A04
            r21 = r0
            X.3VR r0 = r4.A06
            r19 = r0
            X.365 r14 = new X.365
            r14.<init>(r4)
            java.lang.String r13 = r12.A03
            if (r13 == 0) goto L_0x02a5
            java.lang.String r0 = "-"
            java.lang.String[] r8 = r13.split(r0)
            int r1 = r8.length
            r0 = 3
            if (r1 < r0) goto L_0x02a5
            r1 = r8[r9]
            r0 = 2
            r0 = r8[r0]
        L_0x0257:
            X.3F6 r10 = new X.3F6
            r10.<init>(r1, r0)
            r1 = 2131836811(0x7f113f8b, float:1.93068E38)
            X.3Y7 r0 = r10.A00
            java.lang.String r0 = X.AnonymousClass3Y7.A01(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r2, r0, r1)
            r8 = 0
            X.4MA r11 = X.AnonymousClass4MA.A01(r8, r0)
            r1 = 2131836815(0x7f113f8f, float:1.9306807E38)
            X.3Y7 r0 = r10.A01
            java.lang.String r0 = X.AnonymousClass3Y7.A01(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r2, r0, r1)
            X.4MA r0 = X.AnonymousClass4MA.A01(r8, r0)
            X.1xq r1 = new X.1xq
            r22 = r12
            r23 = r20
            r24 = r14
            r25 = r19
            r26 = r10
            r27 = r11
            r28 = r0
            r19 = r1
            r20 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.add(r1)
            if (r13 == 0) goto L_0x01e1
            java.lang.String r1 = "1"
            boolean r1 = r13.startsWith(r1)
            if (r1 == 0) goto L_0x01e1
            goto L_0x0373
        L_0x02a5:
            java.lang.String r1 = "21:00"
            java.lang.String r0 = "07:00"
            goto L_0x0257
        L_0x02aa:
            java.lang.String r0 = "toggle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e1
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "mute_all"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02fb
            java.lang.String r0 = "mute_all_but_dms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02fb
            java.lang.String r0 = "message_only_meta_toggle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e1
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r12.A00
            boolean r29 = r8.equals(r0)
            com.instagram.service.session.UserSession r13 = r4.A05
            androidx.fragment.app.Fragment r10 = r4.A04
            X.3VR r8 = r4.A06
            java.lang.String r12 = r12.A04
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r4.A03
            X.Cu6 r11 = new X.Cu6
            r24 = r10
            r25 = r13
            r26 = r8
            r27 = r12
            r28 = r1
            r21 = r11
            r22 = r2
            r23 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x02f3:
            r3.add(r11)
            r15.add(r11)
            goto L_0x01e1
        L_0x02fb:
            com.instagram.service.session.UserSession r10 = r4.A05
            androidx.fragment.app.Fragment r8 = r4.A04
            X.3VR r13 = r4.A06
            java.lang.Object r0 = r12.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x01e1
            java.lang.String r11 = r12.A04
            boolean r28 = r0.booleanValue()
            X.1tl r23 = X.AnonymousClass3WS.A01(r10)
            X.0gi r22 = X.C09820gj.A00
            X.1xp r0 = new X.1xp
            r24 = r10
            r25 = r13
            r26 = r11
            r27 = r1
            r19 = r0
            r20 = r2
            r21 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.add(r0)
            X.0TJ r11 = X.AnonymousClass0TJ.A05
            r0 = 36320360873858993(0x81092d000017b1, double:3.0324806947582405E-306)
            boolean r0 = X.C63803iN.A0E(r11, r10, r0)
            if (r0 != 0) goto L_0x033c
            boolean r0 = X.C63823iP.A0D(r10)
            if (r0 == 0) goto L_0x01e1
        L_0x033c:
            boolean r1 = X.C63823iP.A0E(r10)
            r0 = 2131833956(0x7f113464, float:1.9301009E38)
            if (r1 == 0) goto L_0x0348
            r0 = 2131833957(0x7f113465, float:1.930101E38)
        L_0x0348:
            java.lang.String r0 = r8.getString(r0)
            X.3hC r12 = new X.3hC
            r12.<init>((java.lang.CharSequence) r0)
            r0 = 2131833955(0x7f113463, float:1.9301007E38)
            java.lang.String r1 = r8.getString(r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r11 = 2131833972(0x7f113474, float:1.9301041E38)
            r13 = 192(0xc0, float:2.69E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r10, r8, r13)
            X.4MA r11 = X.AnonymousClass4MA.A00(r1, r11)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r10, r8, r13)
            r0.A03 = r1
            r3.add(r12)
        L_0x0373:
            r3.add(r11)
            r3.add(r0)
            goto L_0x01e1
        L_0x037b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r29)
            r4.A01(r0)
            java.lang.Object r0 = r7.A01
            X.366 r0 = (X.AnonymousClass366) r0
            X.1xd r0 = r0.A00
            r0.setItems(r3)
            X.3VR r1 = r0.A01
            r0 = 1
            r1.A03(r0)
            r1 = 1637770249(0x619e6409, float:3.6522423E20)
            r0 = r18
            X.C14030oh.A0A(r1, r0)
            r0 = 374266568(0x164edac8, float:1.6709583E-25)
            goto L_0x03e5
        L_0x039d:
            X.C63273h9.A02(r7)
            r6 = 2131821185(0x7f110281, float:1.9275106E38)
            r0 = 209(0xd1, float:2.93E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r3, r0)
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r6)
            r7.add(r0)
            android.content.Context r0 = X.C10600ic.A00
            java.lang.String r1 = X.C10170hq.A00(r0)
            java.lang.String r0 = "Instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e9
            r0 = 2131821186(0x7f110282, float:1.9275108E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x03c6:
            X.C63293hC.A02(r0, r7)
            X.1xe r0 = r8.A00
            r0.setItems(r7)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x03d7
            int r0 = r3.A00
            r3.scrollToPosition(r0)
        L_0x03d7:
            X.3VR r0 = r3.A03
            r0.A03(r4)
            r0 = -1254382009(0xffffffffb53ba647, float:-6.9904894E-7)
            X.C14030oh.A0A(r0, r2)
            r0 = 1424455195(0x54e7761b, float:7.9529514E12)
        L_0x03e5:
            X.C14030oh.A0A(r0, r5)
            return
        L_0x03e9:
            r0 = 2131821189(0x7f110285, float:1.9275114E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r3, r1, r0)
            goto L_0x03c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.request.IDxDCallbackShape59S0200000_1_I2.onSuccess(java.lang.Object):void");
    }
}
