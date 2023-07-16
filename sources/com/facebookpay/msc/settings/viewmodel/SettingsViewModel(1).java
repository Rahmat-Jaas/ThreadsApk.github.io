package com.facebookpay.msc.settings.viewmodel;

import X.AnonymousClass006;
import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5iB;
import X.AnonymousClass5iL;
import X.AnonymousClass5iR;
import X.AnonymousClass5k7;
import X.AnonymousClass67Q;
import X.AnonymousClass69Q;
import X.AnonymousClass6IH;
import X.AnonymousClass7BK;
import X.AnonymousClass7E5;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass7R8;
import X.AnonymousClass8H6;
import X.AnonymousClass8N2;
import X.C04220Ms;
import X.C04530Oa;
import X.C114986uF;
import X.C121177En;
import X.C121187Eo;
import X.C121277Fh;
import X.C121777Ib;
import X.C128047iG;
import X.C128097is;
import X.C128377jT;
import X.C143588gz;
import X.C143688h9;
import X.C146928n6;
import X.C146998nD;
import X.C18220wO;
import X.C30821GXg;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92375iF;
import X.C92385iG;
import X.C92465iX;
import X.M5J;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.pando.TreeJNI;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class SettingsViewModel extends ListSectionWithFeSelectorViewModel implements C143588gz {
    public C128377jT A00;
    public AnonymousClass7Kx A01 = AnonymousClass7Kx.A09((Object) null);
    public AnonymousClass7Kx A02 = AnonymousClass7Kx.A09((Object) null);
    public AnonymousClass7Kx A03 = AnonymousClass7Kx.A09((Object) null);
    public AnonymousClass7Kx A04 = AnonymousClass7Kx.A09((Object) null);
    public AnonymousClass7Kx A05 = AnonymousClass7Kx.A09((Object) null);
    public AnonymousClass7Kx A06 = AnonymousClass7Kx.A09((Object) null);
    public final C880756q A07 = C880756q.A01();
    public final C04530Oa A08 = AnonymousClass0OY.A02(AnonymousClass8H6.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(C121177En r3) {
        super(r3);
        C04220Ms.A0B(r3, 1);
    }

    public static final void A02(SettingsViewModel settingsViewModel, String str) {
        SettingsViewModel settingsViewModel2 = settingsViewModel;
        settingsViewModel.A00 = null;
        A01(settingsViewModel, "fetch_init");
        A03(settingsViewModel2, "client_fetch_payouthub_init", (String) null, (String) null, "PAY_FINANCIAL_ENTITY", (String) null, (String) null, (String) null, 118);
        C880756q r5 = settingsViewModel2.A07;
        Object value = settingsViewModel2.A08.getValue();
        Integer num = AnonymousClass006.A00;
        M5J A002 = AnonymousClass5k7.A00(new IDxFunctionShape17S1200000_2_I2((Object) num, value, str, 5), AnonymousClass7Kz.A0C());
        C04220Ms.A06(A002);
        C121277Fh.A02(A002, r5, C86114wI.A0Q(settingsViewModel2, 112));
    }

    public static final void A04(ImmutableList.Builder builder, int i) {
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(0);
        C92375iF A003 = C92375iF.A00();
        C121777Ib.A02(C128097is.A00(new Object[0], i), A003, AnonymousClass69Q.A19);
        C121187Eo r4 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r4.A05 = true;
        AnonymousClass7E5.A00(r4, A003);
        builder.add((Object) AnonymousClass5iL.A00(A002, A003));
    }

    public final void BQK(NotificationsViewModel notificationsViewModel) {
        C04220Ms.A0B(notificationsViewModel, 0);
        notificationsViewModel.A04(C30821GXg.A01(this.A03, AnonymousClass8N2.A00));
        C880856r.A05(notificationsViewModel.A06, this.A07, this, 114);
        C880856r.A05(notificationsViewModel.A08, this.A03, this, 115);
    }

    public static /* synthetic */ void A03(SettingsViewModel settingsViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String A0r;
        String str8 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) == 0) {
            str8 = str7;
        }
        C143688h9 A082 = AnonymousClass7Kz.A08();
        HashMap A002 = AnonymousClass6IH.A00(settingsViewModel.A09());
        TreeJNI A0N = C86144wL.A0N(settingsViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A002);
        C86134wK.A1M("settings", str2, A002);
        if (str3 != null) {
            A002.put("target_url", str3);
        }
        if (str4 != null) {
            A002.put("endpoint", str4);
        }
        if (str5 != null) {
            A002.put("error_message", str5);
        }
        if (str6 != null) {
            A002.put("error_stacktrace", str6);
        }
        if (str8 != null) {
            A002.put("exception_class", str8);
        }
        A082.Bb8(str, A002);
    }

    private final void A05(ImmutableList.Builder builder, Integer num, String str, String str2, int i) {
        AnonymousClass5iR A002 = AnonymousClass5iR.A00(11);
        AnonymousClass5iB r2 = new AnonymousClass5iB();
        r2.A00 = new C128047iG(0);
        r2.A01 = new C121777Ib((C146998nD) null, C128097is.A00(new Object[0], 2131835591), AnonymousClass69Q.A0y);
        r2.A00 = new AnonymousClass7R8(this, str, str2);
        C121187Eo r6 = new C121187Eo((C146928n6) null, (C146928n6) null, (Integer) null, StringTreeSet.MAX_SYMBOL_COUNT, false, false, false);
        r6.A02 = AnonymousClass006.A01;
        C121187Eo.A00(r6, new Object[0], 2131835591);
        r6.A00 = C128097is.A00(new Object[0], i);
        r6.A04 = true;
        AnonymousClass7E5.A00(r6, r2);
        if (num != null) {
            r2.A02 = Integer.valueOf(num.intValue());
        }
        A002.A05 = new C92385iG(r2);
        A002.A02 = 1;
        C92465iX.A01(A002, builder);
    }

    @OnLifecycleEvent(AnonymousClass060.ON_RESUME)
    public final void onResume(AnonymousClass066 r5) {
        TreeJNI A0N;
        String A0r;
        Object A082 = this.A06.A08();
        if ((A082 == AnonymousClass67Q.SUCCESS || A082 == AnonymousClass67Q.ERROR) && (A0N = C86144wL.A0N(this)) != null && (A0r = C86144wL.A0r(A0N)) != null) {
            AnonymousClass7Kz.A06();
            MarkerEditor A032 = AnonymousClass7Kz.A03("on_resume", 667749724, 0);
            A032.annotate("financial_entity_id", A0r);
            A032.markerEditingCompleted();
            A02(this, A0r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0488, code lost:
        r8 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0566, code lost:
        r6 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c9, code lost:
        r11 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a6, code lost:
        r9 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.facebookpay.msc.settings.viewmodel.SettingsViewModel r32) {
        /*
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            r3 = r32
            X.5iR r0 = r3.A08()
            X.C92465iX.A01(r0, r2)
            X.7jT r0 = r3.A00
            if (r0 == 0) goto L_0x0014
            r2.add((java.lang.Object) r0)
        L_0x0014:
            r0 = 2131832348(0x7f112e1c, float:1.9297747E38)
            A04(r2, r0)
            r0 = 15
            X.5iR r11 = X.AnonymousClass5iR.A00(r0)
            X.5iC r7 = new X.5iC
            r7.<init>()
            r0 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r0 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r5 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            X.7iJ r1 = new X.7iJ
            r1.<init>(r4, r15, r10, r9)
            r7.A01 = r1
            r7.A03 = r0
            X.5iH r6 = new X.5iH
            r6.<init>(r7)
            r4 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.A04 = r6
            r11.A01 = r0
            r11.A00 = r1
            X.5iF r7 = X.C92375iF.A00()
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 2131832351(0x7f112e1f, float:1.9297753E38)
            X.7is r6 = X.C128097is.A00(r6, r1)
            X.69Q r19 = X.AnonymousClass69Q.A19
            r1 = r19
            X.C121777Ib.A02(r6, r7, r1)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 2131832350(0x7f112e1e, float:1.9297751E38)
            X.7is r6 = X.C128097is.A00(r6, r1)
            X.69Q r1 = X.AnonymousClass69Q.A0z
            X.5iL r6 = X.C121777Ib.A00(r6, r7, r1)
            r11.A05 = r6
            r11.A02 = r5
            X.7iF r6 = new X.7iF
            r6.<init>()
            r11.A01 = r6
            r24 = 127(0x7f, float:1.78E-43)
            X.7Eo r8 = new X.7Eo
            r20 = r8
            r21 = r4
            r22 = r4
            r23 = r4
            r25 = r0
            r26 = r0
            r27 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131832349(0x7f112e1d, float:1.929775E38)
            X.C121187Eo.A00(r8, r7, r6)
            X.AnonymousClass7E5.A01(r8, r11, r2)
            X.7Kx r7 = r3.A04
            boolean r6 = X.AnonymousClass7Kx.A0R(r7)
            if (r6 == 0) goto L_0x0208
            java.lang.Object r8 = r7.A01
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            java.lang.String r21 = "Required value was null."
            if (r8 == 0) goto L_0x01bb
            java.lang.Class<com.facebook.graphql.impls.PayoutMethodsFragmentImpl$PayoutInfo> r7 = com.facebook.graphql.impls.PayoutMethodsFragmentImpl.PayoutInfo.class
            java.lang.String r6 = "payout_info"
            com.google.common.collect.ImmutableList r6 = r8.getTreeList(r6, r7)
            if (r6 == 0) goto L_0x01bb
            X.83w r20 = r6.iterator()
        L_0x00bc:
            boolean r6 = r20.hasNext()
            if (r6 == 0) goto L_0x01bb
            java.lang.Object r14 = r20.next()
            com.facebook.pando.TreeJNI r14 = (com.facebook.pando.TreeJNI) r14
            java.lang.String r13 = "bank_name"
            java.lang.String r6 = r14.getStringValue(r13)
            if (r6 == 0) goto L_0x00d6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0154
        L_0x00d6:
            java.lang.String r6 = "bank_account_number"
            java.lang.String r6 = r14.getStringValue(r6)
            if (r6 == 0) goto L_0x00e4
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0154
        L_0x00e4:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131832386(0x7f112e42, float:1.9297824E38)
            X.7is r18 = X.C128097is.A00(r7, r6)
            java.lang.String r7 = "paypal_email"
            java.lang.String r6 = r14.getStringValue(r7)
            X.7it r17 = X.C128107it.A01(r6)
            r6 = 2131233496(0x7f080ad8, float:1.8083131E38)
            X.7iI r12 = new X.7iI
            r12.<init>(r4, r4, r6, r0)
            java.lang.String r6 = r14.getStringValue(r7)
            if (r6 == 0) goto L_0x01a7
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            r6 = 2131832343(0x7f112e17, float:1.9297737E38)
            X.7is r8 = X.C128097is.A00(r7, r6)
            r11 = 0
        L_0x0111:
            r6 = 3
            X.5iR r7 = X.AnonymousClass5iR.A00(r6)
            X.5iC r6 = new X.5iC
            r6.<init>()
            r6.A01 = r12
            r6.A00 = r11
            X.5iF r12 = X.C128387jU.A02(r6, r7)
            X.69Q r11 = X.AnonymousClass69Q.PRIMARY_TEXT
            r6 = r18
            X.C121777Ib.A02(r6, r12, r11)
            X.69Q r11 = X.AnonymousClass69Q.A1A
            r6 = r17
            X.5iL r6 = X.C121777Ib.A00(r6, r12, r11)
            r7.A05 = r6
            r7.A02 = r5
            X.7Eo r6 = new X.7Eo
            r25 = r6
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r24
            r30 = r0
            r31 = r0
            r32 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r6.A01 = r8
            r6.A04 = r0
            X.AnonymousClass7E5.A01(r6, r7, r2)
            goto L_0x00bc
        L_0x0154:
            java.lang.String r6 = r14.getStringValue(r13)
            X.7it r18 = X.C128107it.A01(r6)
            java.lang.String r16 = "bank_account_number"
            r6 = r16
            java.lang.String r6 = r14.getStringValue(r6)
            if (r6 == 0) goto L_0x01b6
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            r6 = 2131821859(0x7f110523, float:1.9276473E38)
            X.7is r17 = X.C128097is.A00(r7, r6)
            r6 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            X.7iJ r12 = new X.7iJ
            r12.<init>(r6, r15, r10, r9)
            r6 = 14
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7 = 2131233788(0x7f080bfc, float:1.8083723E38)
            r6 = 2131165224(0x7f070028, float:1.794466E38)
            X.7iI r11 = new X.7iI
            r11.<init>(r4, r8, r7, r6)
            java.lang.String r7 = r14.getStringValue(r13)
            if (r7 == 0) goto L_0x01b1
            r6 = r16
            java.lang.String r6 = r14.getStringValue(r6)
            if (r6 == 0) goto L_0x01ac
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r6}
            r6 = 2131832342(0x7f112e16, float:1.9297735E38)
            X.7is r8 = X.C128097is.A00(r7, r6)
            goto L_0x0111
        L_0x01a7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r21)
            throw r0
        L_0x01ac:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r21)
            throw r0
        L_0x01b1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r21)
            throw r0
        L_0x01b6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r21)
            throw r0
        L_0x01bb:
            X.7Kx r7 = r3.A02
            boolean r6 = X.AnonymousClass7Kx.A0R(r7)
            if (r6 == 0) goto L_0x0208
            java.lang.Object r6 = r7.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x0208
            java.lang.Class<com.facebook.graphql.impls.EditLinksFragmentImpl$SettingsEditLinks> r11 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class
            java.lang.String r8 = "settings_edit_links(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r8, r11)
            if (r6 == 0) goto L_0x0208
            java.lang.String r7 = "payout_method_update_uri"
            java.lang.String r6 = r6.getStringValue(r7)
            if (r6 == 0) goto L_0x0208
            int r6 = r6.length()
            if (r6 == 0) goto L_0x0208
            r30 = 2131832346(0x7f112e1a, float:1.9297743E38)
            X.7Kx r6 = r3.A02
            java.lang.Object r6 = r6.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x05b7
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r8, r11)
            if (r6 == 0) goto L_0x05b7
            java.lang.String r28 = r6.getStringValue(r7)
            if (r28 == 0) goto L_0x05b7
            r6 = 2131304106(0x7f091eaa, float:1.8226345E38)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r6)
            java.lang.String r29 = "payouthub_setting_payoutmethod_click"
            r25 = r3
            r26 = r2
            r25.A05(r26, r27, r28, r29, r30)
        L_0x0208:
            X.C92445iV.A00(r2)
            r6 = 2131836622(0x7f113ece, float:1.9306416E38)
            A04(r2, r6)
            X.7Kx r7 = r3.A06
            boolean r6 = X.AnonymousClass7Kx.A0R(r7)
            if (r6 == 0) goto L_0x02dd
            java.lang.Object r8 = r7.A01
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            java.lang.String r14 = "Required value was null."
            if (r8 == 0) goto L_0x0298
            java.lang.Class<com.facebook.graphql.impls.TaxInfoFragmentImpl$TaxForm> r7 = com.facebook.graphql.impls.TaxInfoFragmentImpl.TaxForm.class
            java.lang.String r6 = "tax_form"
            com.facebook.pando.TreeJNI r12 = r8.getTreeValue(r6, r7)
            if (r12 == 0) goto L_0x0298
            r6 = 3
            X.5iR r11 = X.AnonymousClass5iR.A00(r6)
            X.5iC r13 = new X.5iC
            r13.<init>()
            r6 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            X.7iJ r6 = new X.7iJ
            r6.<init>(r7, r15, r10, r9)
            r13.A01 = r6
            r6 = 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8 = 2131233788(0x7f080bfc, float:1.8083723E38)
            r7 = 2131165224(0x7f070028, float:1.794466E38)
            X.7iI r6 = new X.7iI
            r6.<init>(r4, r9, r8, r7)
            r13.A00 = r6
            X.5iF r8 = X.C128387jU.A02(r13, r11)
            java.lang.String r9 = "file_name"
            X.7it r7 = X.C128107it.A00(r12, r9)
            X.69Q r6 = X.AnonymousClass69Q.PRIMARY_TEXT
            X.C121777Ib.A02(r7, r8, r6)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131836351(0x7f113dbf, float:1.9305866E38)
            X.7is r7 = X.C128097is.A00(r7, r6)
            X.69Q r6 = X.AnonymousClass69Q.A1A
            X.5iL r6 = X.C121777Ib.A00(r7, r8, r6)
            r11.A05 = r6
            r11.A02 = r5
            X.7Eo r8 = new X.7Eo
            r20 = r8
            r21 = r4
            r25 = r0
            r26 = r0
            r27 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r6 = r12.getStringValue(r9)
            if (r6 == 0) goto L_0x05b2
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            r6 = 2131822707(0x7f110873, float:1.9278193E38)
            X.C121187Eo.A00(r8, r7, r6)
            X.AnonymousClass7E5.A01(r8, r11, r2)
        L_0x0298:
            X.7Kx r7 = r3.A02
            boolean r6 = X.AnonymousClass7Kx.A0R(r7)
            if (r6 == 0) goto L_0x02dd
            java.lang.Object r6 = r7.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x02dd
            java.lang.Class<com.facebook.graphql.impls.EditLinksFragmentImpl$SettingsEditLinks> r9 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class
            java.lang.String r8 = "settings_edit_links(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r8, r9)
            if (r6 == 0) goto L_0x02dd
            java.lang.String r7 = "update_tax_uri"
            java.lang.String r6 = r6.getStringValue(r7)
            if (r6 == 0) goto L_0x02dd
            int r6 = r6.length()
            if (r6 == 0) goto L_0x02dd
            X.7Kx r6 = r3.A02
            java.lang.Object r6 = r6.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            if (r6 == 0) goto L_0x05ad
            com.facebook.pando.TreeJNI r6 = r6.getTreeValue(r8, r9)
            if (r6 == 0) goto L_0x05ad
            java.lang.String r9 = r6.getStringValue(r7)
            if (r9 == 0) goto L_0x05ad
            java.lang.String r10 = "payouthub_setting_taxform_click"
            r11 = 2131836621(0x7f113ecd, float:1.9306414E38)
            r6 = r3
            r7 = r2
            r8 = r4
            r6.A05(r7, r8, r9, r10, r11)
        L_0x02dd:
            r6 = 0
            X.C92445iV.A00(r2)
            r7 = 2131832220(0x7f112d9c, float:1.9297488E38)
            A04(r2, r7)
            X.7Kx r8 = r3.A03
            boolean r7 = X.AnonymousClass7Kx.A0R(r8)
            if (r7 == 0) goto L_0x038c
            java.lang.Object r11 = r8.A01
            com.facebook.pando.TreeJNI r11 = (com.facebook.pando.TreeJNI) r11
            if (r11 == 0) goto L_0x038c
            java.lang.Class<com.facebook.graphql.impls.PayoutAccountInfoFragmentImpl$CompanyAddress> r13 = com.facebook.graphql.impls.PayoutAccountInfoFragmentImpl.CompanyAddress.class
            java.lang.String r12 = "company_address"
            com.facebook.pando.TreeJNI r7 = r11.getTreeValue(r12, r13)
            if (r7 == 0) goto L_0x0339
            java.lang.String r10 = "country_code"
            java.lang.String r7 = r7.getStringValue(r10)
            if (r7 == 0) goto L_0x0339
            X.5iR r9 = X.AnonymousClass5iR.A00(r5)
            X.5iF r8 = X.C92375iF.A00()
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r7 = 2131832218(0x7f112d9a, float:1.9297484E38)
            X.7is r7 = X.C128097is.A00(r14, r7)
            X.C121777Ib.A02(r7, r8, r1)
            com.facebook.pando.TreeJNI r7 = r11.getTreeValue(r12, r13)
            if (r7 == 0) goto L_0x0325
            java.lang.String r6 = r7.getStringValue(r10)
        L_0x0325:
            com.facebook.common.locale.Country r6 = com.facebook.common.locale.Country.A00(r4, r6)
            java.util.Locale r6 = r6.A00
            java.lang.String r6 = r6.getDisplayCountry()
            X.C121777Ib.A03(r8, r1, r6)
            X.5iX r6 = X.AnonymousClass5iL.A00(r9, r8)
            r2.add((java.lang.Object) r6)
        L_0x0339:
            X.5iR r9 = X.AnonymousClass5iR.A00(r5)
            X.5iF r8 = X.C92375iF.A00()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131832217(0x7f112d99, float:1.9297482E38)
            X.7is r6 = X.C128097is.A00(r7, r6)
            X.C121777Ib.A02(r6, r8, r1)
            X.Is6 r7 = X.Is6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "company_type"
            java.lang.Enum r6 = X.C86104wH.A0a(r11, r7, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            X.C121777Ib.A03(r8, r1, r6)
            X.5iX r9 = X.AnonymousClass5iL.A00(r9, r8)
            X.5iR r10 = X.AnonymousClass5iR.A00(r5)
            X.5iF r8 = X.C92375iF.A00()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131832216(0x7f112d98, float:1.929748E38)
            X.7is r6 = X.C128097is.A00(r7, r6)
            X.C121777Ib.A02(r6, r8, r1)
            java.lang.String r6 = "company_name"
            X.7it r7 = X.C128107it.A00(r11, r6)
            X.7Ib r6 = new X.7Ib
            r6.<init>(r4, r7, r1)
            r8.A02 = r6
            X.5iX r6 = X.AnonymousClass5iL.A00(r10, r8)
            X.7jT[] r6 = new X.C128377jT[]{r9, r6}
            r2.add((java.lang.Object[]) r6)
        L_0x038c:
            X.C92445iV.A00(r2)
            r6 = 2131820871(0x7f110147, float:1.927447E38)
            A04(r2, r6)
            X.7Kx r7 = r3.A05
            boolean r6 = X.AnonymousClass7Kx.A0R(r7)
            if (r6 == 0) goto L_0x04bf
            java.lang.Object r9 = r7.A01
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            if (r9 == 0) goto L_0x047a
            X.5iR r12 = X.AnonymousClass5iR.A00(r5)
            X.5iF r11 = X.C92375iF.A00()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6 = 2131832223(0x7f112d9f, float:1.9297494E38)
            X.7is r6 = X.C128097is.A00(r7, r6)
            X.C121777Ib.A02(r6, r11, r1)
            java.lang.Class<com.facebook.graphql.impls.PayoutOwnerFragmentImpl$OwnerAddress> r8 = com.facebook.graphql.impls.PayoutOwnerFragmentImpl.OwnerAddress.class
            java.lang.String r7 = "owner_address"
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r7, r8)
            if (r10 == 0) goto L_0x0555
            java.lang.String r6 = "first_name"
            java.lang.String r13 = r10.getStringValue(r6)
        L_0x03c7:
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r7, r8)
            if (r10 == 0) goto L_0x0552
            java.lang.String r6 = "middle_name"
            java.lang.String r10 = r10.getStringValue(r6)
        L_0x03d3:
            com.facebook.pando.TreeJNI r14 = r9.getTreeValue(r7, r8)
            if (r14 == 0) goto L_0x054f
            java.lang.String r6 = "last_name"
            java.lang.String r6 = r14.getStringValue(r6)
        L_0x03df:
            java.lang.String[] r10 = new java.lang.String[]{r13, r10, r6}
            java.lang.String r6 = " "
            java.lang.String r6 = X.C32522Ce.A00(r6, r10)
            X.C121777Ib.A03(r11, r1, r6)
            X.5iX r13 = X.AnonymousClass5iL.A00(r12, r11)
            X.5iR r12 = X.AnonymousClass5iR.A00(r5)
            X.5iF r6 = X.C92375iF.A00()
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r10 = 2131832214(0x7f112d96, float:1.9297476E38)
            X.7is r10 = X.C128097is.A00(r11, r10)
            X.C121777Ib.A02(r10, r6, r1)
            com.facebook.pando.TreeJNI r11 = r9.getTreeValue(r7, r8)
            if (r11 == 0) goto L_0x054b
            java.lang.String r10 = "street1"
            java.lang.String r25 = r11.getStringValue(r10)
        L_0x0410:
            com.facebook.pando.TreeJNI r11 = r9.getTreeValue(r7, r8)
            if (r11 == 0) goto L_0x0547
            java.lang.String r10 = "street2"
            java.lang.String r26 = r11.getStringValue(r10)
        L_0x041c:
            com.facebook.pando.TreeJNI r11 = r9.getTreeValue(r7, r8)
            if (r11 == 0) goto L_0x0543
            java.lang.String r10 = "address_city"
            java.lang.String r27 = r11.getStringValue(r10)
        L_0x0428:
            com.facebook.pando.TreeJNI r11 = r9.getTreeValue(r7, r8)
            if (r11 == 0) goto L_0x053f
            java.lang.String r10 = "address_state"
            java.lang.String r28 = r11.getStringValue(r10)
        L_0x0434:
            com.facebook.pando.TreeJNI r10 = r9.getTreeValue(r7, r8)
            if (r10 == 0) goto L_0x053b
            java.lang.String r11 = "zip"
            java.lang.String r29 = r10.getStringValue(r11)
        L_0x0440:
            com.facebook.pando.TreeJNI r11 = r9.getTreeValue(r7, r8)
            if (r11 == 0) goto L_0x0537
            java.lang.String r10 = "country_code"
            java.lang.String r11 = r11.getStringValue(r10)
            if (r11 == 0) goto L_0x0537
            com.facebook.pando.TreeJNI r7 = r9.getTreeValue(r7, r8)
            if (r7 == 0) goto L_0x0534
            java.lang.String r7 = r7.getStringValue(r10)
        L_0x0458:
            com.facebook.common.locale.Country r7 = com.facebook.common.locale.Country.A00(r4, r7)
            java.util.Locale r7 = r7.A00
            java.lang.String r30 = r7.getDisplayCountry()
        L_0x0462:
            java.lang.String[] r8 = new java.lang.String[]{r25, r26, r27, r28, r29, r30}
            java.lang.String r7 = ", "
            java.lang.String r7 = X.C32522Ce.A00(r7, r8)
            X.C121777Ib.A03(r6, r1, r7)
            X.5iX r1 = X.AnonymousClass5iL.A00(r12, r6)
            X.7jT[] r1 = new X.C128377jT[]{r13, r1}
            r2.add((java.lang.Object[]) r1)
        L_0x047a:
            X.7Kx r6 = r3.A02
            boolean r1 = X.AnonymousClass7Kx.A0R(r6)
            if (r1 == 0) goto L_0x04bf
            java.lang.Object r1 = r6.A01
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x04bf
            java.lang.Class<com.facebook.graphql.impls.EditLinksFragmentImpl$SettingsEditLinks> r8 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class
            java.lang.String r7 = "settings_edit_links(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r7, r8)
            if (r1 == 0) goto L_0x04bf
            java.lang.String r6 = "owner_info_update_uri"
            java.lang.String r1 = r1.getStringValue(r6)
            if (r1 == 0) goto L_0x04bf
            int r1 = r1.length()
            if (r1 == 0) goto L_0x04bf
            X.7Kx r1 = r3.A02
            java.lang.Object r1 = r1.A01
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x05a8
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r7, r8)
            if (r1 == 0) goto L_0x05a8
            java.lang.String r9 = r1.getStringValue(r6)
            if (r9 == 0) goto L_0x05a8
            java.lang.String r10 = "payouthub_setting_ownerinfo_click"
            r11 = 2131832222(0x7f112d9e, float:1.9297492E38)
            r6 = r3
            r7 = r2
            r8 = r4
            r6.A05(r7, r8, r9, r10, r11)
        L_0x04bf:
            X.C92445iV.A00(r2)
            r1 = 2131820837(0x7f110125, float:1.92744E38)
            A04(r2, r1)
            X.7Kx r6 = r3.A01
            boolean r1 = X.AnonymousClass7Kx.A0R(r6)
            if (r1 == 0) goto L_0x059d
            java.lang.Object r7 = r6.A01
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x0558
            java.lang.Class<com.facebook.graphql.impls.AccountAdminsFragmentImpl$PayAdminDoNotUse> r6 = com.facebook.graphql.impls.AccountAdminsFragmentImpl.PayAdminDoNotUse.class
            java.lang.String r1 = "pay_admin_do_not_use"
            com.google.common.collect.ImmutableList r1 = r7.getTreeList(r1, r6)
            if (r1 == 0) goto L_0x0558
            X.83w r11 = r1.iterator()
        L_0x04e4:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0558
            java.lang.Object r10 = r11.next()
            com.facebook.pando.TreeJNI r10 = (com.facebook.pando.TreeJNI) r10
            r1 = 7
            X.5iR r9 = X.AnonymousClass5iR.A00(r1)
            X.5iC r7 = new X.5iC
            r7.<init>()
            java.lang.String r1 = "image_uri"
            java.lang.String r6 = r10.getStringValue(r1)
            X.7iH r1 = new X.7iH
            r1.<init>(r6, r4, r5, r5)
            r7.A01 = r1
            X.5iF r8 = X.C128387jU.A02(r7, r9)
            java.lang.String r7 = "name"
            X.7it r6 = X.C128107it.A00(r10, r7)
            r1 = r19
            X.5iL r1 = X.C121777Ib.A01(r6, r8, r1)
            r9.A05 = r1
            r9.A02 = r5
            X.7Eo r6 = new X.7Eo
            r20 = r6
            r21 = r4
            r25 = r0
            r26 = r0
            r27 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            X.7it r1 = X.C128107it.A00(r10, r7)
            r6.A01 = r1
            X.AnonymousClass7E5.A01(r6, r9, r2)
            goto L_0x04e4
        L_0x0534:
            r7 = 0
            goto L_0x0458
        L_0x0537:
            r30 = 0
            goto L_0x0462
        L_0x053b:
            r29 = 0
            goto L_0x0440
        L_0x053f:
            r28 = 0
            goto L_0x0434
        L_0x0543:
            r27 = 0
            goto L_0x0428
        L_0x0547:
            r26 = 0
            goto L_0x041c
        L_0x054b:
            r25 = 0
            goto L_0x0410
        L_0x054f:
            r6 = 0
            goto L_0x03df
        L_0x0552:
            r10 = 0
            goto L_0x03d3
        L_0x0555:
            r13 = 0
            goto L_0x03c7
        L_0x0558:
            X.7Kx r1 = r3.A02
            boolean r0 = X.AnonymousClass7Kx.A0R(r1)
            if (r0 == 0) goto L_0x059d
            java.lang.Object r0 = r1.A01
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x059d
            java.lang.Class<com.facebook.graphql.impls.EditLinksFragmentImpl$SettingsEditLinks> r6 = com.facebook.graphql.impls.EditLinksFragmentImpl.SettingsEditLinks.class
            java.lang.String r5 = "settings_edit_links(interface_type:$interface_type)"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x059d
            java.lang.String r1 = "admin_update_uri"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x059d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x059d
            X.7Kx r0 = r3.A02
            java.lang.Object r0 = r0.A01
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x05a3
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r5, r6)
            if (r0 == 0) goto L_0x05a3
            java.lang.String r8 = r0.getStringValue(r1)
            if (r8 == 0) goto L_0x05a3
            java.lang.String r9 = "payouthub_setting_admin_update_click"
            r10 = 2131832215(0x7f112d97, float:1.9297478E38)
            r5 = r3
            r6 = r2
            r7 = r4
            r5.A05(r6, r7, r8, r9, r10)
        L_0x059d:
            X.56q r0 = r3.A07
            X.C86144wL.A1E(r0, r2)
            return
        L_0x05a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x05a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x05ad:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r14)
            throw r0
        L_0x05b2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r14)
            throw r0
        L_0x05b7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.settings.viewmodel.SettingsViewModel.A00(com.facebookpay.msc.settings.viewmodel.SettingsViewModel):void");
    }

    public static final void A01(SettingsViewModel settingsViewModel, String str) {
        String A0r;
        LinkedHashMap A0y = C18220wO.A0y();
        TreeJNI A0N = C86144wL.A0N(settingsViewModel);
        if (A0N == null || (A0r = C86144wL.A0r(A0N)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C86164wN.A1I(A0r, A0y);
        AnonymousClass7Kz.A06();
        AnonymousClass7BK.A01(str, A0y, 667749724, 0, 2);
    }

    public final void A07(Bundle bundle) {
        super.A07(bundle);
        C880856r.A05(this.A03, this.A07, this, 113);
        this.A07.A0H(new C114986uF(C128097is.A00(new Object[0], 2131835559), C86134wK.A0T(), false));
    }
}
