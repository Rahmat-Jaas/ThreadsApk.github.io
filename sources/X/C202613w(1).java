package X;

import android.content.Context;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.service.session.UserSession;

/* renamed from: X.13w  reason: invalid class name and case insensitive filesystem */
public final class C202613w extends M5O {
    public final Context A00;
    public final C34640IcN A01;
    public final IgdsFooterCell A02;
    public final UserSession A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00e2, code lost:
        X.AnonymousClass3Zw.A01(r1, r4, r2);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e5, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00e7, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ea, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Integer r13, java.lang.String r14) {
        /*
            r12 = this;
            r6 = 0
            X.C04220Ms.A0B(r13, r6)
            com.instagram.igds.components.textcell.IgdsFooterCell r0 = r12.A02
            android.content.Context r7 = r12.A00
            int r1 = A00(r13, r14)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r7, r1)
            r0.A00(r1)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            X.C04220Ms.A06(r2)
            com.instagram.common.accessibility.AccessibleTextView r1 = r0.A02
            r1.setMovementMethod(r2)
            int r1 = r13.intValue()
            switch(r1) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0027;
                case 3: goto L_0x0027;
                case 4: goto L_0x0049;
                case 5: goto L_0x0040;
                case 6: goto L_0x0049;
                case 7: goto L_0x008f;
                case 8: goto L_0x0026;
                case 9: goto L_0x00bc;
                default: goto L_0x0026;
            }
        L_0x0026:
            return
        L_0x0027:
            X.IcN r1 = r12.A01
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.service.session.UserSession r3 = r12.A03
            java.lang.String r2 = r1.getModuleName()
            X.C04220Ms.A06(r2)
            int r1 = A00(r13, r14)
            android.text.SpannableStringBuilder r1 = X.C63543hm.A00(r7, r4, r3, r2, r1)
            goto L_0x00e7
        L_0x0040:
            r1 = 2131826132(0x7f1115d4, float:1.928514E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r7, r1)
            goto L_0x00e5
        L_0x0049:
            X.IcN r1 = r12.A01
            androidx.fragment.app.FragmentActivity r8 = r1.requireActivity()
            com.instagram.service.session.UserSession r9 = r12.A03
            java.lang.String r11 = r1.getModuleName()
            X.C04220Ms.A06(r11)
            java.lang.String r1 = "story"
            boolean r4 = r14.equals(r1)
            r1 = 2131829580(0x7f11234c, float:1.9292133E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r7, r1)
            r1 = 2131821009(0x7f1101d1, float:1.927475E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r7, r1)
            r1 = 2131821275(0x7f1102db, float:1.9275289E38)
            if (r4 == 0) goto L_0x0074
            r1 = 2131821276(0x7f1102dc, float:1.927529E38)
        L_0x0074:
            java.lang.String r1 = X.C18220wO.A0h(r7, r2, r3, r1)
            X.C04220Ms.A06(r1)
            X.0xh r4 = new X.0xh
            r4.<init>(r7, r8, r9, r11)
            java.lang.String r10 = "https://help.instagram.com/116947042301556"
            X.0xi r6 = new X.0xi
            r6.<init>(r7, r8, r9, r10, r11)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r1)
            X.AnonymousClass3Zw.A01(r1, r6, r3)
            goto L_0x00e2
        L_0x008f:
            r1 = 2131829580(0x7f11234c, float:1.9292133E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r7, r1)
            X.IcN r2 = r12.A01
            androidx.fragment.app.FragmentActivity r8 = r2.requireActivity()
            com.instagram.service.session.UserSession r9 = r12.A03
            int r1 = X.C34332Jd.A00(r13)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r7, r3, r1)
            java.lang.String r11 = r2.getModuleName()
            X.C04220Ms.A06(r11)
            java.lang.String r10 = "https://help.instagram.com/316932422966736"
            X.0xi r6 = new X.0xi
            r6.<init>(r7, r8, r9, r10, r11)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r1)
            X.AnonymousClass3Zw.A01(r1, r6, r3)
            goto L_0x00e7
        L_0x00bc:
            X.IcN r1 = r12.A01
            androidx.fragment.app.FragmentActivity r8 = r1.requireActivity()
            com.instagram.service.session.UserSession r9 = r12.A03
            r1 = 2131822540(0x7f1107cc, float:1.9277854E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r7, r1)
            r1 = 2131832163(0x7f112d63, float:1.9297372E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r7, r2, r1)
            X.C04220Ms.A06(r1)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r1)
            int r5 = X.C18210wN.A01(r7)
            com.instagram.ui.text.IDxCSpanShape37S0300000_1_I2 r4 = new com.instagram.ui.text.IDxCSpanShape37S0300000_1_I2
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x00e2:
            X.AnonymousClass3Zw.A01(r1, r4, r2)
        L_0x00e5:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x00e7:
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202613w.A01(java.lang.Integer, java.lang.String):void");
    }

    public C202613w(Context context, C34640IcN icN, IgdsFooterCell igdsFooterCell, UserSession userSession) {
        super(igdsFooterCell);
        this.A01 = icN;
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = igdsFooterCell;
    }

    public static final int A00(Integer num, String str) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    switch (str.hashCode()) {
                        case 3138974:
                            if (str.equals("feed")) {
                                return 2131832396;
                            }
                            break;
                        case 3230752:
                            if (str.equals("igtv")) {
                                return 2131832397;
                            }
                            break;
                        case 3496474:
                            if (str.equals("reel")) {
                                return 2131832398;
                            }
                            break;
                        case 109770997:
                            if (str.equals("story")) {
                                return 2131832399;
                            }
                            break;
                    }
                }
            } else {
                switch (str.hashCode()) {
                    case 3138974:
                        if (str.equals("feed")) {
                            return 2131821441;
                        }
                        break;
                    case 3230752:
                        if (str.equals("igtv")) {
                            return 2131821442;
                        }
                        break;
                    case 3496474:
                        if (str.equals("reel")) {
                            return 2131821443;
                        }
                        break;
                    case 109770997:
                        if (str.equals("story")) {
                            return 2131821444;
                        }
                        break;
                }
            }
        } else {
            switch (str.hashCode()) {
                case 3138974:
                    if (str.equals("feed")) {
                        return 2131821445;
                    }
                    break;
                case 3230752:
                    if (str.equals("igtv")) {
                        return 2131821446;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        return 2131821447;
                    }
                    break;
                case 3496474:
                    if (str.equals("reel")) {
                        return 2131821448;
                    }
                    break;
                case 109770997:
                    if (str.equals("story")) {
                        return 2131821449;
                    }
                    break;
            }
        }
        return C34332Jd.A00(num);
    }
}
